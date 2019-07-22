(ns com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1 SecurityCenterClient$ListSourcesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SecurityCenterClient$ListSourcesPagedResponse/createAsync context future-response)))

