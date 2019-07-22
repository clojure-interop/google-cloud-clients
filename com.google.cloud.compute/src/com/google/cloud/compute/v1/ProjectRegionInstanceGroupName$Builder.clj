(ns com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionInstanceGroupName$Builder]))

(defn ->builder
  "Constructor.

  project-region-instance-group-name - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName`"
  (^ProjectRegionInstanceGroupName$Builder [^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName project-region-instance-group-name]
    (new ProjectRegionInstanceGroupName$Builder project-region-instance-group-name)))

(defn get-instance-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName$Builder this]
    (-> this (.getInstanceGroup))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName$Builder this]
    (-> this (.getRegion))))

(defn set-instance-group
  "instance-group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder [^ProjectRegionInstanceGroupName$Builder this ^java.lang.String instance-group]
    (-> this (.setInstanceGroup instance-group))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder [^ProjectRegionInstanceGroupName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder [^ProjectRegionInstanceGroupName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName [^ProjectRegionInstanceGroupName$Builder this]
    (-> this (.build))))

