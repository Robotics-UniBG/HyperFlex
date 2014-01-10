/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.hyperflex.featuremodels.constraints.utility;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.hyperflex.featuremodels.Constraint;
import org.hyperflex.featuremodels.ConstraintType;
import org.hyperflex.featuremodels.ContainmentAssociation;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.Instance;
import org.hyperflex.featuremodels.featuremodelsFactory;
import org.mvel2.MVEL;




public class ConstraintChecker {

	public static final int CONSTRAINT_NOT_ACTIVE = -1;
	public static final int CONSTRAINT_VIOLATED = 0;
	public static final int CONSTRAINT_SATISFIED = 1;

	private ArrayList<String> selectedFeaturesNames;
	Instance currentInstance;
	FeatureModel model;

	public ConstraintChecker(FeatureModel model){
		if(model == null)
			return;
		this.model = model;

		currentInstance = model.getSelectedInstance();
		if(currentInstance == null){
			currentInstance = featuremodelsFactory.eINSTANCE.createInstance();
		}
		selectedFeaturesNames = new ArrayList<String>();
		for(Feature feature : currentInstance.getSelectedFeatures()){
			selectedFeaturesNames.add(feature.getName());
		}

	}

	public boolean checkConstraints(){

		boolean satisfied = true;


		// 1) Check mandatory constraints
		if(! checkMandatoryConstraints())
			satisfied = false;

		// 2) Check cardinality constraints
		if(!checkCardinalityConstraints())
			satisfied = false;
		
		// 3) Check the constraints
		if(!checkExplicitConstraints())
			satisfied = false;
		
		return satisfied;

	}

	private boolean checkMandatoryConstraints(){

		boolean satisfied = true;

		for (Feature feature : model.getRequiredFeatures()) {
			
			boolean constraintSatisfied = false; 
			
			boolean isParentAFeature = feature.getFeatureParent() != null;
			
			boolean isParentSelceted = currentInstance.getSelectedFeatures().contains(feature.getFeatureParent());
			
			if(isParentAFeature && isParentSelceted){
				constraintSatisfied = currentInstance.getSelectedFeatures().contains(feature);
			}else{
				constraintSatisfied = true;
			}
			
			if(! constraintSatisfied){
				MessageDialog.openError(null, "ERROR", "The feature '" + feature.getName() + 
						"' is mandatory and must be selected");
				satisfied = false;
			}
		}

		return satisfied;

	}

	private boolean checkCardinalityConstraints(){

		EList<Feature> selectedFeature = currentInstance.getSelectedFeatures();
		
		boolean satisfied = true;
		for (ContainmentAssociation container : model.getAllContainmentAssociations()) {
			
			if( ! selectedFeature.contains(container.getParent())){
				continue;
			}
			
			int numSelected = 0;
			for(Feature feature : container.getSubFeatures()){
				if(selectedFeature.contains(feature)){
					numSelected++;
				}
			}
			if(numSelected < container.getLowerBound() || (container.getUpperBound() != -1 &&
					numSelected > container.getUpperBound())){
				String subFeatures = "";
				EList<Feature> features = container.getSubFeatures();
				for (int i = 0; i < features.size(); i++) {
					if(i!=0){
						subFeatures += ", ";
					}
					subFeatures += features.get(i).getName();

				}
				MessageDialog.openError(null, "ERROR", 
						"The number of selected sub-feature doesn't respect the cardinality constraints\n\n" +
								"Feature: " + container.getParent().getName() + "\n" +
								"Possible Sub-Feature: " + subFeatures + "\n" +
								"Lower bound: " + container.getLowerBound() + "\n" +
								"Upper bound: " + container.getUpperBound() + "\n" +
								"Selected sub-feature: " + numSelected + "\n" );
				satisfied = false;
			}
		}
		return satisfied;
	}

	private boolean checkExplicitConstraints(){

		boolean satisfied = true;

		for(Constraint constr : model.getConstraints()){
			if(checkExplicitConstraint(constr)==ConstraintChecker.CONSTRAINT_VIOLATED){
				MessageDialog.openError(null, "ERROR", "The constraint '" + constr.getName() + 
						"' is not satisfied \n\n" + constr.getRule());
				satisfied = false;
			}
		}

		return satisfied;
	}

	public int checkExplicitConstraint(Constraint constraint){

		String rule = constraint.getRule();
		String tmp[] = {"",""};
		String type = "";
		if(constraint.getType() == ConstraintType.REQUIRES){
			tmp = rule.split(" REQUIRES ");
			type = "REQUIRES";
		}else if(constraint.getType() == ConstraintType.EXCLUDES){
			tmp = rule.split(" EXCLUDES ");
			type = "EXCLUDES";
		}
		String termA = tmp[0];
		String termB = tmp[1];

		if(! checkTerm(termA)){
			return CONSTRAINT_NOT_ACTIVE;
		}else{ 
			if(type.equals("REQUIRES")){
				if(checkTerm(termB)){
					return CONSTRAINT_SATISFIED;
				}else{
					return CONSTRAINT_VIOLATED;
				}
			}else{
				if(checkTerm(termB)){
					return CONSTRAINT_VIOLATED;
				}else{
					return CONSTRAINT_SATISFIED;
				}
			}
		}
	}

	private boolean checkTerm(String term){
		//		System.out.println("***** Check Constraint *****");
		String[] tmp = term.split(" ");
		String expression = "";
		HashMap<String, Integer> vars = new HashMap<String, Integer>();
		//		System.out.println(term);
		String featureName = "";
		String varName = "";
		for(int i = 0; i < tmp.length; i++){
			if(tmp[i].equals("(")){
				expression += "(";
			}
			else if(tmp[i].equals(")")){
				expression += ")";
			}
			else if(tmp[i].equals("AND")){
				expression += " & ";
			}
			else if(tmp[i].equals("OR")){
				expression += " | ";
			}
			else if(tmp[i].equals("XOR")){
				expression += " ^ ";
			}
			else if(tmp[i].equals("NOT")){
				expression += " 1-";
			}
			else{
				if(tmp[i].startsWith("'") && !tmp[i].endsWith("'")){
					featureName = tmp[i].substring(1,tmp[i].length());
					varName = tmp[i].substring(1,tmp[i].length());
				}
				else if(tmp[i].endsWith("'") && !tmp[i].startsWith("'")){
					featureName += " " + tmp[i].substring(0,tmp[i].length()-1);
					varName += tmp[i].substring(0,tmp[i].length()-1);
					expression += varName;
					int value = 0;
					if(selectedFeaturesNames.contains(featureName)){
						value=1;
					}
					vars.put(varName, value);
					//					System.out.println("var:" + varName + " - value: " + value);
				}
				else if(!tmp[i].endsWith("'") && !tmp[i].startsWith("'")){
					featureName += " " + tmp[i];
					varName += tmp[i];
				}
				else if(tmp[i].startsWith("'") && tmp[i].endsWith("'")){
					featureName = tmp[i].substring(1,tmp[i].length()-1);
					varName = tmp[i].substring(1,tmp[i].length()-1);
					expression += varName;
					int value = 0;
					if(selectedFeaturesNames.contains(featureName)){
						value=1;
					}
					vars.put(varName, value);
					//					System.out.println("var:" + varName + " - value: " + value);
				}


			}
		}
		//		System.out.println("exp: " + expression);
		int result =  (Integer)MVEL.eval(expression,vars);  
		//		System.out.println("result:" + result + "\n\n");
		if(result == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
//		String term = "A && (C && D ^ (B && ! A)) && (! C)";
//		String term2 = "1-0 ^ (Bday)";
//		//		ConstraintChecker cc = new ConstraintChecker(null);
//		//		ArrayList<String> terms = cc.checkBracket(term);
//		//		for (Iterator iterator = terms.iterator(); iterator.hasNext();) {
//		//			System.out.println( (String) iterator.next());
//		//			
//		//		}
//
//
//		Map<String, Boolean> vars = new HashMap<String, Boolean>();
//		vars.put("A", true);
//		vars.put("B", true);
//		vars.put("C", false);
//		vars.put("D", true);
//
//		Map<String, Integer> vars2 = new HashMap<String, Integer>();
//		vars2.put("Email", 0);
//		vars2.put("Bday", 1);
//		// Executes the compiled expression
//		boolean result =  (Boolean)MVEL.eval(term,vars);  
//		//		System.out.println(result);
//		int result2 =  (Integer)MVEL.eval(term2,vars2);  
//		//		System.out.println(result2);


	}

}
