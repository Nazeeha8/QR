/**
 */
package qR1.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qR1.DateData;
import qR1.QR1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.DateDataImpl#getOriginalData <em>Original Data</em>}</li>
 *   <li>{@link qR1.impl.DateDataImpl#getValidDate <em>Valid Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateDataImpl extends MinimalEObjectImpl.Container implements DateData {
	/**
	 * The default value of the '{@link #getOriginalData() <em>Original Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalData()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalData() <em>Original Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalData()
	 * @generated
	 * @ordered
	 */
	protected String originalData = ORIGINAL_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidDate() <em>Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidDate() <em>Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDate()
	 * @generated
	 * @ordered
	 */
	protected Date validDate = VALID_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.DATE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalData() {
		return originalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalData(String newOriginalData) {
		String oldOriginalData = originalData;
		originalData = newOriginalData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.DATE_DATA__ORIGINAL_DATA, oldOriginalData,
					originalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValidDate() {
		return validDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidDate(Date newValidDate) {
		Date oldValidDate = validDate;
		validDate = newValidDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.DATE_DATA__VALID_DATE, oldValidDate,
					validDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void hashing() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QR1Package.DATE_DATA__ORIGINAL_DATA:
			return getOriginalData();
		case QR1Package.DATE_DATA__VALID_DATE:
			return getValidDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QR1Package.DATE_DATA__ORIGINAL_DATA:
			setOriginalData((String) newValue);
			return;
		case QR1Package.DATE_DATA__VALID_DATE:
			setValidDate((Date) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QR1Package.DATE_DATA__ORIGINAL_DATA:
			setOriginalData(ORIGINAL_DATA_EDEFAULT);
			return;
		case QR1Package.DATE_DATA__VALID_DATE:
			setValidDate(VALID_DATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QR1Package.DATE_DATA__ORIGINAL_DATA:
			return ORIGINAL_DATA_EDEFAULT == null ? originalData != null : !ORIGINAL_DATA_EDEFAULT.equals(originalData);
		case QR1Package.DATE_DATA__VALID_DATE:
			return VALID_DATE_EDEFAULT == null ? validDate != null : !VALID_DATE_EDEFAULT.equals(validDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case QR1Package.DATE_DATA___HASHING:
			hashing();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (originalData: ");
		result.append(originalData);
		result.append(", validDate: ");
		result.append(validDate);
		result.append(')');
		return result.toString();
	}

} //DateDataImpl
