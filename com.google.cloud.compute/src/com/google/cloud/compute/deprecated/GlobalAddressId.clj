(ns com.google.cloud.compute.deprecated.GlobalAddressId
  "Identity for a Google Compute Engine global address."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated GlobalAddressId]))

(defn *of
  "Returns an address identity given project and address names. The address name must be 1-63
   characters long and comply with RFC1035. Specifically, the name must match the regular
   expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  address - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.GlobalAddressId`"
  (^com.google.cloud.compute.deprecated.GlobalAddressId [^java.lang.String project ^java.lang.String address]
    (GlobalAddressId/of project address))
  (^com.google.cloud.compute.deprecated.GlobalAddressId [^java.lang.String address]
    (GlobalAddressId/of address)))

(defn get-type
  "Description copied from class: AddressId

  returns: `com.google.cloud.compute.deprecated.AddressId.Type`"
  (^com.google.cloud.compute.deprecated.AddressId.Type [^GlobalAddressId this]
    (-> this (.getType))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^GlobalAddressId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GlobalAddressId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GlobalAddressId this ^java.lang.Object obj]
    (-> this (.equals obj))))

