(ns com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionSubnetworkResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-region-subnetwork-resource-name - `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName`"
  (^ProjectRegionSubnetworkResourceName$Builder [^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName project-region-subnetwork-resource-name]
    (new ProjectRegionSubnetworkResourceName$Builder project-region-subnetwork-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName$Builder this]
    (-> this (.getRegion))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder [^ProjectRegionSubnetworkResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder [^ProjectRegionSubnetworkResourceName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder [^ProjectRegionSubnetworkResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName [^ProjectRegionSubnetworkResourceName$Builder this]
    (-> this (.build))))

