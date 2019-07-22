(ns com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder
  "A builder for CreateDiskConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$CreateDiskConfiguration$Builder]))

(defn set-disk-name
  "Sets the name to be assigned to the disk. If not specified, the disk is given the
   instance's name.

  disk-name - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder [^AttachedDisk$CreateDiskConfiguration$Builder this ^java.lang.String disk-name]
    (-> this (.setDiskName disk-name))))

(defn set-disk-type
  "Sets the identity of the disk type. If not specified, pd-standard is used.

  disk-type - `com.google.cloud.compute.deprecated.DiskTypeId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder [^AttachedDisk$CreateDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.DiskTypeId disk-type]
    (-> this (.setDiskType disk-type))))

(defn set-disk-size-gb
  "Sets the size of the persistent disk, in GB. If not set the disk will have the size of the
   source image. This value can be larger than the image's size. If the provided size is
   smaller than the image's size, then instance creation will fail.

  disk-size-gb - `java.lang.Long`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder [^AttachedDisk$CreateDiskConfiguration$Builder this ^java.lang.Long disk-size-gb]
    (-> this (.setDiskSizeGb disk-size-gb))))

(defn set-source-image
  "Sets the identity of the source image used to create the disk.

  source-image - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder [^AttachedDisk$CreateDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.ImageId source-image]
    (-> this (.setSourceImage source-image))))

(defn set-auto-delete
  "Sets whether the disk should auto-delete when the instance to which it's attached is
   deleted. If not specified, the disk is not deleted automatically.

  auto-delete - `java.lang.Boolean`

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder [^AttachedDisk$CreateDiskConfiguration$Builder this ^java.lang.Boolean auto-delete]
    (-> this (.setAutoDelete auto-delete))))

(defn build
  "Creates a CreateDiskConfiguration object.

  returns: `com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration [^AttachedDisk$CreateDiskConfiguration$Builder this]
    (-> this (.build))))

