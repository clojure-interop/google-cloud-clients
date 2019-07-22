(ns com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorStatsServiceClient$ListEventsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPage>`"
  (^com.google.api.core.ApiFuture [^ErrorStatsServiceClient$ListEventsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

