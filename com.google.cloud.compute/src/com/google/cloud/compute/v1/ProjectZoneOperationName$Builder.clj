(ns com.google.cloud.compute.v1.ProjectZoneOperationName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneOperationName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-operation-name - `com.google.cloud.compute.v1.ProjectZoneOperationName`"
  (^ProjectZoneOperationName$Builder [^com.google.cloud.compute.v1.ProjectZoneOperationName project-zone-operation-name]
    (new ProjectZoneOperationName$Builder project-zone-operation-name)))

(defn get-operation
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName$Builder this]
    (-> this (.getOperation))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName$Builder this]
    (-> this (.getZone))))

(defn set-operation
  "operation - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName$Builder [^ProjectZoneOperationName$Builder this ^java.lang.String operation]
    (-> this (.setOperation operation))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName$Builder [^ProjectZoneOperationName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName$Builder [^ProjectZoneOperationName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneOperationName`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName [^ProjectZoneOperationName$Builder this]
    (-> this (.build))))

