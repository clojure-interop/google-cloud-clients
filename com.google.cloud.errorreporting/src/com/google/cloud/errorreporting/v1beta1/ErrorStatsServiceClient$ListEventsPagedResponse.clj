(ns com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorStatsServiceClient$ListEventsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ErrorStatsServiceClient$ListEventsPagedResponse/createAsync context future-response)))

