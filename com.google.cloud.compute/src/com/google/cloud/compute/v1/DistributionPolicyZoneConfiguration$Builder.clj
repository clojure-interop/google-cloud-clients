(ns com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DistributionPolicyZoneConfiguration$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration`

  returns: `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder [^DistributionPolicyZoneConfiguration$Builder this ^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration other]
    (-> this (.mergeFrom other))))

(defn get-zone
  "The URL of the zone. The zone must exist in the region where the managed instance group is
   located.

  returns: `java.lang.String`"
  (^java.lang.String [^DistributionPolicyZoneConfiguration$Builder this]
    (-> this (.getZone))))

(defn set-zone
  "The URL of the zone. The zone must exist in the region where the managed instance group is
   located.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder [^DistributionPolicyZoneConfiguration$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration`"
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration [^DistributionPolicyZoneConfiguration$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder [^DistributionPolicyZoneConfiguration$Builder this]
    (-> this (.clone))))

