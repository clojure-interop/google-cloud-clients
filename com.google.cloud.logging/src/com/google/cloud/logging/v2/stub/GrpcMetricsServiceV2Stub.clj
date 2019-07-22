(ns com.google.cloud.logging.v2.stub.GrpcMetricsServiceV2Stub
  "gRPC stub implementation for Stackdriver Logging API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub GrpcMetricsServiceV2Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.logging.v2.stub.GrpcMetricsServiceV2Stub`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.stub.GrpcMetricsServiceV2Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcMetricsServiceV2Stub/create client-context callable-factory))
  (^com.google.cloud.logging.v2.stub.GrpcMetricsServiceV2Stub [^com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings settings]
    (GrpcMetricsServiceV2Stub/create settings)))

(defn get-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricsServiceV2Stub this]
    (-> this (.getLogMetricCallable))))

(defn create-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricsServiceV2Stub this]
    (-> this (.createLogMetricCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcMetricsServiceV2Stub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcMetricsServiceV2Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcMetricsServiceV2Stub this]
    (-> this (.shutdown))))

(defn list-log-metrics-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogMetricsRequest,com.google.logging.v2.ListLogMetricsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricsServiceV2Stub this]
    (-> this (.listLogMetricsCallable))))

(defn close
  ""
  ([^GrpcMetricsServiceV2Stub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcMetricsServiceV2Stub this]
    (-> this (.isTerminated))))

(defn update-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricsServiceV2Stub this]
    (-> this (.updateLogMetricCallable))))

(defn delete-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteLogMetricRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricsServiceV2Stub this]
    (-> this (.deleteLogMetricCallable))))

(defn shutdown-now
  ""
  ([^GrpcMetricsServiceV2Stub this]
    (-> this (.shutdownNow))))

(defn list-log-metrics-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogMetricsRequest,com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcMetricsServiceV2Stub this]
    (-> this (.listLogMetricsPagedCallable))))

