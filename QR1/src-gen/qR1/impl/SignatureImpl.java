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

import qR1.Comparison;
import qR1.DateData;
import qR1.DecryptedQR;
import qR1.QR1Package;
import qR1.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.SignatureImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link qR1.impl.SignatureImpl#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link qR1.impl.SignatureImpl#getDecyptedData <em>Decypted Data</em>}</li>
 *   <li>{@link qR1.impl.SignatureImpl#getHashcode <em>Hashcode</em>}</li>
 *   <li>{@link qR1.impl.SignatureImpl#getDecryptedqr <em>Decryptedqr</em>}</li>
 *   <li>{@link qR1.impl.SignatureImpl#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends MinimalEObjectImpl.Container implements Signature {
	/**
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptedData() <em>Encrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedData()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptedData() <em>Encrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedData()
	 * @generated
	 * @ordered
	 */
	protected String encryptedData = ENCRYPTED_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecyptedData() <em>Decypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecyptedData()
	 * @generated
	 * @ordered
	 */
	protected static final String DECYPTED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecyptedData() <em>Decypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecyptedData()
	 * @generated
	 * @ordered
	 */
	protected String decyptedData = DECYPTED_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHashcode() <em>Hashcode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashcode()
	 * @generated
	 * @ordered
	 */
	protected DateData hashcode;

	/**
	 * The cached value of the '{@link #getDecryptedqr() <em>Decryptedqr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecryptedqr()
	 * @generated
	 * @ordered
	 */
	protected DecryptedQR decryptedqr;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected Comparison comparison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.SIGNATURE__PRIVATE_KEY, oldPrivateKey,
					privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptedData() {
		return encryptedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedData(String newEncryptedData) {
		String oldEncryptedData = encryptedData;
		encryptedData = newEncryptedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.SIGNATURE__ENCRYPTED_DATA,
					oldEncryptedData, encryptedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecyptedData() {
		return decyptedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecyptedData(String newDecyptedData) {
		String oldDecyptedData = decyptedData;
		decyptedData = newDecyptedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.SIGNATURE__DECYPTED_DATA, oldDecyptedData,
					decyptedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateData getHashcode() {
		if (hashcode != null && hashcode.eIsProxy()) {
			InternalEObject oldHashcode = (InternalEObject) hashcode;
			hashcode = (DateData) eResolveProxy(oldHashcode);
			if (hashcode != oldHashcode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.SIGNATURE__HASHCODE,
							oldHashcode, hashcode));
			}
		}
		return hashcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateData basicGetHashcode() {
		return hashcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHashcode(DateData newHashcode) {
		DateData oldHashcode = hashcode;
		hashcode = newHashcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.SIGNATURE__HASHCODE, oldHashcode,
					hashcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecryptedQR getDecryptedqr() {
		if (decryptedqr != null && decryptedqr.eIsProxy()) {
			InternalEObject oldDecryptedqr = (InternalEObject) decryptedqr;
			decryptedqr = (DecryptedQR) eResolveProxy(oldDecryptedqr);
			if (decryptedqr != oldDecryptedqr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.SIGNATURE__DECRYPTEDQR,
							oldDecryptedqr, decryptedqr));
			}
		}
		return decryptedqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecryptedQR basicGetDecryptedqr() {
		return decryptedqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecryptedqr(DecryptedQR newDecryptedqr) {
		DecryptedQR oldDecryptedqr = decryptedqr;
		decryptedqr = newDecryptedqr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.SIGNATURE__DECRYPTEDQR, oldDecryptedqr,
					decryptedqr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison getComparison() {
		if (comparison != null && comparison.eIsProxy()) {
			InternalEObject oldComparison = (InternalEObject) comparison;
			comparison = (Comparison) eResolveProxy(oldComparison);
			if (comparison != oldComparison) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.SIGNATURE__COMPARISON,
							oldComparison, comparison));
			}
		}
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison basicGetComparison() {
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparison(Comparison newComparison) {
		Comparison oldComparison = comparison;
		comparison = newComparison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.SIGNATURE__COMPARISON, oldComparison,
					comparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void encryption() {
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
	public void decyption() {
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
		case QR1Package.SIGNATURE__PRIVATE_KEY:
			return getPrivateKey();
		case QR1Package.SIGNATURE__ENCRYPTED_DATA:
			return getEncryptedData();
		case QR1Package.SIGNATURE__DECYPTED_DATA:
			return getDecyptedData();
		case QR1Package.SIGNATURE__HASHCODE:
			if (resolve)
				return getHashcode();
			return basicGetHashcode();
		case QR1Package.SIGNATURE__DECRYPTEDQR:
			if (resolve)
				return getDecryptedqr();
			return basicGetDecryptedqr();
		case QR1Package.SIGNATURE__COMPARISON:
			if (resolve)
				return getComparison();
			return basicGetComparison();
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
		case QR1Package.SIGNATURE__PRIVATE_KEY:
			setPrivateKey((String) newValue);
			return;
		case QR1Package.SIGNATURE__ENCRYPTED_DATA:
			setEncryptedData((String) newValue);
			return;
		case QR1Package.SIGNATURE__DECYPTED_DATA:
			setDecyptedData((String) newValue);
			return;
		case QR1Package.SIGNATURE__HASHCODE:
			setHashcode((DateData) newValue);
			return;
		case QR1Package.SIGNATURE__DECRYPTEDQR:
			setDecryptedqr((DecryptedQR) newValue);
			return;
		case QR1Package.SIGNATURE__COMPARISON:
			setComparison((Comparison) newValue);
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
		case QR1Package.SIGNATURE__PRIVATE_KEY:
			setPrivateKey(PRIVATE_KEY_EDEFAULT);
			return;
		case QR1Package.SIGNATURE__ENCRYPTED_DATA:
			setEncryptedData(ENCRYPTED_DATA_EDEFAULT);
			return;
		case QR1Package.SIGNATURE__DECYPTED_DATA:
			setDecyptedData(DECYPTED_DATA_EDEFAULT);
			return;
		case QR1Package.SIGNATURE__HASHCODE:
			setHashcode((DateData) null);
			return;
		case QR1Package.SIGNATURE__DECRYPTEDQR:
			setDecryptedqr((DecryptedQR) null);
			return;
		case QR1Package.SIGNATURE__COMPARISON:
			setComparison((Comparison) null);
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
		case QR1Package.SIGNATURE__PRIVATE_KEY:
			return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
		case QR1Package.SIGNATURE__ENCRYPTED_DATA:
			return ENCRYPTED_DATA_EDEFAULT == null ? encryptedData != null
					: !ENCRYPTED_DATA_EDEFAULT.equals(encryptedData);
		case QR1Package.SIGNATURE__DECYPTED_DATA:
			return DECYPTED_DATA_EDEFAULT == null ? decyptedData != null : !DECYPTED_DATA_EDEFAULT.equals(decyptedData);
		case QR1Package.SIGNATURE__HASHCODE:
			return hashcode != null;
		case QR1Package.SIGNATURE__DECRYPTEDQR:
			return decryptedqr != null;
		case QR1Package.SIGNATURE__COMPARISON:
			return comparison != null;
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
		case QR1Package.SIGNATURE___ENCRYPTION:
			encryption();
			return null;
		case QR1Package.SIGNATURE___DECYPTION:
			decyption();
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
		result.append(" (privateKey: ");
		result.append(privateKey);
		result.append(", encryptedData: ");
		result.append(encryptedData);
		result.append(", decyptedData: ");
		result.append(decyptedData);
		result.append(')');
		return result.toString();
	}

} //SignatureImpl
