(ns com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$PersistentDiskConfiguration$Mode]))

(def READ_WRITE
  "Enum Constant.

  The instance can both read and write to the disk.

  type: com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode"
  AttachedDisk$PersistentDiskConfiguration$Mode/READ_WRITE)

(def READ_ONLY
  "Enum Constant.

  The instance is only allowed to read the disk.

  type: com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode"
  AttachedDisk$PersistentDiskConfiguration$Mode/READ_ONLY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AttachedDisk.PersistentDiskConfiguration.Mode c : AttachedDisk.PersistentDiskConfiguration.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode[]`"
  ([]
    (AttachedDisk$PersistentDiskConfiguration$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode [^java.lang.String name]
    (AttachedDisk$PersistentDiskConfiguration$Mode/valueOf name)))

