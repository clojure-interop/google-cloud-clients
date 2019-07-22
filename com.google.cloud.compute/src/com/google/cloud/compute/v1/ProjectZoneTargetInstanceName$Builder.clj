(ns com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneTargetInstanceName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-target-instance-name - `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName`"
  (^ProjectZoneTargetInstanceName$Builder [^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName project-zone-target-instance-name]
    (new ProjectZoneTargetInstanceName$Builder project-zone-target-instance-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName$Builder this]
    (-> this (.getProject))))

(defn get-target-instance
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName$Builder this]
    (-> this (.getTargetInstance))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName$Builder this]
    (-> this (.getZone))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder [^ProjectZoneTargetInstanceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-target-instance
  "target-instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder [^ProjectZoneTargetInstanceName$Builder this ^java.lang.String target-instance]
    (-> this (.setTargetInstance target-instance))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder [^ProjectZoneTargetInstanceName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName [^ProjectZoneTargetInstanceName$Builder this]
    (-> this (.build))))

