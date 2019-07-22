(ns com.google.cloud.compute.deprecated.ImageInfo$Builder
  "A builder for ImageInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageInfo$Builder]))

(defn ->builder
  "Constructor."
  (^ImageInfo$Builder []
    (new ImageInfo$Builder )))

(defn set-image-id
  "Sets the image identity.

  image-id - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.ImageInfo$Builder`"
  (^com.google.cloud.compute.deprecated.ImageInfo$Builder [^ImageInfo$Builder this ^com.google.cloud.compute.deprecated.ImageId image-id]
    (-> this (.setImageId image-id))))

(defn set-description
  "Sets an optional textual description of the image.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.ImageInfo$Builder`"
  (^com.google.cloud.compute.deprecated.ImageInfo$Builder [^ImageInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-configuration
  "Sets the image configuration. Use DiskImageConfiguration to create an image from an
   existing disk. Use StorageImageConfiguration to create an image from a file stored in
   Google Cloud Storage.

  configuration - `com.google.cloud.compute.deprecated.ImageConfiguration`

  returns: `com.google.cloud.compute.deprecated.ImageInfo$Builder`"
  (^com.google.cloud.compute.deprecated.ImageInfo$Builder [^ImageInfo$Builder this ^com.google.cloud.compute.deprecated.ImageConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn build
  "Creates a ImageInfo object.

  returns: `com.google.cloud.compute.deprecated.ImageInfo`"
  (^com.google.cloud.compute.deprecated.ImageInfo [^ImageInfo$Builder this]
    (-> this (.build))))

