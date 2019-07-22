(ns com.google.cloud.compute.deprecated.ImageInfo
  "A Google Compute Engine Image. An image contains a boot loader, an operating system and a root
  file system that is necessary for starting an instance. Compute Engine offers publicly-available
  images of certain operating systems that you can use, or you can create a custom image. A custom
  image is an image created from one of your virtual machine instances that contains your specific
  instance configurations. Use DiskImageConfiguration to create an image from an existing
  disk. Use StorageImageConfiguration to create an image from a file stored in Google Cloud
  Storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageInfo]))

(defn *new-builder
  "Returns a builder for an ImageInfo object given the image identity and an image
   configuration. Use DiskImageConfiguration to create an image from an existing disk. Use
   StorageImageConfiguration to create an image from a file stored in Google Cloud
   Storage.

  image-id - `com.google.cloud.compute.deprecated.ImageId`
  configuration - `com.google.cloud.compute.deprecated.ImageConfiguration`

  returns: `com.google.cloud.compute.deprecated.ImageInfo$Builder`"
  (^com.google.cloud.compute.deprecated.ImageInfo$Builder [^com.google.cloud.compute.deprecated.ImageId image-id ^com.google.cloud.compute.deprecated.ImageConfiguration configuration]
    (ImageInfo/newBuilder image-id configuration)))

(defn *of
  "Returns an ImageInfo object given the image identity and an image configuration. Use
   DiskImageConfiguration to create an image from an existing disk. Use StorageImageConfiguration to create an image from a file stored in Google Cloud Storage.

  image-id - `com.google.cloud.compute.deprecated.ImageId`
  configuration - `com.google.cloud.compute.deprecated.ImageConfiguration`

  returns: `com.google.cloud.compute.deprecated.ImageInfo`"
  (^com.google.cloud.compute.deprecated.ImageInfo [^com.google.cloud.compute.deprecated.ImageId image-id ^com.google.cloud.compute.deprecated.ImageConfiguration configuration]
    (ImageInfo/of image-id configuration)))

(defn get-image-id
  "Returns the image identity.

  returns: `com.google.cloud.compute.deprecated.ImageId`"
  (^com.google.cloud.compute.deprecated.ImageId [^ImageInfo this]
    (-> this (.getImageId))))

(defn get-deprecation-status
  "Returns the deprecation status of the image. If DeprecationStatus.getStatus() is either
   DeprecationStatus.Status.DELETED or DeprecationStatus.Status.OBSOLETE the image
   must not be used. Returns null if the image is not deprecated.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus<com.google.cloud.compute.deprecated.ImageId>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus [^ImageInfo this]
    (-> this (.getDeprecationStatus))))

(defn get-status
  "Returns the status of the image. An image can be used to create other disks only after it has
   been successfully created and its status is set to ImageInfo.Status.READY.

  returns: `com.google.cloud.compute.deprecated.ImageInfo$Status`"
  (^com.google.cloud.compute.deprecated.ImageInfo$Status [^ImageInfo this]
    (-> this (.getStatus))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ImageInfo this]
    (-> this (.toString))))

(defn get-licenses
  "Returns all applicable publicly visible licenses.

  returns: `java.util.List<com.google.cloud.compute.deprecated.LicenseId>`"
  (^java.util.List [^ImageInfo this]
    (-> this (.getLicenses))))

(defn get-description
  "Returns a textual description of the image.

  returns: `java.lang.String`"
  (^java.lang.String [^ImageInfo this]
    (-> this (.getDescription))))

(defn get-disk-size-gb
  "Returns the size of the image when restored onto a persistent disk (in GB).

  returns: `java.lang.Long`"
  (^java.lang.Long [^ImageInfo this]
    (-> this (.getDiskSizeGb))))

(defn get-configuration
  "Returns the image configuration. This method returns an instance of DiskImageConfiguration if the the image was created from a Google Compute Engine disk. This
   method returns an instance of StorageImageConfiguration if the image was created from a
   file stored in Google Cloud Storage.

  returns: `<T extends com.google.cloud.compute.deprecated.ImageConfiguration> T`"
  ([^ImageInfo this]
    (-> this (.getConfiguration))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ImageInfo this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ImageInfo this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the image.

  returns: `java.lang.String`"
  (^java.lang.String [^ImageInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImageInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the current image.

  returns: `com.google.cloud.compute.deprecated.ImageInfo$Builder`"
  (^com.google.cloud.compute.deprecated.ImageInfo$Builder [^ImageInfo this]
    (-> this (.toBuilder))))

