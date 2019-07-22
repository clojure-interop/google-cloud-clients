(ns com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings
  "Settings class to configure an instance of ErrorGroupServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (clouderrorreporting.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getGroup to 30 seconds:



  ErrorGroupServiceStubSettings.Builder errorGroupServiceSettingsBuilder =
      ErrorGroupServiceStubSettings.newBuilder();
  errorGroupServiceSettingsBuilder.getGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ErrorGroupServiceStubSettings errorGroupServiceSettings = errorGroupServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ErrorGroupServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ErrorGroupServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ErrorGroupServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ErrorGroupServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ErrorGroupServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ErrorGroupServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ErrorGroupServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ErrorGroupServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ErrorGroupServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder []
    (ErrorGroupServiceStubSettings/newBuilder )))

(defn get-group-settings
  "Returns the object with the settings used for calls to getGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ErrorGroupServiceStubSettings this]
    (-> this (.getGroupSettings))))

(defn update-group-settings
  "Returns the object with the settings used for calls to updateGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ErrorGroupServiceStubSettings this]
    (-> this (.updateGroupSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStub`

  throws: java.io.IOException"
  ([^ErrorGroupServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder [^ErrorGroupServiceStubSettings this]
    (-> this (.toBuilder))))

