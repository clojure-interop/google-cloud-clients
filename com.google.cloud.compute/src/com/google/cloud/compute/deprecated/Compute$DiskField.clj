(ns com.google.cloud.compute.deprecated.Compute$DiskField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskField]))

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/DESCRIPTION)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/ID)

(def LAST_ATTACH_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/LAST_ATTACH_TIMESTAMP)

(def LAST_DETACH_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/LAST_DETACH_TIMESTAMP)

(def LICENSES
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/LICENSES)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/NAME)

(def OPTIONS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/OPTIONS)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/SELF_LINK)

(def SIZE_GB
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/SIZE_GB)

(def SOURCE_IMAGE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/SOURCE_IMAGE)

(def SOURCE_IMAGE_ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/SOURCE_IMAGE_ID)

(def SOURCE_SNAPSHOT
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/SOURCE_SNAPSHOT)

(def SOURCE_SNAPSHOT_ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/SOURCE_SNAPSHOT_ID)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/STATUS)

(def TYPE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/TYPE)

(def USERS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/USERS)

(def ZONE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskField"
  Compute$DiskField/ZONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.DiskField c : Compute.DiskField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$DiskField[]`"
  ([]
    (Compute$DiskField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$DiskField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$DiskField [^java.lang.String name]
    (Compute$DiskField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskField this]
    (-> this (.getSelector))))

