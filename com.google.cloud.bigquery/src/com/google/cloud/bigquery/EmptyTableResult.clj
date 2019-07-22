(ns com.google.cloud.bigquery.EmptyTableResult
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery EmptyTableResult]))

(defn ->empty-table-result
  "Constructor.

  An empty TableResult to avoid making API requests to unlistable tables.

  schema - `com.google.cloud.bigquery.Schema`"
  (^EmptyTableResult [^com.google.cloud.bigquery.Schema schema]
    (new EmptyTableResult schema)))

