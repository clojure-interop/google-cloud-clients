(ns com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsSetDefaultNetworkTierRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest`

  returns: `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder [^ProjectsSetDefaultNetworkTierRequest$Builder this ^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest other]
    (-> this (.mergeFrom other))))

(defn get-network-tier
  "Default network tier to be set.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsSetDefaultNetworkTierRequest$Builder this]
    (-> this (.getNetworkTier))))

(defn set-network-tier
  "Default network tier to be set.

  network-tier - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder [^ProjectsSetDefaultNetworkTierRequest$Builder this ^java.lang.String network-tier]
    (-> this (.setNetworkTier network-tier))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest`"
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest [^ProjectsSetDefaultNetworkTierRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder [^ProjectsSetDefaultNetworkTierRequest$Builder this]
    (-> this (.clone))))

