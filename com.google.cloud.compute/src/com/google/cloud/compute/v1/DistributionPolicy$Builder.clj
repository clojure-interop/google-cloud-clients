(ns com.google.cloud.compute.v1.DistributionPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DistributionPolicy$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DistributionPolicy`

  returns: `com.google.cloud.compute.v1.DistributionPolicy$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicy$Builder [^DistributionPolicy$Builder this ^com.google.cloud.compute.v1.DistributionPolicy other]
    (-> this (.mergeFrom other))))

(defn get-zones-list
  "Zones where the regional managed instance group will create and manage instances.

  returns: `java.util.List<com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration>`"
  (^java.util.List [^DistributionPolicy$Builder this]
    (-> this (.getZonesList))))

(defn add-all-zones
  "Zones where the regional managed instance group will create and manage instances.

  zones - `java.util.List`

  returns: `com.google.cloud.compute.v1.DistributionPolicy$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicy$Builder [^DistributionPolicy$Builder this ^java.util.List zones]
    (-> this (.addAllZones zones))))

(defn add-zones
  "Zones where the regional managed instance group will create and manage instances.

  zones - `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration`

  returns: `com.google.cloud.compute.v1.DistributionPolicy$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicy$Builder [^DistributionPolicy$Builder this ^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration zones]
    (-> this (.addZones zones))))

(defn build
  "returns: `com.google.cloud.compute.v1.DistributionPolicy`"
  (^com.google.cloud.compute.v1.DistributionPolicy [^DistributionPolicy$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DistributionPolicy$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicy$Builder [^DistributionPolicy$Builder this]
    (-> this (.clone))))

