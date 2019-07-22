(ns com.google.cloud.dialogflow.v2beta1.stub.AgentsStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub AgentsStub]))

(defn ->agents-stub
  "Constructor."
  (^AgentsStub []
    (new AgentsStub )))

(defn search-agents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.searchAgentsCallable))))

(defn search-agents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,com.google.cloud.dialogflow.v2beta1.AgentsClient$SearchAgentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.searchAgentsPagedCallable))))

(defn restore-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStub this]
    (-> this (.restoreAgentOperationCallable))))

(defn restore-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.restoreAgentCallable))))

(defn get-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.getAgentCallable))))

(defn export-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.cloud.dialogflow.v2beta1.ExportAgentResponse,com.google.protobuf.Struct>`"
  ([^AgentsStub this]
    (-> this (.exportAgentOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^AgentsStub this]
    (-> this (.getOperationsStub))))

(defn train-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.trainAgentCallable))))

(defn export-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.exportAgentCallable))))

(defn set-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.SetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.setAgentCallable))))

(defn import-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStub this]
    (-> this (.importAgentOperationCallable))))

(defn close
  ""
  ([^AgentsStub this]
    (-> this (.close))))

(defn import-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.importAgentCallable))))

(defn train-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsStub this]
    (-> this (.trainAgentOperationCallable))))

(defn delete-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsStub this]
    (-> this (.deleteAgentCallable))))

