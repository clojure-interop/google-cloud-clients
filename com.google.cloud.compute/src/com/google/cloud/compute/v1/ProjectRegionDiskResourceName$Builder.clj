(ns com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionDiskResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-region-disk-resource-name - `com.google.cloud.compute.v1.ProjectRegionDiskResourceName`"
  (^ProjectRegionDiskResourceName$Builder [^com.google.cloud.compute.v1.ProjectRegionDiskResourceName project-region-disk-resource-name]
    (new ProjectRegionDiskResourceName$Builder project-region-disk-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName$Builder this]
    (-> this (.getRegion))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder [^ProjectRegionDiskResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder [^ProjectRegionDiskResourceName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder [^ProjectRegionDiskResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName [^ProjectRegionDiskResourceName$Builder this]
    (-> this (.build))))

