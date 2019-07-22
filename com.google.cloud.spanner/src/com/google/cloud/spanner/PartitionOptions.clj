(ns com.google.cloud.spanner.PartitionOptions
  "Defines the configuration for the number and size of partitions returned from BatchReadOnlyTransaction.partitionRead(com.google.cloud.spanner.PartitionOptions, java.lang.String, com.google.cloud.spanner.KeySet, java.lang.Iterable<java.lang.String>, com.google.cloud.spanner.Options.ReadOption...), BatchReadOnlyTransaction.partitionReadUsingIndex(com.google.cloud.spanner.PartitionOptions, java.lang.String, java.lang.String, com.google.cloud.spanner.KeySet, java.lang.Iterable<java.lang.String>, com.google.cloud.spanner.Options.ReadOption...)
  and BatchReadOnlyTransaction.partitionQuery(com.google.cloud.spanner.PartitionOptions, com.google.cloud.spanner.Statement, com.google.cloud.spanner.Options.QueryOption...)

  Note: these options may not be honored based on the other parameters in the request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner PartitionOptions]))

(defn *get-default-instance
  "returns: `com.google.cloud.spanner.PartitionOptions`"
  (^com.google.cloud.spanner.PartitionOptions []
    (PartitionOptions/getDefaultInstance )))

(defn *new-builder
  "returns: `com.google.cloud.spanner.PartitionOptions$Builder`"
  (^com.google.cloud.spanner.PartitionOptions$Builder []
    (PartitionOptions/newBuilder )))

(defn get-partition-size-bytes
  "Returns the size of the partition in bytes.

  returns: `long`"
  (^Long [^PartitionOptions this]
    (-> this (.getPartitionSizeBytes))))

(defn get-max-partitions
  "Returns the maximum number of partitions to be created.

  returns: `long`"
  (^Long [^PartitionOptions this]
    (-> this (.getMaxPartitions))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PartitionOptions this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PartitionOptions this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PartitionOptions this]
    (-> this (.hashCode))))

