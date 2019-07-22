(ns com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings
  "Settings class to configure an instance of MetricServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (monitoring.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getMonitoredResourceDescriptor to 30 seconds:



  MetricServiceStubSettings.Builder metricServiceSettingsBuilder =
      MetricServiceStubSettings.newBuilder();
  metricServiceSettingsBuilder.getMonitoredResourceDescriptorSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  MetricServiceStubSettings metricServiceSettings = metricServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub MetricServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (MetricServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (MetricServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (MetricServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (MetricServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (MetricServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (MetricServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (MetricServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (MetricServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder []
    (MetricServiceStubSettings/newBuilder )))

(defn list-metric-descriptors-settings
  "Returns the object with the settings used for calls to listMetricDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.monitoring.v3.ListMetricDescriptorsResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^MetricServiceStubSettings this]
    (-> this (.listMetricDescriptorsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.MetricServiceStub`

  throws: java.io.IOException"
  ([^MetricServiceStubSettings this]
    (-> this (.createStub))))

(defn get-metric-descriptor-settings
  "Returns the object with the settings used for calls to getMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricServiceStubSettings this]
    (-> this (.getMetricDescriptorSettings))))

(defn list-time-series-settings
  "Returns the object with the settings used for calls to listTimeSeries.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.monitoring.v3.ListTimeSeriesResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^MetricServiceStubSettings this]
    (-> this (.listTimeSeriesSettings))))

(defn create-metric-descriptor-settings
  "Returns the object with the settings used for calls to createMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.CreateMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricServiceStubSettings this]
    (-> this (.createMetricDescriptorSettings))))

(defn list-monitored-resource-descriptors-settings
  "Returns the object with the settings used for calls to listMonitoredResourceDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^MetricServiceStubSettings this]
    (-> this (.listMonitoredResourceDescriptorsSettings))))

(defn create-time-series-settings
  "Returns the object with the settings used for calls to createTimeSeries.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.CreateTimeSeriesRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricServiceStubSettings this]
    (-> this (.createTimeSeriesSettings))))

(defn get-monitored-resource-descriptor-settings
  "Returns the object with the settings used for calls to getMonitoredResourceDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,com.google.api.MonitoredResourceDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricServiceStubSettings this]
    (-> this (.getMonitoredResourceDescriptorSettings))))

(defn delete-metric-descriptor-settings
  "Returns the object with the settings used for calls to deleteMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.DeleteMetricDescriptorRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MetricServiceStubSettings this]
    (-> this (.deleteMetricDescriptorSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder [^MetricServiceStubSettings this]
    (-> this (.toBuilder))))

