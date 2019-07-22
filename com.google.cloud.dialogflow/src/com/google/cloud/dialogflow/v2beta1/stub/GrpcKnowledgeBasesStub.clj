(ns com.google.cloud.dialogflow.v2beta1.stub.GrpcKnowledgeBasesStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub GrpcKnowledgeBasesStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.GrpcKnowledgeBasesStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcKnowledgeBasesStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcKnowledgeBasesStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcKnowledgeBasesStub [^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings settings]
    (GrpcKnowledgeBasesStub/create settings)))

(defn create-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKnowledgeBasesStub this]
    (-> this (.createKnowledgeBaseCallable))))

(defn update-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKnowledgeBasesStub this]
    (-> this (.updateKnowledgeBaseCallable))))

(defn list-knowledge-bases-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKnowledgeBasesStub this]
    (-> this (.listKnowledgeBasesPagedCallable))))

(defn get-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKnowledgeBasesStub this]
    (-> this (.getKnowledgeBaseCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcKnowledgeBasesStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcKnowledgeBasesStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcKnowledgeBasesStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcKnowledgeBasesStub this]
    (-> this (.close))))

(defn list-knowledge-bases-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKnowledgeBasesStub this]
    (-> this (.listKnowledgeBasesCallable))))

(defn delete-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcKnowledgeBasesStub this]
    (-> this (.deleteKnowledgeBaseCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcKnowledgeBasesStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcKnowledgeBasesStub this]
    (-> this (.shutdownNow))))

