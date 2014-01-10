/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
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
package org.hyperflex.resolutionmodels.rosresolutionmodels.provider;


import org.hyperflex.resolutionmodels.provider.RMTransfConnectionItemProvider;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ROSTransfConnectionItemProvider
	extends RMTransfConnectionItemProvider
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
	public ROSTransfConnectionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(rosresolutionmodelsPackage.Literals.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS);
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
	 * This returns ROSTransfConnection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ROSTransfConnection"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ROSTransfConnection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ROSTransfConnection_type") :
			getString("_UI_ROSTransfConnection_type") + " " + label;
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

		switch (notification.getFeatureID(ROSTransfConnection.class)) {
			case rosresolutionmodelsPackage.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS:
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
				(rosresolutionmodelsPackage.Literals.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSNewTopicConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rosresolutionmodelsPackage.Literals.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSExistingTopicConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rosresolutionmodelsPackage.Literals.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSNewServiceConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rosresolutionmodelsPackage.Literals.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSExistingServiceConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rosresolutionmodelsPackage.Literals.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSNewActionConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rosresolutionmodelsPackage.Literals.ROS_TRANSF_CONNECTION__NEW_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSExistingActionConnection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RosResolutionModelEditPlugin.INSTANCE;
	}

}
