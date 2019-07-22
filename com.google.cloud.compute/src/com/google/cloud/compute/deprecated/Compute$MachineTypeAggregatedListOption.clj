(ns com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption
  "Class for specifying machine type aggregated list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$MachineTypeAggregatedListOption]))

(defn *filter
  "Returns an option to specify a filter on the machine types being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$MachineTypeFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption [^com.google.cloud.compute.deprecated.Compute$MachineTypeFilter filter]
    (Compute$MachineTypeAggregatedListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of machine types returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption [^Long page-size]
    (Compute$MachineTypeAggregatedListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing machine types.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption [^java.lang.String page-token]
    (Compute$MachineTypeAggregatedListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$MachineTypeAggregatedListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$MachineTypeAggregatedListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$MachineTypeAggregatedListOption this]
    (-> this (.toString))))

