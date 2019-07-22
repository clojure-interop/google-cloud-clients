(ns com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1 DataTransferServiceClient$ListTransferConfigsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DataTransferServiceClient$ListTransferConfigsPagedResponse/createAsync context future-response)))

