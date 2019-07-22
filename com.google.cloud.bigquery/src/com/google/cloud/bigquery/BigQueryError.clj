(ns com.google.cloud.bigquery.BigQueryError
  "Google Cloud BigQuery Error. Objects of this class represent errors encountered by the BigQuery
  service while executing a request. A BigQuery Job that terminated with an error has a non-null
  JobStatus.getError(). A job can also encounter errors during its execution that do not
  cause the whole job to fail (see JobStatus.getExecutionErrors()). Similarly, queries and
  insert all requests can cause BigQuery errors that do not mean the whole operation failed (see
  JobStatus.getExecutionErrors() and InsertAllResponse.getInsertErrors()). When a
  BigQueryException is thrown the BigQuery Error that caused it, if any, can be accessed
  with BigQueryException.getError()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQueryError]))

(defn ->big-query-error
  "Constructor.

  reason - `java.lang.String`
  location - `java.lang.String`
  message - `java.lang.String`
  debug-info - `java.lang.String`"
  (^BigQueryError [^java.lang.String reason ^java.lang.String location ^java.lang.String message ^java.lang.String debug-info]
    (new BigQueryError reason location message debug-info))
  (^BigQueryError [^java.lang.String reason ^java.lang.String location ^java.lang.String message]
    (new BigQueryError reason location message)))

(defn get-reason
  "Returns short error code that summarizes the error.

  returns: `java.lang.String`"
  (^java.lang.String [^BigQueryError this]
    (-> this (.getReason))))

(defn get-location
  "Returns where the error occurred, if present.

  returns: `java.lang.String`"
  (^java.lang.String [^BigQueryError this]
    (-> this (.getLocation))))

(defn get-message
  "Returns a human-readable description of the error.

  returns: `java.lang.String`"
  (^java.lang.String [^BigQueryError this]
    (-> this (.getMessage))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQueryError this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQueryError this]
    (-> this (.toString))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQueryError this ^java.lang.Object obj]
    (-> this (.equals obj))))

