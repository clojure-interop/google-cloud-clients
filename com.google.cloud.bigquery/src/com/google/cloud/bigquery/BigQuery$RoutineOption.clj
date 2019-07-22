(ns com.google.cloud.bigquery.BigQuery$RoutineOption
  "Class for specifying table get, create and update options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$RoutineOption]))

(defn *fields
  "Returns an option to specify the routines's fields to be returned by the RPC call. If this
   option is not provided all model's fields are returned. RoutineOption.fields can be
   used to specify only the fields of interest.

  fields - `com.google.cloud.bigquery.BigQuery$RoutineField`

  returns: `com.google.cloud.bigquery.BigQuery$RoutineOption`"
  (^com.google.cloud.bigquery.BigQuery$RoutineOption [^com.google.cloud.bigquery.BigQuery$RoutineField fields]
    (BigQuery$RoutineOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$RoutineOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$RoutineOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$RoutineOption this]
    (-> this (.toString))))

