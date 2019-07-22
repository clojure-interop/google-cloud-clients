(ns com.google.cloud.bigquery.Table$Builder
  "A builder for Table objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Table$Builder]))

(defn set-description
  "Description copied from class: TableInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.bigquery.Table$Builder`"
  (^com.google.cloud.bigquery.Table$Builder [^Table$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-expiration-time
  "Description copied from class: TableInfo.Builder

  expiration-time - `java.lang.Long`

  returns: `com.google.cloud.bigquery.Table$Builder`"
  (^com.google.cloud.bigquery.Table$Builder [^Table$Builder this ^java.lang.Long expiration-time]
    (-> this (.setExpirationTime expiration-time))))

(defn set-friendly-name
  "Description copied from class: TableInfo.Builder

  friendly-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.Table$Builder`"
  (^com.google.cloud.bigquery.Table$Builder [^Table$Builder this ^java.lang.String friendly-name]
    (-> this (.setFriendlyName friendly-name))))

(defn set-table-id
  "Description copied from class: TableInfo.Builder

  table-id - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.Table$Builder`"
  (^com.google.cloud.bigquery.Table$Builder [^Table$Builder this ^com.google.cloud.bigquery.TableId table-id]
    (-> this (.setTableId table-id))))

(defn set-definition
  "Description copied from class: TableInfo.Builder

  definition - `com.google.cloud.bigquery.TableDefinition`

  returns: `com.google.cloud.bigquery.Table$Builder`"
  (^com.google.cloud.bigquery.Table$Builder [^Table$Builder this ^com.google.cloud.bigquery.TableDefinition definition]
    (-> this (.setDefinition definition))))

(defn set-encryption-configuration
  "configuration - `com.google.cloud.bigquery.EncryptionConfiguration`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^Table$Builder this ^com.google.cloud.bigquery.EncryptionConfiguration configuration]
    (-> this (.setEncryptionConfiguration configuration))))

(defn set-labels
  "Description copied from class: TableInfo.Builder

  labels - `java.util.Map`

  returns: `com.google.cloud.bigquery.Table$Builder`"
  (^com.google.cloud.bigquery.Table$Builder [^Table$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn build
  "Description copied from class: TableInfo.Builder

  returns: `com.google.cloud.bigquery.Table`"
  (^com.google.cloud.bigquery.Table [^Table$Builder this]
    (-> this (.build))))

