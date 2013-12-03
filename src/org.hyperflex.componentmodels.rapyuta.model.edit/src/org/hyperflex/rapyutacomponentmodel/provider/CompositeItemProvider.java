/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
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
package org.hyperflex.rapyutacomponentmodel.provider;


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
import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelFactory;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * This is the item provider adapter for a {@link org.hyperflex.rapyutacomponentmodel.Composite} object.
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
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__COMPONENTS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__PUBLISHERS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__SUBSCRIBERS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__TOPICS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__SRV_SERVERS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__SRV_CLIENTS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__SRV_CONNECTIONS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__PARAMETERS);
			childrenFeatures.add(rapyutacomponentmodelPackage.Literals.COMPOSITE__END_POINT);
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
			case rapyutacomponentmodelPackage.COMPOSITE__COMPONENTS:
			case rapyutacomponentmodelPackage.COMPOSITE__PUBLISHERS:
			case rapyutacomponentmodelPackage.COMPOSITE__SUBSCRIBERS:
			case rapyutacomponentmodelPackage.COMPOSITE__TOPICS:
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_SERVERS:
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CLIENTS:
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CONNECTIONS:
			case rapyutacomponentmodelPackage.COMPOSITE__PARAMETERS:
			case rapyutacomponentmodelPackage.COMPOSITE__END_POINT:
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
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__COMPONENTS,
				 rapyutacomponentmodelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__COMPONENTS,
				 rapyutacomponentmodelFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__COMPONENTS,
				 rapyutacomponentmodelFactory.eINSTANCE.createRobotEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__COMPONENTS,
				 rapyutacomponentmodelFactory.eINSTANCE.createEnvironmentEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__PUBLISHERS,
				 rapyutacomponentmodelFactory.eINSTANCE.createCompositePublisher()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__SUBSCRIBERS,
				 rapyutacomponentmodelFactory.eINSTANCE.createCompositeSubscriber()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__TOPICS,
				 rapyutacomponentmodelFactory.eINSTANCE.createTopic()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__SRV_SERVERS,
				 rapyutacomponentmodelFactory.eINSTANCE.createCompositeSrvServer()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__SRV_CLIENTS,
				 rapyutacomponentmodelFactory.eINSTANCE.createCompositeSrvClient()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__SRV_CONNECTIONS,
				 rapyutacomponentmodelFactory.eINSTANCE.createCompositeSrvConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__PARAMETERS,
				 rapyutacomponentmodelFactory.eINSTANCE.createCompositeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(rapyutacomponentmodelPackage.Literals.COMPOSITE__END_POINT,
				 rapyutacomponentmodelFactory.eINSTANCE.createRobotEndPoint()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == rapyutacomponentmodelPackage.Literals.COMPOSITE__COMPONENTS ||
			childFeature == rapyutacomponentmodelPackage.Literals.COMPOSITE__END_POINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
