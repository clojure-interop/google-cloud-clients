(ns com.google.cloud.bigquery.TableDataWriteChannel
  "WriteChannel implementation to stream data into a BigQuery table. Use getJob()
  to get the job used to insert streamed data. Please notice that getJob() returns null until the channel is closed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableDataWriteChannel]))

(defn get-job
  "Returns the Job created to insert the rows. The job is available only once the upload
   finished and the channel was closed, returns null otherwise.

  returns: `com.google.cloud.bigquery.Job`"
  (^com.google.cloud.bigquery.Job [^TableDataWriteChannel this]
    (-> this (.getJob))))

