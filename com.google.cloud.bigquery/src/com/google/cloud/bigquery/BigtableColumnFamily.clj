(ns com.google.cloud.bigquery.BigtableColumnFamily
  "List of column families to expose in the table schema along with their types. This list restricts
  the column families that can be referenced in queries and specifies their value types.

  You can use this list to do type conversions - see the 'type' field for more details. If you
  leave this list empty, all column families are present in the table schema and their values are
  read as BYTES. During a query only the column families referenced in that query are read from
  Bigtable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigtableColumnFamily]))

(defn ->bigtable-column-family
  "Constructor."
  (^BigtableColumnFamily []
    (new BigtableColumnFamily )))

(defn get-family-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableColumnFamily this]
    (-> this (.getFamilyID))))

(defn get-columns
  "returns: `java.util.List<com.google.cloud.bigquery.BigtableColumn>`"
  (^java.util.List [^BigtableColumnFamily this]
    (-> this (.getColumns))))

(defn get-encoding
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableColumnFamily this]
    (-> this (.getEncoding))))

(defn get-only-read-latest?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BigtableColumnFamily this]
    (-> this (.getOnlyReadLatest))))

(defn get-type
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableColumnFamily this]
    (-> this (.getType))))

