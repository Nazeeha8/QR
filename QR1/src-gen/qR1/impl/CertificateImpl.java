/**
 */
package qR1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qR1.Certificate;
import qR1.QR1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.CertificateImpl#getSenderID <em>Sender ID</em>}</li>
 *   <li>{@link qR1.impl.CertificateImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link qR1.impl.CertificateImpl#getValidDate <em>Valid Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificateImpl extends MinimalEObjectImpl.Container implements Certificate {
	/**
	 * The default value of the '{@link #getSenderID() <em>Sender ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderID()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSenderID() <em>Sender ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderID()
	 * @generated
	 * @ordered
	 */
	protected String senderID = SENDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String publicKey = PUBLIC_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidDate() <em>Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidDate() <em>Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDate()
	 * @generated
	 * @ordered
	 */
	protected String validDate = VALID_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.CERTIFICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSenderID() {
		return senderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSenderID(String newSenderID) {
		String oldSenderID = senderID;
		senderID = newSenderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.CERTIFICATE__SENDER_ID, oldSenderID,
					senderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKey(String newPublicKey) {
		String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.CERTIFICATE__PUBLIC_KEY, oldPublicKey,
					publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidDate() {
		return validDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidDate(String newValidDate) {
		String oldValidDate = validDate;
		validDate = newValidDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.CERTIFICATE__VALID_DATE, oldValidDate,
					validDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QR1Package.CERTIFICATE__SENDER_ID:
			return getSenderID();
		case QR1Package.CERTIFICATE__PUBLIC_KEY:
			return getPublicKey();
		case QR1Package.CERTIFICATE__VALID_DATE:
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
		case QR1Package.CERTIFICATE__SENDER_ID:
			setSenderID((String) newValue);
			return;
		case QR1Package.CERTIFICATE__PUBLIC_KEY:
			setPublicKey((String) newValue);
			return;
		case QR1Package.CERTIFICATE__VALID_DATE:
			setValidDate((String) newValue);
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
		case QR1Package.CERTIFICATE__SENDER_ID:
			setSenderID(SENDER_ID_EDEFAULT);
			return;
		case QR1Package.CERTIFICATE__PUBLIC_KEY:
			setPublicKey(PUBLIC_KEY_EDEFAULT);
			return;
		case QR1Package.CERTIFICATE__VALID_DATE:
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
		case QR1Package.CERTIFICATE__SENDER_ID:
			return SENDER_ID_EDEFAULT == null ? senderID != null : !SENDER_ID_EDEFAULT.equals(senderID);
		case QR1Package.CERTIFICATE__PUBLIC_KEY:
			return PUBLIC_KEY_EDEFAULT == null ? publicKey != null : !PUBLIC_KEY_EDEFAULT.equals(publicKey);
		case QR1Package.CERTIFICATE__VALID_DATE:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (senderID: ");
		result.append(senderID);
		result.append(", publicKey: ");
		result.append(publicKey);
		result.append(", validDate: ");
		result.append(validDate);
		result.append(')');
		return result.toString();
	}

} //CertificateImpl
