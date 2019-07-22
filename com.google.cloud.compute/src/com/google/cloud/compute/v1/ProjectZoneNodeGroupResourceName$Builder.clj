(ns com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNodeGroupResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-node-group-resource-name - `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName`"
  (^ProjectZoneNodeGroupResourceName$Builder [^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName project-zone-node-group-resource-name]
    (new ProjectZoneNodeGroupResourceName$Builder project-zone-node-group-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName$Builder this]
    (-> this (.getResource))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName$Builder this]
    (-> this (.getZone))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder [^ProjectZoneNodeGroupResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder [^ProjectZoneNodeGroupResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder [^ProjectZoneNodeGroupResourceName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName [^ProjectZoneNodeGroupResourceName$Builder this]
    (-> this (.build))))

