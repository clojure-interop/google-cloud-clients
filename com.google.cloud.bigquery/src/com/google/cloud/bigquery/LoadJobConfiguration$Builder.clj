(ns com.google.cloud.bigquery.LoadJobConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery LoadJobConfiguration$Builder]))

(defn set-destination-table
  "Description copied from interface: LoadConfiguration.Builder

  destination-table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.TableId destination-table]
    (-> this (.setDestinationTable destination-table))))

(defn set-clustering
  "Description copied from interface: LoadConfiguration.Builder

  clustering - `com.google.cloud.bigquery.Clustering`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.Clustering clustering]
    (-> this (.setClustering clustering))))

(defn set-source-uris
  "Sets the fully-qualified URIs that point to source data in Google Cloud Storage (e.g.
   gs://bucket/path). Each URI can contain one '*' wildcard character and it must come after the
   'bucket' name.

  source-uris - `java.util.List`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^java.util.List source-uris]
    (-> this (.setSourceUris source-uris))))

(defn set-autodetect
  "Description copied from interface: LoadConfiguration.Builder

  autodetect - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^java.lang.Boolean autodetect]
    (-> this (.setAutodetect autodetect))))

(defn set-schema-update-options
  "Description copied from interface: LoadConfiguration.Builder

  schema-update-options - `java.util.List`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^java.util.List schema-update-options]
    (-> this (.setSchemaUpdateOptions schema-update-options))))

(defn set-null-marker
  "Description copied from interface: LoadConfiguration.Builder

  null-marker - `java.lang.String`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^java.lang.String null-marker]
    (-> this (.setNullMarker null-marker))))

(defn set-write-disposition
  "Description copied from interface: LoadConfiguration.Builder

  write-disposition - `com.google.cloud.bigquery.JobInfo$WriteDisposition`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$WriteDisposition write-disposition]
    (-> this (.setWriteDisposition write-disposition))))

(defn set-ignore-unknown-values
  "Description copied from interface: LoadConfiguration.Builder

  ignore-unknown-values - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^java.lang.Boolean ignore-unknown-values]
    (-> this (.setIgnoreUnknownValues ignore-unknown-values))))

(defn set-create-disposition
  "Description copied from interface: LoadConfiguration.Builder

  create-disposition - `com.google.cloud.bigquery.JobInfo$CreateDisposition`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$CreateDisposition create-disposition]
    (-> this (.setCreateDisposition create-disposition))))

(defn set-max-bad-records
  "Description copied from interface: LoadConfiguration.Builder

  max-bad-records - `java.lang.Integer`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^java.lang.Integer max-bad-records]
    (-> this (.setMaxBadRecords max-bad-records))))

(defn build
  "Description copied from class: JobConfiguration.Builder

  returns: `com.google.cloud.bigquery.LoadJobConfiguration`"
  (^com.google.cloud.bigquery.LoadJobConfiguration [^LoadJobConfiguration$Builder this]
    (-> this (.build))))

(defn set-schema
  "Description copied from interface: LoadConfiguration.Builder

  schema - `com.google.cloud.bigquery.Schema`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.Schema schema]
    (-> this (.setSchema schema))))

(defn set-time-partitioning
  "Description copied from interface: LoadConfiguration.Builder

  time-partitioning - `com.google.cloud.bigquery.TimePartitioning`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.TimePartitioning time-partitioning]
    (-> this (.setTimePartitioning time-partitioning))))

(defn set-use-avro-logical-types
  "Description copied from interface: LoadConfiguration.Builder

  use-avro-logical-types - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^java.lang.Boolean use-avro-logical-types]
    (-> this (.setUseAvroLogicalTypes use-avro-logical-types))))

(defn set-format-options
  "Description copied from interface: LoadConfiguration.Builder

  format-options - `com.google.cloud.bigquery.FormatOptions`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.FormatOptions format-options]
    (-> this (.setFormatOptions format-options))))

(defn set-destination-encryption-configuration
  "encryption-configuration - `com.google.cloud.bigquery.EncryptionConfiguration`

  returns: `com.google.cloud.bigquery.LoadJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.LoadJobConfiguration$Builder [^LoadJobConfiguration$Builder this ^com.google.cloud.bigquery.EncryptionConfiguration encryption-configuration]
    (-> this (.setDestinationEncryptionConfiguration encryption-configuration))))

