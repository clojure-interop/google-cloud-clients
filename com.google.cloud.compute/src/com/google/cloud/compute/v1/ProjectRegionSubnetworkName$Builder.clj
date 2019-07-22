(ns com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionSubnetworkName$Builder]))

(defn ->builder
  "Constructor.

  project-region-subnetwork-name - `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`"
  (^ProjectRegionSubnetworkName$Builder [^com.google.cloud.compute.v1.ProjectRegionSubnetworkName project-region-subnetwork-name]
    (new ProjectRegionSubnetworkName$Builder project-region-subnetwork-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName$Builder this]
    (-> this (.getRegion))))

(defn get-subnetwork
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName$Builder this]
    (-> this (.getSubnetwork))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder [^ProjectRegionSubnetworkName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder [^ProjectRegionSubnetworkName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-subnetwork
  "subnetwork - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder [^ProjectRegionSubnetworkName$Builder this ^java.lang.String subnetwork]
    (-> this (.setSubnetwork subnetwork))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName [^ProjectRegionSubnetworkName$Builder this]
    (-> this (.build))))

