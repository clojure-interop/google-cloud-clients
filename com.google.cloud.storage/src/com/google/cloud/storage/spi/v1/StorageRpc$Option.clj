(ns com.google.cloud.storage.spi.v1.StorageRpc$Option
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.spi.v1 StorageRpc$Option]))

(def PREDEFINED_ACL
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/PREDEFINED_ACL)

(def PREDEFINED_DEFAULT_OBJECT_ACL
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/PREDEFINED_DEFAULT_OBJECT_ACL)

(def IF_METAGENERATION_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_METAGENERATION_MATCH)

(def IF_METAGENERATION_NOT_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_METAGENERATION_NOT_MATCH)

(def IF_GENERATION_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_GENERATION_MATCH)

(def IF_GENERATION_NOT_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_GENERATION_NOT_MATCH)

(def IF_SOURCE_METAGENERATION_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_SOURCE_METAGENERATION_MATCH)

(def IF_SOURCE_METAGENERATION_NOT_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_SOURCE_METAGENERATION_NOT_MATCH)

(def IF_SOURCE_GENERATION_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_SOURCE_GENERATION_MATCH)

(def IF_SOURCE_GENERATION_NOT_MATCH
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_SOURCE_GENERATION_NOT_MATCH)

(def IF_DISABLE_GZIP_CONTENT
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/IF_DISABLE_GZIP_CONTENT)

(def PREFIX
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/PREFIX)

(def PROJECTION
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/PROJECTION)

(def MAX_RESULTS
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/MAX_RESULTS)

(def PAGE_TOKEN
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/PAGE_TOKEN)

(def DELIMITER
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/DELIMITER)

(def VERSIONS
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/VERSIONS)

(def FIELDS
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/FIELDS)

(def CUSTOMER_SUPPLIED_KEY
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/CUSTOMER_SUPPLIED_KEY)

(def USER_PROJECT
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/USER_PROJECT)

(def KMS_KEY_NAME
  "Enum Constant.

  type: com.google.cloud.storage.spi.v1.StorageRpc$Option"
  StorageRpc$Option/KMS_KEY_NAME)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StorageRpc.Option c : StorageRpc.Option.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.storage.spi.v1.StorageRpc$Option[]`"
  ([]
    (StorageRpc$Option/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.storage.spi.v1.StorageRpc$Option`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.storage.spi.v1.StorageRpc$Option [^java.lang.String name]
    (StorageRpc$Option/valueOf name)))

(defn value
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageRpc$Option this]
    (-> this (.value))))

