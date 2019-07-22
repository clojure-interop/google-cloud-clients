(ns com.google.cloud.compute.deprecated.Compute$SubnetworkListOption
  "Class for specifying subnetwork list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SubnetworkListOption]))

(defn *filter
  "Returns an option to specify a filter on the subnetworks being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$SubnetworkFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkListOption [^com.google.cloud.compute.deprecated.Compute$SubnetworkFilter filter]
    (Compute$SubnetworkListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of subnetworks returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkListOption [^Long page-size]
    (Compute$SubnetworkListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing subnetworks.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkListOption [^java.lang.String page-token]
    (Compute$SubnetworkListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the subnetwork's fields to be returned by the RPC call. If this
   option is not provided, all subnetwork's fields are returned. SubnetworListkOption.fields can be used to specify only the fields of interest. SubnetworkInfo.getSubnetworkId() is always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$SubnetworkField`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkListOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkListOption [^com.google.cloud.compute.deprecated.Compute$SubnetworkField fields]
    (Compute$SubnetworkListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$SubnetworkListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$SubnetworkListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$SubnetworkListOption this]
    (-> this (.toString))))

