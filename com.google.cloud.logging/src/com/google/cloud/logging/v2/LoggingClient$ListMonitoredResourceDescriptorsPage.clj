(ns com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 LoggingClient$ListMonitoredResourceDescriptorsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPage>`"
  (^com.google.api.core.ApiFuture [^LoggingClient$ListMonitoredResourceDescriptorsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

