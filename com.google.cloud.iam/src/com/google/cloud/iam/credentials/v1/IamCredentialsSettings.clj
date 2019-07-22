(ns com.google.cloud.iam.credentials.v1.IamCredentialsSettings
  "Settings class to configure an instance of IamCredentialsClient.

  The default instance has everything set to sensible defaults:


    The default service address (iamcredentials.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of generateAccessToken to 30 seconds:



  IamCredentialsSettings.Builder iamCredentialsSettingsBuilder =
      IamCredentialsSettings.newBuilder();
  iamCredentialsSettingsBuilder.generateAccessTokenSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  IamCredentialsSettings iamCredentialsSettings = iamCredentialsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iam.credentials.v1 IamCredentialsSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (IamCredentialsSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (IamCredentialsSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (IamCredentialsSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder`"
  (^com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (IamCredentialsSettings/newBuilder client-context))
  (^com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder []
    (IamCredentialsSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (IamCredentialsSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.iam.credentials.v1.stub.IamCredentialsStubSettings`

  returns: `com.google.cloud.iam.credentials.v1.IamCredentialsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.iam.credentials.v1.IamCredentialsSettings [^com.google.cloud.iam.credentials.v1.stub.IamCredentialsStubSettings stub]
    (IamCredentialsSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (IamCredentialsSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (IamCredentialsSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (IamCredentialsSettings/getDefaultServiceScopes )))

(defn generate-access-token-settings
  "Returns the object with the settings used for calls to generateAccessToken.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iam.credentials.v1.GenerateAccessTokenRequest,com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IamCredentialsSettings this]
    (-> this (.generateAccessTokenSettings))))

(defn generate-id-token-settings
  "Returns the object with the settings used for calls to generateIdToken.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iam.credentials.v1.GenerateIdTokenRequest,com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IamCredentialsSettings this]
    (-> this (.generateIdTokenSettings))))

(defn sign-blob-settings
  "Returns the object with the settings used for calls to signBlob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iam.credentials.v1.SignBlobRequest,com.google.cloud.iam.credentials.v1.SignBlobResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IamCredentialsSettings this]
    (-> this (.signBlobSettings))))

(defn sign-jwt-settings
  "Returns the object with the settings used for calls to signJwt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iam.credentials.v1.SignJwtRequest,com.google.cloud.iam.credentials.v1.SignJwtResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IamCredentialsSettings this]
    (-> this (.signJwtSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder`"
  (^com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder [^IamCredentialsSettings this]
    (-> this (.toBuilder))))

