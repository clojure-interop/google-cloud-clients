(ns com.google.cloud.bigtable.admin.v2.models.CreateTableRequest
  "Fluent wrapper for CreateTableRequest

  Allows for creating table with:


    optional columnFamilies, including optional GCRules.GCRule
    optional granularity
    and optional split points"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models CreateTableRequest]))

(defn *of
  "table-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateTableRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateTableRequest [^java.lang.String table-id]
    (CreateTableRequest/of table-id)))

(defn add-family
  "Adds a new columnFamily with GCRules.GCRule to the configuration. Please note that calling this
   method with the same familyId will overwrite the previous family.

  family-id - `java.lang.String`
  gc-rule - `com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateTableRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateTableRequest [^CreateTableRequest this ^java.lang.String family-id ^com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule gc-rule]
    (-> this (.addFamily family-id gc-rule)))
  (^com.google.cloud.bigtable.admin.v2.models.CreateTableRequest [^CreateTableRequest this ^java.lang.String family-id]
    (-> this (.addFamily family-id))))

(defn add-split
  "Adds split at the specified key to the configuration

  key - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateTableRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateTableRequest [^CreateTableRequest this ^com.google.protobuf.ByteString key]
    (-> this (.addSplit key))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CreateTableRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CreateTableRequest this]
    (-> this (.hashCode))))

(defn to-proto
  "project-id - `java.lang.String`
  instance-id - `java.lang.String`

  returns: `com.google.bigtable.admin.v2.CreateTableRequest`"
  (^com.google.bigtable.admin.v2.CreateTableRequest [^CreateTableRequest this ^java.lang.String project-id ^java.lang.String instance-id]
    (-> this (.toProto project-id instance-id))))

