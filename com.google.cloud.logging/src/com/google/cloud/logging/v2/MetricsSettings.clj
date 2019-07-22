(ns com.google.cloud.logging.v2.MetricsSettings
  "Settings class to configure an instance of MetricsClient.

  The default instance has everything set to sensible defaults:


    The default service address (logging.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getLogMetric to 30 seconds:



  MetricsSettings.Builder metricsSettingsBuilder =
      MetricsSettings.newBuilder();
  metricsSettingsBuilder.getLogMetricSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  MetricsSettings metricsSettings = metricsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 MetricsSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (MetricsSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (MetricsSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (MetricsSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.logging.v2.MetricsSettings$Builder`"
  (^com.google.cloud.logging.v2.MetricsSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (MetricsSettings/newBuilder client-context))
  (^com.google.cloud.logging.v2.MetricsSettings$Builder []
    (MetricsSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (MetricsSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings`

  returns: `com.google.cloud.logging.v2.MetricsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.MetricsSettings [^com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings stub]
    (MetricsSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (MetricsSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (MetricsSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (MetricsSettings/getDefaultServiceScopes )))

(defn list-log-metrics-settings
  "Returns the object with the settings used for calls to listLogMetrics.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.logging.v2.ListLogMetricsRequest,com.google.logging.v2.ListLogMetricsResponse,com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^MetricsSettings this]
    (-> this (.listLogMetricsSettings))))

(defn get-log-metric-settings
  "Returns the object with the settings used for calls to getLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.GetLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsSettings this]
    (-> this (.getLogMetricSettings))))

(defn create-log-metric-settings
  "Returns the object with the settings used for calls to createLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.CreateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsSettings this]
    (-> this (.createLogMetricSettings))))

(defn update-log-metric-settings
  "Returns the object with the settings used for calls to updateLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.UpdateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsSettings this]
    (-> this (.updateLogMetricSettings))))

(defn delete-log-metric-settings
  "Returns the object with the settings used for calls to deleteLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.logging.v2.DeleteLogMetricRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricsSettings this]
    (-> this (.deleteLogMetricSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.logging.v2.MetricsSettings$Builder`"
  (^com.google.cloud.logging.v2.MetricsSettings$Builder [^MetricsSettings this]
    (-> this (.toBuilder))))

