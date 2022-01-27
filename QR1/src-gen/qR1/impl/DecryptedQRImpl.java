/**
 */
package qR1.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qR1.DecryptedQR;
import qR1.EncryptedQR;
import qR1.QR1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decrypted QR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.DecryptedQRImpl#getDecyptedQR <em>Decypted QR</em>}</li>
 *   <li>{@link qR1.impl.DecryptedQRImpl#getEncryptedqr <em>Encryptedqr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecryptedQRImpl extends MinimalEObjectImpl.Container implements DecryptedQR {
	/**
	 * The default value of the '{@link #getDecyptedQR() <em>Decypted QR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecyptedQR()
	 * @generated
	 * @ordered
	 */
	protected static final String DECYPTED_QR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecyptedQR() <em>Decypted QR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecyptedQR()
	 * @generated
	 * @ordered
	 */
	protected String decyptedQR = DECYPTED_QR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEncryptedqr() <em>Encryptedqr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedqr()
	 * @generated
	 * @ordered
	 */
	protected EncryptedQR encryptedqr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecryptedQRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.DECRYPTED_QR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecyptedQR() {
		return decyptedQR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecyptedQR(String newDecyptedQR) {
		String oldDecyptedQR = decyptedQR;
		decyptedQR = newDecyptedQR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.DECRYPTED_QR__DECYPTED_QR, oldDecyptedQR,
					decyptedQR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedQR getEncryptedqr() {
		if (encryptedqr != null && encryptedqr.eIsProxy()) {
			InternalEObject oldEncryptedqr = (InternalEObject) encryptedqr;
			encryptedqr = (EncryptedQR) eResolveProxy(oldEncryptedqr);
			if (encryptedqr != oldEncryptedqr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.DECRYPTED_QR__ENCRYPTEDQR,
							oldEncryptedqr, encryptedqr));
			}
		}
		return encryptedqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptedQR basicGetEncryptedqr() {
		return encryptedqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedqr(EncryptedQR newEncryptedqr) {
		EncryptedQR oldEncryptedqr = encryptedqr;
		encryptedqr = newEncryptedqr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.DECRYPTED_QR__ENCRYPTEDQR, oldEncryptedqr,
					encryptedqr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void decoding() {
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
		case QR1Package.DECRYPTED_QR__DECYPTED_QR:
			return getDecyptedQR();
		case QR1Package.DECRYPTED_QR__ENCRYPTEDQR:
			if (resolve)
				return getEncryptedqr();
			return basicGetEncryptedqr();
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
		case QR1Package.DECRYPTED_QR__DECYPTED_QR:
			setDecyptedQR((String) newValue);
			return;
		case QR1Package.DECRYPTED_QR__ENCRYPTEDQR:
			setEncryptedqr((EncryptedQR) newValue);
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
		case QR1Package.DECRYPTED_QR__DECYPTED_QR:
			setDecyptedQR(DECYPTED_QR_EDEFAULT);
			return;
		case QR1Package.DECRYPTED_QR__ENCRYPTEDQR:
			setEncryptedqr((EncryptedQR) null);
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
		case QR1Package.DECRYPTED_QR__DECYPTED_QR:
			return DECYPTED_QR_EDEFAULT == null ? decyptedQR != null : !DECYPTED_QR_EDEFAULT.equals(decyptedQR);
		case QR1Package.DECRYPTED_QR__ENCRYPTEDQR:
			return encryptedqr != null;
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
		case QR1Package.DECRYPTED_QR___DECODING:
			decoding();
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
		result.append(" (decyptedQR: ");
		result.append(decyptedQR);
		result.append(')');
		return result.toString();
	}

} //DecryptedQRImpl
