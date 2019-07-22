(ns com.google.cloud.dialogflow.v2beta1.stub.GrpcAgentsStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub GrpcAgentsStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.GrpcAgentsStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcAgentsStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcAgentsStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcAgentsStub [^com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings settings]
    (GrpcAgentsStub/create settings)))

(defn search-agents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.searchAgentsCallable))))

(defn search-agents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,com.google.cloud.dialogflow.v2beta1.AgentsClient$SearchAgentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.searchAgentsPagedCallable))))

(defn restore-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcAgentsStub this]
    (-> this (.restoreAgentOperationCallable))))

(defn restore-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.restoreAgentCallable))))

(defn get-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.getAgentCallable))))

(defn export-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.cloud.dialogflow.v2beta1.ExportAgentResponse,com.google.protobuf.Struct>`"
  ([^GrpcAgentsStub this]
    (-> this (.exportAgentOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcAgentsStub this]
    (-> this (.getOperationsStub))))

(defn train-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.trainAgentCallable))))

(defn export-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.exportAgentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcAgentsStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcAgentsStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn set-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.SetAgentRequest,com.google.cloud.dialogflow.v2beta1.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.setAgentCallable))))

(defn shutdown
  ""
  ([^GrpcAgentsStub this]
    (-> this (.shutdown))))

(defn import-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcAgentsStub this]
    (-> this (.importAgentOperationCallable))))

(defn close
  ""
  ([^GrpcAgentsStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcAgentsStub this]
    (-> this (.isTerminated))))

(defn import-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.importAgentCallable))))

(defn train-agent-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcAgentsStub this]
    (-> this (.trainAgentOperationCallable))))

(defn delete-agent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAgentsStub this]
    (-> this (.deleteAgentCallable))))

(defn shutdown-now
  ""
  ([^GrpcAgentsStub this]
    (-> this (.shutdownNow))))

