(ns com.google.cloud.storage.contrib.nio.CloudStorageFileAttributes
  "Interface for attributes on a Cloud Storage file or pseudo-directory."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageFileAttributes]))

(defn etag
  "Returns HTTP etag hash of object contents.

  returns: `com.google.common.base.Optional<java.lang.String>`"
  (^com.google.common.base.Optional [^CloudStorageFileAttributes this]
    (-> this (.etag))))

(defn mime-type
  "Returns mime type (e.g. text/plain), if set.

  returns: `com.google.common.base.Optional<java.lang.String>`"
  (^com.google.common.base.Optional [^CloudStorageFileAttributes this]
    (-> this (.mimeType))))

(defn acl
  "Returns access control list.

  returns: `com.google.common.base.Optional<java.util.List<com.google.cloud.storage.Acl>>`"
  (^com.google.common.base.Optional [^CloudStorageFileAttributes this]
    (-> this (.acl))))

(defn cache-control
  "Returns Cache-Control HTTP header value, if set.

  returns: `com.google.common.base.Optional<java.lang.String>`"
  (^com.google.common.base.Optional [^CloudStorageFileAttributes this]
    (-> this (.cacheControl))))

(defn content-encoding
  "Returns Content-Encoding HTTP header value, if set.

  returns: `com.google.common.base.Optional<java.lang.String>`"
  (^com.google.common.base.Optional [^CloudStorageFileAttributes this]
    (-> this (.contentEncoding))))

(defn content-disposition
  "Returns Content-Disposition HTTP header value, if set.

  returns: `com.google.common.base.Optional<java.lang.String>`"
  (^com.google.common.base.Optional [^CloudStorageFileAttributes this]
    (-> this (.contentDisposition))))

(defn user-metadata
  "Returns user-specified metadata.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^CloudStorageFileAttributes this]
    (-> this (.userMetadata))))

