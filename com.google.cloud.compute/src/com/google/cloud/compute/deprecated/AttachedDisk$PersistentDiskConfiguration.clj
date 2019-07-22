(ns com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration
  "An attached disk configuration for existing persistent disks."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$PersistentDiskConfiguration]))

(defn *new-builder
  "Returns a builder for a PersistentDiskConfiguration object given the identity of the
   persistent disk to attach.

  source-disk - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder [^com.google.cloud.compute.deprecated.DiskId source-disk]
    (AttachedDisk$PersistentDiskConfiguration/newBuilder source-disk)))

(defn *of
  "Returns a PersistentDiskConfiguration object given the identity of the persistent
   disk to attach.

  source-disk - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration [^com.google.cloud.compute.deprecated.DiskId source-disk]
    (AttachedDisk$PersistentDiskConfiguration/of source-disk)))

(defn get-source-disk
  "Returns the identity of the persistent disk to be attached.

  returns: `com.google.cloud.compute.deprecated.DiskId`"
  (^com.google.cloud.compute.deprecated.DiskId [^AttachedDisk$PersistentDiskConfiguration this]
    (-> this (.getSourceDisk))))

(defn get-mode
  "Returns the mode in which to attach this disk. If not specified, the disk is attached in
   AttachedDisk.PersistentDiskConfiguration.Mode.READ_WRITE mode.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode [^AttachedDisk$PersistentDiskConfiguration this]
    (-> this (.getMode))))

(defn to-builder
  "Returns a builder for the current configuration.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder [^AttachedDisk$PersistentDiskConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttachedDisk$PersistentDiskConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttachedDisk$PersistentDiskConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

