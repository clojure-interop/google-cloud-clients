(ns com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSnapshotName$Builder]))

(defn ->builder
  "Constructor.

  project-global-snapshot-name - `com.google.cloud.compute.v1.ProjectGlobalSnapshotName`"
  (^ProjectGlobalSnapshotName$Builder [^com.google.cloud.compute.v1.ProjectGlobalSnapshotName project-global-snapshot-name]
    (new ProjectGlobalSnapshotName$Builder project-global-snapshot-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotName$Builder this]
    (-> this (.getProject))))

(defn get-snapshot
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotName$Builder this]
    (-> this (.getSnapshot))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder [^ProjectGlobalSnapshotName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-snapshot
  "snapshot - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder [^ProjectGlobalSnapshotName$Builder this ^java.lang.String snapshot]
    (-> this (.setSnapshot snapshot))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotName [^ProjectGlobalSnapshotName$Builder this]
    (-> this (.build))))

