(ns com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration
  "An attached disk configuration for scratch disks. Attached disks that use this configuration
  can only be attached to an instance upon creation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$ScratchDiskConfiguration]))

(defn *new-builder
  "Returns a builder for ScratchDiskConfiguration objects given the disk type identity.

  disk-type - `com.google.cloud.compute.deprecated.DiskTypeId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder [^com.google.cloud.compute.deprecated.DiskTypeId disk-type]
    (AttachedDisk$ScratchDiskConfiguration/newBuilder disk-type)))

(defn *of
  "Returns a ScratchDiskConfiguration object given the disk type identity. The disk will
   be attached via the default interface (AttachedDisk.AttachedDiskConfiguration.InterfaceType.SCSI).

  disk-type - `com.google.cloud.compute.deprecated.DiskTypeId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration [^com.google.cloud.compute.deprecated.DiskTypeId disk-type]
    (AttachedDisk$ScratchDiskConfiguration/of disk-type)))

(defn get-disk-type
  "Returns the identity of the disk type for the scratch disk to attach.

  returns: `com.google.cloud.compute.deprecated.DiskTypeId`"
  (^com.google.cloud.compute.deprecated.DiskTypeId [^AttachedDisk$ScratchDiskConfiguration this]
    (-> this (.getDiskType))))

(defn to-builder
  "Returns a builder for the current configuration.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder [^AttachedDisk$ScratchDiskConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttachedDisk$ScratchDiskConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttachedDisk$ScratchDiskConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

