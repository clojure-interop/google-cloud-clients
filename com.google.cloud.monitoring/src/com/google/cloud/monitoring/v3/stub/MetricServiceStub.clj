(ns com.google.cloud.monitoring.v3.stub.MetricServiceStub
  "Base stub class for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub MetricServiceStub]))

(defn ->metric-service-stub
  "Constructor."
  (^MetricServiceStub []
    (new MetricServiceStub )))

(defn get-metric-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.getMetricDescriptorCallable))))

(defn list-metric-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.listMetricDescriptorsPagedCallable))))

(defn list-time-series-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.monitoring.v3.ListTimeSeriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.listTimeSeriesCallable))))

(defn list-metric-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.monitoring.v3.ListMetricDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.listMetricDescriptorsCallable))))

(defn create-metric-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.createMetricDescriptorCallable))))

(defn close
  ""
  ([^MetricServiceStub this]
    (-> this (.close))))

(defn list-monitored-resource-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.listMonitoredResourceDescriptorsPagedCallable))))

(defn list-monitored-resource-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.listMonitoredResourceDescriptorsCallable))))

(defn create-time-series-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateTimeSeriesRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.createTimeSeriesCallable))))

(defn get-monitored-resource-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,com.google.api.MonitoredResourceDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.getMonitoredResourceDescriptorCallable))))

(defn delete-metric-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteMetricDescriptorRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.deleteMetricDescriptorCallable))))

(defn list-time-series-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceStub this]
    (-> this (.listTimeSeriesPagedCallable))))

