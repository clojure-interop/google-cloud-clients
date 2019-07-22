(ns com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1 SecurityCenterClient$ListSourcesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPage>`"
  (^com.google.api.core.ApiFuture [^SecurityCenterClient$ListSourcesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

