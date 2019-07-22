(ns com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder
  "Builder for KeyManagementServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.kms.v1 KeyManagementServiceSettings$Builder]))

(defn update-crypto-key-settings
  "Returns the builder for the settings used for calls to updateCryptoKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.UpdateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.updateCryptoKeySettings))))

(defn decrypt-settings
  "Returns the builder for the settings used for calls to decrypt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.DecryptRequest,com.google.cloud.kms.v1.DecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.decryptSettings))))

(defn list-crypto-keys-settings
  "Returns the builder for the settings used for calls to listCryptoKeys.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.kms.v1.ListCryptoKeysRequest,com.google.cloud.kms.v1.ListCryptoKeysResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.listCryptoKeysSettings))))

(defn get-crypto-key-settings
  "Returns the builder for the settings used for calls to getCryptoKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.GetCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.getCryptoKeySettings))))

(defn update-crypto-key-version-settings
  "Returns the builder for the settings used for calls to updateCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.updateCryptoKeyVersionSettings))))

(defn import-crypto-key-version-settings
  "Returns the builder for the settings used for calls to importCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.importCryptoKeyVersionSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder [^KeyManagementServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn destroy-crypto-key-version-settings
  "Returns the builder for the settings used for calls to destroyCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.destroyCryptoKeyVersionSettings))))

(defn get-crypto-key-version-settings
  "Returns the builder for the settings used for calls to getCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.getCryptoKeyVersionSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn create-crypto-key-settings
  "Returns the builder for the settings used for calls to createCryptoKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.CreateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.createCryptoKeySettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn asymmetric-decrypt-settings
  "Returns the builder for the settings used for calls to asymmetricDecrypt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.AsymmetricDecryptRequest,com.google.cloud.kms.v1.AsymmetricDecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.asymmetricDecryptSettings))))

(defn list-key-rings-settings
  "Returns the builder for the settings used for calls to listKeyRings.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.kms.v1.ListKeyRingsRequest,com.google.cloud.kms.v1.ListKeyRingsResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.listKeyRingsSettings))))

(defn build
  "returns: `com.google.cloud.kms.v1.KeyManagementServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.kms.v1.KeyManagementServiceSettings [^KeyManagementServiceSettings$Builder this]
    (-> this (.build))))

(defn list-import-jobs-settings
  "Returns the builder for the settings used for calls to listImportJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.kms.v1.ListImportJobsRequest,com.google.cloud.kms.v1.ListImportJobsResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.listImportJobsSettings))))

(defn get-import-job-settings
  "Returns the builder for the settings used for calls to getImportJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.GetImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.getImportJobSettings))))

(defn restore-crypto-key-version-settings
  "Returns the builder for the settings used for calls to restoreCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.restoreCryptoKeyVersionSettings))))

(defn create-crypto-key-version-settings
  "Returns the builder for the settings used for calls to createCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.createCryptoKeyVersionSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.kms.v1.stub.KeyManagementServiceStubSettings$Builder`"
  (^com.google.cloud.kms.v1.stub.KeyManagementServiceStubSettings$Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn create-key-ring-settings
  "Returns the builder for the settings used for calls to createKeyRing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.CreateKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.createKeyRingSettings))))

(defn list-crypto-key-versions-settings
  "Returns the builder for the settings used for calls to listCryptoKeyVersions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.listCryptoKeyVersionsSettings))))

(defn get-public-key-settings
  "Returns the builder for the settings used for calls to getPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.GetPublicKeyRequest,com.google.cloud.kms.v1.PublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.getPublicKeySettings))))

(defn encrypt-settings
  "Returns the builder for the settings used for calls to encrypt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.EncryptRequest,com.google.cloud.kms.v1.EncryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.encryptSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn get-key-ring-settings
  "Returns the builder for the settings used for calls to getKeyRing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.GetKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.getKeyRingSettings))))

(defn asymmetric-sign-settings
  "Returns the builder for the settings used for calls to asymmetricSign.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.AsymmetricSignRequest,com.google.cloud.kms.v1.AsymmetricSignResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.asymmetricSignSettings))))

(defn update-crypto-key-primary-version-settings
  "Returns the builder for the settings used for calls to updateCryptoKeyPrimaryVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.updateCryptoKeyPrimaryVersionSettings))))

(defn create-import-job-settings
  "Returns the builder for the settings used for calls to createImportJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.kms.v1.CreateImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KeyManagementServiceSettings$Builder this]
    (-> this (.createImportJobSettings))))

