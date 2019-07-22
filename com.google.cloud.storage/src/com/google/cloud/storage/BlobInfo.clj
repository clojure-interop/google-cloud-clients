(ns com.google.cloud.storage.BlobInfo
  "Google Storage object metadata."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BlobInfo]))

(defn *new-builder
  "Returns a BlobInfo builder where blob identity is set using the provided values.

  bucket-info - `com.google.cloud.storage.BucketInfo`
  name - `java.lang.String`
  generation - `java.lang.Long`

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^com.google.cloud.storage.BucketInfo bucket-info ^java.lang.String name ^java.lang.Long generation]
    (BlobInfo/newBuilder bucket-info name generation))
  (^com.google.cloud.storage.BlobInfo$Builder [^com.google.cloud.storage.BucketInfo bucket-info ^java.lang.String name]
    (BlobInfo/newBuilder bucket-info name))
  (^com.google.cloud.storage.BlobInfo$Builder [^com.google.cloud.storage.BlobId blob-id]
    (BlobInfo/newBuilder blob-id)))

(defn get-retention-expiration-time
  "Returns the retention expiration time of the blob as Long, if a retention period is
   defined. If retention period is not defined this value returns null

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobInfo this]
    (-> this (.getRetentionExpirationTime))))

(defn get-create-time
  "Returns the creation time of the blob.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobInfo this]
    (-> this (.getCreateTime))))

(defn get-storage-class
  "Returns the storage class of the blob.

  returns: `com.google.cloud.storage.StorageClass`"
  (^com.google.cloud.storage.StorageClass [^BlobInfo this]
    (-> this (.getStorageClass))))

(defn get-blob-id
  "Returns the blob's identity.

  returns: `com.google.cloud.storage.BlobId`"
  (^com.google.cloud.storage.BlobId [^BlobInfo this]
    (-> this (.getBlobId))))

(defn get-content-encoding
  "Returns the blob's data content encoding.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getContentEncoding))))

(defn get-customer-encryption
  "Returns information on the customer-supplied encryption key, if the blob is encrypted using
   such a key.

  returns: `com.google.cloud.storage.BlobInfo$CustomerEncryption`"
  (^com.google.cloud.storage.BlobInfo$CustomerEncryption [^BlobInfo this]
    (-> this (.getCustomerEncryption))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.toString))))

(defn get-content-type
  "Returns the blob's data content type.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getContentType))))

(defn get-acl
  "Returns the blob's access control configuration.

  returns: `java.util.List<com.google.cloud.storage.Acl>`"
  (^java.util.List [^BlobInfo this]
    (-> this (.getAcl))))

(defn get-content-language
  "Returns the blob's data content language.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getContentLanguage))))

(defn get-name
  "Returns the blob's name.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getName))))

(defn get-media-link
  "Returns the blob's media download link.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getMediaLink))))

(defn get-generation
  "Returns blob's data generation. Used for blob versioning.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobInfo this]
    (-> this (.getGeneration))))

(defn get-cache-control
  "Returns the blob's data cache control.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getCacheControl))))

(defn directory?
  "Returns true if the current blob represents a directory. This can only happen if the
   blob is returned by Storage.list(String, Storage.BlobListOption...) when the Storage.BlobListOption.currentDirectory() option is used. When this is the case only getBlobId() and getSize() are set for the current blob: BlobId.getName()
   ends with the '/' character, BlobId.getGeneration() returns null and getSize() is 0.

  returns: `boolean`"
  (^Boolean [^BlobInfo this]
    (-> this (.isDirectory))))

(defn get-etag
  "Returns HTTP 1.1 Entity tag for the blob.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getEtag))))

(defn get-md-5
  "Returns the MD5 hash of blob's data encoded in base64.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getMd5))))

(defn get-owner
  "Returns the blob's owner. This will always be the uploader of the blob.

  returns: `com.google.cloud.storage.Acl$Entity`"
  (^com.google.cloud.storage.Acl$Entity [^BlobInfo this]
    (-> this (.getOwner))))

(defn get-event-based-hold?
  "Returns a Boolean with either true, null and in certain cases false.

   Case 1: true the field Storage.BlobField.EVENT_BASED_HOLD is selected in a Storage.get(BlobId, Storage.BlobGetOption...) and event-based hold for the blob is enabled.

   Case 2.1: null the field Storage.BlobField.EVENT_BASED_HOLD is selected in a Storage.get(BlobId, Storage.BlobGetOption...), but event-based hold for the blob is not
   enabled. This case can be considered implicitly false.

   Case 2.2: null the field Storage.BlobField.EVENT_BASED_HOLD is not selected in a Storage.get(BlobId, Storage.BlobGetOption...), and the state for this field is unknown.

   Case 3: false event-based hold is explicitly set to false using in a BlobInfo.Builder.setEventBasedHold(Boolean) client side for a follow-up request e.g. Storage.update(BlobInfo, Storage.BlobTargetOption...) in which case the value of event-based
   hold will remain false for the given instance.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobInfo this]
    (-> this (.getEventBasedHold))))

(defn get-crc-32c
  "Returns the CRC32C checksum of blob's data as described in RFC 4960, Appendix B; encoded in
   base64 in big-endian order.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getCrc32c))))

(defn get-metageneration
  "Returns blob's metageneration. Used for preconditions and for detecting changes in metadata. A
   metageneration number is only meaningful in the context of a particular generation of a
   particular blob.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobInfo this]
    (-> this (.getMetageneration))))

(defn get-self-link
  "Returns the URI of this blob as a string.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getSelfLink))))

(defn get-temporary-hold?
  "Returns a Boolean with either true, null and in certain cases false.

   Case 1: true the field Storage.BlobField.TEMPORARY_HOLD is selected in a Storage.get(BlobId, Storage.BlobGetOption...) and temporary hold for the blob is enabled.

   Case 2.1: null the field Storage.BlobField.TEMPORARY_HOLD is selected in a Storage.get(BlobId, Storage.BlobGetOption...), but temporary hold for the blob is not enabled.
   This case can be considered implicitly false.

   Case 2.2: null the field Storage.BlobField.TEMPORARY_HOLD is not selected in a Storage.get(BlobId, Storage.BlobGetOption...), and the state for this field is unknown.

   Case 3: false event-based hold is explicitly set to false using in a BlobInfo.Builder.setEventBasedHold(Boolean) client side for a follow-up request e.g. Storage.update(BlobInfo, Storage.BlobTargetOption...) in which case the value of temporary
   hold will remain false for the given instance.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BlobInfo this]
    (-> this (.getTemporaryHold))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BlobInfo this]
    (-> this (.hashCode))))

(defn get-metadata
  "Returns blob's user provided metadata.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^BlobInfo this]
    (-> this (.getMetadata))))

(defn get-component-count
  "Returns the number of components that make up this blob. Components are accumulated through the
   Storage.compose(Storage.ComposeRequest) operation and are limited to a count of 1024,
   counting 1 for each non-composite component blob and componentCount for each composite
   component blob. This value is set only for composite blobs.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BlobInfo this]
    (-> this (.getComponentCount))))

(defn get-delete-time
  "Returns the deletion time of the blob.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobInfo this]
    (-> this (.getDeleteTime))))

(defn get-bucket
  "Returns the name of the containing bucket.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getBucket))))

(defn get-generated-id
  "Returns the service-generated for the blob.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getGeneratedId))))

(defn get-update-time
  "Returns the last modification time of the blob's metadata.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobInfo this]
    (-> this (.getUpdateTime))))

(defn get-size
  "Returns the content length of the data in bytes.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BlobInfo this]
    (-> this (.getSize))))

(defn get-kms-key-name
  "Returns the Cloud KMS key used to encrypt the blob, if any.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getKmsKeyName))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BlobInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-md-5-to-hex-string
  "Returns the MD5 hash of blob's data decoded to string.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getMd5ToHexString))))

(defn get-content-disposition
  "Returns the blob's data content disposition.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getContentDisposition))))

(defn to-builder
  "Returns a builder for the current blob.

  returns: `com.google.cloud.storage.BlobInfo$Builder`"
  (^com.google.cloud.storage.BlobInfo$Builder [^BlobInfo this]
    (-> this (.toBuilder))))

(defn get-crc-32c-to-hex-string
  "Returns the CRC32C checksum of blob's data as described in RFC 4960, Appendix B; decoded to
   string.

  returns: `java.lang.String`"
  (^java.lang.String [^BlobInfo this]
    (-> this (.getCrc32cToHexString))))

