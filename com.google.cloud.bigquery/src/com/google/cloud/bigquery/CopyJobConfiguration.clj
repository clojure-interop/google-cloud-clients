(ns com.google.cloud.bigquery.CopyJobConfiguration
  "Google BigQuery copy job configuration. A copy job copies an existing table to another new or
  existing table. Copy job configurations have JobConfiguration.Type.COPY type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery CopyJobConfiguration]))

(defn *new-builder
  "Creates a builder for a BigQuery Copy Job configuration given destination and source table.

  destination-table - `com.google.cloud.bigquery.TableId`
  source-table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.CopyJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.CopyJobConfiguration$Builder [^com.google.cloud.bigquery.TableId destination-table ^com.google.cloud.bigquery.TableId source-table]
    (CopyJobConfiguration/newBuilder destination-table source-table)))

(defn *of
  "Returns a BigQuery Copy Job configuration for the given destination and source table.

  destination-table - `com.google.cloud.bigquery.TableId`
  source-table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.CopyJobConfiguration`"
  (^com.google.cloud.bigquery.CopyJobConfiguration [^com.google.cloud.bigquery.TableId destination-table ^com.google.cloud.bigquery.TableId source-table]
    (CopyJobConfiguration/of destination-table source-table)))

(defn get-source-tables
  "Returns the source tables to copy.

  returns: `java.util.List<com.google.cloud.bigquery.TableId>`"
  (^java.util.List [^CopyJobConfiguration this]
    (-> this (.getSourceTables))))

(defn get-destination-table
  "Returns the destination table to load the data into.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^CopyJobConfiguration this]
    (-> this (.getDestinationTable))))

(defn get-destination-encryption-configuration
  "returns: `com.google.cloud.bigquery.EncryptionConfiguration`"
  (^com.google.cloud.bigquery.EncryptionConfiguration [^CopyJobConfiguration this]
    (-> this (.getDestinationEncryptionConfiguration))))

(defn get-create-disposition
  "Returns whether the job is allowed to create new tables.

  returns: `com.google.cloud.bigquery.JobInfo$CreateDisposition`"
  (^com.google.cloud.bigquery.JobInfo$CreateDisposition [^CopyJobConfiguration this]
    (-> this (.getCreateDisposition))))

(defn get-write-disposition
  "Returns the action that should occur if the destination table already exists.

  returns: `com.google.cloud.bigquery.JobInfo$WriteDisposition`"
  (^com.google.cloud.bigquery.JobInfo$WriteDisposition [^CopyJobConfiguration this]
    (-> this (.getWriteDisposition))))

(defn to-builder
  "Description copied from class: JobConfiguration

  returns: `com.google.cloud.bigquery.CopyJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.CopyJobConfiguration$Builder [^CopyJobConfiguration this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CopyJobConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CopyJobConfiguration this]
    (-> this (.hashCode))))

