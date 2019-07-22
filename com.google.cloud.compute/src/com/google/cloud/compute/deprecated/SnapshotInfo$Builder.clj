(ns com.google.cloud.compute.deprecated.SnapshotInfo$Builder
  "A builder for SnapshotInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SnapshotInfo$Builder]))

(defn ->builder
  "Constructor."
  (^SnapshotInfo$Builder []
    (new SnapshotInfo$Builder )))

(defn set-snapshot-id
  "Sets the snapshot identity.

  snapshot-id - `com.google.cloud.compute.deprecated.SnapshotId`

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$Builder [^SnapshotInfo$Builder this ^com.google.cloud.compute.deprecated.SnapshotId snapshot-id]
    (-> this (.setSnapshotId snapshot-id))))

(defn set-description
  "Sets an optional textual description of the snapshot.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$Builder [^SnapshotInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-source-disk
  "Sets the identity of the source disk used to create the snapshot.

  source-disk - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$Builder [^SnapshotInfo$Builder this ^com.google.cloud.compute.deprecated.DiskId source-disk]
    (-> this (.setSourceDisk source-disk))))

(defn build
  "Creates a SnapshotInfo object.

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo [^SnapshotInfo$Builder this]
    (-> this (.build))))

