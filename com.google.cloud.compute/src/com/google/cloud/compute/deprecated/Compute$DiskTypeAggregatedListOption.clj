(ns com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption
  "Class for specifying disk type aggregated list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskTypeAggregatedListOption]))

(defn *filter
  "Returns an option to specify a filter on the disk types being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$DiskTypeFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption [^com.google.cloud.compute.deprecated.Compute$DiskTypeFilter filter]
    (Compute$DiskTypeAggregatedListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of disk types returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption [^Long page-size]
    (Compute$DiskTypeAggregatedListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing disk types.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption [^java.lang.String page-token]
    (Compute$DiskTypeAggregatedListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$DiskTypeAggregatedListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$DiskTypeAggregatedListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskTypeAggregatedListOption this]
    (-> this (.toString))))

