(ns com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration
  "An attached disk configuration for bootable persistent disks that must be created with the
  instance they are attached to. Attached disks that use this configuration can only be attached
  to an instance upon creation. A CreateDiskConfiguration object is never returned by the
  service: after the instance is created the corresponding attached disk will be returned with a
  AttachedDisk.PersistentDiskConfiguration."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$CreateDiskConfiguration]))

(defn *new-builder
  "Returns a builder for a CreateDiskConfiguration object given the source image that
   will be used to create the disk.

  source-image - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder [^com.google.cloud.compute.deprecated.ImageId source-image]
    (AttachedDisk$CreateDiskConfiguration/newBuilder source-image)))

(defn *of
  "Returns a CreateDiskConfiguration object given the source image that will be used to
   create the disk.

  source-image - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration [^com.google.cloud.compute.deprecated.ImageId source-image]
    (AttachedDisk$CreateDiskConfiguration/of source-image)))

(defn get-disk-name
  "Returns the name to be assigned to the disk. If not specified, the disk is given the
   instance's name.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$CreateDiskConfiguration this]
    (-> this (.getDiskName))))

(defn get-disk-type
  "Returns the identity of the disk type. If not specified, pd-standard is used.

  returns: `com.google.cloud.compute.deprecated.DiskTypeId`"
  (^com.google.cloud.compute.deprecated.DiskTypeId [^AttachedDisk$CreateDiskConfiguration this]
    (-> this (.getDiskType))))

(defn get-disk-size-gb
  "Returns the size of the persistent disk, in GB. If not set the disk will have the size of the
   source image. This value can be larger than the image's size. If the provided size is smaller
   than the image's size then instance creation will fail.

  returns: `java.lang.Long`"
  (^java.lang.Long [^AttachedDisk$CreateDiskConfiguration this]
    (-> this (.getDiskSizeGb))))

(defn get-source-image
  "Returns the identity of the source image used to create the disk.

  returns: `com.google.cloud.compute.deprecated.ImageId`"
  (^com.google.cloud.compute.deprecated.ImageId [^AttachedDisk$CreateDiskConfiguration this]
    (-> this (.getSourceImage))))

(defn to-builder
  "Returns a builder for the current configuration.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder [^AttachedDisk$CreateDiskConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttachedDisk$CreateDiskConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttachedDisk$CreateDiskConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

