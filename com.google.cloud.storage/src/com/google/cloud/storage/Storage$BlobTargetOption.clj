(ns com.google.cloud.storage.Storage$BlobTargetOption
  "Class for specifying blob target options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BlobTargetOption]))

(defn *user-project
  "Returns an option for blob's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption [^java.lang.String user-project]
    (Storage$BlobTargetOption/userProject user-project)))

(defn *metageneration-match
  "Returns an option for blob's metageneration match. If this option is used the request will
   fail if metageneration does not match.

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption []
    (Storage$BlobTargetOption/metagenerationMatch )))

(defn *predefined-acl
  "Returns an option for specifying blob's predefined ACL configuration.

  acl - `com.google.cloud.storage.Storage$PredefinedAcl`

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption [^com.google.cloud.storage.Storage$PredefinedAcl acl]
    (Storage$BlobTargetOption/predefinedAcl acl)))

(defn *generation-match
  "Returns an option for blob's data generation match. If this option is used the request will
   fail if generation does not match.

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption []
    (Storage$BlobTargetOption/generationMatch )))

(defn *generation-not-match
  "Returns an option for blob's data generation mismatch. If this option is used the request
   will fail if generation matches.

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption []
    (Storage$BlobTargetOption/generationNotMatch )))

(defn *disable-gzip-content
  "Returns an option for blob's data disabledGzipContent. If this option is used, the request
   will create a blob with disableGzipContent; at present, this is only for upload.

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption []
    (Storage$BlobTargetOption/disableGzipContent )))

(defn *does-not-exist
  "Returns an option that causes an operation to succeed only if the target blob does not exist.

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption []
    (Storage$BlobTargetOption/doesNotExist )))

(defn *encryption-key
  "Returns an option to set a customer-supplied AES256 key for server-side encryption of the
   blob.

  key - `java.security.Key`

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption [^java.security.Key key]
    (Storage$BlobTargetOption/encryptionKey key)))

(defn *metageneration-not-match
  "Returns an option for blob's metageneration mismatch. If this option is used the request will
   fail if metageneration matches.

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption []
    (Storage$BlobTargetOption/metagenerationNotMatch )))

(defn *kms-key-name
  "Returns an option to set a customer-managed key for server-side encryption of the blob.

  kms-key-name - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobTargetOption`"
  (^com.google.cloud.storage.Storage$BlobTargetOption [^java.lang.String kms-key-name]
    (Storage$BlobTargetOption/kmsKeyName kms-key-name)))

