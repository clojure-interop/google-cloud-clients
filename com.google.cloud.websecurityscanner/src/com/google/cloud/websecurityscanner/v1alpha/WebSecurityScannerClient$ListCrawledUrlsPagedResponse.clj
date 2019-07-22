(ns com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha WebSecurityScannerClient$ListCrawledUrlsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (WebSecurityScannerClient$ListCrawledUrlsPagedResponse/createAsync context future-response)))

