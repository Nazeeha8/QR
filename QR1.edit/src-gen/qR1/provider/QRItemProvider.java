/**
 */
package qR1.provider;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qR1.QR;
import qR1.QR1Factory;
import qR1.QR1Package;

/**
 * This is the item provider adapter for a {@link qR1.QR} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QRItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QR1Package.Literals.QR__HASHCODE);
			childrenFeatures.add(QR1Package.Literals.QR__SIGNATURE);
			childrenFeatures.add(QR1Package.Literals.QR__ENCRYPTEDQR);
			childrenFeatures.add(QR1Package.Literals.QR__DECRYPTEDQR);
			childrenFeatures.add(QR1Package.Literals.QR__COMPARISON);
			childrenFeatures.add(QR1Package.Literals.QR__ALGORITHM);
			childrenFeatures.add(QR1Package.Literals.QR__CERTIFICATE);
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
	 * This returns QR.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QR"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_QR_type");
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

		switch (notification.getFeatureID(QR.class)) {
		case QR1Package.QR__HASHCODE:
		case QR1Package.QR__SIGNATURE:
		case QR1Package.QR__ENCRYPTEDQR:
		case QR1Package.QR__DECRYPTEDQR:
		case QR1Package.QR__COMPARISON:
		case QR1Package.QR__ALGORITHM:
		case QR1Package.QR__CERTIFICATE:
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

		newChildDescriptors
				.add(createChildParameter(QR1Package.Literals.QR__HASHCODE, QR1Factory.eINSTANCE.createDateData()));

		newChildDescriptors
				.add(createChildParameter(QR1Package.Literals.QR__SIGNATURE, QR1Factory.eINSTANCE.createSignature()));

		newChildDescriptors.add(
				createChildParameter(QR1Package.Literals.QR__ENCRYPTEDQR, QR1Factory.eINSTANCE.createEncryptedQR()));

		newChildDescriptors.add(
				createChildParameter(QR1Package.Literals.QR__DECRYPTEDQR, QR1Factory.eINSTANCE.createDecryptedQR()));

		newChildDescriptors
				.add(createChildParameter(QR1Package.Literals.QR__COMPARISON, QR1Factory.eINSTANCE.createComparison()));

		newChildDescriptors
				.add(createChildParameter(QR1Package.Literals.QR__ALGORITHM, QR1Factory.eINSTANCE.createAlgorithm()));

		newChildDescriptors.add(
				createChildParameter(QR1Package.Literals.QR__CERTIFICATE, QR1Factory.eINSTANCE.createCertificate()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QR1EditPlugin.INSTANCE;
	}

}
