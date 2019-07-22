(ns com.google.cloud.monitoring.v3.MetricServiceSettings$Builder
  "Builder for MetricServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 MetricServiceSettings$Builder]))

(defn list-metric-descriptors-settings
  "Returns the builder for the settings used for calls to listMetricDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.monitoring.v3.ListMetricDescriptorsResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.listMetricDescriptorsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.monitoring.v3.MetricServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.monitoring.v3.MetricServiceSettings$Builder [^MetricServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-metric-descriptor-settings
  "Returns the builder for the settings used for calls to getMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.getMetricDescriptorSettings))))

(defn list-time-series-settings
  "Returns the builder for the settings used for calls to listTimeSeries.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.monitoring.v3.ListTimeSeriesResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.listTimeSeriesSettings))))

(defn create-metric-descriptor-settings
  "Returns the builder for the settings used for calls to createMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.createMetricDescriptorSettings))))

(defn build
  "returns: `com.google.cloud.monitoring.v3.MetricServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.MetricServiceSettings [^MetricServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings$Builder [^MetricServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn list-monitored-resource-descriptors-settings
  "Returns the builder for the settings used for calls to listMonitoredResourceDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse,com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.listMonitoredResourceDescriptorsSettings))))

(defn create-time-series-settings
  "Returns the builder for the settings used for calls to createTimeSeries.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateTimeSeriesRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.createTimeSeriesSettings))))

(defn get-monitored-resource-descriptor-settings
  "Returns the builder for the settings used for calls to getMonitoredResourceDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,com.google.api.MonitoredResourceDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.getMonitoredResourceDescriptorSettings))))

(defn delete-metric-descriptor-settings
  "Returns the builder for the settings used for calls to deleteMetricDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.DeleteMetricDescriptorRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricServiceSettings$Builder this]
    (-> this (.deleteMetricDescriptorSettings))))

