(ns com.google.cloud.kms.v1.KeyManagementServiceSettings
  "Settings class to configure an instance of KeyManagementServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (cloudkms.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getKeyRing to 30 seconds:



  KeyManagementServiceSettings.Builder keyManagementServiceSettingsBuilder =
      KeyManagementServiceSettings.newBuilder();
  keyManagementServiceSettingsBuilder.getKeyRingSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  KeyManagementServiceSettings keyManagementServiceSettings = keyManagementServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.kms.v1 KeyManagementServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (KeyManagementServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (KeyManagementServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (KeyManagementServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder`"
  (^com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (KeyManagementServiceSettings/newBuilder client-context))
  (^com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder []
    (KeyManagementServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (KeyManagementServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.kms.v1.stub.KeyManagementServiceStubSettings`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.kms.v1.KeyManagementServiceSettings [^com.google.cloud.kms.v1.stub.KeyManagementServiceStubSettings stub]
    (KeyManagementServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (KeyManagementServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (KeyManagementServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (KeyManagementServiceSettings/getDefaultServiceScopes )))

(defn update-crypto-key-settings
  "Returns the object with the settings used for calls to updateCryptoKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.UpdateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.updateCryptoKeySettings))))

(defn decrypt-settings
  "Returns the object with the settings used for calls to decrypt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.DecryptRequest,com.google.cloud.kms.v1.DecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.decryptSettings))))

(defn list-crypto-keys-settings
  "Returns the object with the settings used for calls to listCryptoKeys.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.kms.v1.ListCryptoKeysRequest,com.google.cloud.kms.v1.ListCryptoKeysResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^KeyManagementServiceSettings this]
    (-> this (.listCryptoKeysSettings))))

(defn get-crypto-key-settings
  "Returns the object with the settings used for calls to getCryptoKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.GetCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.getCryptoKeySettings))))

(defn update-crypto-key-version-settings
  "Returns the object with the settings used for calls to updateCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.updateCryptoKeyVersionSettings))))

(defn import-crypto-key-version-settings
  "Returns the object with the settings used for calls to importCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.importCryptoKeyVersionSettings))))

(defn destroy-crypto-key-version-settings
  "Returns the object with the settings used for calls to destroyCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.destroyCryptoKeyVersionSettings))))

(defn get-crypto-key-version-settings
  "Returns the object with the settings used for calls to getCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.getCryptoKeyVersionSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn create-crypto-key-settings
  "Returns the object with the settings used for calls to createCryptoKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.CreateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.createCryptoKeySettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.setIamPolicySettings))))

(defn asymmetric-decrypt-settings
  "Returns the object with the settings used for calls to asymmetricDecrypt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.AsymmetricDecryptRequest,com.google.cloud.kms.v1.AsymmetricDecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.asymmetricDecryptSettings))))

(defn list-key-rings-settings
  "Returns the object with the settings used for calls to listKeyRings.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.kms.v1.ListKeyRingsRequest,com.google.cloud.kms.v1.ListKeyRingsResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^KeyManagementServiceSettings this]
    (-> this (.listKeyRingsSettings))))

(defn list-import-jobs-settings
  "Returns the object with the settings used for calls to listImportJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.kms.v1.ListImportJobsRequest,com.google.cloud.kms.v1.ListImportJobsResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^KeyManagementServiceSettings this]
    (-> this (.listImportJobsSettings))))

(defn get-import-job-settings
  "Returns the object with the settings used for calls to getImportJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.GetImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.getImportJobSettings))))

(defn restore-crypto-key-version-settings
  "Returns the object with the settings used for calls to restoreCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.restoreCryptoKeyVersionSettings))))

(defn create-crypto-key-version-settings
  "Returns the object with the settings used for calls to createCryptoKeyVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.createCryptoKeyVersionSettings))))

(defn create-key-ring-settings
  "Returns the object with the settings used for calls to createKeyRing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.CreateKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.createKeyRingSettings))))

(defn list-crypto-key-versions-settings
  "Returns the object with the settings used for calls to listCryptoKeyVersions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^KeyManagementServiceSettings this]
    (-> this (.listCryptoKeyVersionsSettings))))

(defn get-public-key-settings
  "Returns the object with the settings used for calls to getPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.GetPublicKeyRequest,com.google.cloud.kms.v1.PublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.getPublicKeySettings))))

(defn encrypt-settings
  "Returns the object with the settings used for calls to encrypt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.EncryptRequest,com.google.cloud.kms.v1.EncryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.encryptSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.getIamPolicySettings))))

(defn get-key-ring-settings
  "Returns the object with the settings used for calls to getKeyRing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.GetKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.getKeyRingSettings))))

(defn asymmetric-sign-settings
  "Returns the object with the settings used for calls to asymmetricSign.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.AsymmetricSignRequest,com.google.cloud.kms.v1.AsymmetricSignResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.asymmetricSignSettings))))

(defn update-crypto-key-primary-version-settings
  "Returns the object with the settings used for calls to updateCryptoKeyPrimaryVersion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.updateCryptoKeyPrimaryVersionSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder`"
  (^com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder [^KeyManagementServiceSettings this]
    (-> this (.toBuilder))))

(defn create-import-job-settings
  "Returns the object with the settings used for calls to createImportJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.kms.v1.CreateImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KeyManagementServiceSettings this]
    (-> this (.createImportJobSettings))))

