(ns com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNodeTypeName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-node-type-name - `com.google.cloud.compute.v1.ProjectZoneNodeTypeName`"
  (^ProjectZoneNodeTypeName$Builder [^com.google.cloud.compute.v1.ProjectZoneNodeTypeName project-zone-node-type-name]
    (new ProjectZoneNodeTypeName$Builder project-zone-node-type-name)))

(defn get-node-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName$Builder this]
    (-> this (.getNodeType))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName$Builder this]
    (-> this (.getZone))))

(defn set-node-type
  "node-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder [^ProjectZoneNodeTypeName$Builder this ^java.lang.String node-type]
    (-> this (.setNodeType node-type))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder [^ProjectZoneNodeTypeName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder [^ProjectZoneNodeTypeName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName [^ProjectZoneNodeTypeName$Builder this]
    (-> this (.build))))

