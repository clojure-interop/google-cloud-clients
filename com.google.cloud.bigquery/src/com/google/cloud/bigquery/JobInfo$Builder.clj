(ns com.google.cloud.bigquery.JobInfo$Builder
  "A builder for JobInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobInfo$Builder]))

(defn ->builder
  "Constructor."
  (^JobInfo$Builder []
    (new JobInfo$Builder )))

(defn set-job-id
  "Sets the job identity.

  job-id - `com.google.cloud.bigquery.JobId`

  returns: `com.google.cloud.bigquery.JobInfo$Builder`"
  (^com.google.cloud.bigquery.JobInfo$Builder [^JobInfo$Builder this ^com.google.cloud.bigquery.JobId job-id]
    (-> this (.setJobId job-id))))

(defn set-configuration
  "Sets a configuration for the JobInfo object. Use CopyJobConfiguration for a
   job that copies an existing table. Use ExtractJobConfiguration for a job that exports
   a table to Google Cloud Storage. Use LoadJobConfiguration for a job that loads data
   from Google Cloud Storage into a table. Use QueryJobConfiguration for a job that runs
   a query.

  configuration - `com.google.cloud.bigquery.JobConfiguration`

  returns: `com.google.cloud.bigquery.JobInfo$Builder`"
  (^com.google.cloud.bigquery.JobInfo$Builder [^JobInfo$Builder this ^com.google.cloud.bigquery.JobConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn build
  "Creates a JobInfo object.

  returns: `com.google.cloud.bigquery.JobInfo`"
  (^com.google.cloud.bigquery.JobInfo [^JobInfo$Builder this]
    (-> this (.build))))

