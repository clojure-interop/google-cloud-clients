(ns com.google.cloud.storage.BlobId
  "Google Storage Object identifier. A BlobId object includes the name of the containing
  bucket, the blob's name and possibly the blob's generation. If getGeneration() is null the identifier refers to the latest blob's generation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BlobId]))

(defn *of
  "Creates a BlobId object.

  bucket - name of the containing bucket - `java.lang.String`
  name - blob's name - `java.lang.String`
  generation - blob's data generation, used for versioning. If null the identifier refers to the latest blob's generation - `java.lang.Long`

  returns: `com.google.cloud.storage.BlobId`"
  (^com.google.cloud.storage.BlobId [^java.lang.String bucket ^java.lang.String name ^java.lang.Long generation]
    (BlobId/of bucket name generation))
  (^com.google.cloud.storage.BlobId [^java.lang.String bucket ^java.lang.String name]
    (BlobId/of bucket name)))

(defn get-bucket
  "Returns the name of the bucket containing the blob.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobId this]
    (-> this (.getBucket))))

(defn get-name
  "Returns the name of the blob.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobId this]
    (-> this (.getName))))

(defn get-generation
  "Returns blob's data generation. Used for versioning.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobId this]
    (-> this (.getGeneration))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlobId this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BlobId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BlobId this ^java.lang.Object obj]
    (-> this (.equals obj))))

