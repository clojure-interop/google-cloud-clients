(ns com.google.cloud.dialogflow.v2.stub.SessionsStubSettings$Builder
  "Builder for SessionsStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2.stub SessionsStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2.stub.SessionsStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2.stub.SessionsStubSettings$Builder [^SessionsStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SessionsStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn detect-intent-settings
  "Returns the builder for the settings used for calls to detectIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.DetectIntentRequest,com.google.cloud.dialogflow.v2.DetectIntentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionsStubSettings$Builder this]
    (-> this (.detectIntentSettings))))

(defn streaming-detect-intent-settings
  "Returns the builder for the settings used for calls to streamingDetectIntent.

  returns: `com.google.api.gax.rpc.StreamingCallSettings.Builder<com.google.cloud.dialogflow.v2.StreamingDetectIntentRequest,com.google.cloud.dialogflow.v2.StreamingDetectIntentResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings.Builder [^SessionsStubSettings$Builder this]
    (-> this (.streamingDetectIntentSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2.stub.SessionsStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.stub.SessionsStubSettings [^SessionsStubSettings$Builder this]
    (-> this (.build))))

