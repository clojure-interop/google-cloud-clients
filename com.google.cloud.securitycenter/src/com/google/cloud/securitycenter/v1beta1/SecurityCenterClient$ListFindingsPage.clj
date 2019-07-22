(ns com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListFindingsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1beta1 SecurityCenterClient$ListFindingsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListFindingsPage>`"
  (^com.google.api.core.ApiFuture [^SecurityCenterClient$ListFindingsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

