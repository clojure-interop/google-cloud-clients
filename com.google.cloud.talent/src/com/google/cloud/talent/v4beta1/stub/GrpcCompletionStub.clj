(ns com.google.cloud.talent.v4beta1.stub.GrpcCompletionStub
  "gRPC stub implementation for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub GrpcCompletionStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.talent.v4beta1.stub.GrpcCompletionStub`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.GrpcCompletionStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcCompletionStub/create client-context callable-factory))
  (^com.google.cloud.talent.v4beta1.stub.GrpcCompletionStub [^com.google.cloud.talent.v4beta1.stub.CompletionStubSettings settings]
    (GrpcCompletionStub/create settings)))

(defn complete-query-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CompleteQueryRequest,com.google.cloud.talent.v4beta1.CompleteQueryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCompletionStub this]
    (-> this (.completeQueryCallable))))

(defn close
  ""
  ([^GrpcCompletionStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcCompletionStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcCompletionStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcCompletionStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcCompletionStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcCompletionStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

