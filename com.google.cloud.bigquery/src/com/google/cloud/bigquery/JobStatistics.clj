(ns com.google.cloud.bigquery.JobStatistics
  "A Google BigQuery Job statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatistics]))

(defn get-creation-time
  "Returns the creation time of the job in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics this]
    (-> this (.getCreationTime))))

(defn get-end-time
  "Returns the end time of the job in milliseconds since epoch. Returns null if the job
   has not finished yet.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics this]
    (-> this (.getEndTime))))

(defn get-start-time
  "Returns the start time of the job in milliseconds since epoch. Returns null if the job
   has not started yet.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics this]
    (-> this (.getStartTime))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^JobStatistics this]
    (-> this (.toString))))

