/**
 */
package qR1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encrypted QR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.EncryptedQR#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link qR1.EncryptedQR#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link qR1.EncryptedQR#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link qR1.EncryptedQR#getSignature <em>Signature</em>}</li>
 *   <li>{@link qR1.EncryptedQR#getDatedata <em>Datedata</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getEncryptedQR()
 * @model
 * @generated
 */
public interface EncryptedQR extends EObject {
	/**
	 * Returns the value of the '<em><b>Encrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Data</em>' attribute.
	 * @see #setEncryptedData(String)
	 * @see qR1.QR1Package#getEncryptedQR_EncryptedData()
	 * @model
	 * @generated
	 */
	String getEncryptedData();

	/**
	 * Sets the value of the '{@link qR1.EncryptedQR#getEncryptedData <em>Encrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Data</em>' attribute.
	 * @see #getEncryptedData()
	 * @generated
	 */
	void setEncryptedData(String value);

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' reference.
	 * @see #setCertificate(Certificate)
	 * @see qR1.QR1Package#getEncryptedQR_Certificate()
	 * @model required="true"
	 * @generated
	 */
	Certificate getCertificate();

	/**
	 * Sets the value of the '{@link qR1.EncryptedQR#getCertificate <em>Certificate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' reference.
	 * @see #getCertificate()
	 * @generated
	 */
	void setCertificate(Certificate value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see qR1.QR1Package#getEncryptedQR_Algorithm()
	 * @model required="true"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link qR1.EncryptedQR#getAlgorithm <em>Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(Signature)
	 * @see qR1.QR1Package#getEncryptedQR_Signature()
	 * @model required="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link qR1.EncryptedQR#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Datedata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datedata</em>' reference.
	 * @see #setDatedata(DateData)
	 * @see qR1.QR1Package#getEncryptedQR_Datedata()
	 * @model required="true"
	 * @generated
	 */
	DateData getDatedata();

	/**
	 * Sets the value of the '{@link qR1.EncryptedQR#getDatedata <em>Datedata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datedata</em>' reference.
	 * @see #getDatedata()
	 * @generated
	 */
	void setDatedata(DateData value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void multiplexing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void multilayering();

} // EncryptedQR
