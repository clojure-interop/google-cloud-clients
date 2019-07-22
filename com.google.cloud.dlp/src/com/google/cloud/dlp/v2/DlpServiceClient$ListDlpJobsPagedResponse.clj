(ns com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dlp.v2 DlpServiceClient$ListDlpJobsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DlpServiceClient$ListDlpJobsPagedResponse/createAsync context future-response)))

