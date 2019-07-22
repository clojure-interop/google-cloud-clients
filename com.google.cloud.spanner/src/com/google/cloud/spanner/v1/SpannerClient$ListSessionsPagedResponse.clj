(ns com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.v1 SpannerClient$ListSessionsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SpannerClient$ListSessionsPagedResponse/createAsync context future-response)))

