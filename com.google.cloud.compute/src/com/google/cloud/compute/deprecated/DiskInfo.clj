(ns com.google.cloud.compute.deprecated.DiskInfo
  "A Google Compute Engine persistent disk. A disk can be used as primary storage for your virtual
  machine instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskInfo]))

(defn *new-builder
  "Returns a builder for a DiskInfo object given its identity and configuration. Use
   StandardDiskConfiguration to create a simple disk given its type and size. Use SnapshotDiskConfiguration to create a disk from a snapshot. Use ImageDiskConfiguration
   to create a disk from a disk image.

  disk-id - `com.google.cloud.compute.deprecated.DiskId`
  configuration - `com.google.cloud.compute.deprecated.DiskConfiguration`

  returns: `com.google.cloud.compute.deprecated.DiskInfo$Builder`"
  (^com.google.cloud.compute.deprecated.DiskInfo$Builder [^com.google.cloud.compute.deprecated.DiskId disk-id ^com.google.cloud.compute.deprecated.DiskConfiguration configuration]
    (DiskInfo/newBuilder disk-id configuration)))

(defn *of
  "Returns a DiskInfo object given its identity and configuration. Use StandardDiskConfiguration to create a simple disk given its type and size. Use SnapshotDiskConfiguration to create a disk from a snapshot. Use ImageDiskConfiguration
   to create a disk from a disk image.

  disk-id - `com.google.cloud.compute.deprecated.DiskId`
  configuration - `com.google.cloud.compute.deprecated.DiskConfiguration`

  returns: `com.google.cloud.compute.deprecated.DiskInfo`"
  (^com.google.cloud.compute.deprecated.DiskInfo [^com.google.cloud.compute.deprecated.DiskId disk-id ^com.google.cloud.compute.deprecated.DiskConfiguration configuration]
    (DiskInfo/of disk-id configuration)))

(defn get-creation-status
  "Returns the creation status of the disk.

  returns: `com.google.cloud.compute.deprecated.DiskInfo$CreationStatus`"
  (^com.google.cloud.compute.deprecated.DiskInfo$CreationStatus [^DiskInfo this]
    (-> this (.getCreationStatus))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiskInfo this]
    (-> this (.toString))))

(defn get-licenses
  "Returns all applicable publicly visible licenses for the disk.

  returns: `java.util.List<com.google.cloud.compute.deprecated.LicenseId>`"
  (^java.util.List [^DiskInfo this]
    (-> this (.getLicenses))))

(defn get-description
  "Returns a textual description of the disk.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInfo this]
    (-> this (.getDescription))))

(defn get-configuration
  "Returns the disk configuration.

  returns: `<T extends com.google.cloud.compute.deprecated.DiskConfiguration> T`"
  ([^DiskInfo this]
    (-> this (.getConfiguration))))

(defn get-last-detach-timestamp
  "Returns the last detach timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DiskInfo this]
    (-> this (.getLastDetachTimestamp))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskInfo this]
    (-> this (.hashCode))))

(defn get-last-attach-timestamp
  "Returns the last attach timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DiskInfo this]
    (-> this (.getLastAttachTimestamp))))

(defn get-disk-id
  "Returns the disk identity.

  returns: `com.google.cloud.compute.deprecated.DiskId`"
  (^com.google.cloud.compute.deprecated.DiskId [^DiskInfo this]
    (-> this (.getDiskId))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DiskInfo this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the disk.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInfo this]
    (-> this (.getGeneratedId))))

(defn get-attached-instances
  "Returns all the identities of the instances this disk is attached to.

  returns: `java.util.List<com.google.cloud.compute.deprecated.InstanceId>`"
  (^java.util.List [^DiskInfo this]
    (-> this (.getAttachedInstances))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the object.

  returns: `com.google.cloud.compute.deprecated.DiskInfo$Builder`"
  (^com.google.cloud.compute.deprecated.DiskInfo$Builder [^DiskInfo this]
    (-> this (.toBuilder))))

