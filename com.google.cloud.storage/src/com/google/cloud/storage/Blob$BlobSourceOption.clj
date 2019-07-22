(ns com.google.cloud.storage.Blob$BlobSourceOption
  "Class for specifying blob source options when Blob methods are used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Blob$BlobSourceOption]))

(defn *generation-match
  "Returns an option for blob's generation match. If this option is used the request will fail
   if generation does not match.

  returns: `com.google.cloud.storage.Blob$BlobSourceOption`"
  (^com.google.cloud.storage.Blob$BlobSourceOption []
    (Blob$BlobSourceOption/generationMatch )))

(defn *generation-not-match
  "Returns an option for blob's generation mismatch. If this option is used the request will
   fail if generation matches.

  returns: `com.google.cloud.storage.Blob$BlobSourceOption`"
  (^com.google.cloud.storage.Blob$BlobSourceOption []
    (Blob$BlobSourceOption/generationNotMatch )))

(defn *metageneration-match
  "Returns an option for blob's metageneration match. If this option is used the request will
   fail if metageneration does not match.

  returns: `com.google.cloud.storage.Blob$BlobSourceOption`"
  (^com.google.cloud.storage.Blob$BlobSourceOption []
    (Blob$BlobSourceOption/metagenerationMatch )))

(defn *metageneration-not-match
  "Returns an option for blob's metageneration mismatch. If this option is used the request will
   fail if metageneration matches.

  returns: `com.google.cloud.storage.Blob$BlobSourceOption`"
  (^com.google.cloud.storage.Blob$BlobSourceOption []
    (Blob$BlobSourceOption/metagenerationNotMatch )))

(defn *decryption-key
  "Returns an option to set a customer-supplied AES256 key for server-side encryption of the
   blob.

  key - `java.security.Key`

  returns: `com.google.cloud.storage.Blob$BlobSourceOption`"
  (^com.google.cloud.storage.Blob$BlobSourceOption [^java.security.Key key]
    (Blob$BlobSourceOption/decryptionKey key)))

(defn *user-project
  "Returns an option for blob's billing user project. This option is used only if the blob's
   bucket has requester_pays flag enabled.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Blob$BlobSourceOption`"
  (^com.google.cloud.storage.Blob$BlobSourceOption [^java.lang.String user-project]
    (Blob$BlobSourceOption/userProject user-project)))

