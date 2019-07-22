(ns com.google.cloud.compute.deprecated.ImageConfiguration
  "Base class for Google Compute Engine image configuration. Use DiskImageConfiguration to
  create an image from an existing Google Compute Engine disk. Use StorageImageConfiguration to create an image from a file stored in Google Cloud Storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageConfiguration]))

(defn get-type
  "Returns the image's type. This method returns ImageConfiguration.Type.DISK if this image was created from
   an existing disk. This method returns ImageConfiguration.Type.STORAGE if this image was created from a
   file in Google Cloud Storage.

  returns: `com.google.cloud.compute.deprecated.ImageConfiguration$Type`"
  (^com.google.cloud.compute.deprecated.ImageConfiguration$Type [^ImageConfiguration this]
    (-> this (.getType))))

(defn get-source-type
  "Returns the source type of the disk. The default and only value is ImageConfiguration.SourceType.RAW.

  returns: `com.google.cloud.compute.deprecated.ImageConfiguration$SourceType`"
  (^com.google.cloud.compute.deprecated.ImageConfiguration$SourceType [^ImageConfiguration this]
    (-> this (.getSourceType))))

(defn get-archive-size-bytes
  "Returns the size of the image archive stored in Google Cloud Storage (in bytes).

  returns: `java.lang.Long`"
  (^java.lang.Long [^ImageConfiguration this]
    (-> this (.getArchiveSizeBytes))))

(defn to-builder
  "Returns a builder for the object.

  returns: `com.google.cloud.compute.deprecated.ImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.ImageConfiguration$Builder [^ImageConfiguration this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ImageConfiguration this]
    (-> this (.toString))))

