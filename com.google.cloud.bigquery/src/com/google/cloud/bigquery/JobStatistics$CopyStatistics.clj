(ns com.google.cloud.bigquery.JobStatistics$CopyStatistics
  "A Google BigQuery Copy Job statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatistics$CopyStatistics]))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JobStatistics$CopyStatistics this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JobStatistics$CopyStatistics this]
    (-> this (.hashCode))))

