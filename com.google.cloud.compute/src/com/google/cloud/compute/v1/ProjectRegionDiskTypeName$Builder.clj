(ns com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionDiskTypeName$Builder]))

(defn ->builder
  "Constructor.

  project-region-disk-type-name - `com.google.cloud.compute.v1.ProjectRegionDiskTypeName`"
  (^ProjectRegionDiskTypeName$Builder [^com.google.cloud.compute.v1.ProjectRegionDiskTypeName project-region-disk-type-name]
    (new ProjectRegionDiskTypeName$Builder project-region-disk-type-name)))

(defn get-disk-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName$Builder this]
    (-> this (.getDiskType))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName$Builder this]
    (-> this (.getRegion))))

(defn set-disk-type
  "disk-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder [^ProjectRegionDiskTypeName$Builder this ^java.lang.String disk-type]
    (-> this (.setDiskType disk-type))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder [^ProjectRegionDiskTypeName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder [^ProjectRegionDiskTypeName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName [^ProjectRegionDiskTypeName$Builder this]
    (-> this (.build))))

