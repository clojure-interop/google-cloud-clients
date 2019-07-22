(ns com.google.cloud.bigquery.JobId$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobId$Builder]))

(defn ->builder
  "Constructor."
  (^JobId$Builder []
    (new JobId$Builder )))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobId$Builder`"
  (^com.google.cloud.bigquery.JobId$Builder [^JobId$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-job
  "job - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobId$Builder`"
  (^com.google.cloud.bigquery.JobId$Builder [^JobId$Builder this ^java.lang.String job]
    (-> this (.setJob job))))

(defn set-random-job
  "setJob to a pseudo-random string.

  returns: `com.google.cloud.bigquery.JobId$Builder`"
  (^com.google.cloud.bigquery.JobId$Builder [^JobId$Builder this]
    (-> this (.setRandomJob))))

(defn set-location
  "location - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobId$Builder`"
  (^com.google.cloud.bigquery.JobId$Builder [^JobId$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn build
  "returns: `com.google.cloud.bigquery.JobId`"
  (^com.google.cloud.bigquery.JobId [^JobId$Builder this]
    (-> this (.build))))

