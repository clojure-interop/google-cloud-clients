(ns com.google.cloud.storage.Storage$BucketField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BucketField]))

(def ID
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/ID)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/SELF_LINK)

(def NAME
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/NAME)

(def TIME_CREATED
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/TIME_CREATED)

(def METAGENERATION
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/METAGENERATION)

(def ACL
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/ACL)

(def DEFAULT_OBJECT_ACL
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/DEFAULT_OBJECT_ACL)

(def OWNER
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/OWNER)

(def LOCATION
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/LOCATION)

(def WEBSITE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/WEBSITE)

(def VERSIONING
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/VERSIONING)

(def CORS
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/CORS)

(def LIFECYCLE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/LIFECYCLE)

(def STORAGE_CLASS
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/STORAGE_CLASS)

(def ETAG
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/ETAG)

(def ENCRYPTION
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/ENCRYPTION)

(def BILLING
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/BILLING)

(def DEFAULT_EVENT_BASED_HOLD
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/DEFAULT_EVENT_BASED_HOLD)

(def RETENTION_POLICY
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/RETENTION_POLICY)

(def IAMCONFIGURATION
  "Enum Constant.

  type: com.google.cloud.storage.Storage$BucketField"
  Storage$BucketField/IAMCONFIGURATION)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Storage.BucketField c : Storage.BucketField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.storage.Storage$BucketField[]`"
  ([]
    (Storage$BucketField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.storage.Storage$BucketField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.storage.Storage$BucketField [^java.lang.String name]
    (Storage$BucketField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Storage$BucketField this]
    (-> this (.getSelector))))

