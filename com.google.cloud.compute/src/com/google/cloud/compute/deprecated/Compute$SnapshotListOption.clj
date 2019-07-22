(ns com.google.cloud.compute.deprecated.Compute$SnapshotListOption
  "Class for specifying snapshot list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SnapshotListOption]))

(defn *filter
  "Returns an option to specify a filter on the snapshots being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$SnapshotFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$SnapshotListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotListOption [^com.google.cloud.compute.deprecated.Compute$SnapshotFilter filter]
    (Compute$SnapshotListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of snapshots returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$SnapshotListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotListOption [^Long page-size]
    (Compute$SnapshotListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing snapshots.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$SnapshotListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotListOption [^java.lang.String page-token]
    (Compute$SnapshotListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the snapshot's fields to be returned by the RPC call. If this
   option is not provided, all the snapshot's fields are returned. SnapshotListOption.fields can be used to specify only the fields of interest. SnapshotInfo.getSnapshotId() is always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$SnapshotField`

  returns: `com.google.cloud.compute.deprecated.Compute$SnapshotListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotListOption [^com.google.cloud.compute.deprecated.Compute$SnapshotField fields]
    (Compute$SnapshotListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$SnapshotListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$SnapshotListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$SnapshotListOption this]
    (-> this (.toString))))

