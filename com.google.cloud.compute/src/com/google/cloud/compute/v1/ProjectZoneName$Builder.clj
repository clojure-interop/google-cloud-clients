(ns com.google.cloud.compute.v1.ProjectZoneName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-name - `com.google.cloud.compute.v1.ProjectZoneName`"
  (^ProjectZoneName$Builder [^com.google.cloud.compute.v1.ProjectZoneName project-zone-name]
    (new ProjectZoneName$Builder project-zone-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneName$Builder this]
    (-> this (.getZone))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneName$Builder [^ProjectZoneName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneName$Builder [^ProjectZoneName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneName`"
  (^com.google.cloud.compute.v1.ProjectZoneName [^ProjectZoneName$Builder this]
    (-> this (.build))))

