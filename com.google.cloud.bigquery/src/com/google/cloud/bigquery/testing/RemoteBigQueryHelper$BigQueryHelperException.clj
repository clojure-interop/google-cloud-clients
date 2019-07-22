(ns com.google.cloud.bigquery.testing.RemoteBigQueryHelper$BigQueryHelperException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.testing RemoteBigQueryHelper$BigQueryHelperException]))

(defn ->big-query-helper-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^RemoteBigQueryHelper$BigQueryHelperException [^java.lang.String message ^java.lang.Throwable cause]
    (new RemoteBigQueryHelper$BigQueryHelperException message cause)))

(defn *translate
  "ex - `java.lang.Exception`

  returns: `com.google.cloud.bigquery.testing.RemoteBigQueryHelper$BigQueryHelperException`"
  (^com.google.cloud.bigquery.testing.RemoteBigQueryHelper$BigQueryHelperException [^java.lang.Exception ex]
    (RemoteBigQueryHelper$BigQueryHelperException/translate ex)))

