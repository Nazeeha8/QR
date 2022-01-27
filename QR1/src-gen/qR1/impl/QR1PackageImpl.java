/**
 */
package qR1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qR1.Algorithm;
import qR1.Certificate;
import qR1.Comparison;
import qR1.DateData;
import qR1.DecryptedQR;
import qR1.EncryptedQR;
import qR1.QR1Factory;
import qR1.QR1Package;
import qR1.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QR1PackageImpl extends EPackageImpl implements QR1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptedQREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decryptedQREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qR1.QR1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QR1PackageImpl() {
		super(eNS_URI, QR1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QR1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QR1Package init() {
		if (isInited)
			return (QR1Package) EPackage.Registry.INSTANCE.getEPackage(QR1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredQR1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		QR1PackageImpl theQR1Package = registeredQR1Package instanceof QR1PackageImpl
				? (QR1PackageImpl) registeredQR1Package
				: new QR1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theQR1Package.createPackageContents();

		// Initialize created meta-data
		theQR1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQR1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QR1Package.eNS_URI, theQR1Package);
		return theQR1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQR() {
		return qrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQR_Hashcode() {
		return (EReference) qrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQR_Signature() {
		return (EReference) qrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQR_Encryptedqr() {
		return (EReference) qrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQR_Decryptedqr() {
		return (EReference) qrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQR_Comparison() {
		return (EReference) qrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQR_Algorithm() {
		return (EReference) qrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQR_Certificate() {
		return (EReference) qrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateData() {
		return dateDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateData_OriginalData() {
		return (EAttribute) dateDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateData_ValidDate() {
		return (EAttribute) dateDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDateData__Hashing() {
		return dateDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptedQR() {
		return encryptedQREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedQR_EncryptedData() {
		return (EAttribute) encryptedQREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedQR_Certificate() {
		return (EReference) encryptedQREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedQR_Algorithm() {
		return (EReference) encryptedQREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedQR_Signature() {
		return (EReference) encryptedQREClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedQR_Datedata() {
		return (EReference) encryptedQREClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEncryptedQR__Multiplexing() {
		return encryptedQREClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEncryptedQR__Multilayering() {
		return encryptedQREClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecryptedQR() {
		return decryptedQREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecryptedQR_DecyptedQR() {
		return (EAttribute) decryptedQREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecryptedQR_Encryptedqr() {
		return (EReference) decryptedQREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDecryptedQR__Decoding() {
		return decryptedQREClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithm_HashingAlgo() {
		return (EAttribute) algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithm_HashCode() {
		return (EAttribute) algorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithm_Decryptedqr() {
		return (EReference) algorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithm_Comparison() {
		return (EReference) algorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAlgorithm__Hashing() {
		return algorithmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_PrivateKey() {
		return (EAttribute) signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_EncryptedData() {
		return (EAttribute) signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_DecyptedData() {
		return (EAttribute) signatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Hashcode() {
		return (EReference) signatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Decryptedqr() {
		return (EReference) signatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Comparison() {
		return (EReference) signatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSignature__Encryption() {
		return signatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSignature__Decyption() {
		return signatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificate() {
		return certificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificate_SenderID() {
		return (EAttribute) certificateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificate_PublicKey() {
		return (EAttribute) certificateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificate_ValidDate() {
		return (EAttribute) certificateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparison_HashCode() {
		return (EAttribute) comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparison_DecryptedData() {
		return (EAttribute) comparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparison__Comparison() {
		return comparisonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QR1Factory getQR1Factory() {
		return (QR1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		qrEClass = createEClass(QR);
		createEReference(qrEClass, QR__HASHCODE);
		createEReference(qrEClass, QR__SIGNATURE);
		createEReference(qrEClass, QR__ENCRYPTEDQR);
		createEReference(qrEClass, QR__DECRYPTEDQR);
		createEReference(qrEClass, QR__COMPARISON);
		createEReference(qrEClass, QR__ALGORITHM);
		createEReference(qrEClass, QR__CERTIFICATE);

		dateDataEClass = createEClass(DATE_DATA);
		createEAttribute(dateDataEClass, DATE_DATA__ORIGINAL_DATA);
		createEAttribute(dateDataEClass, DATE_DATA__VALID_DATE);
		createEOperation(dateDataEClass, DATE_DATA___HASHING);

		encryptedQREClass = createEClass(ENCRYPTED_QR);
		createEAttribute(encryptedQREClass, ENCRYPTED_QR__ENCRYPTED_DATA);
		createEReference(encryptedQREClass, ENCRYPTED_QR__CERTIFICATE);
		createEReference(encryptedQREClass, ENCRYPTED_QR__ALGORITHM);
		createEReference(encryptedQREClass, ENCRYPTED_QR__SIGNATURE);
		createEReference(encryptedQREClass, ENCRYPTED_QR__DATEDATA);
		createEOperation(encryptedQREClass, ENCRYPTED_QR___MULTIPLEXING);
		createEOperation(encryptedQREClass, ENCRYPTED_QR___MULTILAYERING);

		decryptedQREClass = createEClass(DECRYPTED_QR);
		createEAttribute(decryptedQREClass, DECRYPTED_QR__DECYPTED_QR);
		createEReference(decryptedQREClass, DECRYPTED_QR__ENCRYPTEDQR);
		createEOperation(decryptedQREClass, DECRYPTED_QR___DECODING);

		algorithmEClass = createEClass(ALGORITHM);
		createEAttribute(algorithmEClass, ALGORITHM__HASHING_ALGO);
		createEAttribute(algorithmEClass, ALGORITHM__HASH_CODE);
		createEReference(algorithmEClass, ALGORITHM__DECRYPTEDQR);
		createEReference(algorithmEClass, ALGORITHM__COMPARISON);
		createEOperation(algorithmEClass, ALGORITHM___HASHING);

		signatureEClass = createEClass(SIGNATURE);
		createEAttribute(signatureEClass, SIGNATURE__PRIVATE_KEY);
		createEAttribute(signatureEClass, SIGNATURE__ENCRYPTED_DATA);
		createEAttribute(signatureEClass, SIGNATURE__DECYPTED_DATA);
		createEReference(signatureEClass, SIGNATURE__HASHCODE);
		createEReference(signatureEClass, SIGNATURE__DECRYPTEDQR);
		createEReference(signatureEClass, SIGNATURE__COMPARISON);
		createEOperation(signatureEClass, SIGNATURE___ENCRYPTION);
		createEOperation(signatureEClass, SIGNATURE___DECYPTION);

		certificateEClass = createEClass(CERTIFICATE);
		createEAttribute(certificateEClass, CERTIFICATE__SENDER_ID);
		createEAttribute(certificateEClass, CERTIFICATE__PUBLIC_KEY);
		createEAttribute(certificateEClass, CERTIFICATE__VALID_DATE);

		comparisonEClass = createEClass(COMPARISON);
		createEAttribute(comparisonEClass, COMPARISON__HASH_CODE);
		createEAttribute(comparisonEClass, COMPARISON__DECRYPTED_DATA);
		createEOperation(comparisonEClass, COMPARISON___COMPARISON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(qrEClass, qR1.QR.class, "QR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQR_Hashcode(), this.getDateData(), null, "hashcode", null, 0, -1, qR1.QR.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getQR_Signature(), this.getSignature(), null, "signature", null, 0, -1, qR1.QR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQR_Encryptedqr(), this.getEncryptedQR(), null, "encryptedqr", null, 0, -1, qR1.QR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQR_Decryptedqr(), this.getDecryptedQR(), null, "decryptedqr", null, 0, -1, qR1.QR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQR_Comparison(), this.getComparison(), null, "comparison", null, 0, -1, qR1.QR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQR_Algorithm(), this.getAlgorithm(), null, "algorithm", null, 0, -1, qR1.QR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQR_Certificate(), this.getCertificate(), null, "certificate", null, 0, -1, qR1.QR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateDataEClass, DateData.class, "DateData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateData_OriginalData(), ecorePackage.getEString(), "originalData", null, 0, 1,
				DateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateData_ValidDate(), ecorePackage.getEDate(), "validDate", null, 0, 1, DateData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDateData__Hashing(), null, "hashing", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(encryptedQREClass, EncryptedQR.class, "EncryptedQR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncryptedQR_EncryptedData(), ecorePackage.getEString(), "encryptedData", null, 0, 1,
				EncryptedQR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedQR_Certificate(), this.getCertificate(), null, "certificate", null, 1, 1,
				EncryptedQR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedQR_Algorithm(), this.getAlgorithm(), null, "algorithm", null, 1, 1,
				EncryptedQR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedQR_Signature(), this.getSignature(), null, "signature", null, 1, 1,
				EncryptedQR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedQR_Datedata(), this.getDateData(), null, "datedata", null, 1, 1, EncryptedQR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEncryptedQR__Multiplexing(), null, "multiplexing", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEncryptedQR__Multilayering(), null, "multilayering", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(decryptedQREClass, DecryptedQR.class, "DecryptedQR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecryptedQR_DecyptedQR(), ecorePackage.getEString(), "decyptedQR", null, 0, 1,
				DecryptedQR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDecryptedQR_Encryptedqr(), this.getEncryptedQR(), null, "encryptedqr", null, 1, 1,
				DecryptedQR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDecryptedQR__Decoding(), null, "decoding", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(algorithmEClass, Algorithm.class, "Algorithm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithm_HashingAlgo(), ecorePackage.getEString(), "hashingAlgo", null, 0, 1,
				Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithm_HashCode(), ecorePackage.getEString(), "hashCode", null, 0, 1, Algorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Decryptedqr(), this.getDecryptedQR(), null, "decryptedqr", null, 1, 1,
				Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Comparison(), this.getComparison(), null, "comparison", null, 1, 1, Algorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAlgorithm__Hashing(), null, "Hashing", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignature_PrivateKey(), ecorePackage.getEString(), "privateKey", null, 0, 1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_EncryptedData(), ecorePackage.getEString(), "encryptedData", null, 0, 1,
				Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_DecyptedData(), ecorePackage.getEString(), "decyptedData", null, 0, 1,
				Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Hashcode(), this.getDateData(), null, "hashcode", null, 1, 1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Decryptedqr(), this.getDecryptedQR(), null, "decryptedqr", null, 1, 1,
				Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Comparison(), this.getComparison(), null, "comparison", null, 1, 1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSignature__Encryption(), null, "encryption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSignature__Decyption(), null, "decyption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(certificateEClass, Certificate.class, "Certificate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificate_SenderID(), ecorePackage.getEString(), "senderID", null, 0, 1, Certificate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_PublicKey(), ecorePackage.getEString(), "publicKey", null, 0, 1,
				Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_ValidDate(), ecorePackage.getEString(), "validDate", null, 0, 1,
				Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparison_HashCode(), ecorePackage.getEString(), "hashCode", null, 0, 1, Comparison.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparison_DecryptedData(), ecorePackage.getEString(), "decryptedData", null, 0, 1,
				Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getComparison__Comparison(), null, "comparison", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QR1PackageImpl
