(ns com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings
  "Settings class to configure an instance of MetricsServiceV2Stub.

  The default instance has everything set to sensible defaults:


    The default service address (logging.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getLogMetric to 30 seconds:



  MetricsServiceV2StubSettings.Builder metricsSettingsBuilder =
      MetricsServiceV2StubSettings.newBuilder();
  metricsSettingsBuilder.getLogMetricSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  MetricsServiceV2StubSettings metricsSettings = metricsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub MetricsServiceV2StubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (MetricsServiceV2StubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (MetricsServiceV2StubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (MetricsServiceV2StubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (MetricsServiceV2StubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (MetricsServiceV2StubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (MetricsServiceV2StubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (MetricsServiceV2StubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (MetricsServiceV2StubSettings/newBuilder client-context))
  (^com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder []
    (MetricsServiceV2StubSettings/newBuilder )))

(defn list-log-metrics-settings
  "Returns the object with the settings used for calls to listLogMetrics.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListLogMetricsRequest,com.google.logging.v2.ListLogMetricsResponse,com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^MetricsServiceV2StubSettings this]
    (-> this (.listLogMetricsSettings))))

(defn get-log-metric-settings
  "Returns the object with the settings used for calls to getLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.GetLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsServiceV2StubSettings this]
    (-> this (.getLogMetricSettings))))

(defn create-log-metric-settings
  "Returns the object with the settings used for calls to createLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.CreateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsServiceV2StubSettings this]
    (-> this (.createLogMetricSettings))))

(defn update-log-metric-settings
  "Returns the object with the settings used for calls to updateLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.UpdateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsServiceV2StubSettings this]
    (-> this (.updateLogMetricSettings))))

(defn delete-log-metric-settings
  "Returns the object with the settings used for calls to deleteLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteLogMetricRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsServiceV2StubSettings this]
    (-> this (.deleteLogMetricSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.logging.v2.stub.MetricsServiceV2Stub`

  throws: java.io.IOException"
  ([^MetricsServiceV2StubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder [^MetricsServiceV2StubSettings this]
    (-> this (.toBuilder))))

