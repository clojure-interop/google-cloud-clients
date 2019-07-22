(ns com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings
  "Settings class to configure an instance of ErrorGroupServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (clouderrorreporting.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getGroup to 30 seconds:



  ErrorGroupServiceSettings.Builder errorGroupServiceSettingsBuilder =
      ErrorGroupServiceSettings.newBuilder();
  errorGroupServiceSettingsBuilder.getGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ErrorGroupServiceSettings errorGroupServiceSettings = errorGroupServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorGroupServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ErrorGroupServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ErrorGroupServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ErrorGroupServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ErrorGroupServiceSettings/newBuilder client-context))
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder []
    (ErrorGroupServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ErrorGroupServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings [^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings stub]
    (ErrorGroupServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ErrorGroupServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ErrorGroupServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ErrorGroupServiceSettings/getDefaultServiceScopes )))

(defn get-group-settings
  "Returns the object with the settings used for calls to getGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ErrorGroupServiceSettings this]
    (-> this (.getGroupSettings))))

(defn update-group-settings
  "Returns the object with the settings used for calls to updateGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ErrorGroupServiceSettings this]
    (-> this (.updateGroupSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder [^ErrorGroupServiceSettings this]
    (-> this (.toBuilder))))

