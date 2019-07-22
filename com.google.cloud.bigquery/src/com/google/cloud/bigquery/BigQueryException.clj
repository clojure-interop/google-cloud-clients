(ns com.google.cloud.bigquery.BigQueryException
  "BigQuery service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQueryException]))

(defn ->big-query-exception
  "Constructor.

  code - `int`
  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^BigQueryException [^Integer code ^java.lang.String message ^java.lang.Throwable cause]
    (new BigQueryException code message cause))
  (^BigQueryException [^Integer code ^java.lang.String message]
    (new BigQueryException code message))
  (^BigQueryException [^java.io.IOException exception]
    (new BigQueryException exception)))

(defn get-error
  "Returns the BigQueryError that caused this exception. Returns null if none
   exists.

  returns: `com.google.cloud.bigquery.BigQueryError`"
  (^com.google.cloud.bigquery.BigQueryError [^BigQueryException this]
    (-> this (.getError))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQueryException this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQueryException this]
    (-> this (.hashCode))))

