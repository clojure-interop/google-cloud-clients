(ns com.google.cloud.bigquery.InsertAllResponse
  "Google Cloud BigQuery insert all response. Objects of this class possibly contain errors for an
  InsertAllRequest. If a row failed to be inserted, the non-empty list of errors associated
  to that row's index can be obtained with getErrorsFor(long). getInsertErrors() can be used to return all errors caused by a InsertAllRequest as a map."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery InsertAllResponse]))

(defn get-insert-errors
  "Returns all insertion errors as a map whose keys are indexes of rows that failed to insert.
   Each failed row index is associated with a non-empty list of BigQueryError.

  returns: `java.util.Map<java.lang.Long,java.util.List<com.google.cloud.bigquery.BigQueryError>>`"
  (^java.util.Map [^InsertAllResponse this]
    (-> this (.getInsertErrors))))

(defn get-errors-for
  "Returns errors for the provided row index. If no error exists returns null.

  index - `long`

  returns: `java.util.List<com.google.cloud.bigquery.BigQueryError>`"
  (^java.util.List [^InsertAllResponse this ^Long index]
    (-> this (.getErrorsFor index))))

(defn has-errors?
  "Returns true if no row insertion failed, false otherwise. If false
   getInsertErrors() returns an empty map.

  returns: `boolean`"
  (^Boolean [^InsertAllResponse this]
    (-> this (.hasErrors))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InsertAllResponse this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InsertAllResponse this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InsertAllResponse this]
    (-> this (.toString))))

