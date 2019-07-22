(ns com.google.cloud.bigquery.TableInfo$Builder
  "A builder for TableInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableInfo$Builder]))

(defn ->builder
  "Constructor."
  (^TableInfo$Builder []
    (new TableInfo$Builder )))

(defn set-description
  "Sets a user-friendly description for the table.

  description - `java.lang.String`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-expiration-time
  "Sets the time when this table expires, in milliseconds since the epoch. If not present, the
   table will persist indefinitely. Expired tables will be deleted and their storage reclaimed.

  expiration-time - `java.lang.Long`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo$Builder this ^java.lang.Long expiration-time]
    (-> this (.setExpirationTime expiration-time))))

(defn set-friendly-name
  "Sets a user-friendly name for the table.

  friendly-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo$Builder this ^java.lang.String friendly-name]
    (-> this (.setFriendlyName friendly-name))))

(defn set-table-id
  "Sets the table identity.

  table-id - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo$Builder this ^com.google.cloud.bigquery.TableId table-id]
    (-> this (.setTableId table-id))))

(defn set-definition
  "Sets the table definition. Use StandardTableDefinition to create simple BigQuery
   table. Use ViewDefinition to create a BigQuery view. Use ExternalTableDefinition to create a BigQuery a table backed by external data.

  definition - `com.google.cloud.bigquery.TableDefinition`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo$Builder this ^com.google.cloud.bigquery.TableDefinition definition]
    (-> this (.setDefinition definition))))

(defn set-labels
  "Sets the labels applied to this table.

   Unstable, because labels are experimental.

   When used with BigQuery.update(TableInfo, TableOption...), setting labels
   to null removes all labels; otherwise all keys that are mapped to null values
   are removed and other keys are updated to their respective values.

  labels - `java.util.Map`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn build
  "Creates a TableInfo object.

  returns: `com.google.cloud.bigquery.TableInfo`"
  (^com.google.cloud.bigquery.TableInfo [^TableInfo$Builder this]
    (-> this (.build))))

(defn set-encryption-configuration
  "configuration - `com.google.cloud.bigquery.EncryptionConfiguration`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo$Builder this ^com.google.cloud.bigquery.EncryptionConfiguration configuration]
    (-> this (.setEncryptionConfiguration configuration))))

