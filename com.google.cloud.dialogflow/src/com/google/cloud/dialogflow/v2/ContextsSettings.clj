(ns com.google.cloud.dialogflow.v2.ContextsSettings
  "Settings class to configure an instance of ContextsClient.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getContext to 30 seconds:



  ContextsSettings.Builder contextsSettingsBuilder =
      ContextsSettings.newBuilder();
  contextsSettingsBuilder.getContextSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ContextsSettings contextsSettings = contextsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 ContextsSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ContextsSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ContextsSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ContextsSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2.ContextsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2.ContextsSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ContextsSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2.ContextsSettings$Builder []
    (ContextsSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ContextsSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dialogflow.v2.stub.ContextsStubSettings`

  returns: `com.google.cloud.dialogflow.v2.ContextsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.ContextsSettings [^com.google.cloud.dialogflow.v2.stub.ContextsStubSettings stub]
    (ContextsSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ContextsSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ContextsSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ContextsSettings/getDefaultServiceScopes )))

(defn list-contexts-settings
  "Returns the object with the settings used for calls to listContexts.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2.ListContextsRequest,com.google.cloud.dialogflow.v2.ListContextsResponse,com.google.cloud.dialogflow.v2.ContextsClient$ListContextsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ContextsSettings this]
    (-> this (.listContextsSettings))))

(defn get-context-settings
  "Returns the object with the settings used for calls to getContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2.GetContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsSettings this]
    (-> this (.getContextSettings))))

(defn create-context-settings
  "Returns the object with the settings used for calls to createContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2.CreateContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsSettings this]
    (-> this (.createContextSettings))))

(defn update-context-settings
  "Returns the object with the settings used for calls to updateContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2.UpdateContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsSettings this]
    (-> this (.updateContextSettings))))

(defn delete-context-settings
  "Returns the object with the settings used for calls to deleteContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2.DeleteContextRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsSettings this]
    (-> this (.deleteContextSettings))))

(defn delete-all-contexts-settings
  "Returns the object with the settings used for calls to deleteAllContexts.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2.DeleteAllContextsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ContextsSettings this]
    (-> this (.deleteAllContextsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2.ContextsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2.ContextsSettings$Builder [^ContextsSettings this]
    (-> this (.toBuilder))))

