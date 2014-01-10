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
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;


public class ConstraintRuleDialog extends Dialog implements Listener, MouseListener, KeyListener{

	/**
	 * 
	 */
	private int openBracket = 0;
	private boolean ruleKeyWordInserted = false;
	
	private String rule = "";
	private String name = "";
	
	private Composite container;
	private ArrayList<String> features;
	private FeatureModel model;
	
	private Text textName;
	private Label lblName;
	private Button btnAnd;
	private Button btnOr;
	private Button btnXor;
	private Button btnNot;
	private Button btnAP;
	private Button btnCP;
	private Button btnDel;
	private Button btnRequires;
	private Button btnExcludes;
	private Button btnOk;
	
	private Text textArea;
	
	private List list;
	
	public ConstraintRuleDialog(Shell parentShell, FeatureModel model,
			String rule, String name) {
		super(parentShell);
		this.model = model;
		features = new ArrayList<String>();
		for(Iterator<Feature> iter = model.getAllFeatures().iterator(); iter.hasNext();){
			features.add(iter.next().getName());
		}
		Collections.sort(features);
		this.rule = rule;
		this.name = name;
	}
	
	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		container = (Composite) super.createDialogArea(parent);
		container.setLayout(null);
	
		addComponents();
		
		if(rule.equals("")){
			initializeButton();
		}else{
			if(rule.contains("REQUIRES") || rule.contains("EXCLUDES")){
				ruleKeyWordInserted = true;
				btnRequires.setEnabled(false);
				btnExcludes.setEnabled(false);
			}
			enableButton();
		}
		
		return container;
	}
	
	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		btnOk = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				false);
		btnOk.addMouseListener(this);
		btnOk.setEnabled(false);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}
	
		/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(700, 500);
	}

	private void addComponents(){
		
		textName = new Text(container, SWT.BORDER);
		textName.setBounds(73, 20, 352, 19);
		textName.addKeyListener(this);
		textName.setText(name);
		
		lblName = new Label(container, SWT.NONE);
		lblName.setBounds(25, 22, 68, 14);
		lblName.setText("Name:");
		
		textArea = new Text(container, SWT.BORDER | SWT.WRAP);
		textArea.setBounds(25, 64, 400, 226);
		textArea.setEditable(false);
		textArea.setText(rule);
		
		list = new List(container, SWT.BORDER | SWT.V_SCROLL);
		list.setBounds(450, 20, 225, 270);
		list.addMouseListener(this);
		for (Iterator<String> iter = features.iterator(); iter.hasNext();) {
			list.add(iter.next());
		}
		
		btnAnd = new Button(container, SWT.NONE);
		btnAnd.setText("AND");
		btnAnd.setBounds(25, 310, 117, 29);
		btnAnd.addListener(SWT.Selection, this);
		
		btnOr = new Button(container, SWT.NONE);
		btnOr.setText("OR");
		btnOr.setBounds(166, 310, 117, 29);
		btnOr.addListener(SWT.Selection, this);
		
		btnXor = new Button(container, SWT.NONE);
		btnXor.setText("XOR");
		btnXor.setBounds(308, 310, 117, 29);
		btnXor.addListener(SWT.Selection, this);
		
		btnNot = new Button(container, SWT.NONE);
		btnNot.setText("NOT");
		btnNot.setBounds(25, 351, 117, 29);
		btnNot.addListener(SWT.Selection, this);
		
		btnExcludes = new Button(container, SWT.NONE);
		btnExcludes.setText("EXCLUDES");
		btnExcludes.setBounds(558, 310, 117, 29);
		btnExcludes.addListener(SWT.Selection, this);
		
		btnRequires = new Button(container, SWT.NONE);
		btnRequires.setText("REQUIRES");
		btnRequires.setBounds(558, 351, 117, 29);
		btnRequires.addListener(SWT.Selection, this);
		
		btnAP = new Button(container, SWT.NONE);
		btnAP.setText("(");
		btnAP.setBounds(166, 351, 117, 29);
		btnAP.addListener(SWT.Selection, this);
		
		btnCP = new Button(container, SWT.NONE);
		btnCP.setText(")");
		btnCP.setBounds(308, 351, 117, 29);
		btnCP.addListener(SWT.Selection, this);
		
		btnDel = new Button(container, SWT.NONE);
		btnDel.setText("<--");
		btnDel.setBounds(166, 392, 117, 29);
		btnDel.addListener(SWT.Selection, this);
		
	}

	public String getRule(){
		return rule;
	}
	public String getName(){
		return name;
	}
	
	@Override
	public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent e) {
		if(e.getSource().equals(list) && list.isEnabled()){
			textArea.append("'" + ((List)e.getSource()).getSelection()[0] + "'");
			enableButtonAfterFeature();
//			rule = textArea.getText();
		}
	}

	@Override
	public void mouseDown(org.eclipse.swt.events.MouseEvent e) {
		if(e.getSource().equals(btnOk)){
			name = textName.getText();
			rule = textArea.getText();
			if(name.equals("")){
				name = "Constraint " + (model.getConstraints().size()+1);
//				MessageDialog.openWarning(null, "Attention", 
//						"Since you haven't define a name for the constraint, the name '" +
//						name + "' was automatically assigned");
			}
		}

	}

	@Override
	public void mouseUp(org.eclipse.swt.events.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleEvent(Event event) {
		if(event.widget.equals(btnAnd)){
			textArea.append(" AND ");
//			enableButtonAfterAndOrXor();		
		}
		else if(event.widget.equals(btnOr)){
			textArea.append(" OR ");
//			enableButtonAfterAndOrXor();
		}
		else if(event.widget.equals(btnXor)){
			textArea.append(" XOR ");
//			enableButtonAfterAndOrXor();
		}
		else if(event.widget.equals(btnNot)){
			textArea.append(" NOT ");
//			enableButtonAfterNot();
		}
		else if(event.widget.equals(btnAP)){
			openBracket++;
			textArea.append(" ( ");
//			enableButtonAfterAP();
		}
		else if(event.widget.equals(btnCP)){
			openBracket--;
			textArea.append(" ) ");
//			enableButtonAfterCP();
		}
		else if(event.widget.equals(btnDel)){
			backspaceAction();
		}
		else if(event.widget.equals(btnRequires)){
			ruleKeyWordInserted = true;
			textArea.append(" REQUIRES ");
//			enableButtonAfterRequiresExcludes();
		}
		else if(event.widget.equals(btnExcludes)){
			ruleKeyWordInserted = true;
			textArea.append(" EXCLUDES ");
//			enableButtonAfterRequiresExcludes();
		}
		enableButton();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource().equals(textName)){
			if(ruleKeyWordInserted && openBracket == 0 && !list.isEnabled()){
				btnOk.setEnabled(true);
			}
		}
		
	}
	
	private void enableButton(){
		rule = textArea.getText();
		if(rule.endsWith("'")){
			enableButtonAfterFeature();
		}else if(rule.endsWith(" AND ") || rule.endsWith(" OR ") || rule.endsWith(" XOR ")){
			enableButtonAfterAndOrXor();
		}else if(rule.endsWith(" NOT ")){
			enableButtonAfterNot();
		}else if(rule.endsWith(" REQUIRES ") || rule.endsWith(" EXCLUDES ") ){
			enableButtonAfterRequiresExcludes();
		}else if(rule.endsWith(" ( ")){
			enableButtonAfterAP();
		}else if(rule.endsWith(" ) ")){
			enableButtonAfterCP();
		}else if(rule.equals("")){
			initializeButton();
		}
	}
	
	private void enableButtonAfterAndOrXor(){
		list.setEnabled(true);
		btnNot.setEnabled(true);
		btnAP.setEnabled(true);
		enableAndOrXor(false);
		btnCP.setEnabled(false);
		if(!ruleKeyWordInserted){
			btnRequires.setEnabled(false);
			btnExcludes.setEnabled(false);
		}
		btnOk.setEnabled(false);
	}
	
	private void enableButtonAfterNot(){
		list.setEnabled(true);
		btnNot.setEnabled(false);
		btnAP.setEnabled(false);
		enableAndOrXor(false);
		btnCP.setEnabled(false);
		if(!ruleKeyWordInserted){
			btnRequires.setEnabled(false);
			btnExcludes.setEnabled(false);
		}
		btnOk.setEnabled(false);
	}
	
	private void enableButtonAfterAP(){
		list.setEnabled(true);
		btnNot.setEnabled(true);
		btnAP.setEnabled(true);
		enableAndOrXor(false);
		btnCP.setEnabled(false);
		if(!ruleKeyWordInserted){
			btnRequires.setEnabled(false);
			btnExcludes.setEnabled(false);
		}
		btnOk.setEnabled(false);
		
	}
	
	private void enableButtonAfterCP(){
		enableAndOrXor(true);
		if(openBracket == 0){
			btnCP.setEnabled(false);
			if(!ruleKeyWordInserted){
				btnRequires.setEnabled(true);
				btnExcludes.setEnabled(true);
			}else if(btnOk!=null){
				btnOk.setEnabled(true);
			}
		}else{
			btnCP.setEnabled(true);
		}
		list.setEnabled(false);
		btnNot.setEnabled(false);
		btnAP.setEnabled(false);
	}
	
	private void enableButtonAfterFeature(){
		enableAndOrXor(true);
		if(openBracket != 0){
			btnCP.setEnabled(true);
		}else{
			btnCP.setEnabled(false);
			if(!ruleKeyWordInserted){
				btnRequires.setEnabled(true);
				btnExcludes.setEnabled(true);
			}else if(btnOk!=null){
				btnOk.setEnabled(true);
			}
		}
		
		list.setEnabled(false);
		btnNot.setEnabled(false);
		btnAP.setEnabled(false);
	}
	
	private void enableButtonAfterRequiresExcludes(){
		list.setEnabled(true);
		btnNot.setEnabled(true);
		btnAP.setEnabled(true);
		enableAndOrXor(false);
		btnCP.setEnabled(false);
		btnRequires.setEnabled(false);
		btnExcludes.setEnabled(false);
		btnOk.setEnabled(false);
	}
	
	private void enableAndOrXor(boolean b){
		btnAnd.setEnabled(b);
		btnOr.setEnabled(b);
		btnXor.setEnabled(b);
	}
	
	private void initializeButton(){
		openBracket = 0;
		list.setEnabled(true);
		btnNot.setEnabled(true);
		btnAP.setEnabled(true);
		enableAndOrXor(false);
		btnCP.setEnabled(false);
		btnRequires.setEnabled(false);
		btnExcludes.setEnabled(false);
	}
	
	private void backspaceAction(){
		rule = textArea.getText();
		if(rule.endsWith("'")){
			String terms[] = rule.split(" ");
			for(int i = terms.length-1; i >= 0; i--){
				if(terms[i].startsWith("'")){
					textArea.setText(rule.substring(0,rule.length()-terms[i].length()));
					break;
				}else{
					textArea.setText(rule.substring(0,rule.length()-terms[i].length()-1));
				}
				rule = textArea.getText();
			}
		}else if(rule.endsWith(" AND ") || rule.endsWith(" XOR ")){
			textArea.setText(rule.substring(0,rule.length()-5));
		}else if(rule.endsWith(" OR ")){
			textArea.setText(rule.substring(0,rule.length()-4));
		}else if(rule.endsWith(" NOT ")){
			textArea.setText(rule.substring(0,rule.length()-5));
		}else if(rule.endsWith(" REQUIRES ") || rule.endsWith(" EXCLUDES ") ){
			textArea.setText(rule.substring(0,rule.length()-10));
			ruleKeyWordInserted = false;
		}else if(rule.endsWith(" ( ")){
			openBracket--;
			textArea.setText(rule.substring(0,rule.length()-3));
		}else if(rule.endsWith(" ) ")){
			openBracket++;
			textArea.setText(rule.substring(0,rule.length()-3));
		}
	}
	
}
