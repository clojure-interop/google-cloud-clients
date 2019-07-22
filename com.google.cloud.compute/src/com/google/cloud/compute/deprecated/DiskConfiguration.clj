(ns com.google.cloud.compute.deprecated.DiskConfiguration
  "Base class for Google Compute Engine disk configurations. A disk can be used as primary storage
  for your virtual machine instances. Use StandardDiskConfiguration to create a standard
  disk given a disk type and size. Use ImageDiskConfiguration to create a disk from a
  Compute Engine disk image. Use SnapshotDiskConfiguration to create a disk from a Compute
  Engine disk snapshot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskConfiguration]))

(defn get-type
  "Returns the disk configuration's type. This method returns DiskConfiguration.Type.STANDARD for a standard
   configuration that creates a disk given its type and size. This method returns DiskConfiguration.Type.SNAPSHOT for a configuration that creates a disk from a Google Compute Engine snapshot.
   This method returns DiskConfiguration.Type.IMAGE for a configuration that creates a disk from a Google
   Compute Engine image.

  returns: `com.google.cloud.compute.deprecated.DiskConfiguration$Type`"
  (^com.google.cloud.compute.deprecated.DiskConfiguration$Type [^DiskConfiguration this]
    (-> this (.getType))))

(defn get-size-gb
  "Returns the size of the persistent disk, in GB.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DiskConfiguration this]
    (-> this (.getSizeGb))))

(defn get-disk-type
  "Returns the identity of the disk type.

  returns: `com.google.cloud.compute.deprecated.DiskTypeId`"
  (^com.google.cloud.compute.deprecated.DiskTypeId [^DiskConfiguration this]
    (-> this (.getDiskType))))

(defn to-builder
  "Returns a builder for the object.

  returns: `com.google.cloud.compute.deprecated.DiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.DiskConfiguration$Builder [^DiskConfiguration this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiskConfiguration this]
    (-> this (.toString))))

