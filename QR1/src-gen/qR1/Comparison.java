/**
 */
package qR1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.Comparison#getHashCode <em>Hash Code</em>}</li>
 *   <li>{@link qR1.Comparison#getDecryptedData <em>Decrypted Data</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends EObject {
	/**
	 * Returns the value of the '<em><b>Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Code</em>' attribute.
	 * @see #setHashCode(String)
	 * @see qR1.QR1Package#getComparison_HashCode()
	 * @model
	 * @generated
	 */
	String getHashCode();

	/**
	 * Sets the value of the '{@link qR1.Comparison#getHashCode <em>Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Code</em>' attribute.
	 * @see #getHashCode()
	 * @generated
	 */
	void setHashCode(String value);

	/**
	 * Returns the value of the '<em><b>Decrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrypted Data</em>' attribute.
	 * @see #setDecryptedData(String)
	 * @see qR1.QR1Package#getComparison_DecryptedData()
	 * @model
	 * @generated
	 */
	String getDecryptedData();

	/**
	 * Sets the value of the '{@link qR1.Comparison#getDecryptedData <em>Decrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decrypted Data</em>' attribute.
	 * @see #getDecryptedData()
	 * @generated
	 */
	void setDecryptedData(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void comparison();

} // Comparison
