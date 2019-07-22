(ns com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1 SecurityCenterClient$GroupFindingsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPage>`"
  (^com.google.api.core.ApiFuture [^SecurityCenterClient$GroupFindingsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))
