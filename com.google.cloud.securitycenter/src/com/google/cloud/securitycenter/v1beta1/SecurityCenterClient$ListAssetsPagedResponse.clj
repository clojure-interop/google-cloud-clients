(ns com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListAssetsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1beta1 SecurityCenterClient$ListAssetsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListAssetsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SecurityCenterClient$ListAssetsPagedResponse/createAsync context future-response)))

