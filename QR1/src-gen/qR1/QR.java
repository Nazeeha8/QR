/**
 */
package qR1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.QR#getHashcode <em>Hashcode</em>}</li>
 *   <li>{@link qR1.QR#getSignature <em>Signature</em>}</li>
 *   <li>{@link qR1.QR#getEncryptedqr <em>Encryptedqr</em>}</li>
 *   <li>{@link qR1.QR#getDecryptedqr <em>Decryptedqr</em>}</li>
 *   <li>{@link qR1.QR#getComparison <em>Comparison</em>}</li>
 *   <li>{@link qR1.QR#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link qR1.QR#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getQR()
 * @model
 * @generated
 */
public interface QR extends EObject {
	/**
	 * Returns the value of the '<em><b>Hashcode</b></em>' containment reference list.
	 * The list contents are of type {@link qR1.DateData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashcode</em>' containment reference list.
	 * @see qR1.QR1Package#getQR_Hashcode()
	 * @model containment="true"
	 * @generated
	 */
	EList<DateData> getHashcode();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link qR1.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see qR1.QR1Package#getQR_Signature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignature();

	/**
	 * Returns the value of the '<em><b>Encryptedqr</b></em>' containment reference list.
	 * The list contents are of type {@link qR1.EncryptedQR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryptedqr</em>' containment reference list.
	 * @see qR1.QR1Package#getQR_Encryptedqr()
	 * @model containment="true"
	 * @generated
	 */
	EList<EncryptedQR> getEncryptedqr();

	/**
	 * Returns the value of the '<em><b>Decryptedqr</b></em>' containment reference list.
	 * The list contents are of type {@link qR1.DecryptedQR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decryptedqr</em>' containment reference list.
	 * @see qR1.QR1Package#getQR_Decryptedqr()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecryptedQR> getDecryptedqr();

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference list.
	 * The list contents are of type {@link qR1.Comparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference list.
	 * @see qR1.QR1Package#getQR_Comparison()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comparison> getComparison();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' containment reference list.
	 * The list contents are of type {@link qR1.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' containment reference list.
	 * @see qR1.QR1Package#getQR_Algorithm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Algorithm> getAlgorithm();

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link qR1.Certificate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' containment reference list.
	 * @see qR1.QR1Package#getQR_Certificate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Certificate> getCertificate();

} // QR
