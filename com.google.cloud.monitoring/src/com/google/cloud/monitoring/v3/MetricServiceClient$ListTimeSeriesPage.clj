(ns com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 MetricServiceClient$ListTimeSeriesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPage>`"
  (^com.google.api.core.ApiFuture [^MetricServiceClient$ListTimeSeriesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

