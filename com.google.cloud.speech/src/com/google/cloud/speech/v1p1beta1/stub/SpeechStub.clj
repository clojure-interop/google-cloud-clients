(ns com.google.cloud.speech.v1p1beta1.stub.SpeechStub
  "Base stub class for Cloud Speech API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.speech.v1p1beta1.stub SpeechStub]))

(defn ->speech-stub
  "Constructor."
  (^SpeechStub []
    (new SpeechStub )))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^SpeechStub this]
    (-> this (.getOperationsStub))))

(defn recognize-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.speech.v1p1beta1.RecognizeRequest,com.google.cloud.speech.v1p1beta1.RecognizeResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpeechStub this]
    (-> this (.recognizeCallable))))

(defn long-running-recognize-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest,com.google.cloud.speech.v1p1beta1.LongRunningRecognizeResponse,com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadata>`"
  ([^SpeechStub this]
    (-> this (.longRunningRecognizeOperationCallable))))

(defn long-running-recognize-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpeechStub this]
    (-> this (.longRunningRecognizeCallable))))

(defn streaming-recognize-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest,com.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^SpeechStub this]
    (-> this (.streamingRecognizeCallable))))

(defn close
  ""
  ([^SpeechStub this]
    (-> this (.close))))

