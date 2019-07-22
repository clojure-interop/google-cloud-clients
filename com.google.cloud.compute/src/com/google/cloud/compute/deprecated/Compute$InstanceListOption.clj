(ns com.google.cloud.compute.deprecated.Compute$InstanceListOption
  "Class for specifying instance list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$InstanceListOption]))

(defn *filter
  "Returns an option to specify a filter on the instances being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$InstanceFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceListOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceListOption [^com.google.cloud.compute.deprecated.Compute$InstanceFilter filter]
    (Compute$InstanceListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of instances returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceListOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceListOption [^Long page-size]
    (Compute$InstanceListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing instances.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceListOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceListOption [^java.lang.String page-token]
    (Compute$InstanceListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the instance's fields to be returned by the RPC call. If this
   option is not provided, all instance's fields are returned. InstanceListOption.fields
   can be used to specify only the fields of interest. InstanceInfo.getInstanceId() is
   always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$InstanceField`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceListOption`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceListOption [^com.google.cloud.compute.deprecated.Compute$InstanceField fields]
    (Compute$InstanceListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$InstanceListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$InstanceListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$InstanceListOption this]
    (-> this (.toString))))

