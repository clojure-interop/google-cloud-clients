(ns com.google.cloud.compute.deprecated.Compute$ImageField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ImageField]))

(def ARCHIVE_SIZE_BYTES
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/ARCHIVE_SIZE_BYTES)

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/CREATION_TIMESTAMP)

(def DEPRECATED
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/DEPRECATED)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/DESCRIPTION)

(def DISK_SIZE_GB
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/DISK_SIZE_GB)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/ID)

(def LICENSES
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/LICENSES)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/NAME)

(def RAW_DISK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/RAW_DISK)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/SELF_LINK)

(def SOURCE_DISK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/SOURCE_DISK)

(def SOURCE_DISK_ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/SOURCE_DISK_ID)

(def SOURCE_TYPE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ImageField"
  Compute$ImageField/SOURCE_TYPE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.ImageField c : Compute.ImageField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$ImageField[]`"
  ([]
    (Compute$ImageField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$ImageField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$ImageField [^java.lang.String name]
    (Compute$ImageField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$ImageField this]
    (-> this (.getSelector))))

