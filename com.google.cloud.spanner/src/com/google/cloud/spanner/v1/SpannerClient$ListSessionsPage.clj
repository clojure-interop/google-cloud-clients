(ns com.google.cloud.spanner.v1.SpannerClient$ListSessionsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.v1 SpannerClient$ListSessionsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.spanner.v1.SpannerClient$ListSessionsPage>`"
  (^com.google.api.core.ApiFuture [^SpannerClient$ListSessionsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

