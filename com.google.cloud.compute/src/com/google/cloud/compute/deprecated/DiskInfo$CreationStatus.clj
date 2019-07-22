(ns com.google.cloud.compute.deprecated.DiskInfo$CreationStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskInfo$CreationStatus]))

(def CREATING
  "Enum Constant.

  The disk is being created.

  type: com.google.cloud.compute.deprecated.DiskInfo$CreationStatus"
  DiskInfo$CreationStatus/CREATING)

(def FAILED
  "Enum Constant.

  Disk creation failed.

  type: com.google.cloud.compute.deprecated.DiskInfo$CreationStatus"
  DiskInfo$CreationStatus/FAILED)

(def READY
  "Enum Constant.

  The disk has been created and is ready to use.

  type: com.google.cloud.compute.deprecated.DiskInfo$CreationStatus"
  DiskInfo$CreationStatus/READY)

(def RESTORING
  "Enum Constant.

  The disk is being restored.

  type: com.google.cloud.compute.deprecated.DiskInfo$CreationStatus"
  DiskInfo$CreationStatus/RESTORING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DiskInfo.CreationStatus c : DiskInfo.CreationStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.DiskInfo$CreationStatus[]`"
  ([]
    (DiskInfo$CreationStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.DiskInfo$CreationStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.DiskInfo$CreationStatus [^java.lang.String name]
    (DiskInfo$CreationStatus/valueOf name)))

