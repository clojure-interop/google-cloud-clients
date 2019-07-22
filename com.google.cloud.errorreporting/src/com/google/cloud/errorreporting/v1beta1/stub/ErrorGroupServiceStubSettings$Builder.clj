(ns com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder
  "Builder for ErrorGroupServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ErrorGroupServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder [^ErrorGroupServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ErrorGroupServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-group-settings
  "Returns the builder for the settings used for calls to getGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ErrorGroupServiceStubSettings$Builder this]
    (-> this (.getGroupSettings))))

(defn update-group-settings
  "Returns the builder for the settings used for calls to updateGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ErrorGroupServiceStubSettings$Builder this]
    (-> this (.updateGroupSettings))))

(defn build
  "returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings [^ErrorGroupServiceStubSettings$Builder this]
    (-> this (.build))))

