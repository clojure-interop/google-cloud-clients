(ns com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneMachineTypeName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-machine-type-name - `com.google.cloud.compute.v1.ProjectZoneMachineTypeName`"
  (^ProjectZoneMachineTypeName$Builder [^com.google.cloud.compute.v1.ProjectZoneMachineTypeName project-zone-machine-type-name]
    (new ProjectZoneMachineTypeName$Builder project-zone-machine-type-name)))

(defn get-machine-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName$Builder this]
    (-> this (.getMachineType))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName$Builder this]
    (-> this (.getZone))))

(defn set-machine-type
  "machine-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder [^ProjectZoneMachineTypeName$Builder this ^java.lang.String machine-type]
    (-> this (.setMachineType machine-type))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder [^ProjectZoneMachineTypeName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder [^ProjectZoneMachineTypeName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName [^ProjectZoneMachineTypeName$Builder this]
    (-> this (.build))))

