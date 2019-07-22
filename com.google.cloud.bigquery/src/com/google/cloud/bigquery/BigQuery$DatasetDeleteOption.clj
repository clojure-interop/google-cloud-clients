(ns com.google.cloud.bigquery.BigQuery$DatasetDeleteOption
  "Class for specifying dataset delete options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$DatasetDeleteOption]))

(defn *delete-contents
  "Returns an option to delete a dataset even if non-empty. If not provided, attempting to
   delete a non-empty dataset will result in a BigQueryException being thrown.

  returns: `com.google.cloud.bigquery.BigQuery$DatasetDeleteOption`"
  (^com.google.cloud.bigquery.BigQuery$DatasetDeleteOption []
    (BigQuery$DatasetDeleteOption/deleteContents )))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$DatasetDeleteOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$DatasetDeleteOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$DatasetDeleteOption this]
    (-> this (.toString))))

