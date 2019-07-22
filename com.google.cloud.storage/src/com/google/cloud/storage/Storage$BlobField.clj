(ns com.google.cloud.storage.Storage$BlobField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BlobField]))

(def ACL
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/ACL)

(def BUCKET
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/BUCKET)

(def CACHE_CONTROL
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/CACHE_CONTROL)

(def COMPONENT_COUNT
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/COMPONENT_COUNT)

(def CONTENT_DISPOSITION
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/CONTENT_DISPOSITION)

(def CONTENT_ENCODING
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/CONTENT_ENCODING)

(def CONTENT_LANGUAGE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/CONTENT_LANGUAGE)

(def CONTENT_TYPE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/CONTENT_TYPE)

(def CRC32C
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/CRC32C)

(def ETAG
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/ETAG)

(def GENERATION
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/GENERATION)

(def ID
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/ID)

(def KIND
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/KIND)

(def MD5HASH
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/MD5HASH)

(def MEDIA_LINK
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/MEDIA_LINK)

(def METADATA
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/METADATA)

(def METAGENERATION
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/METAGENERATION)

(def NAME
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/NAME)

(def OWNER
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/OWNER)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/SELF_LINK)

(def SIZE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/SIZE)

(def STORAGE_CLASS
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/STORAGE_CLASS)

(def TIME_DELETED
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/TIME_DELETED)

(def TIME_CREATED
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/TIME_CREATED)

(def KMS_KEY_NAME
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/KMS_KEY_NAME)

(def EVENT_BASED_HOLD
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/EVENT_BASED_HOLD)

(def TEMPORARY_HOLD
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/TEMPORARY_HOLD)

(def RETENTION_EXPIRATION_TIME
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/RETENTION_EXPIRATION_TIME)

(def UPDATED
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BlobField"
  Storage$BlobField/UPDATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Storage.BlobField c : Storage.BlobField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.storage.Storage$BlobField[]`"
  ([]
    (Storage$BlobField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.storage.Storage$BlobField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.storage.Storage$BlobField [^java.lang.String name]
    (Storage$BlobField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Storage$BlobField this]
    (-> this (.getSelector))))

