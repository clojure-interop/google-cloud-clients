(ns com.google.cloud.bigtable.admin.v2.models.Table
  "Wrapper for Table protocol buffer object"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models Table]))

(defn *from-proto
  "proto - `com.google.bigtable.admin.v2.Table`

  returns: `com.google.cloud.bigtable.admin.v2.models.Table`"
  (^com.google.cloud.bigtable.admin.v2.models.Table [^com.google.bigtable.admin.v2.Table proto]
    (Table/fromProto proto)))

(defn get-id
  "Gets the table's id.

  returns: `java.lang.String`"
  (^java.lang.String [^Table this]
    (-> this (.getId))))

(defn get-instance-id
  "Gets the id of the instance that owns this Table.

  returns: `java.lang.String`"
  (^java.lang.String [^Table this]
    (-> this (.getInstanceId))))

(defn get-replication-states-by-cluster-id
  "returns: `java.util.Map<java.lang.String,com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState>`"
  (^java.util.Map [^Table this]
    (-> this (.getReplicationStatesByClusterId))))

(defn get-column-families
  "returns: `java.util.List<com.google.cloud.bigtable.admin.v2.models.ColumnFamily>`"
  (^java.util.List [^Table this]
    (-> this (.getColumnFamilies))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Table this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Table this]
    (-> this (.hashCode))))

