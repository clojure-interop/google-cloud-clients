(ns com.google.cloud.bigquery.BigQuery$JobOption
  "Class for specifying table get and create options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$JobOption]))

(defn *fields
  "Returns an option to specify the job's fields to be returned by the RPC call. If this option
   is not provided all job's fields are returned. JobOption.fields() can be used to
   specify only the fields of interest. JobInfo.getJobId() as well as type-specific
   configuration (e.g. QueryJobConfiguration.getQuery() for Query Jobs) are always
   returned, even if not specified.

  fields - `com.google.cloud.bigquery.BigQuery$JobField`

  returns: `com.google.cloud.bigquery.BigQuery$JobOption`"
  (^com.google.cloud.bigquery.BigQuery$JobOption [^com.google.cloud.bigquery.BigQuery$JobField fields]
    (BigQuery$JobOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$JobOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$JobOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$JobOption this]
    (-> this (.toString))))

