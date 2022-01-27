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

import qR1.Algorithm;
import qR1.Certificate;
import qR1.DateData;
import qR1.EncryptedQR;
import qR1.QR1Package;
import qR1.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encrypted QR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.EncryptedQRImpl#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link qR1.impl.EncryptedQRImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link qR1.impl.EncryptedQRImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link qR1.impl.EncryptedQRImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link qR1.impl.EncryptedQRImpl#getDatedata <em>Datedata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncryptedQRImpl extends MinimalEObjectImpl.Container implements EncryptedQR {
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
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected Certificate certificate;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Algorithm algorithm;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature signature;

	/**
	 * The cached value of the '{@link #getDatedata() <em>Datedata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatedata()
	 * @generated
	 * @ordered
	 */
	protected DateData datedata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptedQRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.ENCRYPTED_QR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ENCRYPTED_QR__ENCRYPTED_DATA,
					oldEncryptedData, encryptedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Certificate getCertificate() {
		if (certificate != null && certificate.eIsProxy()) {
			InternalEObject oldCertificate = (InternalEObject) certificate;
			certificate = (Certificate) eResolveProxy(oldCertificate);
			if (certificate != oldCertificate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.ENCRYPTED_QR__CERTIFICATE,
							oldCertificate, certificate));
			}
		}
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificate basicGetCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificate(Certificate newCertificate) {
		Certificate oldCertificate = certificate;
		certificate = newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ENCRYPTED_QR__CERTIFICATE, oldCertificate,
					certificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithm getAlgorithm() {
		if (algorithm != null && algorithm.eIsProxy()) {
			InternalEObject oldAlgorithm = (InternalEObject) algorithm;
			algorithm = (Algorithm) eResolveProxy(oldAlgorithm);
			if (algorithm != oldAlgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.ENCRYPTED_QR__ALGORITHM,
							oldAlgorithm, algorithm));
			}
		}
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm basicGetAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(Algorithm newAlgorithm) {
		Algorithm oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ENCRYPTED_QR__ALGORITHM, oldAlgorithm,
					algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject) signature;
			signature = (Signature) eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.ENCRYPTED_QR__SIGNATURE,
							oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(Signature newSignature) {
		Signature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ENCRYPTED_QR__SIGNATURE, oldSignature,
					signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateData getDatedata() {
		if (datedata != null && datedata.eIsProxy()) {
			InternalEObject oldDatedata = (InternalEObject) datedata;
			datedata = (DateData) eResolveProxy(oldDatedata);
			if (datedata != oldDatedata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.ENCRYPTED_QR__DATEDATA,
							oldDatedata, datedata));
			}
		}
		return datedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateData basicGetDatedata() {
		return datedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatedata(DateData newDatedata) {
		DateData oldDatedata = datedata;
		datedata = newDatedata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ENCRYPTED_QR__DATEDATA, oldDatedata,
					datedata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void multiplexing() {
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
	public void multilayering() {
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
		case QR1Package.ENCRYPTED_QR__ENCRYPTED_DATA:
			return getEncryptedData();
		case QR1Package.ENCRYPTED_QR__CERTIFICATE:
			if (resolve)
				return getCertificate();
			return basicGetCertificate();
		case QR1Package.ENCRYPTED_QR__ALGORITHM:
			if (resolve)
				return getAlgorithm();
			return basicGetAlgorithm();
		case QR1Package.ENCRYPTED_QR__SIGNATURE:
			if (resolve)
				return getSignature();
			return basicGetSignature();
		case QR1Package.ENCRYPTED_QR__DATEDATA:
			if (resolve)
				return getDatedata();
			return basicGetDatedata();
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
		case QR1Package.ENCRYPTED_QR__ENCRYPTED_DATA:
			setEncryptedData((String) newValue);
			return;
		case QR1Package.ENCRYPTED_QR__CERTIFICATE:
			setCertificate((Certificate) newValue);
			return;
		case QR1Package.ENCRYPTED_QR__ALGORITHM:
			setAlgorithm((Algorithm) newValue);
			return;
		case QR1Package.ENCRYPTED_QR__SIGNATURE:
			setSignature((Signature) newValue);
			return;
		case QR1Package.ENCRYPTED_QR__DATEDATA:
			setDatedata((DateData) newValue);
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
		case QR1Package.ENCRYPTED_QR__ENCRYPTED_DATA:
			setEncryptedData(ENCRYPTED_DATA_EDEFAULT);
			return;
		case QR1Package.ENCRYPTED_QR__CERTIFICATE:
			setCertificate((Certificate) null);
			return;
		case QR1Package.ENCRYPTED_QR__ALGORITHM:
			setAlgorithm((Algorithm) null);
			return;
		case QR1Package.ENCRYPTED_QR__SIGNATURE:
			setSignature((Signature) null);
			return;
		case QR1Package.ENCRYPTED_QR__DATEDATA:
			setDatedata((DateData) null);
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
		case QR1Package.ENCRYPTED_QR__ENCRYPTED_DATA:
			return ENCRYPTED_DATA_EDEFAULT == null ? encryptedData != null
					: !ENCRYPTED_DATA_EDEFAULT.equals(encryptedData);
		case QR1Package.ENCRYPTED_QR__CERTIFICATE:
			return certificate != null;
		case QR1Package.ENCRYPTED_QR__ALGORITHM:
			return algorithm != null;
		case QR1Package.ENCRYPTED_QR__SIGNATURE:
			return signature != null;
		case QR1Package.ENCRYPTED_QR__DATEDATA:
			return datedata != null;
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
		case QR1Package.ENCRYPTED_QR___MULTIPLEXING:
			multiplexing();
			return null;
		case QR1Package.ENCRYPTED_QR___MULTILAYERING:
			multilayering();
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
		result.append(" (encryptedData: ");
		result.append(encryptedData);
		result.append(')');
		return result.toString();
	}

} //EncryptedQRImpl
