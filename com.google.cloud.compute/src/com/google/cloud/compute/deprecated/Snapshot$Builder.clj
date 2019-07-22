(ns com.google.cloud.compute.deprecated.Snapshot$Builder
  "A builder for Snapshot objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Snapshot$Builder]))

(defn set-snapshot-id
  "Description copied from class: SnapshotInfo.Builder

  snapshot-id - `com.google.cloud.compute.deprecated.SnapshotId`

  returns: `com.google.cloud.compute.deprecated.Snapshot$Builder`"
  (^com.google.cloud.compute.deprecated.Snapshot$Builder [^Snapshot$Builder this ^com.google.cloud.compute.deprecated.SnapshotId snapshot-id]
    (-> this (.setSnapshotId snapshot-id))))

(defn set-description
  "Description copied from class: SnapshotInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Snapshot$Builder`"
  (^com.google.cloud.compute.deprecated.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-source-disk
  "Description copied from class: SnapshotInfo.Builder

  source-disk - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.Snapshot$Builder`"
  (^com.google.cloud.compute.deprecated.Snapshot$Builder [^Snapshot$Builder this ^com.google.cloud.compute.deprecated.DiskId source-disk]
    (-> this (.setSourceDisk source-disk))))

(defn build
  "Description copied from class: SnapshotInfo.Builder

  returns: `com.google.cloud.compute.deprecated.Snapshot`"
  (^com.google.cloud.compute.deprecated.Snapshot [^Snapshot$Builder this]
    (-> this (.build))))

