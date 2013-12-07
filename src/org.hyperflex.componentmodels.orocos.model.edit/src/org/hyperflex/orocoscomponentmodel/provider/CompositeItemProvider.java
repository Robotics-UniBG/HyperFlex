/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.orocoscomponentmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.hyperflex.orocoscomponentmodel.Composite;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelFactory;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;

/**
 * This is the item provider adapter for a {@link org.hyperflex.orocoscomponentmodel.Composite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeItemProvider
	extends AbstractComponentItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__COMPONENTS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__INPUT_PORTS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__OUTPUT_PORTS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__CONNECTION_POLICIES);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__OPERATIONS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__OPERATION_CALLERS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__PEERS_CONNECTIONS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.COMPOSITE__PROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Composite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Composite"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Composite)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Composite_type") :
			getString("_UI_Composite_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Composite.class)) {
			case orocoscomponentmodelPackage.COMPOSITE__COMPONENTS:
			case orocoscomponentmodelPackage.COMPOSITE__INPUT_PORTS:
			case orocoscomponentmodelPackage.COMPOSITE__OUTPUT_PORTS:
			case orocoscomponentmodelPackage.COMPOSITE__CONNECTION_POLICIES:
			case orocoscomponentmodelPackage.COMPOSITE__OPERATIONS:
			case orocoscomponentmodelPackage.COMPOSITE__OPERATION_CALLERS:
			case orocoscomponentmodelPackage.COMPOSITE__PEERS_CONNECTIONS:
			case orocoscomponentmodelPackage.COMPOSITE__PROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__COMPONENTS,
				 orocoscomponentmodelFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__COMPONENTS,
				 orocoscomponentmodelFactory.eINSTANCE.createTaskContext()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__INPUT_PORTS,
				 orocoscomponentmodelFactory.eINSTANCE.createCompInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__OUTPUT_PORTS,
				 orocoscomponentmodelFactory.eINSTANCE.createCompOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__CONNECTION_POLICIES,
				 orocoscomponentmodelFactory.eINSTANCE.createConnectionPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__OPERATIONS,
				 orocoscomponentmodelFactory.eINSTANCE.createCompOperation()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__OPERATION_CALLERS,
				 orocoscomponentmodelFactory.eINSTANCE.createCompOperationCaller()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__PEERS_CONNECTIONS,
				 orocoscomponentmodelFactory.eINSTANCE.createPeersConnection()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.COMPOSITE__PROPERTIES,
				 orocoscomponentmodelFactory.eINSTANCE.createCompProperty()));
	}

}
