(ns com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings
  "Settings class to configure an instance of KnowledgeBasesClient.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getKnowledgeBase to 30 seconds:



  KnowledgeBasesSettings.Builder knowledgeBasesSettingsBuilder =
      KnowledgeBasesSettings.newBuilder();
  knowledgeBasesSettingsBuilder.getKnowledgeBaseSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  KnowledgeBasesSettings knowledgeBasesSettings = knowledgeBasesSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 KnowledgeBasesSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (KnowledgeBasesSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (KnowledgeBasesSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (KnowledgeBasesSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (KnowledgeBasesSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder []
    (KnowledgeBasesSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (KnowledgeBasesSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings [^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings stub]
    (KnowledgeBasesSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (KnowledgeBasesSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (KnowledgeBasesSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (KnowledgeBasesSettings/getDefaultServiceScopes )))

(defn list-knowledge-bases-settings
  "Returns the object with the settings used for calls to listKnowledgeBases.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse,com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^KnowledgeBasesSettings this]
    (-> this (.listKnowledgeBasesSettings))))

(defn get-knowledge-base-settings
  "Returns the object with the settings used for calls to getKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesSettings this]
    (-> this (.getKnowledgeBaseSettings))))

(defn create-knowledge-base-settings
  "Returns the object with the settings used for calls to createKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesSettings this]
    (-> this (.createKnowledgeBaseSettings))))

(defn delete-knowledge-base-settings
  "Returns the object with the settings used for calls to deleteKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesSettings this]
    (-> this (.deleteKnowledgeBaseSettings))))

(defn update-knowledge-base-settings
  "Returns the object with the settings used for calls to updateKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesSettings this]
    (-> this (.updateKnowledgeBaseSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder [^KnowledgeBasesSettings this]
    (-> this (.toBuilder))))

