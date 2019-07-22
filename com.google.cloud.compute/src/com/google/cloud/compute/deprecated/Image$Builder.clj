(ns com.google.cloud.compute.deprecated.Image$Builder
  "A builder for Image objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Image$Builder]))

(defn set-image-id
  "Description copied from class: ImageInfo.Builder

  image-id - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.Image$Builder`"
  (^com.google.cloud.compute.deprecated.Image$Builder [^Image$Builder this ^com.google.cloud.compute.deprecated.ImageId image-id]
    (-> this (.setImageId image-id))))

(defn set-description
  "Description copied from class: ImageInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Image$Builder`"
  (^com.google.cloud.compute.deprecated.Image$Builder [^Image$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-configuration
  "Description copied from class: ImageInfo.Builder

  configuration - `com.google.cloud.compute.deprecated.ImageConfiguration`

  returns: `com.google.cloud.compute.deprecated.Image$Builder`"
  (^com.google.cloud.compute.deprecated.Image$Builder [^Image$Builder this ^com.google.cloud.compute.deprecated.ImageConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn build
  "Description copied from class: ImageInfo.Builder

  returns: `com.google.cloud.compute.deprecated.Image`"
  (^com.google.cloud.compute.deprecated.Image [^Image$Builder this]
    (-> this (.build))))

