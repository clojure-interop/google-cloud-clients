(ns com.google.cloud.bigquery.BigQuery$JobListOption
  "Class for specifying job list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$JobListOption]))

(defn *all-users
  "Returns an option to list all jobs, even the ones issued by other users.

  returns: `com.google.cloud.bigquery.BigQuery$JobListOption`"
  (^com.google.cloud.bigquery.BigQuery$JobListOption []
    (BigQuery$JobListOption/allUsers )))

(defn *state-filter
  "Returns an option to list only jobs that match the provided state filters.

  state-filters - `com.google.cloud.bigquery.JobStatus$State`

  returns: `com.google.cloud.bigquery.BigQuery$JobListOption`"
  (^com.google.cloud.bigquery.BigQuery$JobListOption [^com.google.cloud.bigquery.JobStatus$State state-filters]
    (BigQuery$JobListOption/stateFilter state-filters)))

(defn *min-creation-time
  "Returns an option to filter out jobs before the given minimum creation time.

  min-creation-time - `long`

  returns: `com.google.cloud.bigquery.BigQuery$JobListOption`"
  (^com.google.cloud.bigquery.BigQuery$JobListOption [^Long min-creation-time]
    (BigQuery$JobListOption/minCreationTime min-creation-time)))

(defn *max-creation-time
  "Returns an option to filter out jobs after the given maximum creation time.

  max-creation-time - `long`

  returns: `com.google.cloud.bigquery.BigQuery$JobListOption`"
  (^com.google.cloud.bigquery.BigQuery$JobListOption [^Long max-creation-time]
    (BigQuery$JobListOption/maxCreationTime max-creation-time)))

(defn *page-size
  "Returns an option to specify the maximum number of jobs returned per page.

  page-size - `long`

  returns: `com.google.cloud.bigquery.BigQuery$JobListOption`"
  (^com.google.cloud.bigquery.BigQuery$JobListOption [^Long page-size]
    (BigQuery$JobListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing jobs.

  page-token - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$JobListOption`"
  (^com.google.cloud.bigquery.BigQuery$JobListOption [^java.lang.String page-token]
    (BigQuery$JobListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the job's fields to be returned by the RPC call. If this option
   is not provided all job's fields are returned. JobOption.fields() can be used to
   specify only the fields of interest. JobInfo.getJobId(), JobStatus.getState(),
   JobStatus.getError() as well as type-specific configuration (e.g. QueryJobConfiguration.getQuery() for Query Jobs) are always returned, even if not specified.
   BigQuery.JobField.SELF_LINK and BigQuery.JobField.ETAG can not be selected when listing jobs.

  fields - `com.google.cloud.bigquery.BigQuery$JobField`

  returns: `com.google.cloud.bigquery.BigQuery$JobListOption`"
  (^com.google.cloud.bigquery.BigQuery$JobListOption [^com.google.cloud.bigquery.BigQuery$JobField fields]
    (BigQuery$JobListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$JobListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$JobListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$JobListOption this]
    (-> this (.toString))))

