/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels.provider;


import it.unibg.robotics.resolutionmodels.provider.RMRequiredConnectionsItemProvider;

import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ROSRequiredConnectionsItemProvider
	extends RMRequiredConnectionsItemProvider
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
	public ROSRequiredConnectionsItemProvider(AdapterFactory adapterFactory) {
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

			addRequiredTopicConnectionsPropertyDescriptor(object);
			addRequiredServiceConnectionsPropertyDescriptor(object);
			addRequiredActionConnectionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required Topic Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredTopicConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSRequiredConnections_requiredTopicConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSRequiredConnections_requiredTopicConnections_feature", "_UI_ROSRequiredConnections_type"),
				 rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Service Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredServiceConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSRequiredConnections_requiredServiceConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSRequiredConnections_requiredServiceConnections_feature", "_UI_ROSRequiredConnections_type"),
				 rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Action Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredActionConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSRequiredConnections_requiredActionConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSRequiredConnections_requiredActionConnections_feature", "_UI_ROSRequiredConnections_type"),
				 rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS);
			childrenFeatures.add(rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS);
			childrenFeatures.add(rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS);
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
	 * This returns ROSRequiredConnections.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ROSRequiredConnections"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ROSRequiredConnections_type");
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

		switch (notification.getFeatureID(ROSRequiredConnections.class)) {
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS:
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS:
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS:
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
				(rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSTopicConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSServiceConnection()));

		newChildDescriptors.add
			(createChildParameter
				(rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS,
				 rosresolutionmodelsFactory.eINSTANCE.createROSActionConnection()));
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