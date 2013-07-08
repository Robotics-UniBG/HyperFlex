/**
 * Variability Modeling And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.roscomponentmodel.provider;


import it.unibg.robotics.roscomponentmodel.roscomponentmodelFactory;
import it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage;

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
 * This is the item provider adapter for a {@link it.unibg.robotics.roscomponentmodel.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
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
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_name_feature", "_UI_Package_type"),
				 roscomponentmodelPackage.Literals.PACKAGE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__NODES);
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__MSG_PRODUCERS);
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__MSG_CONSUMERS);
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__TOPICS);
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__SRV_PRODUCERS);
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__SRV_CONSUMERS);
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__WIRES);
			childrenFeatures.add(roscomponentmodelPackage.Literals.PACKAGE__PROPERTIES);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((it.unibg.robotics.roscomponentmodel.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(it.unibg.robotics.roscomponentmodel.Package.class)) {
			case roscomponentmodelPackage.PACKAGE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case roscomponentmodelPackage.PACKAGE__NODES:
			case roscomponentmodelPackage.PACKAGE__MSG_PRODUCERS:
			case roscomponentmodelPackage.PACKAGE__MSG_CONSUMERS:
			case roscomponentmodelPackage.PACKAGE__TOPICS:
			case roscomponentmodelPackage.PACKAGE__SRV_PRODUCERS:
			case roscomponentmodelPackage.PACKAGE__SRV_CONSUMERS:
			case roscomponentmodelPackage.PACKAGE__WIRES:
			case roscomponentmodelPackage.PACKAGE__PROPERTIES:
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
				(roscomponentmodelPackage.Literals.PACKAGE__NODES,
				 roscomponentmodelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__NODES,
				 roscomponentmodelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__MSG_PRODUCERS,
				 roscomponentmodelFactory.eINSTANCE.createPackageMsgProducer()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__MSG_CONSUMERS,
				 roscomponentmodelFactory.eINSTANCE.createPackageMsgConsumer()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__TOPICS,
				 roscomponentmodelFactory.eINSTANCE.createTopic()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__SRV_PRODUCERS,
				 roscomponentmodelFactory.eINSTANCE.createPackageSrvProducer()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__SRV_CONSUMERS,
				 roscomponentmodelFactory.eINSTANCE.createPackageSrvConsumer()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__WIRES,
				 roscomponentmodelFactory.eINSTANCE.createWire()));

		newChildDescriptors.add
			(createChildParameter
				(roscomponentmodelPackage.Literals.PACKAGE__PROPERTIES,
				 roscomponentmodelFactory.eINSTANCE.createCompositeProperty()));
	}

}
