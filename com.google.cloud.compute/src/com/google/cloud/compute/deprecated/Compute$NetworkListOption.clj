(ns com.google.cloud.compute.deprecated.Compute$NetworkListOption
  "Class for specifying network list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$NetworkListOption]))

(defn *filter
  "Returns an option to specify a filter on the networks being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$NetworkFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$NetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$NetworkListOption [^com.google.cloud.compute.deprecated.Compute$NetworkFilter filter]
    (Compute$NetworkListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of networks returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$NetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$NetworkListOption [^Long page-size]
    (Compute$NetworkListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing networks.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$NetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$NetworkListOption [^java.lang.String page-token]
    (Compute$NetworkListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the network's fields to be returned by the RPC call. If this
   option is not provided, all network's fields are returned. NetworkListOption.fields
   can be used to specify only the fields of interest. NetworkInfo.getNetworkId() and NetworkInfo.getConfiguration() are always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$NetworkField`

  returns: `com.google.cloud.compute.deprecated.Compute$NetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$NetworkListOption [^com.google.cloud.compute.deprecated.Compute$NetworkField fields]
    (Compute$NetworkListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$NetworkListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$NetworkListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$NetworkListOption this]
    (-> this (.toString))))

