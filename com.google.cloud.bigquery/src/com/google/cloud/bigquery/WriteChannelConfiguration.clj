(ns com.google.cloud.bigquery.WriteChannelConfiguration
  "Google BigQuery Configuration for a load operation. A load configuration can be used to load data
  into a table with a WriteChannel (BigQuery.writer(WriteChannelConfiguration))."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery WriteChannelConfiguration]))

(defn *new-builder
  "Creates a builder for a BigQuery Load Configuration given the destination table and format.

  destination-table - `com.google.cloud.bigquery.TableId`
  format - `com.google.cloud.bigquery.FormatOptions`

  returns: `com.google.cloud.bigquery.WriteChannelConfiguration$Builder`"
  (^com.google.cloud.bigquery.WriteChannelConfiguration$Builder [^com.google.cloud.bigquery.TableId destination-table ^com.google.cloud.bigquery.FormatOptions format]
    (WriteChannelConfiguration/newBuilder destination-table format))
  (^com.google.cloud.bigquery.WriteChannelConfiguration$Builder [^com.google.cloud.bigquery.TableId destination-table]
    (WriteChannelConfiguration/newBuilder destination-table)))

(defn *of
  "Returns a BigQuery Load Configuration for the given destination table and format.

  destination-table - `com.google.cloud.bigquery.TableId`
  format - `com.google.cloud.bigquery.FormatOptions`

  returns: `com.google.cloud.bigquery.WriteChannelConfiguration`"
  (^com.google.cloud.bigquery.WriteChannelConfiguration [^com.google.cloud.bigquery.TableId destination-table ^com.google.cloud.bigquery.FormatOptions format]
    (WriteChannelConfiguration/of destination-table format))
  (^com.google.cloud.bigquery.WriteChannelConfiguration [^com.google.cloud.bigquery.TableId destination-table]
    (WriteChannelConfiguration/of destination-table)))

(defn get-create-disposition
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.JobInfo$CreateDisposition`"
  (^com.google.cloud.bigquery.JobInfo$CreateDisposition [^WriteChannelConfiguration this]
    (-> this (.getCreateDisposition))))

(defn get-write-disposition
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.JobInfo$WriteDisposition`"
  (^com.google.cloud.bigquery.JobInfo$WriteDisposition [^WriteChannelConfiguration this]
    (-> this (.getWriteDisposition))))

(defn get-schema-update-options
  "Description copied from interface: LoadConfiguration

  returns: `java.util.List<com.google.cloud.bigquery.JobInfo$SchemaUpdateOption>`"
  (^java.util.List [^WriteChannelConfiguration this]
    (-> this (.getSchemaUpdateOptions))))

(defn get-csv-options
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.CsvOptions`"
  (^com.google.cloud.bigquery.CsvOptions [^WriteChannelConfiguration this]
    (-> this (.getCsvOptions))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^WriteChannelConfiguration this]
    (-> this (.toString))))

(defn get-null-marker
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.String`"
  (^java.lang.String [^WriteChannelConfiguration this]
    (-> this (.getNullMarker))))

(defn get-use-avro-logical-types?
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^WriteChannelConfiguration this]
    (-> this (.getUseAvroLogicalTypes))))

(defn get-max-bad-records
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^WriteChannelConfiguration this]
    (-> this (.getMaxBadRecords))))

(defn get-format
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.String`"
  (^java.lang.String [^WriteChannelConfiguration this]
    (-> this (.getFormat))))

(defn get-schema
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.Schema`"
  (^com.google.cloud.bigquery.Schema [^WriteChannelConfiguration this]
    (-> this (.getSchema))))

(defn get-destination-table
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^WriteChannelConfiguration this]
    (-> this (.getDestinationTable))))

(defn ignore-unknown-values
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^WriteChannelConfiguration this]
    (-> this (.ignoreUnknownValues))))

(defn get-time-partitioning
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.TimePartitioning`"
  (^com.google.cloud.bigquery.TimePartitioning [^WriteChannelConfiguration this]
    (-> this (.getTimePartitioning))))

(defn hash-code
  "returns: `int`"
  (^Integer [^WriteChannelConfiguration this]
    (-> this (.hashCode))))

(defn get-autodetect?
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^WriteChannelConfiguration this]
    (-> this (.getAutodetect))))

(defn get-datastore-backup-options
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.DatastoreBackupOptions`"
  (^com.google.cloud.bigquery.DatastoreBackupOptions [^WriteChannelConfiguration this]
    (-> this (.getDatastoreBackupOptions))))

(defn get-clustering
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.Clustering`"
  (^com.google.cloud.bigquery.Clustering [^WriteChannelConfiguration this]
    (-> this (.getClustering))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^WriteChannelConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-destination-encryption-configuration
  "returns: `com.google.cloud.bigquery.EncryptionConfiguration`"
  (^com.google.cloud.bigquery.EncryptionConfiguration [^WriteChannelConfiguration this]
    (-> this (.getDestinationEncryptionConfiguration))))

(defn to-builder
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.WriteChannelConfiguration$Builder`"
  (^com.google.cloud.bigquery.WriteChannelConfiguration$Builder [^WriteChannelConfiguration this]
    (-> this (.toBuilder))))

