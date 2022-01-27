/**
 */
package qR1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qR1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qR1.QR1Package
 * @generated
 */
public class QR1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QR1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QR1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QR1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QR1Switch<Adapter> modelSwitch = new QR1Switch<Adapter>() {
		@Override
		public Adapter caseQR(QR object) {
			return createQRAdapter();
		}

		@Override
		public Adapter caseDateData(DateData object) {
			return createDateDataAdapter();
		}

		@Override
		public Adapter caseEncryptedQR(EncryptedQR object) {
			return createEncryptedQRAdapter();
		}

		@Override
		public Adapter caseDecryptedQR(DecryptedQR object) {
			return createDecryptedQRAdapter();
		}

		@Override
		public Adapter caseAlgorithm(Algorithm object) {
			return createAlgorithmAdapter();
		}

		@Override
		public Adapter caseSignature(Signature object) {
			return createSignatureAdapter();
		}

		@Override
		public Adapter caseCertificate(Certificate object) {
			return createCertificateAdapter();
		}

		@Override
		public Adapter caseComparison(Comparison object) {
			return createComparisonAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.QR <em>QR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.QR
	 * @generated
	 */
	public Adapter createQRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.DateData <em>Date Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.DateData
	 * @generated
	 */
	public Adapter createDateDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.EncryptedQR <em>Encrypted QR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.EncryptedQR
	 * @generated
	 */
	public Adapter createEncryptedQRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.DecryptedQR <em>Decrypted QR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.DecryptedQR
	 * @generated
	 */
	public Adapter createDecryptedQRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.Algorithm
	 * @generated
	 */
	public Adapter createAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.Certificate
	 * @generated
	 */
	public Adapter createCertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qR1.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qR1.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QR1AdapterFactory
