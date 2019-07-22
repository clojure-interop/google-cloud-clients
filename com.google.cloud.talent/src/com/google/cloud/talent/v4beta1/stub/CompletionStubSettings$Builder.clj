(ns com.google.cloud.talent.v4beta1.stub.CompletionStubSettings$Builder
  "Builder for CompletionStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub CompletionStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.stub.CompletionStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.stub.CompletionStubSettings$Builder [^CompletionStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^CompletionStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn complete-query-settings
  "Returns the builder for the settings used for calls to completeQuery.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CompleteQueryRequest,com.google.cloud.talent.v4beta1.CompleteQueryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CompletionStubSettings$Builder this]
    (-> this (.completeQuerySettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.stub.CompletionStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.CompletionStubSettings [^CompletionStubSettings$Builder this]
    (-> this (.build))))

