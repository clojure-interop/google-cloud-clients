(ns com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorStatsServiceClient$ListGroupStatsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ErrorStatsServiceClient$ListGroupStatsPagedResponse/createAsync context future-response)))

