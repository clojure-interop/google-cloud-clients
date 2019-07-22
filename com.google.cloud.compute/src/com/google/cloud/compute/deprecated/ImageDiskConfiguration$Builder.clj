(ns com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder
  "A builder for ImageDiskConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageDiskConfiguration$Builder]))

(defn set-size-gb
  "Sets the size of the persistent disk, in GB. If not set the disk will have the size of the
   image. This value can be larger than the image's size. If the provided size is smaller than
   the image's size then disk creation will fail.

  size-gb - `java.lang.Long`

  returns: `com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder [^ImageDiskConfiguration$Builder this ^java.lang.Long size-gb]
    (-> this (.setSizeGb size-gb))))

(defn set-source-image
  "Sets the identity of the source image used to create the disk.

  source-image - `com.google.cloud.compute.deprecated.ImageId`

  returns: `com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder [^ImageDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.ImageId source-image]
    (-> this (.setSourceImage source-image))))

(defn build
  "Creates an ImageDiskConfiguration object.

  returns: `com.google.cloud.compute.deprecated.ImageDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.ImageDiskConfiguration [^ImageDiskConfiguration$Builder this]
    (-> this (.build))))

