(ns com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha WebSecurityScannerClient$ListScanConfigsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (WebSecurityScannerClient$ListScanConfigsPagedResponse/createAsync context future-response)))

