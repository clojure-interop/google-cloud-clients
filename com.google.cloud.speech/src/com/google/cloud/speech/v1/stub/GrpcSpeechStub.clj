(ns com.google.cloud.speech.v1.stub.GrpcSpeechStub
  "gRPC stub implementation for Cloud Speech API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.speech.v1.stub GrpcSpeechStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.speech.v1.stub.GrpcSpeechStub`

  throws: java.io.IOException"
  (^com.google.cloud.speech.v1.stub.GrpcSpeechStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcSpeechStub/create client-context callable-factory))
  (^com.google.cloud.speech.v1.stub.GrpcSpeechStub [^com.google.cloud.speech.v1.stub.SpeechStubSettings settings]
    (GrpcSpeechStub/create settings)))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcSpeechStub this]
    (-> this (.getOperationsStub))))

(defn long-running-recognize-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.speech.v1.LongRunningRecognizeRequest,com.google.cloud.speech.v1.LongRunningRecognizeResponse,com.google.cloud.speech.v1.LongRunningRecognizeMetadata>`"
  ([^GrpcSpeechStub this]
    (-> this (.longRunningRecognizeOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcSpeechStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcSpeechStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcSpeechStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcSpeechStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcSpeechStub this]
    (-> this (.isTerminated))))

(defn streaming-recognize-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.speech.v1.StreamingRecognizeRequest,com.google.cloud.speech.v1.StreamingRecognizeResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^GrpcSpeechStub this]
    (-> this (.streamingRecognizeCallable))))

(defn long-running-recognize-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.speech.v1.LongRunningRecognizeRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpeechStub this]
    (-> this (.longRunningRecognizeCallable))))

(defn shutdown-now
  ""
  ([^GrpcSpeechStub this]
    (-> this (.shutdownNow))))

(defn recognize-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.speech.v1.RecognizeRequest,com.google.cloud.speech.v1.RecognizeResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpeechStub this]
    (-> this (.recognizeCallable))))

