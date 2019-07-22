(ns com.google.cloud.compute.deprecated.Compute$DiskOption
  "Class for specifying disk get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskOption]))

(defn *fields
  "Returns an option to specify the disk's fields to be returned by the RPC call. If this option
   is not provided, all disk's fields are returned. DiskOption.fields can be used to
   specify only the fields of interest. DiskInfo.getDiskId(), DiskConfiguration.getDiskType() and either SnapshotDiskConfiguration.getSourceSnapshot() or ImageDiskConfiguration.getSourceImage() are always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$DiskField`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskOption [^com.google.cloud.compute.deprecated.Compute$DiskField fields]
    (Compute$DiskOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$DiskOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$DiskOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskOption this]
    (-> this (.toString))))

