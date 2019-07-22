(ns com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha WebSecurityScannerClient$ListScanRunsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (WebSecurityScannerClient$ListScanRunsPagedResponse/createAsync context future-response)))

