(ns com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupAssetsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1beta1 SecurityCenterClient$GroupAssetsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupAssetsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SecurityCenterClient$GroupAssetsPagedResponse/createAsync context future-response)))

