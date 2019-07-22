(ns com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneAutoscalerName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-autoscaler-name - `com.google.cloud.compute.v1.ProjectZoneAutoscalerName`"
  (^ProjectZoneAutoscalerName$Builder [^com.google.cloud.compute.v1.ProjectZoneAutoscalerName project-zone-autoscaler-name]
    (new ProjectZoneAutoscalerName$Builder project-zone-autoscaler-name)))

(defn get-autoscaler
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName$Builder this]
    (-> this (.getAutoscaler))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName$Builder this]
    (-> this (.getZone))))

(defn set-autoscaler
  "autoscaler - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder [^ProjectZoneAutoscalerName$Builder this ^java.lang.String autoscaler]
    (-> this (.setAutoscaler autoscaler))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder [^ProjectZoneAutoscalerName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder [^ProjectZoneAutoscalerName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName [^ProjectZoneAutoscalerName$Builder this]
    (-> this (.build))))

