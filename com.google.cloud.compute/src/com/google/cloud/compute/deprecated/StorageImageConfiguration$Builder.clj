(ns com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder
  "A builder for StorageImageConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated StorageImageConfiguration$Builder]))

(defn set-container-type
  "Sets the format used to encode and transmit the block device. The only supported value is
   TAR. This is just a container and transmission format, not a runtime format.

  container-type - `com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType`

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder [^StorageImageConfiguration$Builder this ^com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType container-type]
    (-> this (.setContainerType container-type))))

(defn set-sha-1
  "Sets the SHA1 checksum of the disk image before unpackaging.

  sha-1 - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder [^StorageImageConfiguration$Builder this ^java.lang.String sha-1]
    (-> this (.setSha1 sha-1))))

(defn set-source
  "Sets the full Google Cloud Storage URL where the disk image is stored (e.g. gs://bucket/file).

  source - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder [^StorageImageConfiguration$Builder this ^java.lang.String source]
    (-> this (.setSource source))))

(defn build
  "Creates a StorageImageConfiguration object.

  returns: `com.google.cloud.compute.deprecated.StorageImageConfiguration`"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration [^StorageImageConfiguration$Builder this]
    (-> this (.build))))

