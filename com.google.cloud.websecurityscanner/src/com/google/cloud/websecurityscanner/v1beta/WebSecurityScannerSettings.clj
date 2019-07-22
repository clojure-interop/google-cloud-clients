(ns com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings
  "Settings class to configure an instance of WebSecurityScannerClient.

  The default instance has everything set to sensible defaults:


    The default service address (websecurityscanner.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createScanConfig to 30 seconds:



  WebSecurityScannerSettings.Builder webSecurityScannerSettingsBuilder =
      WebSecurityScannerSettings.newBuilder();
  webSecurityScannerSettingsBuilder.createScanConfigSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  WebSecurityScannerSettings webSecurityScannerSettings = webSecurityScannerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1beta WebSecurityScannerSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (WebSecurityScannerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (WebSecurityScannerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (WebSecurityScannerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings$Builder`"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (WebSecurityScannerSettings/newBuilder client-context))
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings$Builder []
    (WebSecurityScannerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (WebSecurityScannerSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings`

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings [^com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings stub]
    (WebSecurityScannerSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (WebSecurityScannerSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (WebSecurityScannerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (WebSecurityScannerSettings/getDefaultServiceScopes )))

(defn get-scan-config-settings
  "Returns the object with the settings used for calls to getScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.getScanConfigSettings))))

(defn list-scan-configs-settings
  "Returns the object with the settings used for calls to listScanConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerSettings this]
    (-> this (.listScanConfigsSettings))))

(defn list-findings-settings
  "Returns the object with the settings used for calls to listFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerSettings this]
    (-> this (.listFindingsSettings))))

(defn get-scan-run-settings
  "Returns the object with the settings used for calls to getScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.getScanRunSettings))))

(defn list-crawled-urls-settings
  "Returns the object with the settings used for calls to listCrawledUrls.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerSettings this]
    (-> this (.listCrawledUrlsSettings))))

(defn start-scan-run-settings
  "Returns the object with the settings used for calls to startScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.startScanRunSettings))))

(defn create-scan-config-settings
  "Returns the object with the settings used for calls to createScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.createScanConfigSettings))))

(defn stop-scan-run-settings
  "Returns the object with the settings used for calls to stopScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.stopScanRunSettings))))

(defn update-scan-config-settings
  "Returns the object with the settings used for calls to updateScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.updateScanConfigSettings))))

(defn get-finding-settings
  "Returns the object with the settings used for calls to getFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,com.google.cloud.websecurityscanner.v1beta.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.getFindingSettings))))

(defn delete-scan-config-settings
  "Returns the object with the settings used for calls to deleteScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.deleteScanConfigSettings))))

(defn list-scan-runs-settings
  "Returns the object with the settings used for calls to listScanRuns.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerSettings this]
    (-> this (.listScanRunsSettings))))

(defn list-finding-type-stats-settings
  "Returns the object with the settings used for calls to listFindingTypeStats.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerSettings this]
    (-> this (.listFindingTypeStatsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings$Builder`"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings$Builder [^WebSecurityScannerSettings this]
    (-> this (.toBuilder))))

