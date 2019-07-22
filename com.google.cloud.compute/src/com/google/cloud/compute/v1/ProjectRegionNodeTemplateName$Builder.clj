(ns com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionNodeTemplateName$Builder]))

(defn ->builder
  "Constructor.

  project-region-node-template-name - `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName`"
  (^ProjectRegionNodeTemplateName$Builder [^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName project-region-node-template-name]
    (new ProjectRegionNodeTemplateName$Builder project-region-node-template-name)))

(defn get-node-template
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName$Builder this]
    (-> this (.getNodeTemplate))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName$Builder this]
    (-> this (.getRegion))))

(defn set-node-template
  "node-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder [^ProjectRegionNodeTemplateName$Builder this ^java.lang.String node-template]
    (-> this (.setNodeTemplate node-template))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder [^ProjectRegionNodeTemplateName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder [^ProjectRegionNodeTemplateName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName [^ProjectRegionNodeTemplateName$Builder this]
    (-> this (.build))))

