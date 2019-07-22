(ns com.google.cloud.texttospeech.v1.stub.TextToSpeechStub
  "Base stub class for Cloud Text-to-Speech API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.texttospeech.v1.stub TextToSpeechStub]))

(defn ->text-to-speech-stub
  "Constructor."
  (^TextToSpeechStub []
    (new TextToSpeechStub )))

(defn list-voices-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.texttospeech.v1.ListVoicesRequest,com.google.cloud.texttospeech.v1.ListVoicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TextToSpeechStub this]
    (-> this (.listVoicesCallable))))

(defn synthesize-speech-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest,com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TextToSpeechStub this]
    (-> this (.synthesizeSpeechCallable))))

(defn close
  ""
  ([^TextToSpeechStub this]
    (-> this (.close))))

