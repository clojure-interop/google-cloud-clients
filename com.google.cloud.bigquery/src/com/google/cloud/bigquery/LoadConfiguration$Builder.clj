(ns com.google.cloud.bigquery.LoadConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery LoadConfiguration$Builder]))

(defn set-destination-table
  "Sets the destination table to load the data into.

  destination-table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.TableId destination-table]
    (-> this (.setDestinationTable destination-table))))

(defn set-clustering
  "Sets the clustering specification for the destination table.

  clustering - `com.google.cloud.bigquery.Clustering`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.Clustering clustering]
    (-> this (.setClustering clustering))))

(defn set-autodetect
  "[Experimental] Sets automatic inference of the options and schema for CSV and JSON sources.

  autodetect - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^java.lang.Boolean autodetect]
    (-> this (.setAutodetect autodetect))))

(defn set-schema-update-options
  "[Experimental] Sets options allowing the schema of the destination table to be updated as a
   side effect of the load job. Schema update options are supported in two cases: when
   writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination
   table is a partition of a table, specified by partition decorators. For normal tables,
   WRITE_TRUNCATE will always overwrite the schema.

  schema-update-options - `java.util.List`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^java.util.List schema-update-options]
    (-> this (.setSchemaUpdateOptions schema-update-options))))

(defn set-null-marker
  "Sets the string that represents a null value in a CSV file. For example, if you specify \"\\N\",
   BigQuery interprets \"\\N\" as a null value when loading a CSV file. The default value is the
   empty string. If you set this property to a custom value, BigQuery throws an error if an
   empty string is present for all data types except for STRING and BYTE. For
   STRING and BYTE columns, BigQuery interprets the empty string as an empty
   value.

  null-marker - `java.lang.String`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^java.lang.String null-marker]
    (-> this (.setNullMarker null-marker))))

(defn set-write-disposition
  "Sets the action that should occur if the destination table already exists.

  write-disposition - `com.google.cloud.bigquery.JobInfo$WriteDisposition`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$WriteDisposition write-disposition]
    (-> this (.setWriteDisposition write-disposition))))

(defn set-ignore-unknown-values
  "Sets whether BigQuery should allow extra values that are not represented in the table schema.
   If true, the extra values are ignored. If false, records with extra columns
   are treated as bad records, and if there are too many bad records, an invalid error is
   returned in the job result. By default unknown values are not allowed.

  ignore-unknown-values - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^java.lang.Boolean ignore-unknown-values]
    (-> this (.setIgnoreUnknownValues ignore-unknown-values))))

(defn set-create-disposition
  "Sets whether the job is allowed to create new tables.

  create-disposition - `com.google.cloud.bigquery.JobInfo$CreateDisposition`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$CreateDisposition create-disposition]
    (-> this (.setCreateDisposition create-disposition))))

(defn set-max-bad-records
  "Sets the maximum number of bad records that BigQuery can ignore when running the job. If the
   number of bad records exceeds this value, an invalid error is returned in the job result. By
   default no bad record is ignored.

  max-bad-records - `java.lang.Integer`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^java.lang.Integer max-bad-records]
    (-> this (.setMaxBadRecords max-bad-records))))

(defn build
  "returns: `com.google.cloud.bigquery.LoadConfiguration`"
  (^com.google.cloud.bigquery.LoadConfiguration [^LoadConfiguration$Builder this]
    (-> this (.build))))

(defn set-schema
  "Sets the schema for the destination table. The schema can be omitted if the destination table
   already exists, or if you're loading data from a Google Cloud Datastore backup (i.e. DATASTORE_BACKUP format option).

  schema - `com.google.cloud.bigquery.Schema`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.Schema schema]
    (-> this (.setSchema schema))))

(defn set-time-partitioning
  "Sets the time partitioning specification for the destination table.

  time-partitioning - `com.google.cloud.bigquery.TimePartitioning`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.TimePartitioning time-partitioning]
    (-> this (.setTimePartitioning time-partitioning))))

(defn set-use-avro-logical-types
  "If FormatOptions is set to AVRO, you can interpret logical types into their corresponding
   types (such as TIMESTAMP) instead of only using their raw types (such as INTEGER). The value
   may be null.

  use-avro-logical-types - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^java.lang.Boolean use-avro-logical-types]
    (-> this (.setUseAvroLogicalTypes use-avro-logical-types))))

(defn set-format-options
  "Sets the source format, and possibly some parsing options, of the external data. Supported
   formats are CSV, NEWLINE_DELIMITED_JSON and DATASTORE_BACKUP. If not
   specified, CSV format is assumed.


   Source Format

  format-options - `com.google.cloud.bigquery.FormatOptions`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.FormatOptions format-options]
    (-> this (.setFormatOptions format-options))))

(defn set-destination-encryption-configuration
  "encryption-configuration - `com.google.cloud.bigquery.EncryptionConfiguration`

  returns: `com.google.cloud.bigquery.LoadConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadConfiguration$Builder [^LoadConfiguration$Builder this ^com.google.cloud.bigquery.EncryptionConfiguration encryption-configuration]
    (-> this (.setDestinationEncryptionConfiguration encryption-configuration))))

