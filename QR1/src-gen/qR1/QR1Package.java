/**
 */
package qR1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qR1.QR1Factory
 * @model kind="package"
 * @generated
 */
public interface QR1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qR1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qR1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qR1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QR1Package eINSTANCE = qR1.impl.QR1PackageImpl.init();

	/**
	 * The meta object id for the '{@link qR1.impl.QRImpl <em>QR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.QRImpl
	 * @see qR1.impl.QR1PackageImpl#getQR()
	 * @generated
	 */
	int QR = 0;

	/**
	 * The feature id for the '<em><b>Hashcode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR__HASHCODE = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Encryptedqr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR__ENCRYPTEDQR = 2;

	/**
	 * The feature id for the '<em><b>Decryptedqr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR__DECRYPTEDQR = 3;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR__COMPARISON = 4;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR__ALGORITHM = 5;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR__CERTIFICATE = 6;

	/**
	 * The number of structural features of the '<em>QR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>QR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qR1.impl.DateDataImpl <em>Date Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.DateDataImpl
	 * @see qR1.impl.QR1PackageImpl#getDateData()
	 * @generated
	 */
	int DATE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Original Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DATA__ORIGINAL_DATA = 0;

	/**
	 * The feature id for the '<em><b>Valid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DATA__VALID_DATE = 1;

	/**
	 * The number of structural features of the '<em>Date Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DATA_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Hashing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DATA___HASHING = 0;

	/**
	 * The number of operations of the '<em>Date Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DATA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qR1.impl.EncryptedQRImpl <em>Encrypted QR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.EncryptedQRImpl
	 * @see qR1.impl.QR1PackageImpl#getEncryptedQR()
	 * @generated
	 */
	int ENCRYPTED_QR = 2;

	/**
	 * The feature id for the '<em><b>Encrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR__ENCRYPTED_DATA = 0;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR__CERTIFICATE = 1;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR__ALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR__SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Datedata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR__DATEDATA = 4;

	/**
	 * The number of structural features of the '<em>Encrypted QR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Multiplexing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR___MULTIPLEXING = 0;

	/**
	 * The operation id for the '<em>Multilayering</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR___MULTILAYERING = 1;

	/**
	 * The number of operations of the '<em>Encrypted QR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_QR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qR1.impl.DecryptedQRImpl <em>Decrypted QR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.DecryptedQRImpl
	 * @see qR1.impl.QR1PackageImpl#getDecryptedQR()
	 * @generated
	 */
	int DECRYPTED_QR = 3;

	/**
	 * The feature id for the '<em><b>Decypted QR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECRYPTED_QR__DECYPTED_QR = 0;

	/**
	 * The feature id for the '<em><b>Encryptedqr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECRYPTED_QR__ENCRYPTEDQR = 1;

	/**
	 * The number of structural features of the '<em>Decrypted QR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECRYPTED_QR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Decoding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECRYPTED_QR___DECODING = 0;

	/**
	 * The number of operations of the '<em>Decrypted QR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECRYPTED_QR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qR1.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.AlgorithmImpl
	 * @see qR1.impl.QR1PackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 4;

	/**
	 * The feature id for the '<em><b>Hashing Algo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__HASHING_ALGO = 0;

	/**
	 * The feature id for the '<em><b>Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__HASH_CODE = 1;

	/**
	 * The feature id for the '<em><b>Decryptedqr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__DECRYPTEDQR = 2;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__COMPARISON = 3;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Hashing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM___HASHING = 0;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qR1.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.SignatureImpl
	 * @see qR1.impl.QR1PackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 5;

	/**
	 * The feature id for the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PRIVATE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Encrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ENCRYPTED_DATA = 1;

	/**
	 * The feature id for the '<em><b>Decypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__DECYPTED_DATA = 2;

	/**
	 * The feature id for the '<em><b>Hashcode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__HASHCODE = 3;

	/**
	 * The feature id for the '<em><b>Decryptedqr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__DECRYPTEDQR = 4;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__COMPARISON = 5;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Encryption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ENCRYPTION = 0;

	/**
	 * The operation id for the '<em>Decyption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___DECYPTION = 1;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qR1.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.CertificateImpl
	 * @see qR1.impl.QR1PackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 6;

	/**
	 * The feature id for the '<em><b>Sender ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__SENDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__PUBLIC_KEY = 1;

	/**
	 * The feature id for the '<em><b>Valid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__VALID_DATE = 2;

	/**
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qR1.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qR1.impl.ComparisonImpl
	 * @see qR1.impl.QR1PackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 7;

	/**
	 * The feature id for the '<em><b>Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__HASH_CODE = 0;

	/**
	 * The feature id for the '<em><b>Decrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__DECRYPTED_DATA = 1;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON___COMPARISON = 0;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link qR1.QR <em>QR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QR</em>'.
	 * @see qR1.QR
	 * @generated
	 */
	EClass getQR();

	/**
	 * Returns the meta object for the containment reference list '{@link qR1.QR#getHashcode <em>Hashcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hashcode</em>'.
	 * @see qR1.QR#getHashcode()
	 * @see #getQR()
	 * @generated
	 */
	EReference getQR_Hashcode();

	/**
	 * Returns the meta object for the containment reference list '{@link qR1.QR#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature</em>'.
	 * @see qR1.QR#getSignature()
	 * @see #getQR()
	 * @generated
	 */
	EReference getQR_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link qR1.QR#getEncryptedqr <em>Encryptedqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encryptedqr</em>'.
	 * @see qR1.QR#getEncryptedqr()
	 * @see #getQR()
	 * @generated
	 */
	EReference getQR_Encryptedqr();

	/**
	 * Returns the meta object for the containment reference list '{@link qR1.QR#getDecryptedqr <em>Decryptedqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decryptedqr</em>'.
	 * @see qR1.QR#getDecryptedqr()
	 * @see #getQR()
	 * @generated
	 */
	EReference getQR_Decryptedqr();

	/**
	 * Returns the meta object for the containment reference list '{@link qR1.QR#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comparison</em>'.
	 * @see qR1.QR#getComparison()
	 * @see #getQR()
	 * @generated
	 */
	EReference getQR_Comparison();

	/**
	 * Returns the meta object for the containment reference list '{@link qR1.QR#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithm</em>'.
	 * @see qR1.QR#getAlgorithm()
	 * @see #getQR()
	 * @generated
	 */
	EReference getQR_Algorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link qR1.QR#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Certificate</em>'.
	 * @see qR1.QR#getCertificate()
	 * @see #getQR()
	 * @generated
	 */
	EReference getQR_Certificate();

	/**
	 * Returns the meta object for class '{@link qR1.DateData <em>Date Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Data</em>'.
	 * @see qR1.DateData
	 * @generated
	 */
	EClass getDateData();

	/**
	 * Returns the meta object for the attribute '{@link qR1.DateData#getOriginalData <em>Original Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Data</em>'.
	 * @see qR1.DateData#getOriginalData()
	 * @see #getDateData()
	 * @generated
	 */
	EAttribute getDateData_OriginalData();

	/**
	 * Returns the meta object for the attribute '{@link qR1.DateData#getValidDate <em>Valid Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Date</em>'.
	 * @see qR1.DateData#getValidDate()
	 * @see #getDateData()
	 * @generated
	 */
	EAttribute getDateData_ValidDate();

	/**
	 * Returns the meta object for the '{@link qR1.DateData#hashing() <em>Hashing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hashing</em>' operation.
	 * @see qR1.DateData#hashing()
	 * @generated
	 */
	EOperation getDateData__Hashing();

	/**
	 * Returns the meta object for class '{@link qR1.EncryptedQR <em>Encrypted QR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encrypted QR</em>'.
	 * @see qR1.EncryptedQR
	 * @generated
	 */
	EClass getEncryptedQR();

	/**
	 * Returns the meta object for the attribute '{@link qR1.EncryptedQR#getEncryptedData <em>Encrypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Data</em>'.
	 * @see qR1.EncryptedQR#getEncryptedData()
	 * @see #getEncryptedQR()
	 * @generated
	 */
	EAttribute getEncryptedQR_EncryptedData();

	/**
	 * Returns the meta object for the reference '{@link qR1.EncryptedQR#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Certificate</em>'.
	 * @see qR1.EncryptedQR#getCertificate()
	 * @see #getEncryptedQR()
	 * @generated
	 */
	EReference getEncryptedQR_Certificate();

	/**
	 * Returns the meta object for the reference '{@link qR1.EncryptedQR#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algorithm</em>'.
	 * @see qR1.EncryptedQR#getAlgorithm()
	 * @see #getEncryptedQR()
	 * @generated
	 */
	EReference getEncryptedQR_Algorithm();

	/**
	 * Returns the meta object for the reference '{@link qR1.EncryptedQR#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see qR1.EncryptedQR#getSignature()
	 * @see #getEncryptedQR()
	 * @generated
	 */
	EReference getEncryptedQR_Signature();

	/**
	 * Returns the meta object for the reference '{@link qR1.EncryptedQR#getDatedata <em>Datedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datedata</em>'.
	 * @see qR1.EncryptedQR#getDatedata()
	 * @see #getEncryptedQR()
	 * @generated
	 */
	EReference getEncryptedQR_Datedata();

	/**
	 * Returns the meta object for the '{@link qR1.EncryptedQR#multiplexing() <em>Multiplexing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multiplexing</em>' operation.
	 * @see qR1.EncryptedQR#multiplexing()
	 * @generated
	 */
	EOperation getEncryptedQR__Multiplexing();

	/**
	 * Returns the meta object for the '{@link qR1.EncryptedQR#multilayering() <em>Multilayering</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multilayering</em>' operation.
	 * @see qR1.EncryptedQR#multilayering()
	 * @generated
	 */
	EOperation getEncryptedQR__Multilayering();

	/**
	 * Returns the meta object for class '{@link qR1.DecryptedQR <em>Decrypted QR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decrypted QR</em>'.
	 * @see qR1.DecryptedQR
	 * @generated
	 */
	EClass getDecryptedQR();

	/**
	 * Returns the meta object for the attribute '{@link qR1.DecryptedQR#getDecyptedQR <em>Decypted QR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decypted QR</em>'.
	 * @see qR1.DecryptedQR#getDecyptedQR()
	 * @see #getDecryptedQR()
	 * @generated
	 */
	EAttribute getDecryptedQR_DecyptedQR();

	/**
	 * Returns the meta object for the reference '{@link qR1.DecryptedQR#getEncryptedqr <em>Encryptedqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Encryptedqr</em>'.
	 * @see qR1.DecryptedQR#getEncryptedqr()
	 * @see #getDecryptedQR()
	 * @generated
	 */
	EReference getDecryptedQR_Encryptedqr();

	/**
	 * Returns the meta object for the '{@link qR1.DecryptedQR#decoding() <em>Decoding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decoding</em>' operation.
	 * @see qR1.DecryptedQR#decoding()
	 * @generated
	 */
	EOperation getDecryptedQR__Decoding();

	/**
	 * Returns the meta object for class '{@link qR1.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see qR1.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Algorithm#getHashingAlgo <em>Hashing Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hashing Algo</em>'.
	 * @see qR1.Algorithm#getHashingAlgo()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_HashingAlgo();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Algorithm#getHashCode <em>Hash Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Code</em>'.
	 * @see qR1.Algorithm#getHashCode()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_HashCode();

	/**
	 * Returns the meta object for the reference '{@link qR1.Algorithm#getDecryptedqr <em>Decryptedqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decryptedqr</em>'.
	 * @see qR1.Algorithm#getDecryptedqr()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Decryptedqr();

	/**
	 * Returns the meta object for the reference '{@link qR1.Algorithm#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparison</em>'.
	 * @see qR1.Algorithm#getComparison()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Comparison();

	/**
	 * Returns the meta object for the '{@link qR1.Algorithm#Hashing() <em>Hashing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hashing</em>' operation.
	 * @see qR1.Algorithm#Hashing()
	 * @generated
	 */
	EOperation getAlgorithm__Hashing();

	/**
	 * Returns the meta object for class '{@link qR1.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see qR1.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Signature#getPrivateKey <em>Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key</em>'.
	 * @see qR1.Signature#getPrivateKey()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_PrivateKey();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Signature#getEncryptedData <em>Encrypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Data</em>'.
	 * @see qR1.Signature#getEncryptedData()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_EncryptedData();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Signature#getDecyptedData <em>Decypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decypted Data</em>'.
	 * @see qR1.Signature#getDecyptedData()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_DecyptedData();

	/**
	 * Returns the meta object for the reference '{@link qR1.Signature#getHashcode <em>Hashcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hashcode</em>'.
	 * @see qR1.Signature#getHashcode()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Hashcode();

	/**
	 * Returns the meta object for the reference '{@link qR1.Signature#getDecryptedqr <em>Decryptedqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decryptedqr</em>'.
	 * @see qR1.Signature#getDecryptedqr()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Decryptedqr();

	/**
	 * Returns the meta object for the reference '{@link qR1.Signature#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparison</em>'.
	 * @see qR1.Signature#getComparison()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Comparison();

	/**
	 * Returns the meta object for the '{@link qR1.Signature#encryption() <em>Encryption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encryption</em>' operation.
	 * @see qR1.Signature#encryption()
	 * @generated
	 */
	EOperation getSignature__Encryption();

	/**
	 * Returns the meta object for the '{@link qR1.Signature#decyption() <em>Decyption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decyption</em>' operation.
	 * @see qR1.Signature#decyption()
	 * @generated
	 */
	EOperation getSignature__Decyption();

	/**
	 * Returns the meta object for class '{@link qR1.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see qR1.Certificate
	 * @generated
	 */
	EClass getCertificate();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Certificate#getSenderID <em>Sender ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender ID</em>'.
	 * @see qR1.Certificate#getSenderID()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_SenderID();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Certificate#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see qR1.Certificate#getPublicKey()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_PublicKey();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Certificate#getValidDate <em>Valid Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Date</em>'.
	 * @see qR1.Certificate#getValidDate()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_ValidDate();

	/**
	 * Returns the meta object for class '{@link qR1.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see qR1.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Comparison#getHashCode <em>Hash Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Code</em>'.
	 * @see qR1.Comparison#getHashCode()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_HashCode();

	/**
	 * Returns the meta object for the attribute '{@link qR1.Comparison#getDecryptedData <em>Decrypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decrypted Data</em>'.
	 * @see qR1.Comparison#getDecryptedData()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_DecryptedData();

	/**
	 * Returns the meta object for the '{@link qR1.Comparison#comparison() <em>Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Comparison</em>' operation.
	 * @see qR1.Comparison#comparison()
	 * @generated
	 */
	EOperation getComparison__Comparison();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QR1Factory getQR1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link qR1.impl.QRImpl <em>QR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.QRImpl
		 * @see qR1.impl.QR1PackageImpl#getQR()
		 * @generated
		 */
		EClass QR = eINSTANCE.getQR();

		/**
		 * The meta object literal for the '<em><b>Hashcode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QR__HASHCODE = eINSTANCE.getQR_Hashcode();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QR__SIGNATURE = eINSTANCE.getQR_Signature();

		/**
		 * The meta object literal for the '<em><b>Encryptedqr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QR__ENCRYPTEDQR = eINSTANCE.getQR_Encryptedqr();

		/**
		 * The meta object literal for the '<em><b>Decryptedqr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QR__DECRYPTEDQR = eINSTANCE.getQR_Decryptedqr();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QR__COMPARISON = eINSTANCE.getQR_Comparison();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QR__ALGORITHM = eINSTANCE.getQR_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QR__CERTIFICATE = eINSTANCE.getQR_Certificate();

		/**
		 * The meta object literal for the '{@link qR1.impl.DateDataImpl <em>Date Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.DateDataImpl
		 * @see qR1.impl.QR1PackageImpl#getDateData()
		 * @generated
		 */
		EClass DATE_DATA = eINSTANCE.getDateData();

		/**
		 * The meta object literal for the '<em><b>Original Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DATA__ORIGINAL_DATA = eINSTANCE.getDateData_OriginalData();

		/**
		 * The meta object literal for the '<em><b>Valid Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DATA__VALID_DATE = eINSTANCE.getDateData_ValidDate();

		/**
		 * The meta object literal for the '<em><b>Hashing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_DATA___HASHING = eINSTANCE.getDateData__Hashing();

		/**
		 * The meta object literal for the '{@link qR1.impl.EncryptedQRImpl <em>Encrypted QR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.EncryptedQRImpl
		 * @see qR1.impl.QR1PackageImpl#getEncryptedQR()
		 * @generated
		 */
		EClass ENCRYPTED_QR = eINSTANCE.getEncryptedQR();

		/**
		 * The meta object literal for the '<em><b>Encrypted Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTED_QR__ENCRYPTED_DATA = eINSTANCE.getEncryptedQR_EncryptedData();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_QR__CERTIFICATE = eINSTANCE.getEncryptedQR_Certificate();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_QR__ALGORITHM = eINSTANCE.getEncryptedQR_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_QR__SIGNATURE = eINSTANCE.getEncryptedQR_Signature();

		/**
		 * The meta object literal for the '<em><b>Datedata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_QR__DATEDATA = eINSTANCE.getEncryptedQR_Datedata();

		/**
		 * The meta object literal for the '<em><b>Multiplexing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENCRYPTED_QR___MULTIPLEXING = eINSTANCE.getEncryptedQR__Multiplexing();

		/**
		 * The meta object literal for the '<em><b>Multilayering</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENCRYPTED_QR___MULTILAYERING = eINSTANCE.getEncryptedQR__Multilayering();

		/**
		 * The meta object literal for the '{@link qR1.impl.DecryptedQRImpl <em>Decrypted QR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.DecryptedQRImpl
		 * @see qR1.impl.QR1PackageImpl#getDecryptedQR()
		 * @generated
		 */
		EClass DECRYPTED_QR = eINSTANCE.getDecryptedQR();

		/**
		 * The meta object literal for the '<em><b>Decypted QR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECRYPTED_QR__DECYPTED_QR = eINSTANCE.getDecryptedQR_DecyptedQR();

		/**
		 * The meta object literal for the '<em><b>Encryptedqr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECRYPTED_QR__ENCRYPTEDQR = eINSTANCE.getDecryptedQR_Encryptedqr();

		/**
		 * The meta object literal for the '<em><b>Decoding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECRYPTED_QR___DECODING = eINSTANCE.getDecryptedQR__Decoding();

		/**
		 * The meta object literal for the '{@link qR1.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.AlgorithmImpl
		 * @see qR1.impl.QR1PackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Hashing Algo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__HASHING_ALGO = eINSTANCE.getAlgorithm_HashingAlgo();

		/**
		 * The meta object literal for the '<em><b>Hash Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__HASH_CODE = eINSTANCE.getAlgorithm_HashCode();

		/**
		 * The meta object literal for the '<em><b>Decryptedqr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__DECRYPTEDQR = eINSTANCE.getAlgorithm_Decryptedqr();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__COMPARISON = eINSTANCE.getAlgorithm_Comparison();

		/**
		 * The meta object literal for the '<em><b>Hashing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALGORITHM___HASHING = eINSTANCE.getAlgorithm__Hashing();

		/**
		 * The meta object literal for the '{@link qR1.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.SignatureImpl
		 * @see qR1.impl.QR1PackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Private Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__PRIVATE_KEY = eINSTANCE.getSignature_PrivateKey();

		/**
		 * The meta object literal for the '<em><b>Encrypted Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__ENCRYPTED_DATA = eINSTANCE.getSignature_EncryptedData();

		/**
		 * The meta object literal for the '<em><b>Decypted Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__DECYPTED_DATA = eINSTANCE.getSignature_DecyptedData();

		/**
		 * The meta object literal for the '<em><b>Hashcode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__HASHCODE = eINSTANCE.getSignature_Hashcode();

		/**
		 * The meta object literal for the '<em><b>Decryptedqr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__DECRYPTEDQR = eINSTANCE.getSignature_Decryptedqr();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__COMPARISON = eINSTANCE.getSignature_Comparison();

		/**
		 * The meta object literal for the '<em><b>Encryption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE___ENCRYPTION = eINSTANCE.getSignature__Encryption();

		/**
		 * The meta object literal for the '<em><b>Decyption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE___DECYPTION = eINSTANCE.getSignature__Decyption();

		/**
		 * The meta object literal for the '{@link qR1.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.CertificateImpl
		 * @see qR1.impl.QR1PackageImpl#getCertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getCertificate();

		/**
		 * The meta object literal for the '<em><b>Sender ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__SENDER_ID = eINSTANCE.getCertificate_SenderID();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__PUBLIC_KEY = eINSTANCE.getCertificate_PublicKey();

		/**
		 * The meta object literal for the '<em><b>Valid Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__VALID_DATE = eINSTANCE.getCertificate_ValidDate();

		/**
		 * The meta object literal for the '{@link qR1.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qR1.impl.ComparisonImpl
		 * @see qR1.impl.QR1PackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Hash Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__HASH_CODE = eINSTANCE.getComparison_HashCode();

		/**
		 * The meta object literal for the '<em><b>Decrypted Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__DECRYPTED_DATA = eINSTANCE.getComparison_DecryptedData();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARISON___COMPARISON = eINSTANCE.getComparison__Comparison();

	}

} //QR1Package
