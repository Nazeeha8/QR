/**
 */
package qR1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qR1.Algorithm;
import qR1.Certificate;
import qR1.Comparison;
import qR1.DateData;
import qR1.DecryptedQR;
import qR1.EncryptedQR;
import qR1.QR;
import qR1.QR1Package;
import qR1.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.QRImpl#getHashcode <em>Hashcode</em>}</li>
 *   <li>{@link qR1.impl.QRImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link qR1.impl.QRImpl#getEncryptedqr <em>Encryptedqr</em>}</li>
 *   <li>{@link qR1.impl.QRImpl#getDecryptedqr <em>Decryptedqr</em>}</li>
 *   <li>{@link qR1.impl.QRImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link qR1.impl.QRImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link qR1.impl.QRImpl#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QRImpl extends MinimalEObjectImpl.Container implements QR {
	/**
	 * The cached value of the '{@link #getHashcode() <em>Hashcode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashcode()
	 * @generated
	 * @ordered
	 */
	protected EList<DateData> hashcode;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signature;

	/**
	 * The cached value of the '{@link #getEncryptedqr() <em>Encryptedqr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedqr()
	 * @generated
	 * @ordered
	 */
	protected EList<EncryptedQR> encryptedqr;

	/**
	 * The cached value of the '{@link #getDecryptedqr() <em>Decryptedqr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecryptedqr()
	 * @generated
	 * @ordered
	 */
	protected EList<DecryptedQR> decryptedqr;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithm> algorithm;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<Certificate> certificate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.QR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateData> getHashcode() {
		if (hashcode == null) {
			hashcode = new EObjectContainmentEList<DateData>(DateData.class, this, QR1Package.QR__HASHCODE);
		}
		return hashcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signature> getSignature() {
		if (signature == null) {
			signature = new EObjectContainmentEList<Signature>(Signature.class, this, QR1Package.QR__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EncryptedQR> getEncryptedqr() {
		if (encryptedqr == null) {
			encryptedqr = new EObjectContainmentEList<EncryptedQR>(EncryptedQR.class, this, QR1Package.QR__ENCRYPTEDQR);
		}
		return encryptedqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DecryptedQR> getDecryptedqr() {
		if (decryptedqr == null) {
			decryptedqr = new EObjectContainmentEList<DecryptedQR>(DecryptedQR.class, this, QR1Package.QR__DECRYPTEDQR);
		}
		return decryptedqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison() {
		if (comparison == null) {
			comparison = new EObjectContainmentEList<Comparison>(Comparison.class, this, QR1Package.QR__COMPARISON);
		}
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algorithm> getAlgorithm() {
		if (algorithm == null) {
			algorithm = new EObjectContainmentEList<Algorithm>(Algorithm.class, this, QR1Package.QR__ALGORITHM);
		}
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Certificate> getCertificate() {
		if (certificate == null) {
			certificate = new EObjectContainmentEList<Certificate>(Certificate.class, this, QR1Package.QR__CERTIFICATE);
		}
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QR1Package.QR__HASHCODE:
			return ((InternalEList<?>) getHashcode()).basicRemove(otherEnd, msgs);
		case QR1Package.QR__SIGNATURE:
			return ((InternalEList<?>) getSignature()).basicRemove(otherEnd, msgs);
		case QR1Package.QR__ENCRYPTEDQR:
			return ((InternalEList<?>) getEncryptedqr()).basicRemove(otherEnd, msgs);
		case QR1Package.QR__DECRYPTEDQR:
			return ((InternalEList<?>) getDecryptedqr()).basicRemove(otherEnd, msgs);
		case QR1Package.QR__COMPARISON:
			return ((InternalEList<?>) getComparison()).basicRemove(otherEnd, msgs);
		case QR1Package.QR__ALGORITHM:
			return ((InternalEList<?>) getAlgorithm()).basicRemove(otherEnd, msgs);
		case QR1Package.QR__CERTIFICATE:
			return ((InternalEList<?>) getCertificate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QR1Package.QR__HASHCODE:
			return getHashcode();
		case QR1Package.QR__SIGNATURE:
			return getSignature();
		case QR1Package.QR__ENCRYPTEDQR:
			return getEncryptedqr();
		case QR1Package.QR__DECRYPTEDQR:
			return getDecryptedqr();
		case QR1Package.QR__COMPARISON:
			return getComparison();
		case QR1Package.QR__ALGORITHM:
			return getAlgorithm();
		case QR1Package.QR__CERTIFICATE:
			return getCertificate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QR1Package.QR__HASHCODE:
			getHashcode().clear();
			getHashcode().addAll((Collection<? extends DateData>) newValue);
			return;
		case QR1Package.QR__SIGNATURE:
			getSignature().clear();
			getSignature().addAll((Collection<? extends Signature>) newValue);
			return;
		case QR1Package.QR__ENCRYPTEDQR:
			getEncryptedqr().clear();
			getEncryptedqr().addAll((Collection<? extends EncryptedQR>) newValue);
			return;
		case QR1Package.QR__DECRYPTEDQR:
			getDecryptedqr().clear();
			getDecryptedqr().addAll((Collection<? extends DecryptedQR>) newValue);
			return;
		case QR1Package.QR__COMPARISON:
			getComparison().clear();
			getComparison().addAll((Collection<? extends Comparison>) newValue);
			return;
		case QR1Package.QR__ALGORITHM:
			getAlgorithm().clear();
			getAlgorithm().addAll((Collection<? extends Algorithm>) newValue);
			return;
		case QR1Package.QR__CERTIFICATE:
			getCertificate().clear();
			getCertificate().addAll((Collection<? extends Certificate>) newValue);
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
		case QR1Package.QR__HASHCODE:
			getHashcode().clear();
			return;
		case QR1Package.QR__SIGNATURE:
			getSignature().clear();
			return;
		case QR1Package.QR__ENCRYPTEDQR:
			getEncryptedqr().clear();
			return;
		case QR1Package.QR__DECRYPTEDQR:
			getDecryptedqr().clear();
			return;
		case QR1Package.QR__COMPARISON:
			getComparison().clear();
			return;
		case QR1Package.QR__ALGORITHM:
			getAlgorithm().clear();
			return;
		case QR1Package.QR__CERTIFICATE:
			getCertificate().clear();
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
		case QR1Package.QR__HASHCODE:
			return hashcode != null && !hashcode.isEmpty();
		case QR1Package.QR__SIGNATURE:
			return signature != null && !signature.isEmpty();
		case QR1Package.QR__ENCRYPTEDQR:
			return encryptedqr != null && !encryptedqr.isEmpty();
		case QR1Package.QR__DECRYPTEDQR:
			return decryptedqr != null && !decryptedqr.isEmpty();
		case QR1Package.QR__COMPARISON:
			return comparison != null && !comparison.isEmpty();
		case QR1Package.QR__ALGORITHM:
			return algorithm != null && !algorithm.isEmpty();
		case QR1Package.QR__CERTIFICATE:
			return certificate != null && !certificate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QRImpl
