(ns com.google.cloud.compute.v1.ProjectZoneDiskName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneDiskName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-disk-name - `com.google.cloud.compute.v1.ProjectZoneDiskName`"
  (^ProjectZoneDiskName$Builder [^com.google.cloud.compute.v1.ProjectZoneDiskName project-zone-disk-name]
    (new ProjectZoneDiskName$Builder project-zone-disk-name)))

(defn get-disk
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName$Builder this]
    (-> this (.getDisk))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName$Builder this]
    (-> this (.getZone))))

(defn set-disk
  "disk - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName$Builder [^ProjectZoneDiskName$Builder this ^java.lang.String disk]
    (-> this (.setDisk disk))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName$Builder [^ProjectZoneDiskName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName$Builder [^ProjectZoneDiskName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName [^ProjectZoneDiskName$Builder this]
    (-> this (.build))))

