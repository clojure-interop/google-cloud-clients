(ns com.google.cloud.bigquery.BigQuery$QueryResultsOption
  "Class for specifying query results options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$QueryResultsOption]))

(defn *page-size
  "Returns an option to specify the maximum number of rows returned per page.

  page-size - `long`

  returns: `com.google.cloud.bigquery.BigQuery$QueryResultsOption`"
  (^com.google.cloud.bigquery.BigQuery$QueryResultsOption [^Long page-size]
    (BigQuery$QueryResultsOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start getting query results.

  page-token - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$QueryResultsOption`"
  (^com.google.cloud.bigquery.BigQuery$QueryResultsOption [^java.lang.String page-token]
    (BigQuery$QueryResultsOption/pageToken page-token)))

(defn *start-index
  "Returns an option that sets the zero-based index of the row from which to start getting query
   results.

  start-index - `long`

  returns: `com.google.cloud.bigquery.BigQuery$QueryResultsOption`"
  (^com.google.cloud.bigquery.BigQuery$QueryResultsOption [^Long start-index]
    (BigQuery$QueryResultsOption/startIndex start-index)))

(defn *max-wait-time
  "Returns an option that sets how long to wait for the query to complete, in milliseconds,
   before returning. Default is 10 seconds.

  max-wait-time - `long`

  returns: `com.google.cloud.bigquery.BigQuery$QueryResultsOption`"
  (^com.google.cloud.bigquery.BigQuery$QueryResultsOption [^Long max-wait-time]
    (BigQuery$QueryResultsOption/maxWaitTime max-wait-time)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$QueryResultsOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$QueryResultsOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$QueryResultsOption this]
    (-> this (.toString))))

