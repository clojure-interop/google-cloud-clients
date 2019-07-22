(ns com.google.cloud.bigquery.BigQuery$TableDataListOption
  "Class for specifying table data list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$TableDataListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of rows returned per page.

  page-size - `long`

  returns: `com.google.cloud.bigquery.BigQuery$TableDataListOption`"
  (^com.google.cloud.bigquery.BigQuery$TableDataListOption [^Long page-size]
    (BigQuery$TableDataListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing table data.

  page-token - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$TableDataListOption`"
  (^com.google.cloud.bigquery.BigQuery$TableDataListOption [^java.lang.String page-token]
    (BigQuery$TableDataListOption/pageToken page-token)))

(defn *start-index
  "Returns an option that sets the zero-based index of the row from which to start listing table
   data.

  index - `long`

  returns: `com.google.cloud.bigquery.BigQuery$TableDataListOption`"
  (^com.google.cloud.bigquery.BigQuery$TableDataListOption [^Long index]
    (BigQuery$TableDataListOption/startIndex index)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$TableDataListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$TableDataListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$TableDataListOption this]
    (-> this (.toString))))

