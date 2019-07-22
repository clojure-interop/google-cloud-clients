(ns com.google.cloud.bigquery.BigQuery$QueryOption
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$QueryOption]))

(defn *of
  "results-option - `com.google.cloud.bigquery.BigQuery$QueryResultsOption`

  returns: `com.google.cloud.bigquery.BigQuery$QueryOption`"
  (^com.google.cloud.bigquery.BigQuery$QueryOption [^com.google.cloud.bigquery.BigQuery$QueryResultsOption results-option]
    (BigQuery$QueryOption/of results-option)))

(defn get-query-results-option
  "returns: `com.google.cloud.bigquery.BigQuery$QueryResultsOption`"
  (^com.google.cloud.bigquery.BigQuery$QueryResultsOption [^BigQuery$QueryOption this]
    (-> this (.getQueryResultsOption))))

(defn get-retry-option
  "returns: `com.google.cloud.RetryOption`"
  (^com.google.cloud.RetryOption [^BigQuery$QueryOption this]
    (-> this (.getRetryOption))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$QueryOption this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$QueryOption this]
    (-> this (.hashCode))))

