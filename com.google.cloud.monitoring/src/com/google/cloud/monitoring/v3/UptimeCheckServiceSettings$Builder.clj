(ns com.google.cloud.monitoring.v3.UptimeCheckServiceSettings$Builder
  "Builder for UptimeCheckServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 UptimeCheckServiceSettings$Builder]))

(defn get-uptime-check-config-settings
  "Returns the builder for the settings used for calls to getUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UptimeCheckServiceSettings$Builder this]
    (-> this (.getUptimeCheckConfigSettings))))

(defn list-uptime-check-ips-settings
  "Returns the builder for the settings used for calls to listUptimeCheckIps.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.monitoring.v3.ListUptimeCheckIpsResponse,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^UptimeCheckServiceSettings$Builder this]
    (-> this (.listUptimeCheckIpsSettings))))

(defn create-uptime-check-config-settings
  "Returns the builder for the settings used for calls to createUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UptimeCheckServiceSettings$Builder this]
    (-> this (.createUptimeCheckConfigSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.monitoring.v3.UptimeCheckServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.monitoring.v3.UptimeCheckServiceSettings$Builder [^UptimeCheckServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-uptime-check-configs-settings
  "Returns the builder for the settings used for calls to listUptimeCheckConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.monitoring.v3.ListUptimeCheckConfigsResponse,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^UptimeCheckServiceSettings$Builder this]
    (-> this (.listUptimeCheckConfigsSettings))))

(defn delete-uptime-check-config-settings
  "Returns the builder for the settings used for calls to deleteUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.DeleteUptimeCheckConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UptimeCheckServiceSettings$Builder this]
    (-> this (.deleteUptimeCheckConfigSettings))))

(defn build
  "returns: `com.google.cloud.monitoring.v3.UptimeCheckServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.UptimeCheckServiceSettings [^UptimeCheckServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings$Builder [^UptimeCheckServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-uptime-check-config-settings
  "Returns the builder for the settings used for calls to updateUptimeCheckConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.UpdateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UptimeCheckServiceSettings$Builder this]
    (-> this (.updateUptimeCheckConfigSettings))))

