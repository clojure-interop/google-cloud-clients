(ns com.google.cloud.compute.deprecated.DiskConfiguration$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskConfiguration$Type]))

(def STANDARD
  "Enum Constant.

  A Google Compute Engine standard disk configuration.

  type: com.google.cloud.compute.deprecated.DiskConfiguration$Type"
  DiskConfiguration$Type/STANDARD)

(def IMAGE
  "Enum Constant.

  A Google Compute Engine disk configuration that creates a disk from an image.

  type: com.google.cloud.compute.deprecated.DiskConfiguration$Type"
  DiskConfiguration$Type/IMAGE)

(def SNAPSHOT
  "Enum Constant.

  A Google Compute Engine disk configuration that creates a disk from a snapshot.

  type: com.google.cloud.compute.deprecated.DiskConfiguration$Type"
  DiskConfiguration$Type/SNAPSHOT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DiskConfiguration.Type c : DiskConfiguration.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.DiskConfiguration$Type[]`"
  ([]
    (DiskConfiguration$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.DiskConfiguration$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.DiskConfiguration$Type [^java.lang.String name]
    (DiskConfiguration$Type/valueOf name)))

