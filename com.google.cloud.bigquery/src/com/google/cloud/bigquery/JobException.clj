(ns com.google.cloud.bigquery.JobException
  "Exception describing a failure of a job."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobException]))

(defn get-id
  "The ID for the failed job.

  returns: `com.google.cloud.bigquery.JobId`"
  (^com.google.cloud.bigquery.JobId [^JobException this]
    (-> this (.getId))))

(defn get-errors
  "The errors reported by the job.

   The list is immutable.

  returns: `java.util.List<com.google.cloud.bigquery.BigQueryError>`"
  (^java.util.List [^JobException this]
    (-> this (.getErrors))))

