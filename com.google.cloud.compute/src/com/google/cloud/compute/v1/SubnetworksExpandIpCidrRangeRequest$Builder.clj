(ns com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworksExpandIpCidrRangeRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest`

  returns: `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder [^SubnetworksExpandIpCidrRangeRequest$Builder this ^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest other]
    (-> this (.mergeFrom other))))

(defn get-ip-cidr-range
  "The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork.
   This range should be disjoint from other subnetworks within this network. This range can only
   be larger than (i.e. a superset of) the range previously defined before the update.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworksExpandIpCidrRangeRequest$Builder this]
    (-> this (.getIpCidrRange))))

(defn set-ip-cidr-range
  "The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork.
   This range should be disjoint from other subnetworks within this network. This range can only
   be larger than (i.e. a superset of) the range previously defined before the update.

  ip-cidr-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder [^SubnetworksExpandIpCidrRangeRequest$Builder this ^java.lang.String ip-cidr-range]
    (-> this (.setIpCidrRange ip-cidr-range))))

(defn build
  "returns: `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest`"
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest [^SubnetworksExpandIpCidrRangeRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest$Builder [^SubnetworksExpandIpCidrRangeRequest$Builder this]
    (-> this (.clone))))

