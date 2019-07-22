(ns com.google.cloud.dialogflow.v2beta1.stub.SessionsStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub SessionsStub]))

(defn ->sessions-stub
  "Constructor."
  (^SessionsStub []
    (new SessionsStub )))

(defn detect-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DetectIntentRequest,com.google.cloud.dialogflow.v2beta1.DetectIntentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionsStub this]
    (-> this (.detectIntentCallable))))

(defn streaming-detect-intent-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest,com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^SessionsStub this]
    (-> this (.streamingDetectIntentCallable))))

(defn close
  ""
  ([^SessionsStub this]
    (-> this (.close))))

