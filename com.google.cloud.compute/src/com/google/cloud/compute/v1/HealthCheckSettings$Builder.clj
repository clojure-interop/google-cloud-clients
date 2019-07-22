(ns com.google.cloud.compute.v1.HealthCheckSettings$Builder
  "Builder for HealthCheckSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthCheckSettings$Builder]))

(defn insert-health-check-settings
  "Returns the builder for the settings used for calls to insertHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HealthCheckSettings$Builder this]
    (-> this (.insertHealthCheckSettings))))

(defn patch-health-check-settings
  "Returns the builder for the settings used for calls to patchHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HealthCheckSettings$Builder this]
    (-> this (.patchHealthCheckSettings))))

(defn update-health-check-settings
  "Returns the builder for the settings used for calls to updateHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HealthCheckSettings$Builder this]
    (-> this (.updateHealthCheckSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.HealthCheckSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.HealthCheckSettings$Builder [^HealthCheckSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-health-check-settings
  "Returns the builder for the settings used for calls to deleteHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HealthCheckSettings$Builder this]
    (-> this (.deleteHealthCheckSettings))))

(defn get-health-check-settings
  "Returns the builder for the settings used for calls to getHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetHealthCheckHttpRequest,com.google.cloud.compute.v1.HealthCheck>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HealthCheckSettings$Builder this]
    (-> this (.getHealthCheckSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.HealthCheckSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.HealthCheckSettings [^HealthCheckSettings$Builder this]
    (-> this (.build))))

(defn list-health-checks-settings
  "Returns the builder for the settings used for calls to listHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckList,com.google.cloud.compute.v1.HealthCheckClient$ListHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^HealthCheckSettings$Builder this]
    (-> this (.listHealthChecksSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.HealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HealthCheckStubSettings$Builder [^HealthCheckSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

