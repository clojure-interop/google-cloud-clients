(ns com.google.cloud.compute.v1.RawDisk$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RawDisk$Builder]))

(defn get-container-type
  "The format used to encode and transmit the block device, which should be TAR. This is just a
   container and transmission format and not a runtime format. Provided by the client when the
   disk image is created.

  returns: `java.lang.String`"
  (^java.lang.String [^RawDisk$Builder this]
    (-> this (.getContainerType))))

(defn get-source
  "The full Google Cloud Storage URL where the disk image is stored. You must provide either
   this property or the sourceDisk property but not both.

  returns: `java.lang.String`"
  (^java.lang.String [^RawDisk$Builder this]
    (-> this (.getSource))))

(defn build
  "returns: `com.google.cloud.compute.v1.RawDisk`"
  (^com.google.cloud.compute.v1.RawDisk [^RawDisk$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RawDisk`

  returns: `com.google.cloud.compute.v1.RawDisk$Builder`"
  (^com.google.cloud.compute.v1.RawDisk$Builder [^RawDisk$Builder this ^com.google.cloud.compute.v1.RawDisk other]
    (-> this (.mergeFrom other))))

(defn get-sha-1-checksum
  "[Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before
   unpackaging provided by the client when the disk image is created.

  returns: `java.lang.String`"
  (^java.lang.String [^RawDisk$Builder this]
    (-> this (.getSha1Checksum))))

(defn set-container-type
  "The format used to encode and transmit the block device, which should be TAR. This is just a
   container and transmission format and not a runtime format. Provided by the client when the
   disk image is created.

  container-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RawDisk$Builder`"
  (^com.google.cloud.compute.v1.RawDisk$Builder [^RawDisk$Builder this ^java.lang.String container-type]
    (-> this (.setContainerType container-type))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RawDisk$Builder`"
  (^com.google.cloud.compute.v1.RawDisk$Builder [^RawDisk$Builder this]
    (-> this (.clone))))

(defn set-sha-1-checksum
  "[Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before
   unpackaging provided by the client when the disk image is created.

  sha-1-checksum - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RawDisk$Builder`"
  (^com.google.cloud.compute.v1.RawDisk$Builder [^RawDisk$Builder this ^java.lang.String sha-1-checksum]
    (-> this (.setSha1Checksum sha-1-checksum))))

(defn set-source
  "The full Google Cloud Storage URL where the disk image is stored. You must provide either
   this property or the sourceDisk property but not both.

  source - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RawDisk$Builder`"
  (^com.google.cloud.compute.v1.RawDisk$Builder [^RawDisk$Builder this ^java.lang.String source]
    (-> this (.setSource source))))

