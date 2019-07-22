(ns com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration
  "Base class for AttachedDisk configuration. Use AttachedDisk.PersistentDiskConfiguration to
  attach an existing persistent disk. Use AttachedDisk.CreateDiskConfiguration to create a boot
  persistent disk to attach to the instance. Use AttachedDisk.ScratchDiskConfiguration to attach a
  scratch disk."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$AttachedDiskConfiguration]))

(defn get-type
  "Returns the type of the attached disk.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type [^AttachedDisk$AttachedDiskConfiguration this]
    (-> this (.getType))))

(defn get-interface-type
  "Returns the interface to use to attach the disk. If not specified, AttachedDisk.AttachedDiskConfiguration.InterfaceType.SCSI
   is used.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType [^AttachedDisk$AttachedDiskConfiguration this]
    (-> this (.getInterfaceType))))

(defn boot
  "Returns whether to use the attached disk as a boot disk. If true the virtual machine
   will use the first partition of the disk for its root filesystem. If not specified, the disk
   is not used as a boot disk.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AttachedDisk$AttachedDiskConfiguration this]
    (-> this (.boot))))

(defn auto-delete
  "Returns whether the disk should auto-delete when the instance to which it's attached is
   deleted. If not specified, the disk is not deleted automatically.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AttachedDisk$AttachedDiskConfiguration this]
    (-> this (.autoDelete))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$AttachedDiskConfiguration this]
    (-> this (.toString))))

