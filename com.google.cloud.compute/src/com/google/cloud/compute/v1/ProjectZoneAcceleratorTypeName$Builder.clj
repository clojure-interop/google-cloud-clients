(ns com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneAcceleratorTypeName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-accelerator-type-name - `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName`"
  (^ProjectZoneAcceleratorTypeName$Builder [^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName project-zone-accelerator-type-name]
    (new ProjectZoneAcceleratorTypeName$Builder project-zone-accelerator-type-name)))

(defn get-accelerator-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName$Builder this]
    (-> this (.getAcceleratorType))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName$Builder this]
    (-> this (.getZone))))

(defn set-accelerator-type
  "accelerator-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder [^ProjectZoneAcceleratorTypeName$Builder this ^java.lang.String accelerator-type]
    (-> this (.setAcceleratorType accelerator-type))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder [^ProjectZoneAcceleratorTypeName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder [^ProjectZoneAcceleratorTypeName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName [^ProjectZoneAcceleratorTypeName$Builder this]
    (-> this (.build))))

