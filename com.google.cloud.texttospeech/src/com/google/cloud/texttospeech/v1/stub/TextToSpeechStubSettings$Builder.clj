(ns com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder
  "Builder for TextToSpeechStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.texttospeech.v1.stub TextToSpeechStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder [^TextToSpeechStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^TextToSpeechStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-voices-settings
  "Returns the builder for the settings used for calls to listVoices.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.texttospeech.v1.ListVoicesRequest,com.google.cloud.texttospeech.v1.ListVoicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TextToSpeechStubSettings$Builder this]
    (-> this (.listVoicesSettings))))

(defn synthesize-speech-settings
  "Returns the builder for the settings used for calls to synthesizeSpeech.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest,com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TextToSpeechStubSettings$Builder this]
    (-> this (.synthesizeSpeechSettings))))

(defn build
  "returns: `com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings [^TextToSpeechStubSettings$Builder this]
    (-> this (.build))))

