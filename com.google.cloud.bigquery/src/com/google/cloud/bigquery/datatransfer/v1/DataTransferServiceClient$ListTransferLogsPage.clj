(ns com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1 DataTransferServiceClient$ListTransferLogsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPage>`"
  (^com.google.api.core.ApiFuture [^DataTransferServiceClient$ListTransferLogsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

