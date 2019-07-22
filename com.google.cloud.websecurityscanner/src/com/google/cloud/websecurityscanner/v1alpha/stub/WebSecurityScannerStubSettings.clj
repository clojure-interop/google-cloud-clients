(ns com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings
  "Settings class to configure an instance of WebSecurityScannerStub.

  The default instance has everything set to sensible defaults:


    The default service address (websecurityscanner.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createScanConfig to 30 seconds:



  WebSecurityScannerStubSettings.Builder webSecurityScannerSettingsBuilder =
      WebSecurityScannerStubSettings.newBuilder();
  webSecurityScannerSettingsBuilder.createScanConfigSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  WebSecurityScannerStubSettings webSecurityScannerSettings = webSecurityScannerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha.stub WebSecurityScannerStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (WebSecurityScannerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (WebSecurityScannerStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (WebSecurityScannerStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (WebSecurityScannerStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (WebSecurityScannerStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (WebSecurityScannerStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (WebSecurityScannerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder`"
  (^com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (WebSecurityScannerStubSettings/newBuilder client-context))
  (^com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder []
    (WebSecurityScannerStubSettings/newBuilder )))

(defn get-scan-config-settings
  "Returns the object with the settings used for calls to getScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.getScanConfigSettings))))

(defn list-scan-configs-settings
  "Returns the object with the settings used for calls to listScanConfigs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.listScanConfigsSettings))))

(defn list-findings-settings
  "Returns the object with the settings used for calls to listFindings.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1alpha.ListFindingsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.listFindingsSettings))))

(defn get-scan-run-settings
  "Returns the object with the settings used for calls to getScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.GetScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.getScanRunSettings))))

(defn list-crawled-urls-settings
  "Returns the object with the settings used for calls to listCrawledUrls.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.listCrawledUrlsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStub`

  throws: java.io.IOException"
  ([^WebSecurityScannerStubSettings this]
    (-> this (.createStub))))

(defn start-scan-run-settings
  "Returns the object with the settings used for calls to startScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.StartScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.startScanRunSettings))))

(defn create-scan-config-settings
  "Returns the object with the settings used for calls to createScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.createScanConfigSettings))))

(defn stop-scan-run-settings
  "Returns the object with the settings used for calls to stopScanRun.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.StopScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.stopScanRunSettings))))

(defn update-scan-config-settings
  "Returns the object with the settings used for calls to updateScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.updateScanConfigSettings))))

(defn get-finding-settings
  "Returns the object with the settings used for calls to getFinding.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.GetFindingRequest,com.google.cloud.websecurityscanner.v1alpha.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.getFindingSettings))))

(defn delete-scan-config-settings
  "Returns the object with the settings used for calls to deleteScanConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.deleteScanConfigSettings))))

(defn list-scan-runs-settings
  "Returns the object with the settings used for calls to listScanRuns.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.websecurityscanner.v1alpha.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanRunsResponse,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.listScanRunsSettings))))

(defn list-finding-type-stats-settings
  "Returns the object with the settings used for calls to listFindingTypeStats.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebSecurityScannerStubSettings this]
    (-> this (.listFindingTypeStatsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder`"
  (^com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder [^WebSecurityScannerStubSettings this]
    (-> this (.toBuilder))))

