/**
 */
package qR1;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qR1.DateData#getOriginalData <em>Original Data</em>}</li>
 *   <li>{@link qR1.DateData#getValidDate <em>Valid Date</em>}</li>
 * </ul>
 *
 * @see qR1.QR1Package#getDateData()
 * @model
 * @generated
 */
public interface DateData extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Data</em>' attribute.
	 * @see #setOriginalData(String)
	 * @see qR1.QR1Package#getDateData_OriginalData()
	 * @model
	 * @generated
	 */
	String getOriginalData();

	/**
	 * Sets the value of the '{@link qR1.DateData#getOriginalData <em>Original Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Data</em>' attribute.
	 * @see #getOriginalData()
	 * @generated
	 */
	void setOriginalData(String value);

	/**
	 * Returns the value of the '<em><b>Valid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Date</em>' attribute.
	 * @see #setValidDate(Date)
	 * @see qR1.QR1Package#getDateData_ValidDate()
	 * @model
	 * @generated
	 */
	Date getValidDate();

	/**
	 * Sets the value of the '{@link qR1.DateData#getValidDate <em>Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Date</em>' attribute.
	 * @see #getValidDate()
	 * @generated
	 */
	void setValidDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void hashing();

} // DateData
