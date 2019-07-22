(ns com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha RealmsServiceClient$ListRealmsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (RealmsServiceClient$ListRealmsPagedResponse/createAsync context future-response)))

