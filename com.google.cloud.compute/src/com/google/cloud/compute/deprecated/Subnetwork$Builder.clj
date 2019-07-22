(ns com.google.cloud.compute.deprecated.Subnetwork$Builder
  "A builder for Subnetwork objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Subnetwork$Builder]))

(defn set-subnetwork-id
  "Description copied from class: SubnetworkInfo.Builder

  subnetwork-id - `com.google.cloud.compute.deprecated.SubnetworkId`

  returns: `com.google.cloud.compute.deprecated.Subnetwork$Builder`"
  (^com.google.cloud.compute.deprecated.Subnetwork$Builder [^Subnetwork$Builder this ^com.google.cloud.compute.deprecated.SubnetworkId subnetwork-id]
    (-> this (.setSubnetworkId subnetwork-id))))

(defn set-description
  "Description copied from class: SubnetworkInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Subnetwork$Builder`"
  (^com.google.cloud.compute.deprecated.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-network
  "Description copied from class: SubnetworkInfo.Builder

  network - `com.google.cloud.compute.deprecated.NetworkId`

  returns: `com.google.cloud.compute.deprecated.Subnetwork$Builder`"
  (^com.google.cloud.compute.deprecated.Subnetwork$Builder [^Subnetwork$Builder this ^com.google.cloud.compute.deprecated.NetworkId network]
    (-> this (.setNetwork network))))

(defn set-ip-range
  "Description copied from class: SubnetworkInfo.Builder

  ip-range - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Subnetwork$Builder`"
  (^com.google.cloud.compute.deprecated.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String ip-range]
    (-> this (.setIpRange ip-range))))

(defn build
  "Description copied from class: SubnetworkInfo.Builder

  returns: `com.google.cloud.compute.deprecated.Subnetwork`"
  (^com.google.cloud.compute.deprecated.Subnetwork [^Subnetwork$Builder this]
    (-> this (.build))))

