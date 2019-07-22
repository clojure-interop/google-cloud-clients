(ns com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption
  "Class for specifying address aggregated list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$AddressAggregatedListOption]))

(defn *filter
  "Returns an option to specify a filter on the addresses being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$AddressFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption [^com.google.cloud.compute.deprecated.Compute$AddressFilter filter]
    (Compute$AddressAggregatedListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of addresses returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption [^Long page-size]
    (Compute$AddressAggregatedListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing addresses.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption [^java.lang.String page-token]
    (Compute$AddressAggregatedListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$AddressAggregatedListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$AddressAggregatedListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$AddressAggregatedListOption this]
    (-> this (.toString))))

