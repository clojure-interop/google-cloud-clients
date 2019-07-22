(ns com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder
  "Builder for MetricsServiceV2StubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub MetricsServiceV2StubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder [^MetricsServiceV2StubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^MetricsServiceV2StubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-log-metrics-settings
  "Returns the builder for the settings used for calls to listLogMetrics.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListLogMetricsRequest,com.google.logging.v2.ListLogMetricsResponse,com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MetricsServiceV2StubSettings$Builder this]
    (-> this (.listLogMetricsSettings))))

(defn get-log-metric-settings
  "Returns the builder for the settings used for calls to getLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.GetLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricsServiceV2StubSettings$Builder this]
    (-> this (.getLogMetricSettings))))

(defn create-log-metric-settings
  "Returns the builder for the settings used for calls to createLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.CreateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricsServiceV2StubSettings$Builder this]
    (-> this (.createLogMetricSettings))))

(defn update-log-metric-settings
  "Returns the builder for the settings used for calls to updateLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.UpdateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricsServiceV2StubSettings$Builder this]
    (-> this (.updateLogMetricSettings))))

(defn delete-log-metric-settings
  "Returns the builder for the settings used for calls to deleteLogMetric.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.DeleteLogMetricRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MetricsServiceV2StubSettings$Builder this]
    (-> this (.deleteLogMetricSettings))))

(defn build
  "returns: `com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings [^MetricsServiceV2StubSettings$Builder this]
    (-> this (.build))))

