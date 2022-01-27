/**
 */
package qR1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.Signature#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link qR1.Signature#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link qR1.Signature#getDecyptedData <em>Decypted Data</em>}</li>
 *   <li>{@link qR1.Signature#getHashcode <em>Hashcode</em>}</li>
 *   <li>{@link qR1.Signature#getDecryptedqr <em>Decryptedqr</em>}</li>
 *   <li>{@link qR1.Signature#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getSignature()
 * @model
 * @generated
 */
public interface Signature extends EObject {
	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see qR1.QR1Package#getSignature_PrivateKey()
	 * @model
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link qR1.Signature#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

	/**
	 * Returns the value of the '<em><b>Encrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Data</em>' attribute.
	 * @see #setEncryptedData(String)
	 * @see qR1.QR1Package#getSignature_EncryptedData()
	 * @model
	 * @generated
	 */
	String getEncryptedData();

	/**
	 * Sets the value of the '{@link qR1.Signature#getEncryptedData <em>Encrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Data</em>' attribute.
	 * @see #getEncryptedData()
	 * @generated
	 */
	void setEncryptedData(String value);

	/**
	 * Returns the value of the '<em><b>Decypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decypted Data</em>' attribute.
	 * @see #setDecyptedData(String)
	 * @see qR1.QR1Package#getSignature_DecyptedData()
	 * @model
	 * @generated
	 */
	String getDecyptedData();

	/**
	 * Sets the value of the '{@link qR1.Signature#getDecyptedData <em>Decypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decypted Data</em>' attribute.
	 * @see #getDecyptedData()
	 * @generated
	 */
	void setDecyptedData(String value);

	/**
	 * Returns the value of the '<em><b>Hashcode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashcode</em>' reference.
	 * @see #setHashcode(DateData)
	 * @see qR1.QR1Package#getSignature_Hashcode()
	 * @model required="true"
	 * @generated
	 */
	DateData getHashcode();

	/**
	 * Sets the value of the '{@link qR1.Signature#getHashcode <em>Hashcode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashcode</em>' reference.
	 * @see #getHashcode()
	 * @generated
	 */
	void setHashcode(DateData value);

	/**
	 * Returns the value of the '<em><b>Decryptedqr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decryptedqr</em>' reference.
	 * @see #setDecryptedqr(DecryptedQR)
	 * @see qR1.QR1Package#getSignature_Decryptedqr()
	 * @model required="true"
	 * @generated
	 */
	DecryptedQR getDecryptedqr();

	/**
	 * Sets the value of the '{@link qR1.Signature#getDecryptedqr <em>Decryptedqr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decryptedqr</em>' reference.
	 * @see #getDecryptedqr()
	 * @generated
	 */
	void setDecryptedqr(DecryptedQR value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' reference.
	 * @see #setComparison(Comparison)
	 * @see qR1.QR1Package#getSignature_Comparison()
	 * @model required="true"
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link qR1.Signature#getComparison <em>Comparison</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' reference.
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparison value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void encryption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void decyption();

} // Signature
