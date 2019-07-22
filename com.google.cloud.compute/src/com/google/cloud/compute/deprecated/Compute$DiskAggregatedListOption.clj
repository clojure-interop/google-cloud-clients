(ns com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption
  "Class for specifying disk aggregated list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskAggregatedListOption]))

(defn *filter
  "Returns an option to specify a filter on the disks being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$DiskFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption [^com.google.cloud.compute.deprecated.Compute$DiskFilter filter]
    (Compute$DiskAggregatedListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of disks returned per page. pageSize
   must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption [^Long page-size]
    (Compute$DiskAggregatedListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing disks.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption [^java.lang.String page-token]
    (Compute$DiskAggregatedListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$DiskAggregatedListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$DiskAggregatedListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskAggregatedListOption this]
    (-> this (.toString))))

