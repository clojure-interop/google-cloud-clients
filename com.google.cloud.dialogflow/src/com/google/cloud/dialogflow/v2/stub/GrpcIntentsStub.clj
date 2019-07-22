(ns com.google.cloud.dialogflow.v2.stub.GrpcIntentsStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2.stub GrpcIntentsStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2.stub.GrpcIntentsStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.stub.GrpcIntentsStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcIntentsStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2.stub.GrpcIntentsStub [^com.google.cloud.dialogflow.v2.stub.IntentsStubSettings settings]
    (GrpcIntentsStub/create settings)))

(defn batch-delete-intents-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.BatchDeleteIntentsRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcIntentsStub this]
    (-> this (.batchDeleteIntentsOperationCallable))))

(defn get-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.GetIntentRequest,com.google.cloud.dialogflow.v2.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.getIntentCallable))))

(defn list-intents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListIntentsRequest,com.google.cloud.dialogflow.v2.IntentsClient$ListIntentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.listIntentsPagedCallable))))

(defn list-intents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListIntentsRequest,com.google.cloud.dialogflow.v2.ListIntentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.listIntentsCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcIntentsStub this]
    (-> this (.getOperationsStub))))

(defn batch-update-intents-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.BatchUpdateIntentsRequest,com.google.cloud.dialogflow.v2.BatchUpdateIntentsResponse,com.google.protobuf.Struct>`"
  ([^GrpcIntentsStub this]
    (-> this (.batchUpdateIntentsOperationCallable))))

(defn update-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.UpdateIntentRequest,com.google.cloud.dialogflow.v2.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.updateIntentCallable))))

(defn batch-update-intents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.BatchUpdateIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.batchUpdateIntentsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcIntentsStub this]
    (-> this (.isShutdown))))

(defn delete-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DeleteIntentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.deleteIntentCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcIntentsStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcIntentsStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcIntentsStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcIntentsStub this]
    (-> this (.isTerminated))))

(defn batch-delete-intents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.BatchDeleteIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.batchDeleteIntentsCallable))))

(defn create-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.CreateIntentRequest,com.google.cloud.dialogflow.v2.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIntentsStub this]
    (-> this (.createIntentCallable))))

(defn shutdown-now
  ""
  ([^GrpcIntentsStub this]
    (-> this (.shutdownNow))))

