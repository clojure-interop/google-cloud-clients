(ns com.google.cloud.compute.v1.UsableSubnetwork$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UsableSubnetwork$Builder]))

(defn get-subnetwork
  "Subnetwork URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetwork$Builder this]
    (-> this (.getSubnetwork))))

(defn get-secondary-ip-ranges-list
  "Secondary IP ranges.

  returns: `java.util.List<com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange>`"
  (^java.util.List [^UsableSubnetwork$Builder this]
    (-> this (.getSecondaryIpRangesList))))

(defn set-network
  "Network URL.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn get-ip-cidr-range
  "The range of internal addresses that are owned by this subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetwork$Builder this]
    (-> this (.getIpCidrRange))))

(defn build
  "returns: `com.google.cloud.compute.v1.UsableSubnetwork`"
  (^com.google.cloud.compute.v1.UsableSubnetwork [^UsableSubnetwork$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UsableSubnetwork`

  returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork$Builder this ^com.google.cloud.compute.v1.UsableSubnetwork other]
    (-> this (.mergeFrom other))))

(defn add-secondary-ip-ranges
  "Secondary IP ranges.

  secondary-ip-ranges - `com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange`

  returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork$Builder this ^com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange secondary-ip-ranges]
    (-> this (.addSecondaryIpRanges secondary-ip-ranges))))

(defn set-ip-cidr-range
  "The range of internal addresses that are owned by this subnetwork.

  ip-cidr-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork$Builder this ^java.lang.String ip-cidr-range]
    (-> this (.setIpCidrRange ip-cidr-range))))

(defn get-network
  "Network URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetwork$Builder this]
    (-> this (.getNetwork))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork$Builder this]
    (-> this (.clone))))

(defn add-all-secondary-ip-ranges
  "Secondary IP ranges.

  secondary-ip-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork$Builder this ^java.util.List secondary-ip-ranges]
    (-> this (.addAllSecondaryIpRanges secondary-ip-ranges))))

(defn set-subnetwork
  "Subnetwork URL.

  subnetwork - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsableSubnetwork$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetwork$Builder [^UsableSubnetwork$Builder this ^java.lang.String subnetwork]
    (-> this (.setSubnetwork subnetwork))))

