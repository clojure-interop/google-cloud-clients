(ns com.google.cloud.compute.deprecated.Compute$AddressListOption
  "Class for specifying address list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$AddressListOption]))

(defn *filter
  "Returns an option to specify a filter on the addresses being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$AddressFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressListOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressListOption [^com.google.cloud.compute.deprecated.Compute$AddressFilter filter]
    (Compute$AddressListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of addresses returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressListOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressListOption [^Long page-size]
    (Compute$AddressListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing addresses.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressListOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressListOption [^java.lang.String page-token]
    (Compute$AddressListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the address' fields to be returned by the RPC call. If this
   option is not provided, all address' fields are returned. AddressListOption.fields
   can be used to specify only the fields of interest. AddressInfo.getAddressId() is always
   returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$AddressField`

  returns: `com.google.cloud.compute.deprecated.Compute$AddressListOption`"
  (^com.google.cloud.compute.deprecated.Compute$AddressListOption [^com.google.cloud.compute.deprecated.Compute$AddressField fields]
    (Compute$AddressListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$AddressListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$AddressListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$AddressListOption this]
    (-> this (.toString))))

