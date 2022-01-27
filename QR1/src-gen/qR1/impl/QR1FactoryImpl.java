/**
 */
package qR1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qR1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QR1FactoryImpl extends EFactoryImpl implements QR1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QR1Factory init() {
		try {
			QR1Factory theQR1Factory = (QR1Factory) EPackage.Registry.INSTANCE.getEFactory(QR1Package.eNS_URI);
			if (theQR1Factory != null) {
				return theQR1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QR1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QR1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QR1Package.QR:
			return createQR();
		case QR1Package.DATE_DATA:
			return createDateData();
		case QR1Package.ENCRYPTED_QR:
			return createEncryptedQR();
		case QR1Package.DECRYPTED_QR:
			return createDecryptedQR();
		case QR1Package.ALGORITHM:
			return createAlgorithm();
		case QR1Package.SIGNATURE:
			return createSignature();
		case QR1Package.CERTIFICATE:
			return createCertificate();
		case QR1Package.COMPARISON:
			return createComparison();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QR createQR() {
		QRImpl qr = new QRImpl();
		return qr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateData createDateData() {
		DateDataImpl dateData = new DateDataImpl();
		return dateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedQR createEncryptedQR() {
		EncryptedQRImpl encryptedQR = new EncryptedQRImpl();
		return encryptedQR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecryptedQR createDecryptedQR() {
		DecryptedQRImpl decryptedQR = new DecryptedQRImpl();
		return decryptedQR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithm createAlgorithm() {
		AlgorithmImpl algorithm = new AlgorithmImpl();
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Certificate createCertificate() {
		CertificateImpl certificate = new CertificateImpl();
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QR1Package getQR1Package() {
		return (QR1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QR1Package getPackage() {
		return QR1Package.eINSTANCE;
	}

} //QR1FactoryImpl
