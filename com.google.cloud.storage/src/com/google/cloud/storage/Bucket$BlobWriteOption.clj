(ns com.google.cloud.storage.Bucket$BlobWriteOption
  "Class for specifying blob write options when Bucket methods are used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Bucket$BlobWriteOption]))

(defn *user-project
  "Returns an option for blob's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^java.lang.String user-project]
    (Bucket$BlobWriteOption/userProject user-project)))

(defn *metageneration-match
  "Returns an option for blob's metageneration match. If this option is used the request will
   fail if metageneration does not match the provided value. This option can not be provided
   together with metagenerationNotMatch(long).

  metageneration - `long`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^Long metageneration]
    (Bucket$BlobWriteOption/metagenerationMatch metageneration)))

(defn *md-5-match
  "Returns an option for blob's data MD5 hash match. If this option is used the request will
   fail if blobs' data MD5 hash does not match the provided value.

  md-5 - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^java.lang.String md-5]
    (Bucket$BlobWriteOption/md5Match md-5)))

(defn *predefined-acl
  "Returns an option for specifying blob's predefined ACL configuration.

  acl - `com.google.cloud.storage.Storage$PredefinedAcl`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^com.google.cloud.storage.Storage$PredefinedAcl acl]
    (Bucket$BlobWriteOption/predefinedAcl acl)))

(defn *generation-match
  "Returns an option for blob's data generation match. If this option is used the request will
   fail if generation does not match the provided value. This option can not be provided
   together with generationNotMatch(long) or doesNotExist().

  generation - `long`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^Long generation]
    (Bucket$BlobWriteOption/generationMatch generation)))

(defn *generation-not-match
  "Returns an option for blob's data generation mismatch. If this option is used the request
   will fail if generation matches the provided value. This option can not be provided together
   with generationMatch(long) or doesNotExist().

  generation - `long`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^Long generation]
    (Bucket$BlobWriteOption/generationNotMatch generation)))

(defn *does-not-exist
  "Returns an option that causes an operation to succeed only if the target blob does not exist.
   This option can not be provided together with generationMatch(long) or generationNotMatch(long).

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption []
    (Bucket$BlobWriteOption/doesNotExist )))

(defn *encryption-key
  "Returns an option to set a customer-supplied AES256 key for server-side encryption of the
   blob.

  key - `java.security.Key`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^java.security.Key key]
    (Bucket$BlobWriteOption/encryptionKey key)))

(defn *metageneration-not-match
  "Returns an option for blob's metageneration mismatch. If this option is used the request will
   fail if metageneration matches the provided value. This option can not be provided together
   with metagenerationMatch(long).

  metageneration - `long`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^Long metageneration]
    (Bucket$BlobWriteOption/metagenerationNotMatch metageneration)))

(defn *crc-32c-match
  "Returns an option for blob's data CRC32C checksum match. If this option is used the request
   will fail if blobs' data CRC32C checksum does not match the provided value.

  crc-32c - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$BlobWriteOption`"
  (^com.google.cloud.storage.Bucket$BlobWriteOption [^java.lang.String crc-32c]
    (Bucket$BlobWriteOption/crc32cMatch crc-32c)))

(defn hash-code
  "returns: `int`"
  (^Integer [^Bucket$BlobWriteOption this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Bucket$BlobWriteOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

