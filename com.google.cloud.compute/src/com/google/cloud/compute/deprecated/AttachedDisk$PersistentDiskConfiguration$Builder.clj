(ns com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder
  "A builder for PersistentDiskConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$PersistentDiskConfiguration$Builder]))

(defn set-source-disk
  "Sets the identity of the persistent disk to be attached.

  source-disk - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder [^AttachedDisk$PersistentDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.DiskId source-disk]
    (-> this (.setSourceDisk source-disk))))

(defn set-mode
  "Sets the mode in which to attach this disk. If not specified, the disk is attached in
   AttachedDisk.PersistentDiskConfiguration.Mode.READ_WRITE mode.

  mode - `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder [^AttachedDisk$PersistentDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode mode]
    (-> this (.setMode mode))))

(defn set-boot
  "Sets whether to use the attached disk as a boot disk. If true the virtual machine
   instance will use the first partition of the disk for its root filesystem. If not
   specified, the isk is not used as a boot disk.

  boot - `boolean`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder [^AttachedDisk$PersistentDiskConfiguration$Builder this ^Boolean boot]
    (-> this (.setBoot boot))))

(defn set-auto-delete
  "Sets whether the disk should auto-delete when the instance to which it's attached is
   deleted. If not specified, the disk is not deleted automatically.

  auto-delete - `boolean`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder [^AttachedDisk$PersistentDiskConfiguration$Builder this ^Boolean auto-delete]
    (-> this (.setAutoDelete auto-delete))))

(defn build
  "Creates a PersistentDiskConfiguration object.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration [^AttachedDisk$PersistentDiskConfiguration$Builder this]
    (-> this (.build))))

