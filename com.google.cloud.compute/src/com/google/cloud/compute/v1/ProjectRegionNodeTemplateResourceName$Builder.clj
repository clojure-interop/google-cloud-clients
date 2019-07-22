(ns com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionNodeTemplateResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-region-node-template-resource-name - `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName`"
  (^ProjectRegionNodeTemplateResourceName$Builder [^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName project-region-node-template-resource-name]
    (new ProjectRegionNodeTemplateResourceName$Builder project-region-node-template-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName$Builder this]
    (-> this (.getRegion))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder [^ProjectRegionNodeTemplateResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder [^ProjectRegionNodeTemplateResourceName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder [^ProjectRegionNodeTemplateResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName [^ProjectRegionNodeTemplateResourceName$Builder this]
    (-> this (.build))))

