(ns com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneDiskTypeName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-disk-type-name - `com.google.cloud.compute.v1.ProjectZoneDiskTypeName`"
  (^ProjectZoneDiskTypeName$Builder [^com.google.cloud.compute.v1.ProjectZoneDiskTypeName project-zone-disk-type-name]
    (new ProjectZoneDiskTypeName$Builder project-zone-disk-type-name)))

(defn get-disk-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName$Builder this]
    (-> this (.getDiskType))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName$Builder this]
    (-> this (.getZone))))

(defn set-disk-type
  "disk-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder [^ProjectZoneDiskTypeName$Builder this ^java.lang.String disk-type]
    (-> this (.setDiskType disk-type))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder [^ProjectZoneDiskTypeName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder [^ProjectZoneDiskTypeName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName [^ProjectZoneDiskTypeName$Builder this]
    (-> this (.build))))

