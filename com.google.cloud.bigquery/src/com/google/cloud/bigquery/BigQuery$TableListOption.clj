(ns com.google.cloud.bigquery.BigQuery$TableListOption
  "Class for specifying table list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$TableListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of tables returned per page.

  page-size - `long`

  returns: `com.google.cloud.bigquery.BigQuery$TableListOption`"
  (^com.google.cloud.bigquery.BigQuery$TableListOption [^Long page-size]
    (BigQuery$TableListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing tables.

  page-token - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$TableListOption`"
  (^com.google.cloud.bigquery.BigQuery$TableListOption [^java.lang.String page-token]
    (BigQuery$TableListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$TableListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$TableListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$TableListOption this]
    (-> this (.toString))))

