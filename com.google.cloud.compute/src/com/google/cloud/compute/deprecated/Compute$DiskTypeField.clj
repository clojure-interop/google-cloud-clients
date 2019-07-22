(ns com.google.cloud.compute.deprecated.Compute$DiskTypeField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$DiskTypeField]))

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/CREATION_TIMESTAMP)

(def DEFAULT_DISK_SIZE_GB
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/DEFAULT_DISK_SIZE_GB)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/DESCRIPTION)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/ID)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/NAME)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/SELF_LINK)

(def VALID_DISK_SIZE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/VALID_DISK_SIZE)

(def ZONE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/ZONE)

(def DEPRECATED
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$DiskTypeField"
  Compute$DiskTypeField/DEPRECATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.DiskTypeField c : Compute.DiskTypeField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$DiskTypeField[]`"
  ([]
    (Compute$DiskTypeField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$DiskTypeField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$DiskTypeField [^java.lang.String name]
    (Compute$DiskTypeField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$DiskTypeField this]
    (-> this (.getSelector))))

