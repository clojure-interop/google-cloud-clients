(ns com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 MetricsClient$ListLogMetricsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPage>`"
  (^com.google.api.core.ApiFuture [^MetricsClient$ListLogMetricsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

