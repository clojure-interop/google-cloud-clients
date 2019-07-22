(ns com.google.cloud.storage.Storage$BlobSourceOption
  "Class for specifying blob source options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BlobSourceOption]))

(defn *generation-match
  "Returns an option for blob's data generation match. If this option is used the request will
   fail if blob's generation does not match the provided value.

  generation - `long`

  returns: `com.google.cloud.storage.Storage$BlobSourceOption`"
  (^com.google.cloud.storage.Storage$BlobSourceOption [^Long generation]
    (Storage$BlobSourceOption/generationMatch generation))
  (^com.google.cloud.storage.Storage$BlobSourceOption []
    (Storage$BlobSourceOption/generationMatch )))

(defn *generation-not-match
  "Returns an option for blob's data generation mismatch. If this option is used the request
   will fail if blob's generation matches the provided value.

  generation - `long`

  returns: `com.google.cloud.storage.Storage$BlobSourceOption`"
  (^com.google.cloud.storage.Storage$BlobSourceOption [^Long generation]
    (Storage$BlobSourceOption/generationNotMatch generation))
  (^com.google.cloud.storage.Storage$BlobSourceOption []
    (Storage$BlobSourceOption/generationNotMatch )))

(defn *metageneration-match
  "Returns an option for blob's metageneration match. If this option is used the request will
   fail if blob's metageneration does not match the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BlobSourceOption`"
  (^com.google.cloud.storage.Storage$BlobSourceOption [^Long metageneration]
    (Storage$BlobSourceOption/metagenerationMatch metageneration)))

(defn *metageneration-not-match
  "Returns an option for blob's metageneration mismatch. If this option is used the request will
   fail if blob's metageneration matches the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BlobSourceOption`"
  (^com.google.cloud.storage.Storage$BlobSourceOption [^Long metageneration]
    (Storage$BlobSourceOption/metagenerationNotMatch metageneration)))

(defn *decryption-key
  "Returns an option to set a customer-supplied AES256 key for server-side encryption of the
   blob.

  key - `java.security.Key`

  returns: `com.google.cloud.storage.Storage$BlobSourceOption`"
  (^com.google.cloud.storage.Storage$BlobSourceOption [^java.security.Key key]
    (Storage$BlobSourceOption/decryptionKey key)))

(defn *user-project
  "Returns an option for blob's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobSourceOption`"
  (^com.google.cloud.storage.Storage$BlobSourceOption [^java.lang.String user-project]
    (Storage$BlobSourceOption/userProject user-project)))

