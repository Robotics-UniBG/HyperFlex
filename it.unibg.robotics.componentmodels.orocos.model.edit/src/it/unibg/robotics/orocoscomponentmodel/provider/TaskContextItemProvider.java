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
package it.unibg.robotics.orocoscomponentmodel.provider;


import it.unibg.robotics.orocoscomponentmodel.TaskContext;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelFactory;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.unibg.robotics.orocoscomponentmodel.TaskContext} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskContextItemProvider
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
	public TaskContextItemProvider(AdapterFactory adapterFactory) {
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

			addNamespacePropertyDescriptor(object);
			addClassNamePropertyDescriptor(object);
			addPeriodPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskContext_namespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskContext_namespace_feature", "_UI_TaskContext_type"),
				 orocoscomponentmodelPackage.Literals.TASK_CONTEXT__NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskContext_className_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskContext_className_feature", "_UI_TaskContext_type"),
				 orocoscomponentmodelPackage.Literals.TASK_CONTEXT__CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskContext_period_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskContext_period_feature", "_UI_TaskContext_type"),
				 orocoscomponentmodelPackage.Literals.TASK_CONTEXT__PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskContext_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskContext_priority_feature", "_UI_TaskContext_type"),
				 orocoscomponentmodelPackage.Literals.TASK_CONTEXT__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__INPUT_PORTS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__OUTPUT_PORTS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__PROPERTIES);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__OPERATIONS);
			childrenFeatures.add(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__OPERATION_CALLERS);
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
	 * This returns TaskContext.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskContext"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskContext)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskContext_type") :
			getString("_UI_TaskContext_type") + " " + label;
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

		switch (notification.getFeatureID(TaskContext.class)) {
			case orocoscomponentmodelPackage.TASK_CONTEXT__NAMESPACE:
			case orocoscomponentmodelPackage.TASK_CONTEXT__CLASS_NAME:
			case orocoscomponentmodelPackage.TASK_CONTEXT__PERIOD:
			case orocoscomponentmodelPackage.TASK_CONTEXT__PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__INPUT_PORTS:
			case orocoscomponentmodelPackage.TASK_CONTEXT__OUTPUT_PORTS:
			case orocoscomponentmodelPackage.TASK_CONTEXT__PROPERTIES:
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATIONS:
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATION_CALLERS:
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
				(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__INPUT_PORTS,
				 orocoscomponentmodelFactory.eINSTANCE.createTCInputDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__OUTPUT_PORTS,
				 orocoscomponentmodelFactory.eINSTANCE.createTCOutputDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__PROPERTIES,
				 orocoscomponentmodelFactory.eINSTANCE.createTCProperty()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__OPERATIONS,
				 orocoscomponentmodelFactory.eINSTANCE.createTCOperation()));

		newChildDescriptors.add
			(createChildParameter
				(orocoscomponentmodelPackage.Literals.TASK_CONTEXT__OPERATION_CALLERS,
				 orocoscomponentmodelFactory.eINSTANCE.createTCOperationCaller()));
	}

}
