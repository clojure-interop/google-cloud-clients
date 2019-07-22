(ns com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings
  "Settings class to configure an instance of ContextsStub.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getContext to 30 seconds:



  ContextsStubSettings.Builder contextsSettingsBuilder =
      ContextsStubSettings.newBuilder();
  contextsSettingsBuilder.getContextSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ContextsStubSettings contextsSettings = contextsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub ContextsStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ContextsStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ContextsStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ContextsStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ContextsStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ContextsStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ContextsStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ContextsStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ContextsStubSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings$Builder []
    (ContextsStubSettings/newBuilder )))

(defn list-contexts-settings
  "Returns the object with the settings used for calls to listContexts.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListContextsRequest,com.google.cloud.dialogflow.v2beta1.ListContextsResponse,com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ContextsStubSettings this]
    (-> this (.listContextsSettings))))

(defn get-context-settings
  "Returns the object with the settings used for calls to getContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsStubSettings this]
    (-> this (.getContextSettings))))

(defn create-context-settings
  "Returns the object with the settings used for calls to createContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsStubSettings this]
    (-> this (.createContextSettings))))

(defn update-context-settings
  "Returns the object with the settings used for calls to updateContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsStubSettings this]
    (-> this (.updateContextSettings))))

(defn delete-context-settings
  "Returns the object with the settings used for calls to deleteContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteContextRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsStubSettings this]
    (-> this (.deleteContextSettings))))

(defn delete-all-contexts-settings
  "Returns the object with the settings used for calls to deleteAllContexts.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteAllContextsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsStubSettings this]
    (-> this (.deleteAllContextsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.ContextsStub`

  throws: java.io.IOException"
  ([^ContextsStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings$Builder [^ContextsStubSettings this]
    (-> this (.toBuilder))))

