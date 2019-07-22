(ns com.google.cloud.speech.v1.SpeechSettings$Builder
  "Builder for SpeechSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.speech.v1 SpeechSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.speech.v1.stub.SpeechStubSettings$Builder`"
  (^com.google.cloud.speech.v1.stub.SpeechStubSettings$Builder [^SpeechSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.speech.v1.SpeechSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.speech.v1.SpeechSettings$Builder [^SpeechSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn recognize-settings
  "Returns the builder for the settings used for calls to recognize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.speech.v1.RecognizeRequest,com.google.cloud.speech.v1.RecognizeResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpeechSettings$Builder this]
    (-> this (.recognizeSettings))))

(defn long-running-recognize-settings
  "Returns the builder for the settings used for calls to longRunningRecognize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.speech.v1.LongRunningRecognizeRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpeechSettings$Builder this]
    (-> this (.longRunningRecognizeSettings))))

(defn long-running-recognize-operation-settings
  "Returns the builder for the settings used for calls to longRunningRecognize.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.speech.v1.LongRunningRecognizeRequest,com.google.cloud.speech.v1.LongRunningRecognizeResponse,com.google.cloud.speech.v1.LongRunningRecognizeMetadata>`"
  ([^SpeechSettings$Builder this]
    (-> this (.longRunningRecognizeOperationSettings))))

(defn streaming-recognize-settings
  "Returns the builder for the settings used for calls to streamingRecognize.

  returns: `com.google.api.gax.rpc.StreamingCallSettings.Builder<com.google.cloud.speech.v1.StreamingRecognizeRequest,com.google.cloud.speech.v1.StreamingRecognizeResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings.Builder [^SpeechSettings$Builder this]
    (-> this (.streamingRecognizeSettings))))

(defn build
  "returns: `com.google.cloud.speech.v1.SpeechSettings`

  throws: java.io.IOException"
  (^com.google.cloud.speech.v1.SpeechSettings [^SpeechSettings$Builder this]
    (-> this (.build))))

