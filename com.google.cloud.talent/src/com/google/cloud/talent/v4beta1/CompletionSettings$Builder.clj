(ns com.google.cloud.talent.v4beta1.CompletionSettings$Builder
  "Builder for CompletionSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 CompletionSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.talent.v4beta1.stub.CompletionStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.CompletionStubSettings$Builder [^CompletionSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.CompletionSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.CompletionSettings$Builder [^CompletionSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn complete-query-settings
  "Returns the builder for the settings used for calls to completeQuery.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CompleteQueryRequest,com.google.cloud.talent.v4beta1.CompleteQueryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CompletionSettings$Builder this]
    (-> this (.completeQuerySettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.CompletionSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.CompletionSettings [^CompletionSettings$Builder this]
    (-> this (.build))))

