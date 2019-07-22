(ns com.google.cloud.bigquery.Job$Builder
  "A builder for Job objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Job$Builder]))

(defn set-job-id
  "Description copied from class: JobInfo.Builder

  job-id - `com.google.cloud.bigquery.JobId`

  returns: `com.google.cloud.bigquery.Job$Builder`"
  (^com.google.cloud.bigquery.Job$Builder [^Job$Builder this ^com.google.cloud.bigquery.JobId job-id]
    (-> this (.setJobId job-id))))

(defn set-configuration
  "Description copied from class: JobInfo.Builder

  configuration - `com.google.cloud.bigquery.JobConfiguration`

  returns: `com.google.cloud.bigquery.Job$Builder`"
  (^com.google.cloud.bigquery.Job$Builder [^Job$Builder this ^com.google.cloud.bigquery.JobConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn build
  "Description copied from class: JobInfo.Builder

  returns: `com.google.cloud.bigquery.Job`"
  (^com.google.cloud.bigquery.Job [^Job$Builder this]
    (-> this (.build))))

