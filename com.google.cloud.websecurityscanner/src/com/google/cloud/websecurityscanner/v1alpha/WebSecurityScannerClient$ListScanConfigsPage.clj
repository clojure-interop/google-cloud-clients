(ns com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha WebSecurityScannerClient$ListScanConfigsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPage>`"
  (^com.google.api.core.ApiFuture [^WebSecurityScannerClient$ListScanConfigsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

