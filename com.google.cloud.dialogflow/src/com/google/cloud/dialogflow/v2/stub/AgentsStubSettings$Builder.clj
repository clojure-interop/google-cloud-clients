(ns com.google.cloud.dialogflow.v2.stub.AgentsStubSettings$Builder
  "Builder for AgentsStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2.stub AgentsStubSettings$Builder]))

(defn delete-agent-settings
  "Returns the builder for the settings used for calls to deleteAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.DeleteAgentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.deleteAgentSettings))))

(defn restore-agent-settings
  "Returns the builder for the settings used for calls to restoreAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.RestoreAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.restoreAgentSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2.stub.AgentsStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2.stub.AgentsStubSettings$Builder [^AgentsStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-agent-settings
  "Returns the builder for the settings used for calls to getAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.GetAgentRequest,com.google.cloud.dialogflow.v2.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.getAgentSettings))))

(defn export-agent-operation-settings
  "Returns the builder for the settings used for calls to exportAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2.ExportAgentRequest,com.google.cloud.dialogflow.v2.ExportAgentResponse,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings$Builder this]
    (-> this (.exportAgentOperationSettings))))

(defn train-agent-operation-settings
  "Returns the builder for the settings used for calls to trainAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2.TrainAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings$Builder this]
    (-> this (.trainAgentOperationSettings))))

(defn train-agent-settings
  "Returns the builder for the settings used for calls to trainAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.TrainAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.trainAgentSettings))))

(defn restore-agent-operation-settings
  "Returns the builder for the settings used for calls to restoreAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2.RestoreAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings$Builder this]
    (-> this (.restoreAgentOperationSettings))))

(defn set-agent-settings
  "Returns the builder for the settings used for calls to setAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.SetAgentRequest,com.google.cloud.dialogflow.v2.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.setAgentSettings))))

(defn import-agent-operation-settings
  "Returns the builder for the settings used for calls to importAgent.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2.ImportAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStubSettings$Builder this]
    (-> this (.importAgentOperationSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2.stub.AgentsStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.stub.AgentsStubSettings [^AgentsStubSettings$Builder this]
    (-> this (.build))))

(defn export-agent-settings
  "Returns the builder for the settings used for calls to exportAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.ExportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.exportAgentSettings))))

(defn search-agents-settings
  "Returns the builder for the settings used for calls to searchAgents.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2.SearchAgentsRequest,com.google.cloud.dialogflow.v2.SearchAgentsResponse,com.google.cloud.dialogflow.v2.AgentsClient$SearchAgentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.searchAgentsSettings))))

(defn import-agent-settings
  "Returns the builder for the settings used for calls to importAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.ImportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsStubSettings$Builder this]
    (-> this (.importAgentSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^AgentsStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

