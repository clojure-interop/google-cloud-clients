(ns com.google.cloud.bigquery.CopyJobConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery CopyJobConfiguration$Builder]))

(defn set-source-tables
  "Sets the source tables to copy.

  source-tables - `java.util.List`

  returns: `com.google.cloud.bigquery.CopyJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.CopyJobConfiguration$Builder [^CopyJobConfiguration$Builder this ^java.util.List source-tables]
    (-> this (.setSourceTables source-tables))))

(defn set-destination-table
  "Sets the destination table of the copy job.

  destination-table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.CopyJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.CopyJobConfiguration$Builder [^CopyJobConfiguration$Builder this ^com.google.cloud.bigquery.TableId destination-table]
    (-> this (.setDestinationTable destination-table))))

(defn set-destination-encryption-configuration
  "encryption-configuration - `com.google.cloud.bigquery.EncryptionConfiguration`

  returns: `com.google.cloud.bigquery.CopyJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.CopyJobConfiguration$Builder [^CopyJobConfiguration$Builder this ^com.google.cloud.bigquery.EncryptionConfiguration encryption-configuration]
    (-> this (.setDestinationEncryptionConfiguration encryption-configuration))))

(defn set-create-disposition
  "Sets whether the job is allowed to create new tables.

  create-disposition - `com.google.cloud.bigquery.JobInfo$CreateDisposition`

  returns: `com.google.cloud.bigquery.CopyJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.CopyJobConfiguration$Builder [^CopyJobConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$CreateDisposition create-disposition]
    (-> this (.setCreateDisposition create-disposition))))

(defn set-write-disposition
  "Sets the action that should occur if the destination table already exists.

  write-disposition - `com.google.cloud.bigquery.JobInfo$WriteDisposition`

  returns: `com.google.cloud.bigquery.CopyJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.CopyJobConfiguration$Builder [^CopyJobConfiguration$Builder this ^com.google.cloud.bigquery.JobInfo$WriteDisposition write-disposition]
    (-> this (.setWriteDisposition write-disposition))))

(defn build
  "Description copied from class: JobConfiguration.Builder

  returns: `com.google.cloud.bigquery.CopyJobConfiguration`"
  (^com.google.cloud.bigquery.CopyJobConfiguration [^CopyJobConfiguration$Builder this]
    (-> this (.build))))

