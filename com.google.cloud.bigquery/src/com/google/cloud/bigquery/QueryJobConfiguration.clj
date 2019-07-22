(ns com.google.cloud.bigquery.QueryJobConfiguration
  "Google BigQuery Query Job configuration. A Query Job runs a query against BigQuery data. Query
  job configurations have JobConfiguration.Type.QUERY type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery QueryJobConfiguration]))

(defn *new-builder
  "Creates a builder for a BigQuery Query Job given the query to be run.

  query - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^java.lang.String query]
    (QueryJobConfiguration/newBuilder query)))

(defn *of
  "Returns a BigQuery Copy Job for the given the query to be run. Job's id is chosen by the
   service.

  query - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration`"
  (^com.google.cloud.bigquery.QueryJobConfiguration [^java.lang.String query]
    (QueryJobConfiguration/of query)))

(defn get-create-disposition
  "Returns whether the job is allowed to create new tables.

  returns: `com.google.cloud.bigquery.JobInfo$CreateDisposition`"
  (^com.google.cloud.bigquery.JobInfo$CreateDisposition [^QueryJobConfiguration this]
    (-> this (.getCreateDisposition))))

(defn flatten-results
  "Returns whether nested and repeated fields should be flattened. If set to false QueryJobConfiguration.Builder.setAllowLargeResults(Boolean) must be true.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^QueryJobConfiguration this]
    (-> this (.flattenResults))))

(defn use-query-cache
  "Returns whether to look for the result in the query cache. The query cache is a best-effort
   cache that will be flushed whenever tables in the query are modified. Moreover, the query cache
   is only available when QueryJobConfiguration.Builder.setDestinationTable(TableId) is not set.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^QueryJobConfiguration this]
    (-> this (.useQueryCache))))

(defn allow-large-results
  "Returns whether the job is enabled to create arbitrarily large results. If true the
   query is allowed to create large results at a slight cost in performance. the query is allowed
   to create large results at a slight cost in performance.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^QueryJobConfiguration this]
    (-> this (.allowLargeResults))))

(defn get-write-disposition
  "Returns the action that should occur if the destination table already exists.

  returns: `com.google.cloud.bigquery.JobInfo$WriteDisposition`"
  (^com.google.cloud.bigquery.JobInfo$WriteDisposition [^QueryJobConfiguration this]
    (-> this (.getWriteDisposition))))

(defn get-schema-update-options
  "[Experimental] Returns options allowing the schema of the destination table to be updated as a
   side effect of the query job. Schema update options are supported in two cases: when
   writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination
   table is a partition of a table, specified by partition decorators. For normal tables,
   WRITE_TRUNCATE will always overwrite the schema.

  returns: `java.util.List<com.google.cloud.bigquery.JobInfo$SchemaUpdateOption>`"
  (^java.util.List [^QueryJobConfiguration this]
    (-> this (.getSchemaUpdateOptions))))

(defn get-default-dataset
  "Returns the default dataset. This dataset is used for all unqualified table names used in the
   query.

  returns: `com.google.cloud.bigquery.DatasetId`"
  (^com.google.cloud.bigquery.DatasetId [^QueryJobConfiguration this]
    (-> this (.getDefaultDataset))))

(defn use-legacy-sql
  "Returns whether to use BigQuery's legacy SQL dialect for this query. By default this property
   is set to false. If set to false, the query will use BigQuery's Standard SQL. When set to false, the values of allowLargeResults() and flattenResults() are ignored;
   query will be run as if allowLargeResults() is true and flattenResults() is false. If set to null or true, legacy SQL dialect
   is used. This property is experimental and might be subject to change.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^QueryJobConfiguration this]
    (-> this (.useLegacySql))))

(defn get-maximum-bytes-billed
  "Returns the optional bytes billed limit for this job.

  returns: `java.lang.Long`"
  (^java.lang.Long [^QueryJobConfiguration this]
    (-> this (.getMaximumBytesBilled))))

(defn get-user-defined-functions
  "Returns user defined function resources that can be used by this query. Function resources can
   either be defined inline (UserDefinedFunction.Type.INLINE) or loaded from a Google
   Cloud Storage URI (UserDefinedFunction.Type.FROM_URI.

  returns: `java.util.List<com.google.cloud.bigquery.UserDefinedFunction>`"
  (^java.util.List [^QueryJobConfiguration this]
    (-> this (.getUserDefinedFunctions))))

(defn get-query
  "Returns the Google BigQuery SQL query.

  returns: `java.lang.String`"
  (^java.lang.String [^QueryJobConfiguration this]
    (-> this (.getQuery))))

(defn dry-run
  "Returns whether the job has to be dry run or not. If set, the job is not executed. A valid
   query will return a mostly empty response with some processing statistics, while an invalid
   query will return the same error it would if it wasn't a dry run.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^QueryJobConfiguration this]
    (-> this (.dryRun))))

(defn get-table-definitions
  "Returns the external tables definitions. If querying external data sources outside of BigQuery,
   this value describes the data format, location and other properties of the data sources. By
   defining these properties, the data sources can be queried as if they were standard BigQuery
   tables.

  returns: `java.util.Map<java.lang.String,com.google.cloud.bigquery.ExternalTableDefinition>`"
  (^java.util.Map [^QueryJobConfiguration this]
    (-> this (.getTableDefinitions))))

(defn get-destination-table
  "Returns the table where to put query results. If not provided a new table is created. This
   value is required if allowLargeResults() is true.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^QueryJobConfiguration this]
    (-> this (.getDestinationTable))))

(defn get-time-partitioning
  "Returns the time partitioning specification for the destination table.

  returns: `com.google.cloud.bigquery.TimePartitioning`"
  (^com.google.cloud.bigquery.TimePartitioning [^QueryJobConfiguration this]
    (-> this (.getTimePartitioning))))

(defn get-named-parameters
  "Returns the named query parameters to use for the query.

  returns: `java.util.Map<java.lang.String,com.google.cloud.bigquery.QueryParameterValue>`"
  (^java.util.Map [^QueryJobConfiguration this]
    (-> this (.getNamedParameters))))

(defn hash-code
  "returns: `int`"
  (^Integer [^QueryJobConfiguration this]
    (-> this (.hashCode))))

(defn get-maximum-billing-tier
  "Returns the optional billing tier limit for this job.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^QueryJobConfiguration this]
    (-> this (.getMaximumBillingTier))))

(defn get-clustering
  "Returns the clustering specification for the destination table.

  returns: `com.google.cloud.bigquery.Clustering`"
  (^com.google.cloud.bigquery.Clustering [^QueryJobConfiguration this]
    (-> this (.getClustering))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^QueryJobConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-priority
  "Returns the query priority.

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Priority`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Priority [^QueryJobConfiguration this]
    (-> this (.getPriority))))

(defn get-positional-parameters
  "Returns the positional query parameters to use for the query.

  returns: `java.util.List<com.google.cloud.bigquery.QueryParameterValue>`"
  (^java.util.List [^QueryJobConfiguration this]
    (-> this (.getPositionalParameters))))

(defn get-destination-encryption-configuration
  "returns: `com.google.cloud.bigquery.EncryptionConfiguration`"
  (^com.google.cloud.bigquery.EncryptionConfiguration [^QueryJobConfiguration this]
    (-> this (.getDestinationEncryptionConfiguration))))

(defn to-builder
  "Description copied from class: JobConfiguration

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration this]
    (-> this (.toBuilder))))

