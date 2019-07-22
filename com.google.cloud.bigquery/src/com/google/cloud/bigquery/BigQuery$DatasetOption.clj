(ns com.google.cloud.bigquery.BigQuery$DatasetOption
  "Class for specifying dataset get, create and update options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$DatasetOption]))

(defn *fields
  "Returns an option to specify the dataset's fields to be returned by the RPC call. If this
   option is not provided all dataset's fields are returned. DatasetOption.fields can be
   used to specify only the fields of interest. DatasetInfo.getDatasetId() is always
   returned, even if not specified.

  fields - `com.google.cloud.bigquery.BigQuery$DatasetField`

  returns: `com.google.cloud.bigquery.BigQuery$DatasetOption`"
  (^com.google.cloud.bigquery.BigQuery$DatasetOption [^com.google.cloud.bigquery.BigQuery$DatasetField fields]
    (BigQuery$DatasetOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$DatasetOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$DatasetOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$DatasetOption this]
    (-> this (.toString))))

