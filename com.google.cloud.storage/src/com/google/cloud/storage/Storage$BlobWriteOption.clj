(ns com.google.cloud.storage.Storage$BlobWriteOption
  "Class for specifying blob write options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BlobWriteOption]))

(defn *user-project
  "Returns an option for blob's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption [^java.lang.String user-project]
    (Storage$BlobWriteOption/userProject user-project)))

(defn *metageneration-match
  "Returns an option for blob's metageneration match. If this option is used the request will
   fail if metageneration does not match.

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption []
    (Storage$BlobWriteOption/metagenerationMatch )))

(defn *md-5-match
  "Returns an option for blob's data MD5 hash match. If this option is used the request will
   fail if blobs' data MD5 hash does not match.

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption []
    (Storage$BlobWriteOption/md5Match )))

(defn *predefined-acl
  "Returns an option for specifying blob's predefined ACL configuration.

  acl - `com.google.cloud.storage.Storage$PredefinedAcl`

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption [^com.google.cloud.storage.Storage$PredefinedAcl acl]
    (Storage$BlobWriteOption/predefinedAcl acl)))

(defn *generation-match
  "Returns an option for blob's data generation match. If this option is used the request will
   fail if generation does not match.

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption []
    (Storage$BlobWriteOption/generationMatch )))

(defn *generation-not-match
  "Returns an option for blob's data generation mismatch. If this option is used the request
   will fail if generation matches.

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption []
    (Storage$BlobWriteOption/generationNotMatch )))

(defn *does-not-exist
  "Returns an option that causes an operation to succeed only if the target blob does not exist.

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption []
    (Storage$BlobWriteOption/doesNotExist )))

(defn *encryption-key
  "Returns an option to set a customer-supplied AES256 key for server-side encryption of the
   blob.

  key - `java.security.Key`

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption [^java.security.Key key]
    (Storage$BlobWriteOption/encryptionKey key)))

(defn *metageneration-not-match
  "Returns an option for blob's metageneration mismatch. If this option is used the request will
   fail if metageneration matches.

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption []
    (Storage$BlobWriteOption/metagenerationNotMatch )))

(defn *crc-32c-match
  "Returns an option for blob's data CRC32C checksum match. If this option is used the request
   will fail if blobs' data CRC32C checksum does not match.

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption []
    (Storage$BlobWriteOption/crc32cMatch )))

(defn *kms-key-name
  "Returns an option to set a customer-managed KMS key for server-side encryption of the blob.

  kms-key-name - the KMS key resource id - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobWriteOption`"
  (^com.google.cloud.storage.Storage$BlobWriteOption [^java.lang.String kms-key-name]
    (Storage$BlobWriteOption/kmsKeyName kms-key-name)))

(defn hash-code
  "returns: `int`"
  (^Integer [^Storage$BlobWriteOption this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Storage$BlobWriteOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

