(ns com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-instance-resource-name - `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`"
  (^ProjectZoneInstanceResourceName$Builder [^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName project-zone-instance-resource-name]
    (new ProjectZoneInstanceResourceName$Builder project-zone-instance-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName$Builder this]
    (-> this (.getResource))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName$Builder this]
    (-> this (.getZone))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder [^ProjectZoneInstanceResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder [^ProjectZoneInstanceResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder [^ProjectZoneInstanceResourceName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName [^ProjectZoneInstanceResourceName$Builder this]
    (-> this (.build))))

