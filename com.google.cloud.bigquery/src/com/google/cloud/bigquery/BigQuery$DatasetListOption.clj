(ns com.google.cloud.bigquery.BigQuery$DatasetListOption
  "Class for specifying dataset list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$DatasetListOption]))

(defn *label-filter
  "Returns an option to specify a label filter. See
   https://cloud.google.com/bigquery/docs/adding-using-labels#filtering_datasets_using_labels

  label-filter - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$DatasetListOption`"
  (^com.google.cloud.bigquery.BigQuery$DatasetListOption [^java.lang.String label-filter]
    (BigQuery$DatasetListOption/labelFilter label-filter)))

(defn *page-size
  "Returns an option to specify the maximum number of datasets returned per page.

  page-size - `long`

  returns: `com.google.cloud.bigquery.BigQuery$DatasetListOption`"
  (^com.google.cloud.bigquery.BigQuery$DatasetListOption [^Long page-size]
    (BigQuery$DatasetListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing datasets.

  page-token - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$DatasetListOption`"
  (^com.google.cloud.bigquery.BigQuery$DatasetListOption [^java.lang.String page-token]
    (BigQuery$DatasetListOption/pageToken page-token)))

(defn *all
  "Returns an options to list all datasets, even hidden ones.

  returns: `com.google.cloud.bigquery.BigQuery$DatasetListOption`"
  (^com.google.cloud.bigquery.BigQuery$DatasetListOption []
    (BigQuery$DatasetListOption/all )))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$DatasetListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$DatasetListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$DatasetListOption this]
    (-> this (.toString))))

