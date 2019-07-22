(ns com.google.cloud.bigquery.BigQuery$ModelListOption
  "Class for specifying table list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$ModelListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of models returned per page.

  page-size - `long`

  returns: `com.google.cloud.bigquery.BigQuery$ModelListOption`"
  (^com.google.cloud.bigquery.BigQuery$ModelListOption [^Long page-size]
    (BigQuery$ModelListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing models.

  page-token - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$ModelListOption`"
  (^com.google.cloud.bigquery.BigQuery$ModelListOption [^java.lang.String page-token]
    (BigQuery$ModelListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$ModelListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$ModelListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$ModelListOption this]
    (-> this (.toString))))

