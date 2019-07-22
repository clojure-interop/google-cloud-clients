(ns com.google.cloud.bigquery.QueryJobConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery QueryJobConfiguration$Builder]))

(defn set-use-legacy-sql
  "Sets whether to use BigQuery's legacy SQL dialect for this query. By default this property is
   set to false. If set to false, the query will use BigQuery's Standard SQL. When set to false, the values of setAllowLargeResults(Boolean) and setFlattenResults(Boolean) are ignored; query will be run as if setAllowLargeResults(Boolean) is true and setFlattenResults(Boolean) is
   false.

   If set to null or true, legacy SQL dialect is used. This property is
   experimental and might be subject to change.

  use-legacy-sql - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Boolean use-legacy-sql]
    (-> this (.setUseLegacySql use-legacy-sql))))

(defn set-destination-table
  "Sets the table where to put query results. If not provided a new table is created. This value
   is required if setAllowLargeResults(Boolean) is set to true.

  destination-table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.TableId destination-table]
    (-> this (.setDestinationTable destination-table))))

(defn set-dry-run
  "Sets whether the job has to be dry run or not. If set, the job is not executed. A valid query
   will return a mostly empty response with some processing statistics, while an invalid query
   will return the same error it would if it wasn't a dry run.

  dry-run - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Boolean dry-run]
    (-> this (.setDryRun dry-run))))

(defn set-use-query-cache
  "Sets whether to look for the result in the query cache. The query cache is a best-effort
   cache that will be flushed whenever tables in the query are modified. Moreover, the query
   cache is only available when setDestinationTable(TableId) is not set.

  use-query-cache - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Boolean use-query-cache]
    (-> this (.setUseQueryCache use-query-cache))))

(defn set-clustering
  "Sets the clustering specification for the destination table.

  clustering - `com.google.cloud.bigquery.Clustering`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.Clustering clustering]
    (-> this (.setClustering clustering))))

(defn set-positional-parameters
  "Sets the query parameters to a list of positional query parameters to use in the query.

   The set of query parameters must either be all positional or all named parameters.
   Positional parameters are denoted in the query with a question mark (?).

   Additionally, useLegacySql must be set to false; query parameters cannot be used with
   legacy SQL.

   The values parameter can be set to null to clear out the positional parameters so that
   named parameters can be used instead.

  values - `java.lang.Iterable`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Iterable values]
    (-> this (.setPositionalParameters values))))

(defn add-positional-parameter
  "Adds a positional query parameter to the list of query parameters. See setPositionalParameters(Iterable) for more details on the input requirements.

   A positional parameter cannot be added after named parameters have been added.

  value - `com.google.cloud.bigquery.QueryParameterValue`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.QueryParameterValue value]
    (-> this (.addPositionalParameter value))))

(defn set-schema-update-options
  "[Experimental] Sets options allowing the schema of the destination table to be updated as a
   side effect of the query job. Schema update options are supported in two cases: when
   writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination
   table is a partition of a table, specified by partition decorators. For normal tables,
   WRITE_TRUNCATE will always overwrite the schema.

  schema-update-options - `java.util.List`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.util.List schema-update-options]
    (-> this (.setSchemaUpdateOptions schema-update-options))))

(defn set-write-disposition
  "Sets the action that should occur if the destination table already exists.

  write-disposition - `com.google.cloud.bigquery.JobInfo$WriteDisposition`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$WriteDisposition write-disposition]
    (-> this (.setWriteDisposition write-disposition))))

(defn set-allow-large-results
  "Sets whether the job is enabled to create arbitrarily large results. If true the
   query is allowed to create large results at a slight cost in performance. If true
   setDestinationTable(TableId) must be provided.

  allow-large-results - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Boolean allow-large-results]
    (-> this (.setAllowLargeResults allow-large-results))))

(defn set-user-defined-functions
  "Sets user defined function resources that can be used by this query. Function resources can
   either be defined inline (UserDefinedFunction.inline(String)) or loaded from a Google
   Cloud Storage URI (UserDefinedFunction.fromUri(String).

  user-defined-functions - `java.util.List`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.util.List user-defined-functions]
    (-> this (.setUserDefinedFunctions user-defined-functions))))

(defn set-named-parameters
  "Sets the query parameters to a set of named query parameters to use in the query.

   The set of query parameters must either be all positional or all named parameters. Named
   parameters are denoted using an @ prefix, e.g. @myParam for a parameter named \"myParam\".

   Additionally, useLegacySql must be set to false; query parameters cannot be used with
   legacy SQL.

   The values parameter can be set to null to clear out the named parameters so that
   positional parameters can be used instead.

  values - `java.util.Map`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.util.Map values]
    (-> this (.setNamedParameters values))))

(defn set-create-disposition
  "Sets whether the job is allowed to create tables.

  create-disposition - `com.google.cloud.bigquery.JobInfo$CreateDisposition`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$CreateDisposition create-disposition]
    (-> this (.setCreateDisposition create-disposition))))

(defn build
  "Description copied from class: JobConfiguration.Builder

  returns: `com.google.cloud.bigquery.QueryJobConfiguration`"
  (^com.google.cloud.bigquery.QueryJobConfiguration [^QueryJobConfiguration$Builder this]
    (-> this (.build))))

(defn set-priority
  "Sets a priority for the query. If not specified the priority is assumed to be QueryJobConfiguration.Priority.INTERACTIVE.

  priority - `com.google.cloud.bigquery.QueryJobConfiguration$Priority`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.QueryJobConfiguration$Priority priority]
    (-> this (.setPriority priority))))

(defn set-time-partitioning
  "Sets the time partitioning specification for the destination table.

  time-partitioning - `com.google.cloud.bigquery.TimePartitioning`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.TimePartitioning time-partitioning]
    (-> this (.setTimePartitioning time-partitioning))))

(defn set-flatten-results
  "Sets whether nested and repeated fields should be flattened. If set to false setAllowLargeResults(Boolean) must be true. By default results are
   flattened.

  flatten-results - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Boolean flatten-results]
    (-> this (.setFlattenResults flatten-results))))

(defn set-query
  "Sets the BigQuery SQL query to execute.

  query - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.String query]
    (-> this (.setQuery query))))

(defn add-named-parameter
  "Adds a named query parameter to the set of query parameters. See setNamedParameters(Map) for more details on the input requirements.

   A named parameter cannot be added after positional parameters have been added.

  name - `java.lang.String`
  value - `com.google.cloud.bigquery.QueryParameterValue`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.String name ^com.google.cloud.bigquery.QueryParameterValue value]
    (-> this (.addNamedParameter name value))))

(defn set-maximum-bytes-billed
  "Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit
   will fail (without incurring a charge). If unspecified, this will be set to your project
   default.

  maximum-bytes-billed - maximum bytes billed for this job - `java.lang.Long`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Long maximum-bytes-billed]
    (-> this (.setMaximumBytesBilled maximum-bytes-billed))))

(defn add-table-definition
  "Adds a new external table definition. If a definition already exists for tableName it
   is updated.

  table-name - name of the table - `java.lang.String`
  table-definition - external data configuration for the table used by this query - `com.google.cloud.bigquery.ExternalTableDefinition`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.String table-name ^com.google.cloud.bigquery.ExternalTableDefinition table-definition]
    (-> this (.addTableDefinition table-name table-definition))))

(defn set-destination-encryption-configuration
  "encryption-configuration - `com.google.cloud.bigquery.EncryptionConfiguration`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.EncryptionConfiguration encryption-configuration]
    (-> this (.setDestinationEncryptionConfiguration encryption-configuration))))

(defn set-table-definitions
  "Sets the external tables definitions. If querying external data sources outside of BigQuery,
   this value describes the data format, location and other properties of the data sources. By
   defining these properties, the data sources can be queried as if they were standard BigQuery
   tables.

  table-definitions - `java.util.Map`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.util.Map table-definitions]
    (-> this (.setTableDefinitions table-definitions))))

(defn set-default-dataset
  "Sets the default dataset. This dataset is used for all unqualified table names used in the
   query.

  default-dataset - `com.google.cloud.bigquery.DatasetId`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^com.google.cloud.bigquery.DatasetId default-dataset]
    (-> this (.setDefaultDataset default-dataset))))

(defn set-maximum-billing-tier
  "Limits the billing tier for this job. Queries that have resource usage beyond this tier will
   fail (without incurring a charge). If unspecified, this will be set to your project default.

  maximum-billing-tier - maximum billing tier for this job - `java.lang.Integer`

  returns: `com.google.cloud.bigquery.QueryJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Builder [^QueryJobConfiguration$Builder this ^java.lang.Integer maximum-billing-tier]
    (-> this (.setMaximumBillingTier maximum-billing-tier))))

