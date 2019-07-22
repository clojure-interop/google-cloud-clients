(ns com.google.cloud.dialogflow.v2.stub.GrpcSessionEntityTypesStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2.stub GrpcSessionEntityTypesStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2.stub.GrpcSessionEntityTypesStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.stub.GrpcSessionEntityTypesStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcSessionEntityTypesStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2.stub.GrpcSessionEntityTypesStub [^com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStubSettings settings]
    (GrpcSessionEntityTypesStub/create settings)))

(defn list-session-entity-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSessionEntityTypesStub this]
    (-> this (.listSessionEntityTypesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcSessionEntityTypesStub this]
    (-> this (.isShutdown))))

(defn create-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.CreateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSessionEntityTypesStub this]
    (-> this (.createSessionEntityTypeCallable))))

(defn list-session-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2.ListSessionEntityTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSessionEntityTypesStub this]
    (-> this (.listSessionEntityTypesCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcSessionEntityTypesStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcSessionEntityTypesStub this]
    (-> this (.shutdown))))

(defn delete-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSessionEntityTypesStub this]
    (-> this (.deleteSessionEntityTypeCallable))))

(defn get-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.GetSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSessionEntityTypesStub this]
    (-> this (.getSessionEntityTypeCallable))))

(defn update-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSessionEntityTypesStub this]
    (-> this (.updateSessionEntityTypeCallable))))

(defn close
  ""
  ([^GrpcSessionEntityTypesStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcSessionEntityTypesStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcSessionEntityTypesStub this]
    (-> this (.shutdownNow))))

