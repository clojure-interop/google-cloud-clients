(ns com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder
  "Builder for DataTransferServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1 DataTransferServiceSettings$Builder]))

(defn delete-transfer-run-settings
  "Returns the builder for the settings used for calls to deleteTransferRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.deleteTransferRunSettings))))

(defn get-transfer-run-settings
  "Returns the builder for the settings used for calls to getTransferRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,com.google.cloud.bigquery.datatransfer.v1.TransferRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.getTransferRunSettings))))

(defn list-transfer-configs-settings
  "Returns the builder for the settings used for calls to listTransferConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.listTransferConfigsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder [^DataTransferServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-data-sources-settings
  "Returns the builder for the settings used for calls to listDataSources.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.listDataSourcesSettings))))

(defn start-manual-transfer-runs-settings
  "Returns the builder for the settings used for calls to startManualTransferRuns.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.startManualTransferRunsSettings))))

(defn schedule-transfer-runs-settings
  "Returns the builder for the settings used for calls to scheduleTransferRuns.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.scheduleTransferRunsSettings))))

(defn get-data-source-settings
  "Returns the builder for the settings used for calls to getDataSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,com.google.cloud.bigquery.datatransfer.v1.DataSource>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.getDataSourceSettings))))

(defn build
  "returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings [^DataTransferServiceSettings$Builder this]
    (-> this (.build))))

(defn delete-transfer-config-settings
  "Returns the builder for the settings used for calls to deleteTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.deleteTransferConfigSettings))))

(defn list-transfer-runs-settings
  "Returns the builder for the settings used for calls to listTransferRuns.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.listTransferRunsSettings))))

(defn get-transfer-config-settings
  "Returns the builder for the settings used for calls to getTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.getTransferConfigSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder`"
  (^com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn create-transfer-config-settings
  "Returns the builder for the settings used for calls to createTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.createTransferConfigSettings))))

(defn list-transfer-logs-settings
  "Returns the builder for the settings used for calls to listTransferLogs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.listTransferLogsSettings))))

(defn update-transfer-config-settings
  "Returns the builder for the settings used for calls to updateTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.updateTransferConfigSettings))))

(defn check-valid-creds-settings
  "Returns the builder for the settings used for calls to checkValidCreds.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataTransferServiceSettings$Builder this]
    (-> this (.checkValidCredsSettings))))

