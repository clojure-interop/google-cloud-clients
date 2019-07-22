(ns com.google.cloud.compute.deprecated.Image
  "A Google Compute Engine Image. An image contains a boot loader, an operating system and a root
  file system that is necessary for starting an instance. Compute Engine offers publicly-available
  images of certain operating systems that you can use, or you can create a custom image. A custom
  image is an image created from one of your virtual machine instances that contains your specific
  instance configurations. To get an Image object with the most recent information use
  reload(com.google.cloud.compute.deprecated.Compute.ImageOption...). Image adds a layer of service-related functionality over ImageInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Image]))

(defn exists?
  "Checks if this image exists.

  returns: true if this image exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Image this]
    (-> this (.exists))))

(defn reload
  "Fetches current image' latest information. Returns null if the image does not exist.

  options - image options - `com.google.cloud.compute.deprecated.Compute$ImageOption`

  returns: an Image object with latest information or null if not found - `com.google.cloud.compute.deprecated.Image`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Image [^Image this ^com.google.cloud.compute.deprecated.Compute$ImageOption options]
    (-> this (.reload options))))

(defn delete
  "Deletes this image.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if the delete request was successfully sent, null if the
       image was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if this image is a publicly-available image"
  (^com.google.cloud.compute.deprecated.Operation [^Image this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.delete options))))

(defn deprecate
  "Deprecates this image.

  deprecation-status - `com.google.cloud.compute.deprecated.DeprecationStatus`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if the deprecation request was successfully sent, null if
       the image was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if this image is a publicly-available image"
  (^com.google.cloud.compute.deprecated.Operation [^Image this ^com.google.cloud.compute.deprecated.DeprecationStatus deprecation-status ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deprecate deprecation-status options))))

(defn get-compute
  "Returns the image's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Image this]
    (-> this (.getCompute))))

(defn to-builder
  "Description copied from class: ImageInfo

  returns: `com.google.cloud.compute.deprecated.Image$Builder`"
  (^com.google.cloud.compute.deprecated.Image$Builder [^Image this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Image this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Image this]
    (-> this (.hashCode))))

