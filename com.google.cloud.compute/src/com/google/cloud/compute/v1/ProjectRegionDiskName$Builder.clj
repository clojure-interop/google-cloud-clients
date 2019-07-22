(ns com.google.cloud.compute.v1.ProjectRegionDiskName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionDiskName$Builder]))

(defn ->builder
  "Constructor.

  project-region-disk-name - `com.google.cloud.compute.v1.ProjectRegionDiskName`"
  (^ProjectRegionDiskName$Builder [^com.google.cloud.compute.v1.ProjectRegionDiskName project-region-disk-name]
    (new ProjectRegionDiskName$Builder project-region-disk-name)))

(defn get-disk
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName$Builder this]
    (-> this (.getDisk))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName$Builder this]
    (-> this (.getRegion))))

(defn set-disk
  "disk - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName$Builder [^ProjectRegionDiskName$Builder this ^java.lang.String disk]
    (-> this (.setDisk disk))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName$Builder [^ProjectRegionDiskName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName$Builder [^ProjectRegionDiskName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName [^ProjectRegionDiskName$Builder this]
    (-> this (.build))))

