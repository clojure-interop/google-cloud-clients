(ns com.google.cloud.compute.deprecated.ImageDiskConfiguration
  "A Google Compute Engine disk configuration to create a disk from a Google Compute Engine image."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageDiskConfiguration]))

(defn *new-builder
  "Returns a builder for an ImageDiskConfiguration object given the image identity.

  image-id - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder [^com.google.cloud.compute.deprecated.ImageId image-id]
    (ImageDiskConfiguration/newBuilder image-id)))

(defn *of
  "Returns an ImageDiskConfiguration object given the image identity.

  image-id - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.ImageDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.ImageDiskConfiguration [^com.google.cloud.compute.deprecated.ImageId image-id]
    (ImageDiskConfiguration/of image-id)))

(defn get-source-image
  "Returns the identity of the source image used to create the disk.

  returns: `com.google.cloud.compute.deprecated.ImageId`"
  (^com.google.cloud.compute.deprecated.ImageId [^ImageDiskConfiguration this]
    (-> this (.getSourceImage))))

(defn get-source-image-id
  "Returns the service-generated unique id of the image used to create this disk. This value
   identifies the exact image that was used to create this persistent disk. For example, if you
   created the persistent disk from an image that was later deleted and recreated under the same
   name, the source image service-generated id would identify the exact version of the image that
   was used.

  returns: `java.lang.String`"
  (^java.lang.String [^ImageDiskConfiguration this]
    (-> this (.getSourceImageId))))

(defn to-builder
  "Description copied from class: DiskConfiguration

  returns: `com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder [^ImageDiskConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ImageDiskConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImageDiskConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

