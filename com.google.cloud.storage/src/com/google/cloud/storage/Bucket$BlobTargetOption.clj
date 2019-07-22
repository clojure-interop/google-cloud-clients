(ns com.google.cloud.storage.Bucket$BlobTargetOption
  "Class for specifying blob target options when Bucket methods are used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Bucket$BlobTargetOption]))

(defn *user-project
  "Returns an option for blob's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^java.lang.String user-project]
    (Bucket$BlobTargetOption/userProject user-project)))

(defn *metageneration-match
  "Returns an option for blob's metageneration match. If this option is used the request will
   fail if metageneration does not match the provided value. This option can not be provided
   together with metagenerationNotMatch(long).

  metageneration - `long`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^Long metageneration]
    (Bucket$BlobTargetOption/metagenerationMatch metageneration)))

(defn *predefined-acl
  "Returns an option for specifying blob's predefined ACL configuration.

  acl - `com.google.cloud.storage.Storage$PredefinedAcl`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^com.google.cloud.storage.Storage$PredefinedAcl acl]
    (Bucket$BlobTargetOption/predefinedAcl acl)))

(defn *generation-match
  "Returns an option for blob's data generation match. If this option is used the request will
   fail if generation does not match the provided value. This option can not be provided
   together with generationNotMatch(long) or doesNotExist().

  generation - `long`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^Long generation]
    (Bucket$BlobTargetOption/generationMatch generation)))

(defn *generation-not-match
  "Returns an option for blob's data generation mismatch. If this option is used the request
   will fail if blob's generation matches the provided value. This option can not be provided
   together with generationMatch(long) or doesNotExist().

  generation - `long`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^Long generation]
    (Bucket$BlobTargetOption/generationNotMatch generation)))

(defn *does-not-exist
  "Returns an option that causes an operation to succeed only if the target blob does not exist.
   This option can not be provided together with generationMatch(long) or generationNotMatch(long).

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption []
    (Bucket$BlobTargetOption/doesNotExist )))

(defn *encryption-key
  "Returns an option to set a customer-supplied AES256 key for server-side encryption of the
   blob.

  key - `java.security.Key`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^java.security.Key key]
    (Bucket$BlobTargetOption/encryptionKey key)))

(defn *metageneration-not-match
  "Returns an option for blob's metageneration mismatch. If this option is used the request will
   fail if metageneration matches the provided value. This option can not be provided together
   with metagenerationMatch(long).

  metageneration - `long`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^Long metageneration]
    (Bucket$BlobTargetOption/metagenerationNotMatch metageneration)))

(defn *kms-key-name
  "Returns an option to set a customer-managed KMS key for server-side encryption of the blob.

  kms-key-name - the KMS key resource id - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$BlobTargetOption`"
  (^com.google.cloud.storage.Bucket$BlobTargetOption [^java.lang.String kms-key-name]
    (Bucket$BlobTargetOption/kmsKeyName kms-key-name)))

