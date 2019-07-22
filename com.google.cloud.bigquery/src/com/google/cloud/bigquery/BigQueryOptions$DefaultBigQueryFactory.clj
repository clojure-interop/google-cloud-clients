(ns com.google.cloud.bigquery.BigQueryOptions$DefaultBigQueryFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQueryOptions$DefaultBigQueryFactory]))

(defn ->default-big-query-factory
  "Constructor."
  (^BigQueryOptions$DefaultBigQueryFactory []
    (new BigQueryOptions$DefaultBigQueryFactory )))

(defn create
  "options - `com.google.cloud.bigquery.BigQueryOptions`

  returns: `com.google.cloud.bigquery.BigQuery`"
  (^com.google.cloud.bigquery.BigQuery [^BigQueryOptions$DefaultBigQueryFactory this ^com.google.cloud.bigquery.BigQueryOptions options]
    (-> this (.create options))))

