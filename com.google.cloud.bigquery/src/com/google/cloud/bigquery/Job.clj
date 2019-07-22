(ns com.google.cloud.bigquery.Job
  "A Google BigQuery Job.

  Objects of this class are immutable. To get a Job object with the most recent
  information use reload(com.google.cloud.bigquery.BigQuery.JobOption...). Job adds a layer of service-related functionality over
  JobInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Job]))

(defn cancel
  "Sends a job cancel request.

   Example of cancelling a job.



   if (job.cancel()) {
     return true; // job successfully cancelled
   } else {
     // job not found
   }

  returns: true if cancel request was sent successfully, false if job was not
       found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Job this]
    (-> this (.cancel))))

(defn reload
  "Fetches current job's latest information. Returns null if the job does not exist.

   Example of reloading all fields until job status is DONE.



   while (!JobStatus.State.DONE.equals(job.getStatus().getState())) {
     Thread.sleep(1000L);
     job = job.reload();
   }

   Example of reloading status field until job status is DONE.



   while (!JobStatus.State.DONE.equals(job.getStatus().getState())) {
     Thread.sleep(1000L);
     job = job.reload(BigQuery.JobOption.fields(BigQuery.JobField.STATUS));
   }

  options - job options - `com.google.cloud.bigquery.BigQuery$JobOption`

  returns: a Job object with latest information or null if not found - `com.google.cloud.bigquery.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Job [^Job this ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.reload options))))

(defn get-query-results
  "Gets the query results of this job. This job must be of type JobConfiguration.Type.QUERY, otherwise this method will throw UnsupportedOperationException.

   If the job hasn't finished, this method waits for the job to complete. However, the state of
   the current Job instance is not updated. To get the new state, call waitFor(RetryOption...) or #reload(JobOption...).

  options - `com.google.cloud.bigquery.BigQuery$QueryResultsOption`

  returns: `com.google.cloud.bigquery.TableResult`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.TableResult [^Job this ^com.google.cloud.bigquery.BigQuery$QueryResultsOption options]
    (-> this (.getQueryResults options))))

(defn done?
  "Checks if this job has completed its execution, either failing or succeeding. If the job does
   not exist this method returns true.

   Example of waiting for a job until it reports that it is done.



   while (!job.isDone()) {
     Thread.sleep(1000L);
   }

  returns: true if this job is in JobStatus.State.DONE state or if it does not
       exist, false if the state is not JobStatus.State.DONE - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Job this]
    (-> this (.isDone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Job this]
    (-> this (.hashCode))))

(defn get-big-query
  "Returns the job's BigQuery object used to issue requests.

  returns: `com.google.cloud.bigquery.BigQuery`"
  (^com.google.cloud.bigquery.BigQuery [^Job this]
    (-> this (.getBigQuery))))

(defn exists?
  "Checks if this job exists.

   Example of checking that a job exists.



   if (!job.exists()) {
     // job doesn't exist
   }

  returns: true if this job exists, false otherwise - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Job this]
    (-> this (.exists))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Job this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn wait-for
  "Blocks until this job completes its execution, either failing or succeeding. This method
   returns current job's latest information. If the job no longer exists, this method returns
   null. By default, the job status is checked using jittered exponential backoff with 1
   second as an initial delay, 2.0 as a backoff factor, 1 minute as maximum delay between polls,
   12 hours as a total timeout and unlimited number of attempts.

   Example usage of waitFor().



   Job completedJob = job.waitFor();
   if (completedJob == null) {
     // job no longer exists
   } else if (completedJob.getStatus().getError() != null) {
     // job failed, handle error
   } else {
     // job completed successfully
   }

   Example usage of waitFor() with checking period and timeout.



   Job completedJob =
       job.waitFor(
           RetryOption.initialRetryDelay(Duration.ofSeconds(1)),
           RetryOption.totalTimeout(Duration.ofMinutes(1)));
   if (completedJob == null) {
     // job no longer exists
   } else if (completedJob.getStatus().getError() != null) {
     // job failed, handle error
   } else {
     // job completed successfully
   }

  wait-options - options to configure checking period and timeout - `com.google.cloud.RetryOption`

  returns: `com.google.cloud.bigquery.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure, check Throwable.getCause() for details"
  (^com.google.cloud.bigquery.Job [^Job this ^com.google.cloud.RetryOption wait-options]
    (-> this (.waitFor wait-options))))

(defn to-builder
  "Description copied from class: JobInfo

  returns: `com.google.cloud.bigquery.Job$Builder`"
  (^com.google.cloud.bigquery.Job$Builder [^Job this]
    (-> this (.toBuilder))))

