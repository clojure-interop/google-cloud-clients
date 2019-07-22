(ns com.google.cloud.compute.deprecated.SnapshotInfo
  "A Google Compute Engine snapshot. Compute Engine allows you to take snapshots of your persistent
  disk and create new persistent disks from that snapshot. This can be useful for backing up data,
  recreating a persistent disk that might have been lost, or copying a persistent disk. Snapshots
  can be applied across persistent disk types."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SnapshotInfo]))

(defn *new-builder
  "Returns a builder for a SnapshotInfo object given the snapshot identity and a source
   disk identity.

  snapshot-id - `com.google.cloud.compute.deprecated.SnapshotId`
  source - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$Builder [^com.google.cloud.compute.deprecated.SnapshotId snapshot-id ^com.google.cloud.compute.deprecated.DiskId source]
    (SnapshotInfo/newBuilder snapshot-id source)))

(defn *of
  "Returns a SnapshotInfo object given the snapshot identity and a source disk identity.

  snapshot-id - `com.google.cloud.compute.deprecated.SnapshotId`
  source - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo [^com.google.cloud.compute.deprecated.SnapshotId snapshot-id ^com.google.cloud.compute.deprecated.DiskId source]
    (SnapshotInfo/of snapshot-id source)))

(defn get-source-disk-id
  "Returns the service-generated unique id of the disk used to create this snapshot. This value
   may be used to determine whether the snapshot was taken from the current or a previous instance
   of a given disk name.

  returns: `java.lang.String`"
  (^java.lang.String [^SnapshotInfo this]
    (-> this (.getSourceDiskId))))

(defn get-status
  "Returns the status of the snapshot. A snapshot can be used to create other resources, such as
   disks, only after the snapshot has been successfully created and the status is set to READY.

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo$Status`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$Status [^SnapshotInfo this]
    (-> this (.getStatus))))

(defn get-source-disk
  "Returns the identity of the source disk used to create this snapshot.

  returns: `com.google.cloud.compute.deprecated.DiskId`"
  (^com.google.cloud.compute.deprecated.DiskId [^SnapshotInfo this]
    (-> this (.getSourceDisk))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SnapshotInfo this]
    (-> this (.toString))))

(defn get-licenses
  "Returns all applicable publicly visible licenses.

  returns: `java.util.List<com.google.cloud.compute.deprecated.LicenseId>`"
  (^java.util.List [^SnapshotInfo this]
    (-> this (.getLicenses))))

(defn get-description
  "Returns a textual description of the snapshot.

  returns: `java.lang.String`"
  (^java.lang.String [^SnapshotInfo this]
    (-> this (.getDescription))))

(defn get-disk-size-gb
  "Returns the size of the snapshot (in GB).

  returns: `java.lang.Long`"
  (^java.lang.Long [^SnapshotInfo this]
    (-> this (.getDiskSizeGb))))

(defn get-snapshot-id
  "Returns the snapshot identity.

  returns: `com.google.cloud.compute.deprecated.SnapshotId`"
  (^com.google.cloud.compute.deprecated.SnapshotId [^SnapshotInfo this]
    (-> this (.getSnapshotId))))

(defn get-storage-bytes
  "Returns the size of the the storage used by the snapshot. As snapshots share storage, this
   number is expected to change with snapshot creation/deletion.

  returns: `java.lang.Long`"
  (^java.lang.Long [^SnapshotInfo this]
    (-> this (.getStorageBytes))))

(defn get-storage-bytes-status
  "Indicates whether getStorageBytes() is in a stable state or it is being
   adjusted as a result of shared storage reallocation. SnapshotInfo.StorageBytesStatus.UPDATING
   indicates that the size of the snapshot is being updated. SnapshotInfo.StorageBytesStatus.UP_TO_DATE
   indicates that the size of the snapshot is up-to-date.

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus [^SnapshotInfo this]
    (-> this (.getStorageBytesStatus))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SnapshotInfo this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^SnapshotInfo this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the snapshot.

  returns: `java.lang.String`"
  (^java.lang.String [^SnapshotInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SnapshotInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the current snapshot.

  returns: `com.google.cloud.compute.deprecated.SnapshotInfo$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$Builder [^SnapshotInfo this]
    (-> this (.toBuilder))))

