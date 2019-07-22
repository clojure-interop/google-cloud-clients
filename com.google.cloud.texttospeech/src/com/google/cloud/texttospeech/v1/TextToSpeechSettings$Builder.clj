(ns com.google.cloud.texttospeech.v1.TextToSpeechSettings$Builder
  "Builder for TextToSpeechSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.texttospeech.v1 TextToSpeechSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder`"
  (^com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder [^TextToSpeechSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.texttospeech.v1.TextToSpeechSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.texttospeech.v1.TextToSpeechSettings$Builder [^TextToSpeechSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-voices-settings
  "Returns the builder for the settings used for calls to listVoices.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.texttospeech.v1.ListVoicesRequest,com.google.cloud.texttospeech.v1.ListVoicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TextToSpeechSettings$Builder this]
    (-> this (.listVoicesSettings))))

(defn synthesize-speech-settings
  "Returns the builder for the settings used for calls to synthesizeSpeech.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest,com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TextToSpeechSettings$Builder this]
    (-> this (.synthesizeSpeechSettings))))

(defn build
  "returns: `com.google.cloud.texttospeech.v1.TextToSpeechSettings`

  throws: java.io.IOException"
  (^com.google.cloud.texttospeech.v1.TextToSpeechSettings [^TextToSpeechSettings$Builder this]
    (-> this (.build))))

