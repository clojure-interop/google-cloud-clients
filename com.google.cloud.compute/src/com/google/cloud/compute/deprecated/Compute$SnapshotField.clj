(ns com.google.cloud.compute.deprecated.Compute$SnapshotField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SnapshotField]))

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/DESCRIPTION)

(def DISK_SIZE_GB
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/DISK_SIZE_GB)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/ID)

(def LICENSES
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/LICENSES)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/NAME)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/SELF_LINK)

(def SOURCE_DISK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/SOURCE_DISK)

(def SOURCE_DISK_ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/SOURCE_DISK_ID)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/STATUS)

(def STORAGE_BYTES
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/STORAGE_BYTES)

(def STORAGE_BYTES_STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SnapshotField"
  Compute$SnapshotField/STORAGE_BYTES_STATUS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.SnapshotField c : Compute.SnapshotField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$SnapshotField[]`"
  ([]
    (Compute$SnapshotField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$SnapshotField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotField [^java.lang.String name]
    (Compute$SnapshotField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$SnapshotField this]
    (-> this (.getSelector))))

