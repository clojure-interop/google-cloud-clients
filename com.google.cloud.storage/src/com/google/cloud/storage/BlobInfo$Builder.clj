(ns com.google.cloud.storage.BlobInfo$Builder
  "Builder for BlobInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BlobInfo$Builder]))

(defn ->builder
  "Constructor."
  (^BlobInfo$Builder []
    (new BlobInfo$Builder )))

(defn set-content-encoding
  "Sets the blob's data content encoding.

  content-encoding - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String content-encoding]
    (-> this (.setContentEncoding content-encoding))))

(defn set-cache-control
  "Sets the blob's data cache control.

  cache-control - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String cache-control]
    (-> this (.setCacheControl cache-control))))

(defn set-content-type
  "Sets the blob's data content type.

  content-type - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String content-type]
    (-> this (.setContentType content-type))))

(defn set-crc-32c-from-hex-string
  "Sets the CRC32C checksum of blob's data as described in RFC 4960, Appendix B; from hex
   string.

  crc-32c-hex-string - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String crc-32c-hex-string]
    (-> this (.setCrc32cFromHexString crc-32c-hex-string))))

(defn set-md-5-from-hex-string
  "Sets the MD5 hash of blob's data from hex string.

  md-5-hex-string - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String md-5-hex-string]
    (-> this (.setMd5FromHexString md-5-hex-string))))

(defn set-storage-class
  "Sets the blob's storage class.

  storage-class - `com.google.cloud.storage.StorageClass`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^com.google.cloud.storage.StorageClass storage-class]
    (-> this (.setStorageClass storage-class))))

(defn set-md-5
  "Sets the MD5 hash of blob's data. MD5 value must be encoded in base64.

  md-5 - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String md-5]
    (-> this (.setMd5 md-5))))

(defn set-acl
  "Sets the blob's access control configuration.

  acl - `java.util.List`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.util.List acl]
    (-> this (.setAcl acl))))

(defn set-content-language
  "Sets the blob's data content language.

  content-language - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String content-language]
    (-> this (.setContentLanguage content-language))))

(defn build
  "Creates a BlobInfo object.

  returns: `com.google.cloud.storage.BlobInfo`"
  (^com.google.cloud.storage.BlobInfo [^BlobInfo$Builder this]
    (-> this (.build))))

(defn set-crc-32c
  "Sets the CRC32C checksum of blob's data as described in RFC 4960, Appendix B; encoded in
   base64 in big-endian order.

  crc-32c - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String crc-32c]
    (-> this (.setCrc32c crc-32c))))

(defn set-event-based-hold
  "Sets the blob's event-based hold.

  event-based-hold - `java.lang.Boolean`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.Boolean event-based-hold]
    (-> this (.setEventBasedHold event-based-hold))))

(defn set-content-disposition
  "Sets the blob's data content disposition.

  content-disposition - `java.lang.String`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.String content-disposition]
    (-> this (.setContentDisposition content-disposition))))

(defn set-metadata
  "Sets the blob's user provided metadata.

  metadata - `java.util.Map`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.util.Map metadata]
    (-> this (.setMetadata metadata))))

(defn set-blob-id
  "Sets the blob identity.

  blob-id - `com.google.cloud.storage.BlobId`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^com.google.cloud.storage.BlobId blob-id]
    (-> this (.setBlobId blob-id))))

(defn set-temporary-hold
  "Sets the blob's temporary hold.

  temporary-hold - `java.lang.Boolean`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo$Builder this ^java.lang.Boolean temporary-hold]
    (-> this (.setTemporaryHold temporary-hold))))

