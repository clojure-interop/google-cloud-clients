(ns com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder
  "Builder for MetricServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub MetricServiceStubSettings$Builder]))

(defn list-metric-descriptors-settings
  "Returns the builder for the settings used for calls to listMetricDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.monitoring.v3.ListMetricDescriptorsResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.listMetricDescriptorsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder [^MetricServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-metric-descriptor-settings
  "Returns the builder for the settings used for calls to getMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.getMetricDescriptorSettings))))

(defn list-time-series-settings
  "Returns the builder for the settings used for calls to listTimeSeries.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.monitoring.v3.ListTimeSeriesResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.listTimeSeriesSettings))))

(defn create-metric-descriptor-settings
  "Returns the builder for the settings used for calls to createMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.createMetricDescriptorSettings))))

(defn build
  "returns: `com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings [^MetricServiceStubSettings$Builder this]
    (-> this (.build))))

(defn list-monitored-resource-descriptors-settings
  "Returns the builder for the settings used for calls to listMonitoredResourceDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.listMonitoredResourceDescriptorsSettings))))

(defn create-time-series-settings
  "Returns the builder for the settings used for calls to createTimeSeries.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateTimeSeriesRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.createTimeSeriesSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^MetricServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-monitored-resource-descriptor-settings
  "Returns the builder for the settings used for calls to getMonitoredResourceDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,com.google.api.MonitoredResourceDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.getMonitoredResourceDescriptorSettings))))

(defn delete-metric-descriptor-settings
  "Returns the builder for the settings used for calls to deleteMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.DeleteMetricDescriptorRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceStubSettings$Builder this]
    (-> this (.deleteMetricDescriptorSettings))))

