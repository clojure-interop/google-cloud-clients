(ns com.google.cloud.compute.v1.ProjectRegionName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionName$Builder]))

(defn ->builder
  "Constructor.

  project-region-name - `com.google.cloud.compute.v1.ProjectRegionName`"
  (^ProjectRegionName$Builder [^com.google.cloud.compute.v1.ProjectRegionName project-region-name]
    (new ProjectRegionName$Builder project-region-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionName$Builder this]
    (-> this (.getRegion))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionName$Builder [^ProjectRegionName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionName$Builder [^ProjectRegionName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionName`"
  (^com.google.cloud.compute.v1.ProjectRegionName [^ProjectRegionName$Builder this]
    (-> this (.build))))

