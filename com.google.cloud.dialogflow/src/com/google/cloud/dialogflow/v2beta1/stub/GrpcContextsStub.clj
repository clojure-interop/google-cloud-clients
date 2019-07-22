(ns com.google.cloud.dialogflow.v2beta1.stub.GrpcContextsStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub GrpcContextsStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.GrpcContextsStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcContextsStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcContextsStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcContextsStub [^com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings settings]
    (GrpcContextsStub/create settings)))

(defn delete-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteContextRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContextsStub this]
    (-> this (.deleteContextCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcContextsStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcContextsStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-contexts-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListContextsRequest,com.google.cloud.dialogflow.v2beta1.ListContextsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContextsStub this]
    (-> this (.listContextsCallable))))

(defn shutdown
  ""
  ([^GrpcContextsStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcContextsStub this]
    (-> this (.close))))

(defn get-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContextsStub this]
    (-> this (.getContextCallable))))

(defn delete-all-contexts-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteAllContextsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContextsStub this]
    (-> this (.deleteAllContextsCallable))))

(defn list-contexts-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListContextsRequest,com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContextsStub this]
    (-> this (.listContextsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcContextsStub this]
    (-> this (.isTerminated))))

(defn update-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContextsStub this]
    (-> this (.updateContextCallable))))

(defn create-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContextsStub this]
    (-> this (.createContextCallable))))

(defn shutdown-now
  ""
  ([^GrpcContextsStub this]
    (-> this (.shutdownNow))))

