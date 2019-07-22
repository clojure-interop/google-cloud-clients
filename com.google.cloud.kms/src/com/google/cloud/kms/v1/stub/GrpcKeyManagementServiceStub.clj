(ns com.google.cloud.kms.v1.stub.GrpcKeyManagementServiceStub
  "gRPC stub implementation for Cloud Key Management Service (KMS) API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.kms.v1.stub GrpcKeyManagementServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.kms.v1.stub.GrpcKeyManagementServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.kms.v1.stub.GrpcKeyManagementServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcKeyManagementServiceStub/create client-context callable-factory))
  (^com.google.cloud.kms.v1.stub.GrpcKeyManagementServiceStub [^com.google.cloud.kms.v1.stub.KeyManagementServiceStubSettings settings]
    (GrpcKeyManagementServiceStub/create settings)))

(defn get-crypto-key-version-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.getCryptoKeyVersionCallable))))

(defn update-crypto-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.UpdateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.updateCryptoKeyCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.getIamPolicyCallable))))

(defn get-crypto-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.getCryptoKeyCallable))))

(defn create-crypto-key-version-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.createCryptoKeyVersionCallable))))

(defn create-key-ring-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.createKeyRingCallable))))

(defn decrypt-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.DecryptRequest,com.google.cloud.kms.v1.DecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.decryptCallable))))

(defn restore-crypto-key-version-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.restoreCryptoKeyVersionCallable))))

(defn update-crypto-key-version-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.updateCryptoKeyVersionCallable))))

(defn get-import-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.getImportJobCallable))))

(defn destroy-crypto-key-version-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.destroyCryptoKeyVersionCallable))))

(defn list-crypto-key-versions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listCryptoKeyVersionsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcKeyManagementServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcKeyManagementServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-crypto-keys-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeysRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listCryptoKeysPagedCallable))))

(defn shutdown
  ""
  ([^GrpcKeyManagementServiceStub this]
    (-> this (.shutdown))))

(defn update-crypto-key-primary-version-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.updateCryptoKeyPrimaryVersionCallable))))

(defn import-crypto-key-version-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.importCryptoKeyVersionCallable))))

(defn asymmetric-decrypt-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.AsymmetricDecryptRequest,com.google.cloud.kms.v1.AsymmetricDecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.asymmetricDecryptCallable))))

(defn list-import-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListImportJobsRequest,com.google.cloud.kms.v1.ListImportJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listImportJobsCallable))))

(defn list-key-rings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListKeyRingsRequest,com.google.cloud.kms.v1.ListKeyRingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listKeyRingsCallable))))

(defn list-crypto-keys-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeysRequest,com.google.cloud.kms.v1.ListCryptoKeysResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listCryptoKeysCallable))))

(defn get-key-ring-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.getKeyRingCallable))))

(defn get-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetPublicKeyRequest,com.google.cloud.kms.v1.PublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.getPublicKeyCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.setIamPolicyCallable))))

(defn encrypt-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.EncryptRequest,com.google.cloud.kms.v1.EncryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.encryptCallable))))

(defn close
  ""
  ([^GrpcKeyManagementServiceStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.testIamPermissionsCallable))))

(defn asymmetric-sign-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.AsymmetricSignRequest,com.google.cloud.kms.v1.AsymmetricSignResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.asymmetricSignCallable))))

(defn create-import-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.createImportJobCallable))))

(defn list-crypto-key-versions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listCryptoKeyVersionsPagedCallable))))

(defn list-import-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListImportJobsRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listImportJobsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcKeyManagementServiceStub this]
    (-> this (.isTerminated))))

(defn create-crypto-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.createCryptoKeyCallable))))

(defn shutdown-now
  ""
  ([^GrpcKeyManagementServiceStub this]
    (-> this (.shutdownNow))))

(defn list-key-rings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListKeyRingsRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKeyManagementServiceStub this]
    (-> this (.listKeyRingsPagedCallable))))

