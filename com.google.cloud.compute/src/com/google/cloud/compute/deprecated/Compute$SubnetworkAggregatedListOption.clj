(ns com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption
  "Class for specifying subnetwork aggregated list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SubnetworkAggregatedListOption]))

(defn *filter
  "Returns an option to specify a filter on the subnetworks being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$SubnetworkFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption [^com.google.cloud.compute.deprecated.Compute$SubnetworkFilter filter]
    (Compute$SubnetworkAggregatedListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of subnetworks returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption [^Long page-size]
    (Compute$SubnetworkAggregatedListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing subnetworks.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption [^java.lang.String page-token]
    (Compute$SubnetworkAggregatedListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$SubnetworkAggregatedListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$SubnetworkAggregatedListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$SubnetworkAggregatedListOption this]
    (-> this (.toString))))

