(ns com.google.cloud.logging.v2.stub.MetricsServiceV2Stub
  "Base stub class for Stackdriver Logging API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub MetricsServiceV2Stub]))

(defn ->metrics-service-v-2-stub
  "Constructor."
  (^MetricsServiceV2Stub []
    (new MetricsServiceV2Stub )))

(defn list-log-metrics-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogMetricsRequest,com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsServiceV2Stub this]
    (-> this (.listLogMetricsPagedCallable))))

(defn list-log-metrics-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogMetricsRequest,com.google.logging.v2.ListLogMetricsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsServiceV2Stub this]
    (-> this (.listLogMetricsCallable))))

(defn get-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsServiceV2Stub this]
    (-> this (.getLogMetricCallable))))

(defn create-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsServiceV2Stub this]
    (-> this (.createLogMetricCallable))))

(defn update-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsServiceV2Stub this]
    (-> this (.updateLogMetricCallable))))

(defn delete-log-metric-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteLogMetricRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsServiceV2Stub this]
    (-> this (.deleteLogMetricCallable))))

(defn close
  ""
  ([^MetricsServiceV2Stub this]
    (-> this (.close))))

