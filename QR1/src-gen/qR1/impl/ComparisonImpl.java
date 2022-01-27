/**
 */
package qR1.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qR1.Comparison;
import qR1.QR1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.ComparisonImpl#getHashCode <em>Hash Code</em>}</li>
 *   <li>{@link qR1.impl.ComparisonImpl#getDecryptedData <em>Decrypted Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends MinimalEObjectImpl.Container implements Comparison {
	/**
	 * The default value of the '{@link #getHashCode() <em>Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashCode()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashCode() <em>Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashCode()
	 * @generated
	 * @ordered
	 */
	protected String hashCode = HASH_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecryptedData() <em>Decrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecryptedData()
	 * @generated
	 * @ordered
	 */
	protected static final String DECRYPTED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecryptedData() <em>Decrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecryptedData()
	 * @generated
	 * @ordered
	 */
	protected String decryptedData = DECRYPTED_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHashCode() {
		return hashCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHashCode(String newHashCode) {
		String oldHashCode = hashCode;
		hashCode = newHashCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.COMPARISON__HASH_CODE, oldHashCode,
					hashCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecryptedData() {
		return decryptedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecryptedData(String newDecryptedData) {
		String oldDecryptedData = decryptedData;
		decryptedData = newDecryptedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.COMPARISON__DECRYPTED_DATA,
					oldDecryptedData, decryptedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void comparison() {
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
		case QR1Package.COMPARISON__HASH_CODE:
			return getHashCode();
		case QR1Package.COMPARISON__DECRYPTED_DATA:
			return getDecryptedData();
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
		case QR1Package.COMPARISON__HASH_CODE:
			setHashCode((String) newValue);
			return;
		case QR1Package.COMPARISON__DECRYPTED_DATA:
			setDecryptedData((String) newValue);
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
		case QR1Package.COMPARISON__HASH_CODE:
			setHashCode(HASH_CODE_EDEFAULT);
			return;
		case QR1Package.COMPARISON__DECRYPTED_DATA:
			setDecryptedData(DECRYPTED_DATA_EDEFAULT);
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
		case QR1Package.COMPARISON__HASH_CODE:
			return HASH_CODE_EDEFAULT == null ? hashCode != null : !HASH_CODE_EDEFAULT.equals(hashCode);
		case QR1Package.COMPARISON__DECRYPTED_DATA:
			return DECRYPTED_DATA_EDEFAULT == null ? decryptedData != null
					: !DECRYPTED_DATA_EDEFAULT.equals(decryptedData);
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
		case QR1Package.COMPARISON___COMPARISON:
			comparison();
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
		result.append(" (hashCode: ");
		result.append(hashCode);
		result.append(", decryptedData: ");
		result.append(decryptedData);
		result.append(')');
		return result.toString();
	}

} //ComparisonImpl
