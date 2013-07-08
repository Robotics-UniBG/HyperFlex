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
package it.unibg.robotics.compositionmodel.provider;

import it.unibg.robotics.compositionmodel.compositionmodelPackage;

import it.unibg.robotics.compositionmodel.util.compositionmodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class compositionmodelItemProviderAdapterFactory extends compositionmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(CompositionModelEditPlugin.INSTANCE, compositionmodelPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compositionmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.Connection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionItemProvider connectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAdapter() {
		if (connectionItemProvider == null) {
			connectionItemProvider = new ConnectionItemProvider(this);
		}

		return connectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.ArchitectureModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureModelItemProvider architectureModelItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.ArchitectureModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchitectureModelAdapter() {
		if (architectureModelItemProvider == null) {
			architectureModelItemProvider = new ArchitectureModelItemProvider(this);
		}

		return architectureModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.SystemComposite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCompositeItemProvider systemCompositeItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.SystemComposite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemCompositeAdapter() {
		if (systemCompositeItemProvider == null) {
			systemCompositeItemProvider = new SystemCompositeItemProvider(this);
		}

		return systemCompositeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.SystemProvidedInterf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemProvidedInterfItemProvider systemProvidedInterfItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.SystemProvidedInterf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemProvidedInterfAdapter() {
		if (systemProvidedInterfItemProvider == null) {
			systemProvidedInterfItemProvider = new SystemProvidedInterfItemProvider(this);
		}

		return systemProvidedInterfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.SystemRequiredInterf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequiredInterfItemProvider systemRequiredInterfItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.SystemRequiredInterf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemRequiredInterfAdapter() {
		if (systemRequiredInterfItemProvider == null) {
			systemRequiredInterfItemProvider = new SystemRequiredInterfItemProvider(this);
		}

		return systemRequiredInterfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCompositeProvidedInterfItemProvider systemCompositeProvidedInterfItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemCompositeProvidedInterfAdapter() {
		if (systemCompositeProvidedInterfItemProvider == null) {
			systemCompositeProvidedInterfItemProvider = new SystemCompositeProvidedInterfItemProvider(this);
		}

		return systemCompositeProvidedInterfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCompositeRequiredInterfItemProvider systemCompositeRequiredInterfItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemCompositeRequiredInterfAdapter() {
		if (systemCompositeRequiredInterfItemProvider == null) {
			systemCompositeRequiredInterfItemProvider = new SystemCompositeRequiredInterfItemProvider(this);
		}

		return systemCompositeRequiredInterfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.SystemProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemPropertyItemProvider systemPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.SystemProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemPropertyAdapter() {
		if (systemPropertyItemProvider == null) {
			systemPropertyItemProvider = new SystemPropertyItemProvider(this);
		}

		return systemPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.compositionmodel.SystemCompositeProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCompositePropertyItemProvider systemCompositePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.compositionmodel.SystemCompositeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemCompositePropertyAdapter() {
		if (systemCompositePropertyItemProvider == null) {
			systemCompositePropertyItemProvider = new SystemCompositePropertyItemProvider(this);
		}

		return systemCompositePropertyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (connectionItemProvider != null) connectionItemProvider.dispose();
		if (architectureModelItemProvider != null) architectureModelItemProvider.dispose();
		if (systemCompositeItemProvider != null) systemCompositeItemProvider.dispose();
		if (systemProvidedInterfItemProvider != null) systemProvidedInterfItemProvider.dispose();
		if (systemRequiredInterfItemProvider != null) systemRequiredInterfItemProvider.dispose();
		if (systemCompositeProvidedInterfItemProvider != null) systemCompositeProvidedInterfItemProvider.dispose();
		if (systemCompositeRequiredInterfItemProvider != null) systemCompositeRequiredInterfItemProvider.dispose();
		if (systemPropertyItemProvider != null) systemPropertyItemProvider.dispose();
		if (systemCompositePropertyItemProvider != null) systemCompositePropertyItemProvider.dispose();
	}

}
