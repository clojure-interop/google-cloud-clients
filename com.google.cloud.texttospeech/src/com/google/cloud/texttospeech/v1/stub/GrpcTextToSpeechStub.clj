(ns com.google.cloud.texttospeech.v1.stub.GrpcTextToSpeechStub
  "gRPC stub implementation for Cloud Text-to-Speech API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.texttospeech.v1.stub GrpcTextToSpeechStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.texttospeech.v1.stub.GrpcTextToSpeechStub`

  throws: java.io.IOException"
  (^com.google.cloud.texttospeech.v1.stub.GrpcTextToSpeechStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcTextToSpeechStub/create client-context callable-factory))
  (^com.google.cloud.texttospeech.v1.stub.GrpcTextToSpeechStub [^com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings settings]
    (GrpcTextToSpeechStub/create settings)))

(defn list-voices-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.texttospeech.v1.ListVoicesRequest,com.google.cloud.texttospeech.v1.ListVoicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTextToSpeechStub this]
    (-> this (.listVoicesCallable))))

(defn synthesize-speech-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest,com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTextToSpeechStub this]
    (-> this (.synthesizeSpeechCallable))))

(defn close
  ""
  ([^GrpcTextToSpeechStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcTextToSpeechStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcTextToSpeechStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcTextToSpeechStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcTextToSpeechStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcTextToSpeechStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

