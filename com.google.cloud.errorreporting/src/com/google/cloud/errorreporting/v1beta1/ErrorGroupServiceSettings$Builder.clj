(ns com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder
  "Builder for ErrorGroupServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorGroupServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder [^ErrorGroupServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder [^ErrorGroupServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-group-settings
  "Returns the builder for the settings used for calls to getGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ErrorGroupServiceSettings$Builder this]
    (-> this (.getGroupSettings))))

(defn update-group-settings
  "Returns the builder for the settings used for calls to updateGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ErrorGroupServiceSettings$Builder this]
    (-> this (.updateGroupSettings))))

(defn build
  "returns: `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings [^ErrorGroupServiceSettings$Builder this]
    (-> this (.build))))

