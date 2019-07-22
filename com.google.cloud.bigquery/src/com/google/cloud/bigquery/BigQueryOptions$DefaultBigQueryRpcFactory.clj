(ns com.google.cloud.bigquery.BigQueryOptions$DefaultBigQueryRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQueryOptions$DefaultBigQueryRpcFactory]))

(defn ->default-big-query-rpc-factory
  "Constructor."
  (^BigQueryOptions$DefaultBigQueryRpcFactory []
    (new BigQueryOptions$DefaultBigQueryRpcFactory )))

(defn create
  "options - `com.google.cloud.bigquery.BigQueryOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^BigQueryOptions$DefaultBigQueryRpcFactory this ^com.google.cloud.bigquery.BigQueryOptions options]
    (-> this (.create options))))

