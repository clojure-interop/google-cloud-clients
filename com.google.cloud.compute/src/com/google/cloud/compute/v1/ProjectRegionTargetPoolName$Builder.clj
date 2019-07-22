(ns com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionTargetPoolName$Builder]))

(defn ->builder
  "Constructor.

  project-region-target-pool-name - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`"
  (^ProjectRegionTargetPoolName$Builder [^com.google.cloud.compute.v1.ProjectRegionTargetPoolName project-region-target-pool-name]
    (new ProjectRegionTargetPoolName$Builder project-region-target-pool-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName$Builder this]
    (-> this (.getRegion))))

(defn get-target-pool
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName$Builder this]
    (-> this (.getTargetPool))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder [^ProjectRegionTargetPoolName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder [^ProjectRegionTargetPoolName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-target-pool
  "target-pool - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder [^ProjectRegionTargetPoolName$Builder this ^java.lang.String target-pool]
    (-> this (.setTargetPool target-pool))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName [^ProjectRegionTargetPoolName$Builder this]
    (-> this (.build))))

