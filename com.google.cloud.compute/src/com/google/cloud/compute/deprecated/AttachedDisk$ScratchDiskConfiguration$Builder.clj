(ns com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder
  "A builder for ScratchDiskConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$ScratchDiskConfiguration$Builder]))

(defn set-disk-type
  "Sets the identity of the disk type for the scratch disk to attach.

  disk-type - `com.google.cloud.compute.deprecated.DiskTypeId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder [^AttachedDisk$ScratchDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.DiskTypeId disk-type]
    (-> this (.setDiskType disk-type))))

(defn set-interface-type
  "Sets the interface type. If not specified, SCSI is used.

  interface-type - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder [^AttachedDisk$ScratchDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType interface-type]
    (-> this (.setInterfaceType interface-type))))

(defn build
  "Creates a ScratchDiskConfiguration object.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration [^AttachedDisk$ScratchDiskConfiguration$Builder this]
    (-> this (.build))))

