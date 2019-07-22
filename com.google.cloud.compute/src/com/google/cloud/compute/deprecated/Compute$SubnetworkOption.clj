(ns com.google.cloud.compute.deprecated.Compute$SubnetworkOption
  "Class for specifying subnetwork get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SubnetworkOption]))

(defn *fields
  "Returns an option to specify the subnetwork's fields to be returned by the RPC call. If this
   option is not provided, all subnetwork's fields are returned. SubnetworkOption.fields
   can be used to specify only the fields of interest. SubnetworkInfo.getSubnetworkId() is
   always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$SubnetworkField`

  returns: `com.google.cloud.compute.deprecated.Compute$SubnetworkOption`"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkOption [^com.google.cloud.compute.deprecated.Compute$SubnetworkField fields]
    (Compute$SubnetworkOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$SubnetworkOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$SubnetworkOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$SubnetworkOption this]
    (-> this (.toString))))

