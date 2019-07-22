(ns com.google.cloud.spanner.PartitionOptions$Builder
  "Builder for PartitionOptions instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner PartitionOptions$Builder]))

(defn set-partition-size-bytes
  "The desired data size for each partition generated. This is only a hint. The actual size of
   each partition may be smaller or larger than this size request.

  partition-size-bytes - configuration for size of the partitions returned - `long`

  returns: `com.google.cloud.spanner.PartitionOptions$Builder`"
  (^com.google.cloud.spanner.PartitionOptions$Builder [^PartitionOptions$Builder this ^Long partition-size-bytes]
    (-> this (.setPartitionSizeBytes partition-size-bytes))))

(defn set-max-partitions
  "max-partitions - `long`

  returns: `com.google.cloud.spanner.PartitionOptions$Builder`"
  (^com.google.cloud.spanner.PartitionOptions$Builder [^PartitionOptions$Builder this ^Long max-partitions]
    (-> this (.setMaxPartitions max-partitions))))

(defn build
  "returns: `com.google.cloud.spanner.PartitionOptions`"
  (^com.google.cloud.spanner.PartitionOptions [^PartitionOptions$Builder this]
    (-> this (.build))))

