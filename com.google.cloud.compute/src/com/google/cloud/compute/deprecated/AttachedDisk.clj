(ns com.google.cloud.compute.deprecated.AttachedDisk
  "A disk attached to a Google Compute Engine instance. To create a new disk to attach when an image
  is being created use AttachedDisk.CreateDiskConfiguration. To attach an existing persistent disk use
  AttachedDisk.PersistentDiskConfiguration. To attach a scratch disk use AttachedDisk.ScratchDiskConfiguration."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk]))

(defn *new-builder
  "Returns a builder for an AttachedDisk object given its configuration.

  configuration - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$Builder [^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration configuration]
    (AttachedDisk/newBuilder configuration)))

(defn *of
  "Returns an AttachedDisk object given the device name and its configuration.

  device-name - `java.lang.String`
  configuration - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk`"
  (^com.google.cloud.compute.deprecated.AttachedDisk [^java.lang.String device-name ^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration configuration]
    (AttachedDisk/of device-name configuration))
  (^com.google.cloud.compute.deprecated.AttachedDisk [^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration configuration]
    (AttachedDisk/of configuration)))

(defn get-device-name
  "Returns the unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This
   name can be used to reference the device for mounting, resizing, and so on, from within the
   instance. If not specified, the service chooses a default device name to apply to this disk, in
   the form persistent-disks-x, where x is a number assigned by Google Compute Engine.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.getDeviceName))))

(defn get-index
  "Returns a zero-based index to this disk, where 0 is reserved for the boot disk.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AttachedDisk this]
    (-> this (.getIndex))))

(defn get-configuration
  "Returns the attached disk configuration. Returns AttachedDisk.ScratchDiskConfiguration to attach a
   scratch disk to the instance. Returns AttachedDisk.PersistentDiskConfiguration to attach a
   persistent disk to the instance. Returns AttachedDisk.CreateDiskConfiguration to create and attach a
   new persistent disk.

  returns: `<T extends com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration> T`"
  ([^AttachedDisk this]
    (-> this (.getConfiguration))))

(defn get-licenses
  "Returns a list of publicly accessible licenses for the attached disk.

  returns: `java.util.List<com.google.cloud.compute.deprecated.LicenseId>`"
  (^java.util.List [^AttachedDisk this]
    (-> this (.getLicenses))))

(defn to-builder
  "Returns a builder for the current attached disk.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$Builder [^AttachedDisk this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttachedDisk this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttachedDisk this ^java.lang.Object obj]
    (-> this (.equals obj))))

