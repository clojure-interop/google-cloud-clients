(ns com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceGroupName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-instance-group-name - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`"
  (^ProjectZoneInstanceGroupName$Builder [^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName project-zone-instance-group-name]
    (new ProjectZoneInstanceGroupName$Builder project-zone-instance-group-name)))

(defn get-instance-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName$Builder this]
    (-> this (.getInstanceGroup))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName$Builder this]
    (-> this (.getZone))))

(defn set-instance-group
  "instance-group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder [^ProjectZoneInstanceGroupName$Builder this ^java.lang.String instance-group]
    (-> this (.setInstanceGroup instance-group))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder [^ProjectZoneInstanceGroupName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder [^ProjectZoneInstanceGroupName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName [^ProjectZoneInstanceGroupName$Builder this]
    (-> this (.build))))

