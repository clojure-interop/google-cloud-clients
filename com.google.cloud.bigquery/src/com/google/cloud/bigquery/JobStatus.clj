(ns com.google.cloud.bigquery.JobStatus
  "A Google BigQuery Job status. Objects of this class can be examined when polling an asynchronous
  job to see if the job completed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatus]))

(defn get-state
  "Returns the state of the job. A JobStatus.State.PENDING job is waiting to be executed. A JobStatus.State.RUNNING is being executed. A JobStatus.State.DONE job has completed either succeeding or
   failing. If failed getError() will be non-null.

  returns: `com.google.cloud.bigquery.JobStatus$State`"
  (^com.google.cloud.bigquery.JobStatus$State [^JobStatus this]
    (-> this (.getState))))

(defn get-error
  "Returns the final error result of the job. If present, indicates that the job has completed and
   was unsuccessful.

  returns: `com.google.cloud.bigquery.BigQueryError`"
  (^com.google.cloud.bigquery.BigQueryError [^JobStatus this]
    (-> this (.getError))))

(defn get-execution-errors
  "Returns all errors encountered during the running of the job. Errors here do not necessarily
   mean that the job has completed or was unsuccessful.

  returns: `java.util.List<com.google.cloud.bigquery.BigQueryError>`"
  (^java.util.List [^JobStatus this]
    (-> this (.getExecutionErrors))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^JobStatus this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JobStatus this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JobStatus this ^java.lang.Object obj]
    (-> this (.equals obj))))

