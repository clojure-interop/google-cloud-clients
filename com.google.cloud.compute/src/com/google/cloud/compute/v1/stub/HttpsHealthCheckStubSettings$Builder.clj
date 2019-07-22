(ns com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder
  "Builder for HttpsHealthCheckStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpsHealthCheckStubSettings$Builder]))

(defn get-https-health-check-settings
  "Returns the builder for the settings used for calls to getHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.getHttpsHealthCheckSettings))))

(defn insert-https-health-check-settings
  "Returns the builder for the settings used for calls to insertHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.insertHttpsHealthCheckSettings))))

(defn patch-https-health-check-settings
  "Returns the builder for the settings used for calls to patchHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.patchHttpsHealthCheckSettings))))

(defn list-https-health-checks-settings
  "Returns the builder for the settings used for calls to listHttpsHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList,com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.listHttpsHealthChecksSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder [^HttpsHealthCheckStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-https-health-check-settings
  "Returns the builder for the settings used for calls to deleteHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.deleteHttpsHealthCheckSettings))))

(defn update-https-health-check-settings
  "Returns the builder for the settings used for calls to updateHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.updateHttpsHealthCheckSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.build))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^HttpsHealthCheckStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

