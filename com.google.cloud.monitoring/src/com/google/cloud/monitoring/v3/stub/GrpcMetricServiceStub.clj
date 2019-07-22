(ns com.google.cloud.monitoring.v3.stub.GrpcMetricServiceStub
  "gRPC stub implementation for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub GrpcMetricServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.monitoring.v3.stub.GrpcMetricServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.stub.GrpcMetricServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcMetricServiceStub/create client-context callable-factory))
  (^com.google.cloud.monitoring.v3.stub.GrpcMetricServiceStub [^com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings settings]
    (GrpcMetricServiceStub/create settings)))

(defn get-metric-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.getMetricDescriptorCallable))))

(defn list-metric-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.listMetricDescriptorsPagedCallable))))

(defn list-time-series-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.monitoring.v3.ListTimeSeriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.listTimeSeriesCallable))))

(defn list-metric-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.monitoring.v3.ListMetricDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.listMetricDescriptorsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcMetricServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcMetricServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcMetricServiceStub this]
    (-> this (.shutdown))))

(defn create-metric-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.createMetricDescriptorCallable))))

(defn close
  ""
  ([^GrpcMetricServiceStub this]
    (-> this (.close))))

(defn list-monitored-resource-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.listMonitoredResourceDescriptorsPagedCallable))))

(defn list-monitored-resource-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.listMonitoredResourceDescriptorsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcMetricServiceStub this]
    (-> this (.isTerminated))))

(defn create-time-series-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateTimeSeriesRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.createTimeSeriesCallable))))

(defn get-monitored-resource-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,com.google.api.MonitoredResourceDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.getMonitoredResourceDescriptorCallable))))

(defn delete-metric-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteMetricDescriptorRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.deleteMetricDescriptorCallable))))

(defn list-time-series-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricServiceStub this]
    (-> this (.listTimeSeriesPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcMetricServiceStub this]
    (-> this (.shutdownNow))))

