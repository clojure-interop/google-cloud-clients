(ns com.google.cloud.compute.deprecated.AttachedDisk$Builder
  "A builder for AttachedDisk objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$Builder]))

(defn set-device-name
  "Sets the unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This
   name can be used to reference the device for mounting, resizing, and so on, from within the
   instance. If not specified, the service chooses a default device name to apply to this disk,
   in the form persistent-disks-x, where x is a number assigned by Google Compute
   Engine.

  device-name - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String device-name]
    (-> this (.setDeviceName device-name))))

(defn set-index
  "Sets a zero-based index to this disk, where 0 is reserved for the boot disk. For example, if
   you have many disks attached to an instance, each disk would have an unique index number. If
   not specified, the service will choose an appropriate value.

  index - `java.lang.Integer`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.Integer index]
    (-> this (.setIndex index))))

(defn set-configuration
  "Sets the attached disk configuration. Use AttachedDisk.ScratchDiskConfiguration to attach a
   scratch disk to the instance. Use AttachedDisk.PersistentDiskConfiguration to attach a persistent
   disk to the instance. Use AttachedDisk.CreateDiskConfiguration to create and attach a new
   persistent disk.

  configuration - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$Builder [^AttachedDisk$Builder this ^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn build
  "Creates an AttachedDisk object.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk`"
  (^com.google.cloud.compute.deprecated.AttachedDisk [^AttachedDisk$Builder this]
    (-> this (.build))))

