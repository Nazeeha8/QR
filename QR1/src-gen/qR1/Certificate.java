/**
 */
package qR1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.Certificate#getSenderID <em>Sender ID</em>}</li>
 *   <li>{@link qR1.Certificate#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link qR1.Certificate#getValidDate <em>Valid Date</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getCertificate()
 * @model
 * @generated
 */
public interface Certificate extends EObject {
	/**
	 * Returns the value of the '<em><b>Sender ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender ID</em>' attribute.
	 * @see #setSenderID(String)
	 * @see qR1.QR1Package#getCertificate_SenderID()
	 * @model
	 * @generated
	 */
	String getSenderID();

	/**
	 * Sets the value of the '{@link qR1.Certificate#getSenderID <em>Sender ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender ID</em>' attribute.
	 * @see #getSenderID()
	 * @generated
	 */
	void setSenderID(String value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see qR1.QR1Package#getCertificate_PublicKey()
	 * @model
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link qR1.Certificate#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Valid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Date</em>' attribute.
	 * @see #setValidDate(String)
	 * @see qR1.QR1Package#getCertificate_ValidDate()
	 * @model
	 * @generated
	 */
	String getValidDate();

	/**
	 * Sets the value of the '{@link qR1.Certificate#getValidDate <em>Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Date</em>' attribute.
	 * @see #getValidDate()
	 * @generated
	 */
	void setValidDate(String value);

} // Certificate
