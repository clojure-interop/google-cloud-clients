(ns com.google.cloud.bigquery.QueryStage
  "BigQuery provides diagnostic information about a completed query's execution plan (or query plan
  for short). The query plan describes a query as a series of stages, with each stage comprising a
  number of steps that read from data sources, perform a series of transformations on the input,
  and emit an output to a future stage (or the final result). This class contains information on a
  query stage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery QueryStage]))

(defn get-wait-ratio-avg
  "Returns the time the average worker spent waiting to be scheduled, divided by the longest time
   spent by any worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getWaitRatioAvg))))

(defn get-read-ratio-max
  "Returns the time the slowest worker spent reading input data, divided by the longest time spent
   by any worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getReadRatioMax))))

(defn get-wait-ms-avg
  "Returns the time in milliseconds the average worker spent waiting to be scheduled.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getWaitMsAvg))))

(defn get-status
  "Returns the current status for the stage.

  returns: `java.lang.String`"
  (^java.lang.String [^QueryStage this]
    (-> this (.getStatus))))

(defn get-end-ms
  "Returns the stage end time represented as milliseconds since epoch.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getEndMs))))

(defn get-records-written
  "Returns the number of rows (top-level records) written by the stage.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getRecordsWritten))))

(defn get-completed-parallel-inputs
  "Returns the number of parallel input segments completed.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getCompletedParallelInputs))))

(defn get-read-ms-avg
  "Returns the time in milliseconds the average worker spent reading input.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getReadMsAvg))))

(defn get-shuffle-output-bytes-spilled
  "Returns the total number of bytes writtedn to shuffle and spilled to disk.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getShuffleOutputBytesSpilled))))

(defn get-start-ms
  "Returns the stage start time represented as milliseconds since epoch.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getStartMs))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^QueryStage this]
    (-> this (.toString))))

(defn get-name
  "Returns a human-readable name for the stage.

  returns: `java.lang.String`"
  (^java.lang.String [^QueryStage this]
    (-> this (.getName))))

(defn get-write-ratio-max
  "Returns the time the slowest worker spent writing output data, divided by the longest time
   spent by any worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getWriteRatioMax))))

(defn get-write-ratio-avg
  "Returns the time the average worker spent writing output data, divided by the longest time
   spent by any worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getWriteRatioAvg))))

(defn get-wait-ms-max
  "Returns the time in milliseconds the slowest worker spent waiting to be scheduled.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getWaitMsMax))))

(defn get-wait-ratio-max
  "Returns the time the slowest worker spent waiting to be scheduled, divided by the longest time
   spent by any worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getWaitRatioMax))))

(defn get-records-read
  "Returns the number of rows (top-level records) read by the stage.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getRecordsRead))))

(defn get-shuffle-output-bytes
  "Returns the total number of bytes written to shuffle.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getShuffleOutputBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^QueryStage this]
    (-> this (.hashCode))))

(defn get-compute-ms-max
  "Returns the time in milliseconds the slowest worker spent on CPU-bound tasks.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getComputeMsMax))))

(defn get-input-stages
  "Returns a list of the stage IDs that are inputs to this stage.

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^QueryStage this]
    (-> this (.getInputStages))))

(defn get-steps
  "Returns the list of steps within the stage in dependency order (approximately chronological).

  returns: `java.util.List<com.google.cloud.bigquery.QueryStage$QueryStep>`"
  (^java.util.List [^QueryStage this]
    (-> this (.getSteps))))

(defn get-compute-ratio-max
  "Returns the time the slowest worker spent CPU-bound, divided by the longest time spent by any
   worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getComputeRatioMax))))

(defn get-generated-id
  "Returns a unique, server-generated ID for the stage within its plan.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getGeneratedId))))

(defn get-read-ms-max
  "Returns the time in milliseconds the slowest worker spent reading input.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getReadMsMax))))

(defn get-read-ratio-avg
  "Returns the time the average worker spent reading input data, divided by the longest time spent
   by any worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getReadRatioAvg))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^QueryStage this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-parallel-inputs
  "Returns the number of parallel input segments to be processed.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getParallelInputs))))

(defn get-write-ms-avg
  "Returns the time in milliseconds the average worker spent writing output.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getWriteMsAvg))))

(defn get-write-ms-max
  "Returns the time in milliseconds the slowest worker spent writing output.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getWriteMsMax))))

(defn get-compute-ratio-avg
  "Returns the time the average worker spent CPU-bound, divided by the longest time spent by any
   worker in any segment.

  returns: `double`"
  (^Double [^QueryStage this]
    (-> this (.getComputeRatioAvg))))

(defn get-compute-ms-avg
  "Returns the time in milliseconds the average worker spent on CPU-bound tasks.

  returns: `long`"
  (^Long [^QueryStage this]
    (-> this (.getComputeMsAvg))))

