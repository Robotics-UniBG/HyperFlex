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
package org.hyperflex.featuremodels.diagram.edit.parts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.diagram.edit.policies.FeatureModelCanonicalEditPolicy;
import org.hyperflex.featuremodels.diagram.edit.policies.FeatureModelItemSemanticEditPolicy;
import org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry;

/**
 * @generated NOT
 */
public class FeatureModelEditPart extends DiagramEditPart implements PropertyChangeListener {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "FeatureModel"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated NOT
	 */
	public FeatureModelEditPart(View view) {
		super(view);
		FeatureModel model = (FeatureModel)resolveSemanticElement();
		
		if(model != null){
			model.removePropertyChangeListener(this);

		}
		System.out.println("Listener registered");
		model.addPropertyChangeListener(this);
		
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FeatureModelItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FeatureModelCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						FeatureModelVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		
		System.out.println("Event Received");
		
		String propertyName = event.getPropertyName();
		if(propertyName.equals(FeatureModel.INSTANCE_SELECTED_PROPERTY) || propertyName.equals(FeatureModel.INSTANCE_UPDATED_PROPERTY)){
			
			@SuppressWarnings("unchecked")
			Iterator<EditPart> it = getChildren().iterator();
			while(it.hasNext()){
				EditPart ep = it.next();
				if(ep instanceof Feature2EditPart){
					((Feature2EditPart)ep).getPrimaryShape().updateColor();
				}
			}
			
		}
		
	}

}
