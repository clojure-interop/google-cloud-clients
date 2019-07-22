(ns com.google.cloud.compute.deprecated.StorageImageConfiguration
  "A Google Compute Engine image configuration used to create images from a Google Cloud Storage URL
  where the disk image is stored."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated StorageImageConfiguration]))

(defn *new-builder
  "Creates a StorageImageConfiguration builder given the full Google Cloud Storage URL
   where the disk image is stored.

  source - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder [^java.lang.String source]
    (StorageImageConfiguration/newBuilder source)))

(defn *of
  "Creates a StorageImageConfiguration object given the full Google Cloud Storage URL
   where the disk image is stored.

  source - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration [^java.lang.String source]
    (StorageImageConfiguration/of source)))

(defn get-container-type
  "Returns the format used to encode and transmit the block device. This is just a container and
   transmission format, not a runtime format.

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType [^StorageImageConfiguration this]
    (-> this (.getContainerType))))

(defn get-sha-1
  "Returns the SHA1 checksum of the disk image before unpackaging.

  returns: `java.lang.String`"
  (^java.lang.String [^StorageImageConfiguration this]
    (-> this (.getSha1))))

(defn get-source
  "Returns the full Google Cloud Storage URL where the disk image is stored (e.g. gs://bucket/file).

  returns: `java.lang.String`"
  (^java.lang.String [^StorageImageConfiguration this]
    (-> this (.getSource))))

(defn to-builder
  "Description copied from class: ImageConfiguration

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder [^StorageImageConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StorageImageConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StorageImageConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

