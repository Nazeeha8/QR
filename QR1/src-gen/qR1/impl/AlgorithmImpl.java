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
import qR1.Comparison;
import qR1.DecryptedQR;
import qR1.QR1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qR1.impl.AlgorithmImpl#getHashingAlgo <em>Hashing Algo</em>}</li>
 *   <li>{@link qR1.impl.AlgorithmImpl#getHashCode <em>Hash Code</em>}</li>
 *   <li>{@link qR1.impl.AlgorithmImpl#getDecryptedqr <em>Decryptedqr</em>}</li>
 *   <li>{@link qR1.impl.AlgorithmImpl#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmImpl extends MinimalEObjectImpl.Container implements Algorithm {
	/**
	 * The default value of the '{@link #getHashingAlgo() <em>Hashing Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashingAlgo()
	 * @generated
	 * @ordered
	 */
	protected static final String HASHING_ALGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashingAlgo() <em>Hashing Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashingAlgo()
	 * @generated
	 * @ordered
	 */
	protected String hashingAlgo = HASHING_ALGO_EDEFAULT;

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
	protected AlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QR1Package.Literals.ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHashingAlgo() {
		return hashingAlgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHashingAlgo(String newHashingAlgo) {
		String oldHashingAlgo = hashingAlgo;
		hashingAlgo = newHashingAlgo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ALGORITHM__HASHING_ALGO, oldHashingAlgo,
					hashingAlgo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ALGORITHM__HASH_CODE, oldHashCode,
					hashCode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.ALGORITHM__DECRYPTEDQR,
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
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ALGORITHM__DECRYPTEDQR, oldDecryptedqr,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QR1Package.ALGORITHM__COMPARISON,
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
			eNotify(new ENotificationImpl(this, Notification.SET, QR1Package.ALGORITHM__COMPARISON, oldComparison,
					comparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void Hashing() {
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
		case QR1Package.ALGORITHM__HASHING_ALGO:
			return getHashingAlgo();
		case QR1Package.ALGORITHM__HASH_CODE:
			return getHashCode();
		case QR1Package.ALGORITHM__DECRYPTEDQR:
			if (resolve)
				return getDecryptedqr();
			return basicGetDecryptedqr();
		case QR1Package.ALGORITHM__COMPARISON:
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
		case QR1Package.ALGORITHM__HASHING_ALGO:
			setHashingAlgo((String) newValue);
			return;
		case QR1Package.ALGORITHM__HASH_CODE:
			setHashCode((String) newValue);
			return;
		case QR1Package.ALGORITHM__DECRYPTEDQR:
			setDecryptedqr((DecryptedQR) newValue);
			return;
		case QR1Package.ALGORITHM__COMPARISON:
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
		case QR1Package.ALGORITHM__HASHING_ALGO:
			setHashingAlgo(HASHING_ALGO_EDEFAULT);
			return;
		case QR1Package.ALGORITHM__HASH_CODE:
			setHashCode(HASH_CODE_EDEFAULT);
			return;
		case QR1Package.ALGORITHM__DECRYPTEDQR:
			setDecryptedqr((DecryptedQR) null);
			return;
		case QR1Package.ALGORITHM__COMPARISON:
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
		case QR1Package.ALGORITHM__HASHING_ALGO:
			return HASHING_ALGO_EDEFAULT == null ? hashingAlgo != null : !HASHING_ALGO_EDEFAULT.equals(hashingAlgo);
		case QR1Package.ALGORITHM__HASH_CODE:
			return HASH_CODE_EDEFAULT == null ? hashCode != null : !HASH_CODE_EDEFAULT.equals(hashCode);
		case QR1Package.ALGORITHM__DECRYPTEDQR:
			return decryptedqr != null;
		case QR1Package.ALGORITHM__COMPARISON:
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
		case QR1Package.ALGORITHM___HASHING:
			Hashing();
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
		result.append(" (hashingAlgo: ");
		result.append(hashingAlgo);
		result.append(", hashCode: ");
		result.append(hashCode);
		result.append(')');
		return result.toString();
	}

} //AlgorithmImpl
