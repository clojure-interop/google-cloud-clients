(ns com.google.cloud.bigquery.JobStatistics$LoadStatistics
  "A Google BigQuery Load Job statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatistics$LoadStatistics]))

(defn get-input-bytes
  "Returns the number of bytes of source data in a load job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$LoadStatistics this]
    (-> this (.getInputBytes))))

(defn get-input-files
  "Returns the number of source files in a load job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$LoadStatistics this]
    (-> this (.getInputFiles))))

(defn get-output-bytes
  "Returns the size of the data loaded by a load job so far, in bytes.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$LoadStatistics this]
    (-> this (.getOutputBytes))))

(defn get-output-rows
  "Returns the number of rows loaded by a load job so far.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$LoadStatistics this]
    (-> this (.getOutputRows))))

(defn get-bad-records
  "Returns the number of bad records reported in a job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$LoadStatistics this]
    (-> this (.getBadRecords))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JobStatistics$LoadStatistics this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JobStatistics$LoadStatistics this]
    (-> this (.hashCode))))

