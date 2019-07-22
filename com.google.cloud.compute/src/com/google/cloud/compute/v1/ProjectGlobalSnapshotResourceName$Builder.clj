(ns com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSnapshotResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-global-snapshot-resource-name - `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`"
  (^ProjectGlobalSnapshotResourceName$Builder [^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName project-global-snapshot-resource-name]
    (new ProjectGlobalSnapshotResourceName$Builder project-global-snapshot-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder [^ProjectGlobalSnapshotResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder [^ProjectGlobalSnapshotResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName [^ProjectGlobalSnapshotResourceName$Builder this]
    (-> this (.build))))

