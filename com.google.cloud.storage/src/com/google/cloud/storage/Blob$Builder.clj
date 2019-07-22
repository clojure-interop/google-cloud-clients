(ns com.google.cloud.storage.Blob$Builder
  "Builder for Blob."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Blob$Builder]))

(defn set-content-encoding
  "Description copied from class: BlobInfo.Builder

  content-encoding - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String content-encoding]
    (-> this (.setContentEncoding content-encoding))))

(defn set-cache-control
  "Description copied from class: BlobInfo.Builder

  cache-control - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String cache-control]
    (-> this (.setCacheControl cache-control))))

(defn set-content-type
  "Description copied from class: BlobInfo.Builder

  content-type - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String content-type]
    (-> this (.setContentType content-type))))

(defn set-crc-32c-from-hex-string
  "Description copied from class: BlobInfo.Builder

  crc-32c-hex-string - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String crc-32c-hex-string]
    (-> this (.setCrc32cFromHexString crc-32c-hex-string))))

(defn set-md-5-from-hex-string
  "Description copied from class: BlobInfo.Builder

  md-5-hex-string - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String md-5-hex-string]
    (-> this (.setMd5FromHexString md-5-hex-string))))

(defn set-storage-class
  "Description copied from class: BlobInfo.Builder

  storage-class - `com.google.cloud.storage.StorageClass`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^com.google.cloud.storage.StorageClass storage-class]
    (-> this (.setStorageClass storage-class))))

(defn set-md-5
  "Description copied from class: BlobInfo.Builder

  md-5 - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String md-5]
    (-> this (.setMd5 md-5))))

(defn set-acl
  "Description copied from class: BlobInfo.Builder

  acl - `java.util.List`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.util.List acl]
    (-> this (.setAcl acl))))

(defn set-content-language
  "Description copied from class: BlobInfo.Builder

  content-language - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String content-language]
    (-> this (.setContentLanguage content-language))))

(defn build
  "Description copied from class: BlobInfo.Builder

  returns: `com.google.cloud.storage.Blob`"
  (^com.google.cloud.storage.Blob [^Blob$Builder this]
    (-> this (.build))))

(defn set-crc-32c
  "Description copied from class: BlobInfo.Builder

  crc-32c - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String crc-32c]
    (-> this (.setCrc32c crc-32c))))

(defn set-event-based-hold
  "Description copied from class: BlobInfo.Builder

  event-based-hold - `java.lang.Boolean`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.Boolean event-based-hold]
    (-> this (.setEventBasedHold event-based-hold))))

(defn set-content-disposition
  "Description copied from class: BlobInfo.Builder

  content-disposition - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.String content-disposition]
    (-> this (.setContentDisposition content-disposition))))

(defn set-metadata
  "Description copied from class: BlobInfo.Builder

  metadata - `java.util.Map`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.util.Map metadata]
    (-> this (.setMetadata metadata))))

(defn set-blob-id
  "Description copied from class: BlobInfo.Builder

  blob-id - `com.google.cloud.storage.BlobId`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^com.google.cloud.storage.BlobId blob-id]
    (-> this (.setBlobId blob-id))))

(defn set-temporary-hold
  "Description copied from class: BlobInfo.Builder

  temporary-hold - `java.lang.Boolean`

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob$Builder this ^java.lang.Boolean temporary-hold]
    (-> this (.setTemporaryHold temporary-hold))))

