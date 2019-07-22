(ns com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworkSecondaryRange$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SubnetworkSecondaryRange`

  returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder [^SubnetworkSecondaryRange$Builder this ^com.google.cloud.compute.v1.SubnetworkSecondaryRange other]
    (-> this (.mergeFrom other))))

(defn get-ip-cidr-range
  "The range of IP addresses belonging to this subnetwork secondary range. Provide this property
   when you create the subnetwork. Ranges must be unique and non-overlapping with all primary
   and secondary IP ranges within a network. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkSecondaryRange$Builder this]
    (-> this (.getIpCidrRange))))

(defn set-ip-cidr-range
  "The range of IP addresses belonging to this subnetwork secondary range. Provide this property
   when you create the subnetwork. Ranges must be unique and non-overlapping with all primary
   and secondary IP ranges within a network. Only IPv4 is supported.

  ip-cidr-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder [^SubnetworkSecondaryRange$Builder this ^java.lang.String ip-cidr-range]
    (-> this (.setIpCidrRange ip-cidr-range))))

(defn get-range-name
  "The name associated with this subnetwork secondary range, used when adding an alias IP range
   to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name
   must be unique within the subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^SubnetworkSecondaryRange$Builder this]
    (-> this (.getRangeName))))

(defn set-range-name
  "The name associated with this subnetwork secondary range, used when adding an alias IP range
   to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name
   must be unique within the subnetwork.

  range-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder [^SubnetworkSecondaryRange$Builder this ^java.lang.String range-name]
    (-> this (.setRangeName range-name))))

(defn build
  "returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange [^SubnetworkSecondaryRange$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder`"
  (^com.google.cloud.compute.v1.SubnetworkSecondaryRange$Builder [^SubnetworkSecondaryRange$Builder this]
    (-> this (.clone))))

