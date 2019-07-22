(ns com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption
  "Class for specifying instance aggregated list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$InstanceAggregatedListOption]))

(defn *filter
  "Returns an option to specify a filter on the instances being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$InstanceFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption [^com.google.cloud.compute.deprecated.Compute$InstanceFilter filter]
    (Compute$InstanceAggregatedListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of instances returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption [^Long page-size]
    (Compute$InstanceAggregatedListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing instances.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption [^java.lang.String page-token]
    (Compute$InstanceAggregatedListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$InstanceAggregatedListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$InstanceAggregatedListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$InstanceAggregatedListOption this]
    (-> this (.toString))))

