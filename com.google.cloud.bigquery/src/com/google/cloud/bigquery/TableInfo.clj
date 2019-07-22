(ns com.google.cloud.bigquery.TableInfo
  "Google BigQuery table information. Use StandardTableDefinition to create simple BigQuery
  table. Use ViewDefinition to create a BigQuery view. Use ExternalTableDefinition
  to create a BigQuery a table backed by external data."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableInfo]))

(defn *new-builder
  "Returns a builder for a TableInfo object given table identity and definition. Use
   StandardTableDefinition to create simple BigQuery table. Use ViewDefinition to
   create a BigQuery view. Use ExternalTableDefinition to create a BigQuery a table backed
   by external data.

  table-id - `com.google.cloud.bigquery.TableId`
  definition - `com.google.cloud.bigquery.TableDefinition`

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^com.google.cloud.bigquery.TableId table-id ^com.google.cloud.bigquery.TableDefinition definition]
    (TableInfo/newBuilder table-id definition)))

(defn *of
  "Returns a TableInfo object given table identity and definition. Use StandardTableDefinition to create simple BigQuery table. Use ViewDefinition to create
   a BigQuery view. Use ExternalTableDefinition to create a BigQuery a table backed by
   external data.

  table-id - `com.google.cloud.bigquery.TableId`
  definition - `com.google.cloud.bigquery.TableDefinition`

  returns: `com.google.cloud.bigquery.TableInfo`"
  (^com.google.cloud.bigquery.TableInfo [^com.google.cloud.bigquery.TableId table-id ^com.google.cloud.bigquery.TableDefinition definition]
    (TableInfo/of table-id definition)))

(defn get-encryption-configuration
  "returns: `com.google.cloud.bigquery.EncryptionConfiguration`"
  (^com.google.cloud.bigquery.EncryptionConfiguration [^TableInfo this]
    (-> this (.getEncryptionConfiguration))))

(defn get-friendly-name
  "Returns a user-friendly name for the table.

  returns: `java.lang.String`"
  (^java.lang.String [^TableInfo this]
    (-> this (.getFriendlyName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TableInfo this]
    (-> this (.toString))))

(defn get-table-id
  "Returns the table identity.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^TableInfo this]
    (-> this (.getTableId))))

(defn get-num-rows
  "Returns the number of rows of data in this table

  returns: `java.math.BigInteger`"
  (^java.math.BigInteger [^TableInfo this]
    (-> this (.getNumRows))))

(defn get-num-long-term-bytes
  "Returns the number of bytes considered \"long-term storage\" for reduced billing purposes.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TableInfo this]
    (-> this (.getNumLongTermBytes))))

(defn get-etag
  "Returns the hash of the table resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TableInfo this]
    (-> this (.getEtag))))

(defn get-definition
  "Returns the table definition.

  returns: `<T extends com.google.cloud.bigquery.TableDefinition> T`"
  ([^TableInfo this]
    (-> this (.getDefinition))))

(defn get-description
  "Returns a user-friendly description for the table.

  returns: `java.lang.String`"
  (^java.lang.String [^TableInfo this]
    (-> this (.getDescription))))

(defn get-labels
  "Return a map for labels applied to the table.

   Unstable, because labels are experimental.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^TableInfo this]
    (-> this (.getLabels))))

(defn get-num-bytes
  "Returns the size of this table in bytes

  returns: `java.lang.Long`"
  (^java.lang.Long [^TableInfo this]
    (-> this (.getNumBytes))))

(defn get-self-link
  "Returns an URL that can be used to access the resource again. The returned URL can be used for
   get or update requests.

  returns: `java.lang.String`"
  (^java.lang.String [^TableInfo this]
    (-> this (.getSelfLink))))

(defn get-last-modified-time
  "Returns the time when this table was last modified, in milliseconds since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TableInfo this]
    (-> this (.getLastModifiedTime))))

(defn get-expiration-time
  "Returns the time when this table expires, in milliseconds since the epoch. If not present, the
   table will persist indefinitely. Expired tables will be deleted and their storage reclaimed.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TableInfo this]
    (-> this (.getExpirationTime))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TableInfo this]
    (-> this (.hashCode))))

(defn get-generated-id
  "Returns the service-generated id for the table.

  returns: `java.lang.String`"
  (^java.lang.String [^TableInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TableInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-creation-time
  "Returns the time when this table was created, in milliseconds since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TableInfo this]
    (-> this (.getCreationTime))))

(defn to-builder
  "Returns a builder for the table object.

  returns: `com.google.cloud.bigquery.TableInfo$Builder`"
  (^com.google.cloud.bigquery.TableInfo$Builder [^TableInfo this]
    (-> this (.toBuilder))))

