(ns com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings
  "Settings class to configure an instance of AgentsStub.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of setAgent to 30 seconds:



  AgentsStubSettings.Builder agentsSettingsBuilder =
      AgentsStubSettings.newBuilder();
  agentsSettingsBuilder.setAgentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AgentsStubSettings agentsSettings = agentsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub AgentsStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AgentsStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AgentsStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AgentsStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AgentsStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AgentsStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AgentsStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AgentsStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AgentsStubSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder []
    (AgentsStubSettings/newBuilder )))

(defn delete-agent-settings
  "Returns the object with the settings used for calls to deleteAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AgentsStubSettings this]
    (-> this (.deleteAgentSettings))))

(defn restore-agent-settings
  "Returns the object with the settings used for calls to restoreAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AgentsStubSettings this]
    (-> this (.restoreAgentSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.AgentsStub`

  throws: java.io.IOException"
  ([^AgentsStubSettings this]
    (-> this (.createStub))))

(defn get-agent-settings
  "Returns the object with the settings used for calls to getAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AgentsStubSettings this]
    (-> this (.getAgentSettings))))

(defn export-agent-operation-settings
  "Returns the object with the settings used for calls to exportAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.cloud.dialogflow.v2beta1.ExportAgentResponse,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings this]
    (-> this (.exportAgentOperationSettings))))

(defn train-agent-operation-settings
  "Returns the object with the settings used for calls to trainAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings this]
    (-> this (.trainAgentOperationSettings))))

(defn train-agent-settings
  "Returns the object with the settings used for calls to trainAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AgentsStubSettings this]
    (-> this (.trainAgentSettings))))

(defn restore-agent-operation-settings
  "Returns the object with the settings used for calls to restoreAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings this]
    (-> this (.restoreAgentOperationSettings))))

(defn set-agent-settings
  "Returns the object with the settings used for calls to setAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.SetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AgentsStubSettings this]
    (-> this (.setAgentSettings))))

(defn import-agent-operation-settings
  "Returns the object with the settings used for calls to importAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings this]
    (-> this (.importAgentOperationSettings))))

(defn export-agent-settings
  "Returns the object with the settings used for calls to exportAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AgentsStubSettings this]
    (-> this (.exportAgentSettings))))

(defn search-agents-settings
  "Returns the object with the settings used for calls to searchAgents.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse,com.google.cloud.dialogflow.v2beta1.AgentsClient$SearchAgentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AgentsStubSettings this]
    (-> this (.searchAgentsSettings))))

(defn import-agent-settings
  "Returns the object with the settings used for calls to importAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AgentsStubSettings this]
    (-> this (.importAgentSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder [^AgentsStubSettings this]
    (-> this (.toBuilder))))

