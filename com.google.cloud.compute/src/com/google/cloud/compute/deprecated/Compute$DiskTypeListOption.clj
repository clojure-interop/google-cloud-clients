(ns com.google.cloud.compute.deprecated.Compute$DiskTypeListOption
  "Class for specifying disk type list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskTypeListOption]))

(defn *filter
  "Returns an option to specify a filter on the disk types being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$DiskTypeFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeListOption [^com.google.cloud.compute.deprecated.Compute$DiskTypeFilter filter]
    (Compute$DiskTypeListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of disk types returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeListOption [^Long page-size]
    (Compute$DiskTypeListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing disk types.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeListOption [^java.lang.String page-token]
    (Compute$DiskTypeListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the disk type's fields to be returned by the RPC call. If this
   option is not provided, all disk type's fields are returned. DiskTypeListOption.fields can be used to specify only the fields of interest. DiskType.getDiskTypeId() is always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$DiskTypeField`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeListOption [^com.google.cloud.compute.deprecated.Compute$DiskTypeField fields]
    (Compute$DiskTypeListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$DiskTypeListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$DiskTypeListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskTypeListOption this]
    (-> this (.toString))))

