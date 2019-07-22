(ns com.google.cloud.bigquery.LoadConfiguration
  "Common interface for a load configuration. A load configuration (WriteChannelConfiguration) can be used to load data into a table with a WriteChannel (BigQuery.writer(WriteChannelConfiguration)). A load
  configuration (LoadJobConfiguration) can also be used to create a load job (JobInfo.of(JobConfiguration))."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery LoadConfiguration]))

(defn get-create-disposition
  "Returns whether the job is allowed to create new tables.

  returns: `com.google.cloud.bigquery.JobInfo$CreateDisposition`"
  (^com.google.cloud.bigquery.JobInfo$CreateDisposition [^LoadConfiguration this]
    (-> this (.getCreateDisposition))))

(defn get-write-disposition
  "Returns the action that should occur if the destination table already exists.

  returns: `com.google.cloud.bigquery.JobInfo$WriteDisposition`"
  (^com.google.cloud.bigquery.JobInfo$WriteDisposition [^LoadConfiguration this]
    (-> this (.getWriteDisposition))))

(defn get-schema-update-options
  "[Experimental] Returns options allowing the schema of the destination table to be updated as a
   side effect of the load job. Schema update options are supported in two cases: when
   writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination
   table is a partition of a table, specified by partition decorators. For normal tables,
   WRITE_TRUNCATE will always overwrite the schema.

  returns: `java.util.List<com.google.cloud.bigquery.JobInfo$SchemaUpdateOption>`"
  (^java.util.List [^LoadConfiguration this]
    (-> this (.getSchemaUpdateOptions))))

(defn get-csv-options
  "Returns additional properties used to parse CSV data (used when getFormat() is set to
   CSV). Returns null if not set.

  returns: `com.google.cloud.bigquery.CsvOptions`"
  (^com.google.cloud.bigquery.CsvOptions [^LoadConfiguration this]
    (-> this (.getCsvOptions))))

(defn get-null-marker
  "Returns the string that represents a null value in a CSV file.

  returns: `java.lang.String`"
  (^java.lang.String [^LoadConfiguration this]
    (-> this (.getNullMarker))))

(defn get-use-avro-logical-types?
  "Returns True/False. Indicates whether the logical type is interpreted.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LoadConfiguration this]
    (-> this (.getUseAvroLogicalTypes))))

(defn get-max-bad-records
  "Returns the maximum number of bad records that BigQuery can ignore when running the job. If the
   number of bad records exceeds this value, an invalid error is returned in the job result. By
   default no bad record is ignored.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^LoadConfiguration this]
    (-> this (.getMaxBadRecords))))

(defn get-format
  "Returns the format of the data files.

  returns: `java.lang.String`"
  (^java.lang.String [^LoadConfiguration this]
    (-> this (.getFormat))))

(defn get-schema
  "Returns the schema for the destination table, if set. Returns null otherwise.

  returns: `com.google.cloud.bigquery.Schema`"
  (^com.google.cloud.bigquery.Schema [^LoadConfiguration this]
    (-> this (.getSchema))))

(defn get-destination-table
  "Returns the destination table to load the data into.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^LoadConfiguration this]
    (-> this (.getDestinationTable))))

(defn ignore-unknown-values
  "Returns whether BigQuery should allow extra values that are not represented in the table
   schema. If true, the extra values are ignored. If true, records with extra
   columns are treated as bad records, and if there are too many bad records, an invalid error is
   returned in the job result. By default unknown values are not allowed.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LoadConfiguration this]
    (-> this (.ignoreUnknownValues))))

(defn get-time-partitioning
  "Returns the time partitioning specification defined for the destination table.

  returns: `com.google.cloud.bigquery.TimePartitioning`"
  (^com.google.cloud.bigquery.TimePartitioning [^LoadConfiguration this]
    (-> this (.getTimePartitioning))))

(defn get-autodetect?
  "[Experimental] Returns whether automatic inference of the options and schema for CSV and JSON
   sources is set.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LoadConfiguration this]
    (-> this (.getAutodetect))))

(defn get-datastore-backup-options
  "Returns additional options used to load from a Cloud datastore backup.

  returns: `com.google.cloud.bigquery.DatastoreBackupOptions`"
  (^com.google.cloud.bigquery.DatastoreBackupOptions [^LoadConfiguration this]
    (-> this (.getDatastoreBackupOptions))))

(defn get-clustering
  "Returns the clustering specification for the definition table.

  returns: `com.google.cloud.bigquery.Clustering`"
  (^com.google.cloud.bigquery.Clustering [^LoadConfiguration this]
    (-> this (.getClustering))))

(defn get-destination-encryption-configuration
  "returns: `com.google.cloud.bigquery.EncryptionConfiguration`"
  (^com.google.cloud.bigquery.EncryptionConfiguration [^LoadConfiguration this]
    (-> this (.getDestinationEncryptionConfiguration))))

(defn to-builder
  "Returns a builder for the load configuration object.

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration this]
    (-> this (.toBuilder))))

