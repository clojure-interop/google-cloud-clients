(ns com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceGroupManagerName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-instance-group-manager-name - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`"
  (^ProjectZoneInstanceGroupManagerName$Builder [^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName project-zone-instance-group-manager-name]
    (new ProjectZoneInstanceGroupManagerName$Builder project-zone-instance-group-manager-name)))

(defn get-instance-group-manager
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName$Builder this]
    (-> this (.getInstanceGroupManager))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName$Builder this]
    (-> this (.getZone))))

(defn set-instance-group-manager
  "instance-group-manager - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder [^ProjectZoneInstanceGroupManagerName$Builder this ^java.lang.String instance-group-manager]
    (-> this (.setInstanceGroupManager instance-group-manager))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder [^ProjectZoneInstanceGroupManagerName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder [^ProjectZoneInstanceGroupManagerName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName [^ProjectZoneInstanceGroupManagerName$Builder this]
    (-> this (.build))))

