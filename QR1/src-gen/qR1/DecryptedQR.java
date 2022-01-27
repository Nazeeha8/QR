/**
 */
package qR1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decrypted QR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.DecryptedQR#getDecyptedQR <em>Decypted QR</em>}</li>
 *   <li>{@link qR1.DecryptedQR#getEncryptedqr <em>Encryptedqr</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getDecryptedQR()
 * @model
 * @generated
 */
public interface DecryptedQR extends EObject {
	/**
	 * Returns the value of the '<em><b>Decypted QR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decypted QR</em>' attribute.
	 * @see #setDecyptedQR(String)
	 * @see qR1.QR1Package#getDecryptedQR_DecyptedQR()
	 * @model
	 * @generated
	 */
	String getDecyptedQR();

	/**
	 * Sets the value of the '{@link qR1.DecryptedQR#getDecyptedQR <em>Decypted QR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decypted QR</em>' attribute.
	 * @see #getDecyptedQR()
	 * @generated
	 */
	void setDecyptedQR(String value);

	/**
	 * Returns the value of the '<em><b>Encryptedqr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryptedqr</em>' reference.
	 * @see #setEncryptedqr(EncryptedQR)
	 * @see qR1.QR1Package#getDecryptedQR_Encryptedqr()
	 * @model required="true"
	 * @generated
	 */
	EncryptedQR getEncryptedqr();

	/**
	 * Sets the value of the '{@link qR1.DecryptedQR#getEncryptedqr <em>Encryptedqr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryptedqr</em>' reference.
	 * @see #getEncryptedqr()
	 * @generated
	 */
	void setEncryptedqr(EncryptedQR value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void decoding();

} // DecryptedQR
