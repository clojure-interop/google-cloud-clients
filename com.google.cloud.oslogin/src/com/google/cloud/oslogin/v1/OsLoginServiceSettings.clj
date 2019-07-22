(ns com.google.cloud.oslogin.v1.OsLoginServiceSettings
  "Settings class to configure an instance of OsLoginServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (oslogin.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deletePosixAccount to 30 seconds:



  OsLoginServiceSettings.Builder osLoginServiceSettingsBuilder =
      OsLoginServiceSettings.newBuilder();
  osLoginServiceSettingsBuilder.deletePosixAccountSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  OsLoginServiceSettings osLoginServiceSettings = osLoginServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.oslogin.v1 OsLoginServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (OsLoginServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (OsLoginServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (OsLoginServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder`"
  (^com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (OsLoginServiceSettings/newBuilder client-context))
  (^com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder []
    (OsLoginServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (OsLoginServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings`

  returns: `com.google.cloud.oslogin.v1.OsLoginServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.oslogin.v1.OsLoginServiceSettings [^com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings stub]
    (OsLoginServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (OsLoginServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (OsLoginServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (OsLoginServiceSettings/getDefaultServiceScopes )))

(defn delete-posix-account-settings
  "Returns the object with the settings used for calls to deletePosixAccount.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^OsLoginServiceSettings this]
    (-> this (.deletePosixAccountSettings))))

(defn delete-ssh-public-key-settings
  "Returns the object with the settings used for calls to deleteSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^OsLoginServiceSettings this]
    (-> this (.deleteSshPublicKeySettings))))

(defn get-login-profile-settings
  "Returns the object with the settings used for calls to getLoginProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.oslogin.v1.GetLoginProfileRequest,com.google.cloud.oslogin.v1.LoginProfile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^OsLoginServiceSettings this]
    (-> this (.getLoginProfileSettings))))

(defn get-ssh-public-key-settings
  "Returns the object with the settings used for calls to getSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^OsLoginServiceSettings this]
    (-> this (.getSshPublicKeySettings))))

(defn import-ssh-public-key-settings
  "Returns the object with the settings used for calls to importSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^OsLoginServiceSettings this]
    (-> this (.importSshPublicKeySettings))))

(defn update-ssh-public-key-settings
  "Returns the object with the settings used for calls to updateSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^OsLoginServiceSettings this]
    (-> this (.updateSshPublicKeySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder`"
  (^com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder [^OsLoginServiceSettings this]
    (-> this (.toBuilder))))

