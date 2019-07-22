(ns com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings
  "Settings class to configure an instance of KnowledgeBasesStub.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getKnowledgeBase to 30 seconds:



  KnowledgeBasesStubSettings.Builder knowledgeBasesSettingsBuilder =
      KnowledgeBasesStubSettings.newBuilder();
  knowledgeBasesSettingsBuilder.getKnowledgeBaseSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  KnowledgeBasesStubSettings knowledgeBasesSettings = knowledgeBasesSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub KnowledgeBasesStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (KnowledgeBasesStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (KnowledgeBasesStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (KnowledgeBasesStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (KnowledgeBasesStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (KnowledgeBasesStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (KnowledgeBasesStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (KnowledgeBasesStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (KnowledgeBasesStubSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder []
    (KnowledgeBasesStubSettings/newBuilder )))

(defn list-knowledge-bases-settings
  "Returns the object with the settings used for calls to listKnowledgeBases.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse,com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^KnowledgeBasesStubSettings this]
    (-> this (.listKnowledgeBasesSettings))))

(defn get-knowledge-base-settings
  "Returns the object with the settings used for calls to getKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesStubSettings this]
    (-> this (.getKnowledgeBaseSettings))))

(defn create-knowledge-base-settings
  "Returns the object with the settings used for calls to createKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesStubSettings this]
    (-> this (.createKnowledgeBaseSettings))))

(defn delete-knowledge-base-settings
  "Returns the object with the settings used for calls to deleteKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesStubSettings this]
    (-> this (.deleteKnowledgeBaseSettings))))

(defn update-knowledge-base-settings
  "Returns the object with the settings used for calls to updateKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^KnowledgeBasesStubSettings this]
    (-> this (.updateKnowledgeBaseSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStub`

  throws: java.io.IOException"
  ([^KnowledgeBasesStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder [^KnowledgeBasesStubSettings this]
    (-> this (.toBuilder))))

