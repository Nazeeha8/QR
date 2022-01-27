/**
 */
package qR1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.Algorithm#getHashingAlgo <em>Hashing Algo</em>}</li>
 *   <li>{@link qR1.Algorithm#getHashCode <em>Hash Code</em>}</li>
 *   <li>{@link qR1.Algorithm#getDecryptedqr <em>Decryptedqr</em>}</li>
 *   <li>{@link qR1.Algorithm#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Hashing Algo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashing Algo</em>' attribute.
	 * @see #setHashingAlgo(String)
	 * @see qR1.QR1Package#getAlgorithm_HashingAlgo()
	 * @model
	 * @generated
	 */
	String getHashingAlgo();

	/**
	 * Sets the value of the '{@link qR1.Algorithm#getHashingAlgo <em>Hashing Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashing Algo</em>' attribute.
	 * @see #getHashingAlgo()
	 * @generated
	 */
	void setHashingAlgo(String value);

	/**
	 * Returns the value of the '<em><b>Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Code</em>' attribute.
	 * @see #setHashCode(String)
	 * @see qR1.QR1Package#getAlgorithm_HashCode()
	 * @model
	 * @generated
	 */
	String getHashCode();

	/**
	 * Sets the value of the '{@link qR1.Algorithm#getHashCode <em>Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Code</em>' attribute.
	 * @see #getHashCode()
	 * @generated
	 */
	void setHashCode(String value);

	/**
	 * Returns the value of the '<em><b>Decryptedqr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decryptedqr</em>' reference.
	 * @see #setDecryptedqr(DecryptedQR)
	 * @see qR1.QR1Package#getAlgorithm_Decryptedqr()
	 * @model required="true"
	 * @generated
	 */
	DecryptedQR getDecryptedqr();

	/**
	 * Sets the value of the '{@link qR1.Algorithm#getDecryptedqr <em>Decryptedqr</em>}' reference.
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
	 * @see qR1.QR1Package#getAlgorithm_Comparison()
	 * @model required="true"
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link qR1.Algorithm#getComparison <em>Comparison</em>}' reference.
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
	void Hashing();

} // Algorithm
