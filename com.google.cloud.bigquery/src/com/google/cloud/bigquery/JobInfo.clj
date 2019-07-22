(ns com.google.cloud.bigquery.JobInfo
  "Google BigQuery Job information. Jobs are objects that manage asynchronous tasks such as running
  queries, loading data, and exporting data. Use CopyJobConfiguration for a job that copies
  an existing table. Use ExtractJobConfiguration for a job that exports a table to Google
  Cloud Storage. Use LoadJobConfiguration for a job that loads data from Google Cloud
  Storage into a table. Use QueryJobConfiguration for a job that runs a query."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobInfo]))

(defn *new-builder
  "Returns a builder for a JobInfo object given the job configuration. Use CopyJobConfiguration for a job that copies an existing table. Use ExtractJobConfiguration for a job that exports a table to Google Cloud Storage. Use LoadJobConfiguration for a job that loads data from Google Cloud Storage into a table. Use
   QueryJobConfiguration for a job that runs a query.

  configuration - `com.google.cloud.bigquery.JobConfiguration`

  returns: `com.google.cloud.bigquery.JobInfo$Builder`"
  (^com.google.cloud.bigquery.JobInfo$Builder [^com.google.cloud.bigquery.JobConfiguration configuration]
    (JobInfo/newBuilder configuration)))

(defn *of
  "Returns a builder for a JobInfo object given the job identity and configuration. Use
   CopyJobConfiguration for a job that copies an existing table. Use ExtractJobConfiguration for a job that exports a table to Google Cloud Storage. Use LoadJobConfiguration for a job that loads data from Google Cloud Storage into a table. Use
   QueryJobConfiguration for a job that runs a query.

  job-id - `com.google.cloud.bigquery.JobId`
  configuration - `com.google.cloud.bigquery.JobConfiguration`

  returns: `com.google.cloud.bigquery.JobInfo`"
  (^com.google.cloud.bigquery.JobInfo [^com.google.cloud.bigquery.JobId job-id ^com.google.cloud.bigquery.JobConfiguration configuration]
    (JobInfo/of job-id configuration))
  (^com.google.cloud.bigquery.JobInfo [^com.google.cloud.bigquery.JobConfiguration configuration]
    (JobInfo/of configuration)))

(defn get-job-id
  "Returns the job identity.

  returns: `com.google.cloud.bigquery.JobId`"
  (^com.google.cloud.bigquery.JobId [^JobInfo this]
    (-> this (.getJobId))))

(defn get-status
  "Returns the status of this job. Examine this value when polling an asynchronous job to see if
   the job is complete.

  returns: `com.google.cloud.bigquery.JobStatus`"
  (^com.google.cloud.bigquery.JobStatus [^JobInfo this]
    (-> this (.getStatus))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^JobInfo this]
    (-> this (.toString))))

(defn get-etag
  "Returns the hash of the job resource.

  returns: `java.lang.String`"
  (^java.lang.String [^JobInfo this]
    (-> this (.getEtag))))

(defn get-statistics
  "Returns information about the job, including starting time and ending time of the job.

  returns: `<S extends com.google.cloud.bigquery.JobStatistics> S`"
  ([^JobInfo this]
    (-> this (.getStatistics))))

(defn get-configuration
  "Returns the job's configuration.

  returns: `<C extends com.google.cloud.bigquery.JobConfiguration> C`"
  ([^JobInfo this]
    (-> this (.getConfiguration))))

(defn get-self-link
  "Returns an URL that can be used to access the resource again. The returned URL can be used for
   GET requests.

  returns: `java.lang.String`"
  (^java.lang.String [^JobInfo this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JobInfo this]
    (-> this (.hashCode))))

(defn get-user-email
  "Returns the email address of the user who ran the job.

  returns: `java.lang.String`"
  (^java.lang.String [^JobInfo this]
    (-> this (.getUserEmail))))

(defn get-generated-id
  "Returns the service-generated id for the job.

  returns: `java.lang.String`"
  (^java.lang.String [^JobInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JobInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the job object.

  returns: `com.google.cloud.bigquery.JobInfo$Builder`"
  (^com.google.cloud.bigquery.JobInfo$Builder [^JobInfo this]
    (-> this (.toBuilder))))

