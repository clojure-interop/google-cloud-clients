(ns com.google.cloud.bigquery.JobId
  "Google BigQuery Job identity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobId]))

(defn *new-builder
  "returns: `com.google.cloud.bigquery.JobId$Builder`"
  (^com.google.cloud.bigquery.JobId$Builder []
    (JobId/newBuilder )))

(defn *of
  "Creates a job identity given project's and job's user-defined id.

  project - `java.lang.String`
  job - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobId`"
  (^com.google.cloud.bigquery.JobId [^java.lang.String project ^java.lang.String job]
    (JobId/of project job))
  (^com.google.cloud.bigquery.JobId [^java.lang.String job]
    (JobId/of job))
  (^com.google.cloud.bigquery.JobId []
    (JobId/of )))

(defn get-project
  "Returns job's project id.

   When sending requests with null project, the client will attempt to infer the project name
   from the environment.

  returns: `java.lang.String`"
  (^java.lang.String [^JobId this]
    (-> this (.getProject))))

(defn get-job
  "Returns the job's id.

   The server returns null job id for dry-run queries.

  returns: `java.lang.String`"
  (^java.lang.String [^JobId this]
    (-> this (.getJob))))

(defn get-location
  "Returns the job's location.

   When sending requests, the location must be specified for jobs whose location not \"US\" or
   \"EU\".

  returns: `java.lang.String`"
  (^java.lang.String [^JobId this]
    (-> this (.getLocation))))

(defn to-builder
  "returns: `com.google.cloud.bigquery.JobId$Builder`"
  (^com.google.cloud.bigquery.JobId$Builder [^JobId this]
    (-> this (.toBuilder))))

