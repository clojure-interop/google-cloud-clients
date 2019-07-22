(ns com.google.cloud.bigquery.LoadJobConfiguration
  "Google BigQuery load job configuration. A load job loads data from one of several formats into a
  table. Data is provided as URIs that point to objects in Google Cloud Storage. Load job
  configurations have JobConfiguration.Type.LOAD type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery LoadJobConfiguration]))

(defn *new-builder
  "Creates a builder for a BigQuery Load Job configuration given the destination table, format and
   source URIs.

  destination-table - `com.google.cloud.bigquery.TableId`
  source-uris - `java.util.List`
  format - `com.google.cloud.bigquery.FormatOptions`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^com.google.cloud.bigquery.TableId destination-table ^java.util.List source-uris ^com.google.cloud.bigquery.FormatOptions format]
    (LoadJobConfiguration/newBuilder destination-table source-uris format))
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^com.google.cloud.bigquery.TableId destination-table ^java.util.List source-uris]
    (LoadJobConfiguration/newBuilder destination-table source-uris)))

(defn *builder
  "Creates a builder for a BigQuery Load Job configuration given the destination table and source
   URI.

  destination-table - `com.google.cloud.bigquery.TableId`
  source-uri - `java.lang.String`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^com.google.cloud.bigquery.TableId destination-table ^java.lang.String source-uri]
    (LoadJobConfiguration/builder destination-table source-uri)))

(defn *of
  "Returns a BigQuery Load Job Configuration for the given destination table, format and source
   URI.

  destination-table - `com.google.cloud.bigquery.TableId`
  source-uris - `java.util.List`
  format - `com.google.cloud.bigquery.FormatOptions`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration`"
  (^com.google.cloud.bigquery.LoadJobConfiguration [^com.google.cloud.bigquery.TableId destination-table ^java.util.List source-uris ^com.google.cloud.bigquery.FormatOptions format]
    (LoadJobConfiguration/of destination-table source-uris format))
  (^com.google.cloud.bigquery.LoadJobConfiguration [^com.google.cloud.bigquery.TableId destination-table ^java.util.List source-uris]
    (LoadJobConfiguration/of destination-table source-uris)))

(defn get-create-disposition
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.JobInfo$CreateDisposition`"
  (^com.google.cloud.bigquery.JobInfo$CreateDisposition [^LoadJobConfiguration this]
    (-> this (.getCreateDisposition))))

(defn get-write-disposition
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.JobInfo$WriteDisposition`"
  (^com.google.cloud.bigquery.JobInfo$WriteDisposition [^LoadJobConfiguration this]
    (-> this (.getWriteDisposition))))

(defn get-schema-update-options
  "Description copied from interface: LoadConfiguration

  returns: `java.util.List<com.google.cloud.bigquery.JobInfo$SchemaUpdateOption>`"
  (^java.util.List [^LoadJobConfiguration this]
    (-> this (.getSchemaUpdateOptions))))

(defn get-csv-options
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.CsvOptions`"
  (^com.google.cloud.bigquery.CsvOptions [^LoadJobConfiguration this]
    (-> this (.getCsvOptions))))

(defn get-null-marker
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.String`"
  (^java.lang.String [^LoadJobConfiguration this]
    (-> this (.getNullMarker))))

(defn get-use-avro-logical-types?
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LoadJobConfiguration this]
    (-> this (.getUseAvroLogicalTypes))))

(defn get-max-bad-records
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^LoadJobConfiguration this]
    (-> this (.getMaxBadRecords))))

(defn get-format
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.String`"
  (^java.lang.String [^LoadJobConfiguration this]
    (-> this (.getFormat))))

(defn get-schema
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.Schema`"
  (^com.google.cloud.bigquery.Schema [^LoadJobConfiguration this]
    (-> this (.getSchema))))

(defn get-destination-table
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^LoadJobConfiguration this]
    (-> this (.getDestinationTable))))

(defn ignore-unknown-values
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LoadJobConfiguration this]
    (-> this (.ignoreUnknownValues))))

(defn get-time-partitioning
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.TimePartitioning`"
  (^com.google.cloud.bigquery.TimePartitioning [^LoadJobConfiguration this]
    (-> this (.getTimePartitioning))))

(defn get-source-uris
  "Returns the fully-qualified URIs that point to source data in Google Cloud Storage (e.g.
   gs://bucket/path). Each URI can contain one '*' wildcard character and it must come after the
   'bucket' name.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LoadJobConfiguration this]
    (-> this (.getSourceUris))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LoadJobConfiguration this]
    (-> this (.hashCode))))

(defn get-autodetect?
  "Description copied from interface: LoadConfiguration

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LoadJobConfiguration this]
    (-> this (.getAutodetect))))

(defn get-datastore-backup-options
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.DatastoreBackupOptions`"
  (^com.google.cloud.bigquery.DatastoreBackupOptions [^LoadJobConfiguration this]
    (-> this (.getDatastoreBackupOptions))))

(defn get-clustering
  "Description copied from interface: LoadConfiguration

  returns: `com.google.cloud.bigquery.Clustering`"
  (^com.google.cloud.bigquery.Clustering [^LoadJobConfiguration this]
    (-> this (.getClustering))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LoadJobConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-destination-encryption-configuration
  "returns: `com.google.cloud.bigquery.EncryptionConfiguration`"
  (^com.google.cloud.bigquery.EncryptionConfiguration [^LoadJobConfiguration this]
    (-> this (.getDestinationEncryptionConfiguration))))

(defn to-builder
  "Description copied from class: JobConfiguration

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration this]
    (-> this (.toBuilder))))

