(ns com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings
  "Settings class to configure an instance of DataTransferServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (bigquerydatatransfer.googleapis.com) and default port (443)
        are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDataSource to 30 seconds:



  DataTransferServiceSettings.Builder dataTransferServiceSettingsBuilder =
      DataTransferServiceSettings.newBuilder();
  dataTransferServiceSettingsBuilder.getDataSourceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DataTransferServiceSettings dataTransferServiceSettings = dataTransferServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1 DataTransferServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DataTransferServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DataTransferServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DataTransferServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder`"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DataTransferServiceSettings/newBuilder client-context))
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder []
    (DataTransferServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DataTransferServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings [^com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings stub]
    (DataTransferServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DataTransferServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DataTransferServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DataTransferServiceSettings/getDefaultServiceScopes )))

(defn delete-transfer-run-settings
  "Returns the object with the settings used for calls to deleteTransferRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.deleteTransferRunSettings))))

(defn get-transfer-run-settings
  "Returns the object with the settings used for calls to getTransferRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,com.google.cloud.bigquery.datatransfer.v1.TransferRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.getTransferRunSettings))))

(defn list-transfer-configs-settings
  "Returns the object with the settings used for calls to listTransferConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceSettings this]
    (-> this (.listTransferConfigsSettings))))

(defn list-data-sources-settings
  "Returns the object with the settings used for calls to listDataSources.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceSettings this]
    (-> this (.listDataSourcesSettings))))

(defn start-manual-transfer-runs-settings
  "Returns the object with the settings used for calls to startManualTransferRuns.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.startManualTransferRunsSettings))))

(defn schedule-transfer-runs-settings
  "Returns the object with the settings used for calls to scheduleTransferRuns.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.scheduleTransferRunsSettings))))

(defn get-data-source-settings
  "Returns the object with the settings used for calls to getDataSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,com.google.cloud.bigquery.datatransfer.v1.DataSource>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.getDataSourceSettings))))

(defn delete-transfer-config-settings
  "Returns the object with the settings used for calls to deleteTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.deleteTransferConfigSettings))))

(defn list-transfer-runs-settings
  "Returns the object with the settings used for calls to listTransferRuns.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceSettings this]
    (-> this (.listTransferRunsSettings))))

(defn get-transfer-config-settings
  "Returns the object with the settings used for calls to getTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.getTransferConfigSettings))))

(defn create-transfer-config-settings
  "Returns the object with the settings used for calls to createTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.createTransferConfigSettings))))

(defn list-transfer-logs-settings
  "Returns the object with the settings used for calls to listTransferLogs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceSettings this]
    (-> this (.listTransferLogsSettings))))

(defn update-transfer-config-settings
  "Returns the object with the settings used for calls to updateTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.updateTransferConfigSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder`"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder [^DataTransferServiceSettings this]
    (-> this (.toBuilder))))

(defn check-valid-creds-settings
  "Returns the object with the settings used for calls to checkValidCreds.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceSettings this]
    (-> this (.checkValidCredsSettings))))

