(ns com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder
  "Builder for HttpHealthCheckStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpHealthCheckStubSettings$Builder]))

(defn get-http-health-check-settings
  "Returns the builder for the settings used for calls to getHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.getHttpHealthCheckSettings))))

(defn update-http-health-check-settings
  "Returns the builder for the settings used for calls to updateHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.updateHttpHealthCheckSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder [^HttpHealthCheckStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn patch-http-health-check-settings
  "Returns the builder for the settings used for calls to patchHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.patchHttpHealthCheckSettings))))

(defn list-http-health-checks-settings
  "Returns the builder for the settings used for calls to listHttpHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckList,com.google.cloud.compute.v1.HttpHealthCheckClient$ListHttpHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.listHttpHealthChecksSettings))))

(defn insert-http-health-check-settings
  "Returns the builder for the settings used for calls to insertHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.insertHttpHealthCheckSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.build))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-http-health-check-settings
  "Returns the builder for the settings used for calls to deleteHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^HttpHealthCheckStubSettings$Builder this]
    (-> this (.deleteHttpHealthCheckSettings))))

