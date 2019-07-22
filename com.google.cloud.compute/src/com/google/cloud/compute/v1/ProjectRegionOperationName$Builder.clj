(ns com.google.cloud.compute.v1.ProjectRegionOperationName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionOperationName$Builder]))

(defn ->builder
  "Constructor.

  project-region-operation-name - `com.google.cloud.compute.v1.ProjectRegionOperationName`"
  (^ProjectRegionOperationName$Builder [^com.google.cloud.compute.v1.ProjectRegionOperationName project-region-operation-name]
    (new ProjectRegionOperationName$Builder project-region-operation-name)))

(defn get-operation
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName$Builder this]
    (-> this (.getOperation))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName$Builder this]
    (-> this (.getRegion))))

(defn set-operation
  "operation - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName$Builder [^ProjectRegionOperationName$Builder this ^java.lang.String operation]
    (-> this (.setOperation operation))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName$Builder [^ProjectRegionOperationName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName$Builder [^ProjectRegionOperationName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionOperationName`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName [^ProjectRegionOperationName$Builder this]
    (-> this (.build))))

