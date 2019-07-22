(ns com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings$Builder
  "Builder for WebSecurityScannerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha WebSecurityScannerSettings$Builder]))

(defn get-scan-config-settings
  "Returns the builder for the settings used for calls to getScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.getScanConfigSettings))))

(defn list-scan-configs-settings
  "Returns the builder for the settings used for calls to listScanConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.listScanConfigsSettings))))

(defn list-findings-settings
  "Returns the builder for the settings used for calls to listFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.ListFindingsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.listFindingsSettings))))

(defn get-scan-run-settings
  "Returns the builder for the settings used for calls to getScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.GetScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.getScanRunSettings))))

(defn list-crawled-urls-settings
  "Returns the builder for the settings used for calls to listCrawledUrls.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.listCrawledUrlsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings$Builder [^WebSecurityScannerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn build
  "returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings [^WebSecurityScannerSettings$Builder this]
    (-> this (.build))))

(defn start-scan-run-settings
  "Returns the builder for the settings used for calls to startScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.StartScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.startScanRunSettings))))

(defn create-scan-config-settings
  "Returns the builder for the settings used for calls to createScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.createScanConfigSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder`"
  (^com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn stop-scan-run-settings
  "Returns the builder for the settings used for calls to stopScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.StopScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.stopScanRunSettings))))

(defn update-scan-config-settings
  "Returns the builder for the settings used for calls to updateScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.updateScanConfigSettings))))

(defn get-finding-settings
  "Returns the builder for the settings used for calls to getFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.GetFindingRequest,com.google.cloud.websecurityscanner.v1alpha.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.getFindingSettings))))

(defn delete-scan-config-settings
  "Returns the builder for the settings used for calls to deleteScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.deleteScanConfigSettings))))

(defn list-scan-runs-settings
  "Returns the builder for the settings used for calls to listScanRuns.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanRunsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.listScanRunsSettings))))

(defn list-finding-type-stats-settings
  "Returns the builder for the settings used for calls to listFindingTypeStats.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerSettings$Builder this]
    (-> this (.listFindingTypeStatsSettings))))

