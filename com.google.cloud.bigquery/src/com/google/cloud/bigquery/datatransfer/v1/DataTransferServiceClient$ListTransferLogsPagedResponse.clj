(ns com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1 DataTransferServiceClient$ListTransferLogsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DataTransferServiceClient$ListTransferLogsPagedResponse/createAsync context future-response)))

