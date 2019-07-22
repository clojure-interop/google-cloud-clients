(ns com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 LoggingClient$ListLogsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (LoggingClient$ListLogsPagedResponse/createAsync context future-response)))

