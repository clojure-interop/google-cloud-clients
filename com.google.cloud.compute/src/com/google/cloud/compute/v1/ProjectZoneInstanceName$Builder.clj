(ns com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-instance-name - `com.google.cloud.compute.v1.ProjectZoneInstanceName`"
  (^ProjectZoneInstanceName$Builder [^com.google.cloud.compute.v1.ProjectZoneInstanceName project-zone-instance-name]
    (new ProjectZoneInstanceName$Builder project-zone-instance-name)))

(defn get-instance
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName$Builder this]
    (-> this (.getInstance))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName$Builder this]
    (-> this (.getZone))))

(defn set-instance
  "instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder [^ProjectZoneInstanceName$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder [^ProjectZoneInstanceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder [^ProjectZoneInstanceName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName [^ProjectZoneInstanceName$Builder this]
    (-> this (.build))))

