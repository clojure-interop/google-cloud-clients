(ns com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionsStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub GrpcSessionsStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionsStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionsStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcSessionsStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionsStub [^com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings settings]
    (GrpcSessionsStub/create settings)))

(defn detect-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DetectIntentRequest,com.google.cloud.dialogflow.v2beta1.DetectIntentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSessionsStub this]
    (-> this (.detectIntentCallable))))

(defn streaming-detect-intent-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest,com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^GrpcSessionsStub this]
    (-> this (.streamingDetectIntentCallable))))

(defn close
  ""
  ([^GrpcSessionsStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcSessionsStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcSessionsStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcSessionsStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcSessionsStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcSessionsStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

