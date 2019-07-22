(ns com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1 DataTransferServiceClient$ListDataSourcesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DataTransferServiceClient$ListDataSourcesPagedResponse/createAsync context future-response)))

