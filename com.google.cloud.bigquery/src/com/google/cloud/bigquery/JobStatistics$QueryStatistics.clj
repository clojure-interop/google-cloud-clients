(ns com.google.cloud.bigquery.JobStatistics$QueryStatistics
  "A Google BigQuery Query Job statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatistics$QueryStatistics]))

(defn get-cache-hit?
  "Returns whether the query result was fetched from the query cache.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^JobStatistics$QueryStatistics this]
    (-> this (.getCacheHit))))

(defn get-referenced-tables
  "Referenced tables for the job. Queries that reference more than 50 tables will not have a
   complete list.

  returns: `java.util.List<com.google.cloud.bigquery.TableId>`"
  (^java.util.List [^JobStatistics$QueryStatistics this]
    (-> this (.getReferencedTables))))

(defn get-ddl-target-routine
  "[BETA] For DDL queries, returns the RoutineId of the targeted routine.

  returns: `com.google.cloud.bigquery.RoutineId`"
  (^com.google.cloud.bigquery.RoutineId [^JobStatistics$QueryStatistics this]
    (-> this (.getDdlTargetRoutine))))

(defn get-total-bytes-billed
  "Returns the total number of bytes billed for the job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$QueryStatistics this]
    (-> this (.getTotalBytesBilled))))

(defn get-num-dml-affected-rows
  "The number of rows affected by a DML statement. Present only for DML statements INSERT,
   UPDATE or DELETE.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$QueryStatistics this]
    (-> this (.getNumDmlAffectedRows))))

(defn get-timeline
  "Return the timeline for the query, as a list of timeline samples. Each sample provides
   information about the overall progress of the query. Information includes time of the sample,
   progress reporting on active, completed, and pending units of work, as well as the cumulative
   estimation of slot-milliseconds consumed by the query.

  returns: `java.util.List<com.google.cloud.bigquery.TimelineSample>`"
  (^java.util.List [^JobStatistics$QueryStatistics this]
    (-> this (.getTimeline))))

(defn get-billing-tier
  "Returns the billing tier for the job.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^JobStatistics$QueryStatistics this]
    (-> this (.getBillingTier))))

(defn get-total-slot-ms
  "Returns the slot-milliseconds consumed by the query.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$QueryStatistics this]
    (-> this (.getTotalSlotMs))))

(defn get-estimated-bytes-processed
  "The original estimate of bytes processed for the job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$QueryStatistics this]
    (-> this (.getEstimatedBytesProcessed))))

(defn get-ddl-target-table
  "[BETA] For DDL queries, returns the TableID of the targeted table.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^JobStatistics$QueryStatistics this]
    (-> this (.getDdlTargetTable))))

(defn get-statement-type
  "[BETA] The type of query statement, if valid. Possible values include: SELECT INSERT UPDATE
   DELETE CREATE_TABLE CREATE_TABLE_AS_SELECT DROP_TABLE CREATE_VIEW DROP_VIEW

  returns: `com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType`"
  (^com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType [^JobStatistics$QueryStatistics this]
    (-> this (.getStatementType))))

(defn get-schema
  "Returns the schema for the query result. Present only for successful dry run of non-legacy
   SQL queries.

  returns: `com.google.cloud.bigquery.Schema`"
  (^com.google.cloud.bigquery.Schema [^JobStatistics$QueryStatistics this]
    (-> this (.getSchema))))

(defn get-total-partitions-processed
  "Total number of partitions processed from all partitioned tables referenced in the job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$QueryStatistics this]
    (-> this (.getTotalPartitionsProcessed))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JobStatistics$QueryStatistics this]
    (-> this (.hashCode))))

(defn get-total-bytes-processed
  "Returns the total number of bytes processed by the job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^JobStatistics$QueryStatistics this]
    (-> this (.getTotalBytesProcessed))))

(defn get-query-plan
  "Returns the query plan as a list of stages or null if a query plan is not available.
   Each stage involves a number of steps that read from data sources, perform a series of
   transformations on the input, and emit an output to a future stage (or the final result). The
   query plan is available for a completed query job and is retained for 7 days.

  returns: `java.util.List<com.google.cloud.bigquery.QueryStage>`"
  (^java.util.List [^JobStatistics$QueryStatistics this]
    (-> this (.getQueryPlan))))

(defn get-ddl-operation-performed
  "[BETA] For DDL queries, returns the operation applied to the DDL target table.

  returns: `java.lang.String`"
  (^java.lang.String [^JobStatistics$QueryStatistics this]
    (-> this (.getDdlOperationPerformed))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JobStatistics$QueryStatistics this ^java.lang.Object obj]
    (-> this (.equals obj))))

