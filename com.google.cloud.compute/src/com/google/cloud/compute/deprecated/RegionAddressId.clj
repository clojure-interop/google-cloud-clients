(ns com.google.cloud.compute.deprecated.RegionAddressId
  "Identity for a Google Compute Engine region address."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated RegionAddressId]))

(defn *of
  "Returns a region address identity given project, region and address names. The address name
   must be 1-63 characters long and comply with RFC1035. Specifically, the name must match the
   regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  region - `java.lang.String`
  address - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.RegionAddressId`"
  (^com.google.cloud.compute.deprecated.RegionAddressId [^java.lang.String project ^java.lang.String region ^java.lang.String address]
    (RegionAddressId/of project region address))
  (^com.google.cloud.compute.deprecated.RegionAddressId [^com.google.cloud.compute.deprecated.RegionId region-id ^java.lang.String address]
    (RegionAddressId/of region-id address)))

(defn get-type
  "Description copied from class: AddressId

  returns: `com.google.cloud.compute.deprecated.AddressId.Type`"
  (^com.google.cloud.compute.deprecated.AddressId.Type [^RegionAddressId this]
    (-> this (.getType))))

(defn get-region
  "Returns the name of the region this address belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionAddressId this]
    (-> this (.getRegion))))

(defn get-region-id
  "Returns the identity of the region this address belongs to.

  returns: `com.google.cloud.compute.deprecated.RegionId`"
  (^com.google.cloud.compute.deprecated.RegionId [^RegionAddressId this]
    (-> this (.getRegionId))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^RegionAddressId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionAddressId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionAddressId this ^java.lang.Object obj]
    (-> this (.equals obj))))

