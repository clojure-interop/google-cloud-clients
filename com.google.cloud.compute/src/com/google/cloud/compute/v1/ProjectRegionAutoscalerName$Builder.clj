(ns com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionAutoscalerName$Builder]))

(defn ->builder
  "Constructor.

  project-region-autoscaler-name - `com.google.cloud.compute.v1.ProjectRegionAutoscalerName`"
  (^ProjectRegionAutoscalerName$Builder [^com.google.cloud.compute.v1.ProjectRegionAutoscalerName project-region-autoscaler-name]
    (new ProjectRegionAutoscalerName$Builder project-region-autoscaler-name)))

(defn get-autoscaler
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName$Builder this]
    (-> this (.getAutoscaler))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName$Builder this]
    (-> this (.getRegion))))

(defn set-autoscaler
  "autoscaler - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder [^ProjectRegionAutoscalerName$Builder this ^java.lang.String autoscaler]
    (-> this (.setAutoscaler autoscaler))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder [^ProjectRegionAutoscalerName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder [^ProjectRegionAutoscalerName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName [^ProjectRegionAutoscalerName$Builder this]
    (-> this (.build))))

