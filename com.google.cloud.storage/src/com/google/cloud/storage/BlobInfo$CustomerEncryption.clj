(ns com.google.cloud.storage.BlobInfo$CustomerEncryption
  "Objects of this class hold information on the customer-supplied encryption key, if the blob is
  encrypted using such a key."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BlobInfo$CustomerEncryption]))

(defn get-encryption-algorithm
  "Returns the algorithm used to encrypt the blob.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo$CustomerEncryption this]
    (-> this (.getEncryptionAlgorithm))))

(defn get-key-sha-256
  "Returns the SHA256 hash of the encryption key.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo$CustomerEncryption this]
    (-> this (.getKeySha256))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo$CustomerEncryption this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BlobInfo$CustomerEncryption this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BlobInfo$CustomerEncryption this ^java.lang.Object obj]
    (-> this (.equals obj))))

