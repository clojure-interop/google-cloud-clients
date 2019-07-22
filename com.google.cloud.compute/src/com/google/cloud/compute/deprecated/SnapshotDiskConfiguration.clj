(ns com.google.cloud.compute.deprecated.SnapshotDiskConfiguration
  "A Google Compute Engine disk configuration to create a disk from a Google Compute Engine
  snapshot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SnapshotDiskConfiguration]))

(defn *new-builder
  "Returns a builder for a SnapshotDiskConfiguration object given the snapshot identity.

  source-snapshot - `com.google.cloud.compute.deprecated.SnapshotId`

  returns: `com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder [^com.google.cloud.compute.deprecated.SnapshotId source-snapshot]
    (SnapshotDiskConfiguration/newBuilder source-snapshot)))

(defn *of
  "Returns a SnapshotDiskConfiguration object given the snapshot identity.

  source-snapshot - `com.google.cloud.compute.deprecated.SnapshotId`

  returns: `com.google.cloud.compute.deprecated.SnapshotDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.SnapshotDiskConfiguration [^com.google.cloud.compute.deprecated.SnapshotId source-snapshot]
    (SnapshotDiskConfiguration/of source-snapshot)))

(defn get-source-snapshot
  "Returns the identity of the source snapshot used to create the disk.

  returns: `com.google.cloud.compute.deprecated.SnapshotId`"
  (^com.google.cloud.compute.deprecated.SnapshotId [^SnapshotDiskConfiguration this]
    (-> this (.getSourceSnapshot))))

(defn get-source-snapshot-id
  "Returns the service-generated unique id of the snapshot used to create this disk. This value
   identifies the exact snapshot that was used to create the persistent disk. For example, if you
   created the persistent disk from a snapshot that was later deleted and recreated under the same
   name, the source snapshot ID would identify the exact version of the snapshot that was used.

  returns: `java.lang.String`"
  (^java.lang.String [^SnapshotDiskConfiguration this]
    (-> this (.getSourceSnapshotId))))

(defn to-builder
  "Description copied from class: DiskConfiguration

  returns: `com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder [^SnapshotDiskConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SnapshotDiskConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SnapshotDiskConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

