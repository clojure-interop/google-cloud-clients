(ns com.google.cloud.bigquery.JobStatistics$ExtractStatistics
  "A Google BigQuery Extract Job statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatistics$ExtractStatistics]))

(defn get-destination-uri-file-counts
  "Returns the number of files per destination URI or URI pattern specified in the extract job.
   These values will be in the same order as the URIs specified by ExtractJobConfiguration.getDestinationUris().

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^JobStatistics$ExtractStatistics this]
    (-> this (.getDestinationUriFileCounts))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JobStatistics$ExtractStatistics this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JobStatistics$ExtractStatistics this]
    (-> this (.hashCode))))

