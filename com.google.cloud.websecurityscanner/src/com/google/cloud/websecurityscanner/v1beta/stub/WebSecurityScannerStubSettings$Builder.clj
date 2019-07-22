(ns com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings$Builder
  "Builder for WebSecurityScannerStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1beta.stub WebSecurityScannerStubSettings$Builder]))

(defn get-scan-config-settings
  "Returns the builder for the settings used for calls to getScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.getScanConfigSettings))))

(defn list-scan-configs-settings
  "Returns the builder for the settings used for calls to listScanConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.listScanConfigsSettings))))

(defn list-findings-settings
  "Returns the builder for the settings used for calls to listFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.listFindingsSettings))))

(defn get-scan-run-settings
  "Returns the builder for the settings used for calls to getScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.getScanRunSettings))))

(defn list-crawled-urls-settings
  "Returns the builder for the settings used for calls to listCrawledUrls.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.listCrawledUrlsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings$Builder [^WebSecurityScannerStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn build
  "returns: `com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.build))))

(defn start-scan-run-settings
  "Returns the builder for the settings used for calls to startScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.startScanRunSettings))))

(defn create-scan-config-settings
  "Returns the builder for the settings used for calls to createScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.createScanConfigSettings))))

(defn stop-scan-run-settings
  "Returns the builder for the settings used for calls to stopScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.stopScanRunSettings))))

(defn update-scan-config-settings
  "Returns the builder for the settings used for calls to updateScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.updateScanConfigSettings))))

(defn get-finding-settings
  "Returns the builder for the settings used for calls to getFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,com.google.cloud.websecurityscanner.v1beta.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.getFindingSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-scan-config-settings
  "Returns the builder for the settings used for calls to deleteScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.deleteScanConfigSettings))))

(defn list-scan-runs-settings
  "Returns the builder for the settings used for calls to listScanRuns.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.listScanRunsSettings))))

(defn list-finding-type-stats-settings
  "Returns the builder for the settings used for calls to listFindingTypeStats.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebSecurityScannerStubSettings$Builder this]
    (-> this (.listFindingTypeStatsSettings))))

