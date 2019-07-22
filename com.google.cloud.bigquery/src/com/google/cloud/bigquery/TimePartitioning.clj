(ns com.google.cloud.bigquery.TimePartitioning
  "Objects of this class allow to configure table partitioning based on time. By dividing a large
  table into smaller partitions, you can improve query performance and reduce the number of bytes
  billed by restricting the amount of data scanned."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TimePartitioning]))

(defn *new-builder
  "Returns a TimePartitioning object given the time partitioning type. Currently, the only
   type supported is TimePartitioning.Type.DAY, which will generate one partition per day based on data
   loading time.

  type - `com.google.cloud.bigquery.TimePartitioning$Type`

  returns: `com.google.cloud.bigquery.TimePartitioning$Builder`"
  (^com.google.cloud.bigquery.TimePartitioning$Builder [^com.google.cloud.bigquery.TimePartitioning$Type type]
    (TimePartitioning/newBuilder type)))

(defn *of
  "Returns a TimePartitioning object given the time partitioning type and the partition's
   expiration in milliseconds.

  type - the time partitioning type. Currently, the only type supported is TimePartitioning.Type.DAY, which will generate one partition per day based on data loading time. - `com.google.cloud.bigquery.TimePartitioning$Type`
  expiration-ms - the number of milliseconds for which to keep the storage for a partition - `long`

  returns: `com.google.cloud.bigquery.TimePartitioning`"
  (^com.google.cloud.bigquery.TimePartitioning [^com.google.cloud.bigquery.TimePartitioning$Type type ^Long expiration-ms]
    (TimePartitioning/of type expiration-ms))
  (^com.google.cloud.bigquery.TimePartitioning [^com.google.cloud.bigquery.TimePartitioning$Type type]
    (TimePartitioning/of type)))

(defn get-type
  "Returns the time partitioning type. Currently, the only type supported is TimePartitioning.Type.DAY,
   which will generate one partition per day based on data loading time.

  returns: `com.google.cloud.bigquery.TimePartitioning$Type`"
  (^com.google.cloud.bigquery.TimePartitioning$Type [^TimePartitioning this]
    (-> this (.getType))))

(defn get-expiration-ms
  "Returns the number of milliseconds for which to keep the storage for a partition. When expired,
   the storage for the partition is reclaimed. If null, the partion does not expire.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TimePartitioning this]
    (-> this (.getExpirationMs))))

(defn get-field
  "If not set, the table is partitioned by pseudo column '_PARTITIONTIME'; if set, the table is
   partitioned by this field.

  returns: `java.lang.String`"
  (^java.lang.String [^TimePartitioning this]
    (-> this (.getField))))

(defn get-require-partition-filter?
  "If set to true, queries over this table require a partition filter (that can be used for
   partition elimination) to be specified.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^TimePartitioning this]
    (-> this (.getRequirePartitionFilter))))

(defn to-builder
  "returns: `com.google.cloud.bigquery.TimePartitioning$Builder`"
  (^com.google.cloud.bigquery.TimePartitioning$Builder [^TimePartitioning this]
    (-> this (.toBuilder))))

