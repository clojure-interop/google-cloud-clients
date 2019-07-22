(ns com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder
  "Builder for HttpsHealthCheckSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpsHealthCheckSettings$Builder]))

(defn get-https-health-check-settings
  "Returns the builder for the settings used for calls to getHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckSettings$Builder this]
    (-> this (.getHttpsHealthCheckSettings))))

(defn insert-https-health-check-settings
  "Returns the builder for the settings used for calls to insertHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckSettings$Builder this]
    (-> this (.insertHttpsHealthCheckSettings))))

(defn patch-https-health-check-settings
  "Returns the builder for the settings used for calls to patchHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckSettings$Builder this]
    (-> this (.patchHttpsHealthCheckSettings))))

(defn list-https-health-checks-settings
  "Returns the builder for the settings used for calls to listHttpsHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList,com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^HttpsHealthCheckSettings$Builder this]
    (-> this (.listHttpsHealthChecksSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder [^HttpsHealthCheckSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-https-health-check-settings
  "Returns the builder for the settings used for calls to deleteHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckSettings$Builder this]
    (-> this (.deleteHttpsHealthCheckSettings))))

(defn update-https-health-check-settings
  "Returns the builder for the settings used for calls to updateHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckSettings$Builder this]
    (-> this (.updateHttpsHealthCheckSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.HttpsHealthCheckSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.HttpsHealthCheckSettings [^HttpsHealthCheckSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder [^HttpsHealthCheckSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

