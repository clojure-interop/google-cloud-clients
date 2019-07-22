(ns com.google.cloud.dialogflow.v2beta1.AgentsSettings$Builder
  "Builder for AgentsSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 AgentsSettings$Builder]))

(defn delete-agent-settings
  "Returns the builder for the settings used for calls to deleteAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.deleteAgentSettings))))

(defn restore-agent-settings
  "Returns the builder for the settings used for calls to restoreAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.restoreAgentSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2beta1.AgentsSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2beta1.AgentsSettings$Builder [^AgentsSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-agent-settings
  "Returns the builder for the settings used for calls to getAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.GetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.getAgentSettings))))

(defn export-agent-operation-settings
  "Returns the builder for the settings used for calls to exportAgent.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.cloud.dialogflow.v2beta1.ExportAgentResponse,com.google.protobuf.Struct>`"
  ([^AgentsSettings$Builder this]
    (-> this (.exportAgentOperationSettings))))

(defn train-agent-operation-settings
  "Returns the builder for the settings used for calls to trainAgent.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsSettings$Builder this]
    (-> this (.trainAgentOperationSettings))))

(defn train-agent-settings
  "Returns the builder for the settings used for calls to trainAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.trainAgentSettings))))

(defn restore-agent-operation-settings
  "Returns the builder for the settings used for calls to restoreAgent.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsSettings$Builder this]
    (-> this (.restoreAgentOperationSettings))))

(defn set-agent-settings
  "Returns the builder for the settings used for calls to setAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.SetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.setAgentSettings))))

(defn import-agent-operation-settings
  "Returns the builder for the settings used for calls to importAgent.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsSettings$Builder this]
    (-> this (.importAgentOperationSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2beta1.AgentsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.AgentsSettings [^AgentsSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder [^AgentsSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn export-agent-settings
  "Returns the builder for the settings used for calls to exportAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.exportAgentSettings))))

(defn search-agents-settings
  "Returns the builder for the settings used for calls to searchAgents.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse,com.google.cloud.dialogflow.v2beta1.AgentsClient$SearchAgentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.searchAgentsSettings))))

(defn import-agent-settings
  "Returns the builder for the settings used for calls to importAgent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AgentsSettings$Builder this]
    (-> this (.importAgentSettings))))

