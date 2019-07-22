(ns com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1beta WebSecurityScannerClient$ListFindingsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (WebSecurityScannerClient$ListFindingsPagedResponse/createAsync context future-response)))

