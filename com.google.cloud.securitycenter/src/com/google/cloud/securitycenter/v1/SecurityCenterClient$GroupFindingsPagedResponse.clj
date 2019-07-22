(ns com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1 SecurityCenterClient$GroupFindingsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SecurityCenterClient$GroupFindingsPagedResponse/createAsync context future-response)))

