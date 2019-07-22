(ns com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings
  "Settings class to configure an instance of DataTransferServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (bigquerydatatransfer.googleapis.com) and default port (443)
        are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDataSource to 30 seconds:



  DataTransferServiceStubSettings.Builder dataTransferServiceSettingsBuilder =
      DataTransferServiceStubSettings.newBuilder();
  dataTransferServiceSettingsBuilder.getDataSourceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DataTransferServiceStubSettings dataTransferServiceSettings = dataTransferServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1.stub DataTransferServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DataTransferServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DataTransferServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DataTransferServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DataTransferServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DataTransferServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DataTransferServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DataTransferServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder`"
  (^com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DataTransferServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder []
    (DataTransferServiceStubSettings/newBuilder )))

(defn delete-transfer-run-settings
  "Returns the object with the settings used for calls to deleteTransferRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.deleteTransferRunSettings))))

(defn get-transfer-run-settings
  "Returns the object with the settings used for calls to getTransferRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,com.google.cloud.bigquery.datatransfer.v1.TransferRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.getTransferRunSettings))))

(defn list-transfer-configs-settings
  "Returns the object with the settings used for calls to listTransferConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.listTransferConfigsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStub`

  throws: java.io.IOException"
  ([^DataTransferServiceStubSettings this]
    (-> this (.createStub))))

(defn list-data-sources-settings
  "Returns the object with the settings used for calls to listDataSources.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.listDataSourcesSettings))))

(defn start-manual-transfer-runs-settings
  "Returns the object with the settings used for calls to startManualTransferRuns.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.startManualTransferRunsSettings))))

(defn schedule-transfer-runs-settings
  "Returns the object with the settings used for calls to scheduleTransferRuns.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.scheduleTransferRunsSettings))))

(defn get-data-source-settings
  "Returns the object with the settings used for calls to getDataSource.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,com.google.cloud.bigquery.datatransfer.v1.DataSource>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.getDataSourceSettings))))

(defn delete-transfer-config-settings
  "Returns the object with the settings used for calls to deleteTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.deleteTransferConfigSettings))))

(defn list-transfer-runs-settings
  "Returns the object with the settings used for calls to listTransferRuns.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.listTransferRunsSettings))))

(defn get-transfer-config-settings
  "Returns the object with the settings used for calls to getTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.getTransferConfigSettings))))

(defn create-transfer-config-settings
  "Returns the object with the settings used for calls to createTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.createTransferConfigSettings))))

(defn list-transfer-logs-settings
  "Returns the object with the settings used for calls to listTransferLogs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.listTransferLogsSettings))))

(defn update-transfer-config-settings
  "Returns the object with the settings used for calls to updateTransferConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.updateTransferConfigSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder`"
  (^com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder [^DataTransferServiceStubSettings this]
    (-> this (.toBuilder))))

(defn check-valid-creds-settings
  "Returns the object with the settings used for calls to checkValidCreds.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataTransferServiceStubSettings this]
    (-> this (.checkValidCredsSettings))))

