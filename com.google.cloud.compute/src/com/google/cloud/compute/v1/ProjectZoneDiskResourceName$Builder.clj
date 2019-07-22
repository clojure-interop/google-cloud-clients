(ns com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneDiskResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-disk-resource-name - `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`"
  (^ProjectZoneDiskResourceName$Builder [^com.google.cloud.compute.v1.ProjectZoneDiskResourceName project-zone-disk-resource-name]
    (new ProjectZoneDiskResourceName$Builder project-zone-disk-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName$Builder this]
    (-> this (.getResource))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName$Builder this]
    (-> this (.getZone))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder [^ProjectZoneDiskResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder [^ProjectZoneDiskResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder [^ProjectZoneDiskResourceName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName [^ProjectZoneDiskResourceName$Builder this]
    (-> this (.build))))

