(ns com.google.cloud.compute.deprecated.Compute$SnapshotOption
  "Class for specifying snapshot get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SnapshotOption]))

(defn *fields
  "Returns an option to specify the snapshot's fields to be returned by the RPC call. If this
   option is not provided, all the snapshot's fields are returned. SnapshotOption.fields
   can be used to specify only the fields of interest. SnapshotInfo.getSnapshotId() is
   always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$SnapshotField`

  returns: `com.google.cloud.compute.deprecated.Compute$SnapshotOption`"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotOption [^com.google.cloud.compute.deprecated.Compute$SnapshotField fields]
    (Compute$SnapshotOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$SnapshotOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$SnapshotOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$SnapshotOption this]
    (-> this (.toString))))

