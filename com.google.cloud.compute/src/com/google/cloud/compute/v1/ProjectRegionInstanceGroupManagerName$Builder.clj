(ns com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionInstanceGroupManagerName$Builder]))

(defn ->builder
  "Constructor.

  project-region-instance-group-manager-name - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`"
  (^ProjectRegionInstanceGroupManagerName$Builder [^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName project-region-instance-group-manager-name]
    (new ProjectRegionInstanceGroupManagerName$Builder project-region-instance-group-manager-name)))

(defn get-instance-group-manager
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName$Builder this]
    (-> this (.getInstanceGroupManager))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName$Builder this]
    (-> this (.getRegion))))

(defn set-instance-group-manager
  "instance-group-manager - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder [^ProjectRegionInstanceGroupManagerName$Builder this ^java.lang.String instance-group-manager]
    (-> this (.setInstanceGroupManager instance-group-manager))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder [^ProjectRegionInstanceGroupManagerName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder [^ProjectRegionInstanceGroupManagerName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName [^ProjectRegionInstanceGroupManagerName$Builder this]
    (-> this (.build))))

