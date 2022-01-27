/**
 */
package qR1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qR1.QR1Package
 * @generated
 */
public interface QR1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QR1Factory eINSTANCE = qR1.impl.QR1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QR</em>'.
	 * @generated
	 */
	QR createQR();

	/**
	 * Returns a new object of class '<em>Date Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Data</em>'.
	 * @generated
	 */
	DateData createDateData();

	/**
	 * Returns a new object of class '<em>Encrypted QR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encrypted QR</em>'.
	 * @generated
	 */
	EncryptedQR createEncryptedQR();

	/**
	 * Returns a new object of class '<em>Decrypted QR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decrypted QR</em>'.
	 * @generated
	 */
	DecryptedQR createDecryptedQR();

	/**
	 * Returns a new object of class '<em>Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algorithm</em>'.
	 * @generated
	 */
	Algorithm createAlgorithm();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificate</em>'.
	 * @generated
	 */
	Certificate createCertificate();

	/**
	 * Returns a new object of class '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison</em>'.
	 * @generated
	 */
	Comparison createComparison();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QR1Package getQR1Package();

} //QR1Factory
