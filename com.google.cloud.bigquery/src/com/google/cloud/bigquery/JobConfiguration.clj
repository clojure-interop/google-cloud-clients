(ns com.google.cloud.bigquery.JobConfiguration
  "Base class for a BigQuery job configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobConfiguration]))

(defn get-type
  "Returns the type of the job configuration.

  returns: `com.google.cloud.bigquery.JobConfiguration$Type`"
  (^com.google.cloud.bigquery.JobConfiguration$Type [^JobConfiguration this]
    (-> this (.getType))))

(defn to-builder
  "Returns a builder for the object.

  returns: `com.google.cloud.bigquery.JobConfiguration$Builder`"
  (^com.google.cloud.bigquery.JobConfiguration$Builder [^JobConfiguration this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^JobConfiguration this]
    (-> this (.toString))))

