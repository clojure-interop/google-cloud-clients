(ns com.google.cloud.bigquery.BigQuery$ModelOption
  "Class for specifying model get, create and update options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$ModelOption]))

(defn *fields
  "Returns an option to specify the model's fields to be returned by the RPC call. If this
   option is not provided all model's fields are returned. ModelOption.fields can be
   used to specify only the fields of interest.

  fields - `com.google.cloud.bigquery.BigQuery$ModelField`

  returns: `com.google.cloud.bigquery.BigQuery$ModelOption`"
  (^com.google.cloud.bigquery.BigQuery$ModelOption [^com.google.cloud.bigquery.BigQuery$ModelField fields]
    (BigQuery$ModelOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$ModelOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$ModelOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$ModelOption this]
    (-> this (.toString))))

