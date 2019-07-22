(ns com.google.cloud.compute.deprecated.SubnetworkId
  "Identity for a Google Compute Engine subnetwork."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SubnetworkId]))

(defn *of
  "Returns a subnetwork identity given project, region and subnetwork names. The subnetwork name
   must be 1-63 characters long and comply with RFC1035. Specifically, the name must match the
   regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  region - `java.lang.String`
  subnetwork - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SubnetworkId`"
  (^com.google.cloud.compute.deprecated.SubnetworkId [^java.lang.String project ^java.lang.String region ^java.lang.String subnetwork]
    (SubnetworkId/of project region subnetwork))
  (^com.google.cloud.compute.deprecated.SubnetworkId [^com.google.cloud.compute.deprecated.RegionId region-id ^java.lang.String subnetwork]
    (SubnetworkId/of region-id subnetwork)))

(defn get-region
  "Returns the name of the region this subnetwork belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkId this]
    (-> this (.getRegion))))

(defn get-region-id
  "Returns the identity of the region this subnetwork belongs to.

  returns: `com.google.cloud.compute.deprecated.RegionId`"
  (^com.google.cloud.compute.deprecated.RegionId [^SubnetworkId this]
    (-> this (.getRegionId))))

(defn get-subnetwork
  "Returns the name of the subnetwork. The name must be 1-63 characters long and comply with
   RFC1035. Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a lowercase letter, and all
   following characters must be a dash, lowercase letter, or digit, except the last character,
   which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkId this]
    (-> this (.getSubnetwork))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworkId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworkId this ^java.lang.Object obj]
    (-> this (.equals obj))))

