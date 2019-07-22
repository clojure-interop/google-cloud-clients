(ns com.google.cloud.compute.deprecated.Compute$AddressOption
  "Class for specifying address get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$AddressOption]))

(defn *fields
  "Returns an option to specify the address' fields to be returned by the RPC call. If this
   option is not provided, all address' fields are returned. AddressOption.fields can be
   used to specify only the fields of interest. AddressInfo.getAddressId() is always
   returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$AddressField`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressOption [^com.google.cloud.compute.deprecated.Compute$AddressField fields]
    (Compute$AddressOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$AddressOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$AddressOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$AddressOption this]
    (-> this (.toString))))

