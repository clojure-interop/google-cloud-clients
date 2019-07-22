(ns com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings
  "Settings class to configure an instance of SessionEntityTypesClient.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getSessionEntityType to 30 seconds:



  SessionEntityTypesSettings.Builder sessionEntityTypesSettingsBuilder =
      SessionEntityTypesSettings.newBuilder();
  sessionEntityTypesSettingsBuilder.getSessionEntityTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SessionEntityTypesSettings sessionEntityTypesSettings = sessionEntityTypesSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 SessionEntityTypesSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SessionEntityTypesSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SessionEntityTypesSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SessionEntityTypesSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SessionEntityTypesSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings$Builder []
    (SessionEntityTypesSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SessionEntityTypesSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings [^com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings stub]
    (SessionEntityTypesSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SessionEntityTypesSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SessionEntityTypesSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SessionEntityTypesSettings/getDefaultServiceScopes )))

(defn list-session-entity-types-settings
  "Returns the object with the settings used for calls to listSessionEntityTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse,com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SessionEntityTypesSettings this]
    (-> this (.listSessionEntityTypesSettings))))

(defn get-session-entity-type-settings
  "Returns the object with the settings used for calls to getSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SessionEntityTypesSettings this]
    (-> this (.getSessionEntityTypeSettings))))

(defn create-session-entity-type-settings
  "Returns the object with the settings used for calls to createSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SessionEntityTypesSettings this]
    (-> this (.createSessionEntityTypeSettings))))

(defn update-session-entity-type-settings
  "Returns the object with the settings used for calls to updateSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SessionEntityTypesSettings this]
    (-> this (.updateSessionEntityTypeSettings))))

(defn delete-session-entity-type-settings
  "Returns the object with the settings used for calls to deleteSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SessionEntityTypesSettings this]
    (-> this (.deleteSessionEntityTypeSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings$Builder [^SessionEntityTypesSettings this]
    (-> this (.toBuilder))))

