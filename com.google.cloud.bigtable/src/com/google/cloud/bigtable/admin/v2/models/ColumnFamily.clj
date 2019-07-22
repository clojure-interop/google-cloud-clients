(ns com.google.cloud.bigtable.admin.v2.models.ColumnFamily
  "Wrapper for ColumnFamily protocol buffer object"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models ColumnFamily]))

(defn *from-proto
  "id - `java.lang.String`
  proto - `com.google.bigtable.admin.v2.ColumnFamily`

  returns: `com.google.cloud.bigtable.admin.v2.models.ColumnFamily`"
  (^com.google.cloud.bigtable.admin.v2.models.ColumnFamily [^java.lang.String id ^com.google.bigtable.admin.v2.ColumnFamily proto]
    (ColumnFamily/fromProto id proto)))

(defn get-id
  "Gets the column family's id.

  returns: `java.lang.String`"
  (^java.lang.String [^ColumnFamily this]
    (-> this (.getId))))

(defn get-gc-rule
  "Get's the GCRule configured for the column family.

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule [^ColumnFamily this]
    (-> this (.getGCRule))))

(defn has-gc-rule?
  "Returns true if a GCRule has been configured for the family.

  returns: `boolean`"
  (^Boolean [^ColumnFamily this]
    (-> this (.hasGCRule))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ColumnFamily this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ColumnFamily this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ColumnFamily this]
    (-> this (.toString))))

