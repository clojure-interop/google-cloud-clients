(ns com.google.cloud.compute.deprecated.Compute$DiskListOption
  "Class for specifying disk list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskListOption]))

(defn *filter
  "Returns an option to specify a filter on the disks being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$DiskFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskListOption [^com.google.cloud.compute.deprecated.Compute$DiskFilter filter]
    (Compute$DiskListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of disks returned per page. pageSize
   must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskListOption [^Long page-size]
    (Compute$DiskListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing disks.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskListOption [^java.lang.String page-token]
    (Compute$DiskListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the disk's fields to be returned by the RPC call. If this option
   is not provided, all disk's fields are returned. DiskListOption.fields can be used to
   specify only the fields of interest. DiskInfo.getDiskId(), DiskConfiguration.getDiskType() and either SnapshotDiskConfiguration.getSourceSnapshot() or ImageDiskConfiguration.getSourceImage() are always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$DiskField`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskListOption [^com.google.cloud.compute.deprecated.Compute$DiskField fields]
    (Compute$DiskListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$DiskListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$DiskListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskListOption this]
    (-> this (.toString))))

