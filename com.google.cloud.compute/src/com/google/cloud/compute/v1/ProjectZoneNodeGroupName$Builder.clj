(ns com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNodeGroupName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-node-group-name - `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`"
  (^ProjectZoneNodeGroupName$Builder [^com.google.cloud.compute.v1.ProjectZoneNodeGroupName project-zone-node-group-name]
    (new ProjectZoneNodeGroupName$Builder project-zone-node-group-name)))

(defn get-node-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName$Builder this]
    (-> this (.getNodeGroup))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName$Builder this]
    (-> this (.getZone))))

(defn set-node-group
  "node-group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder [^ProjectZoneNodeGroupName$Builder this ^java.lang.String node-group]
    (-> this (.setNodeGroup node-group))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder [^ProjectZoneNodeGroupName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder [^ProjectZoneNodeGroupName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName [^ProjectZoneNodeGroupName$Builder this]
    (-> this (.build))))

