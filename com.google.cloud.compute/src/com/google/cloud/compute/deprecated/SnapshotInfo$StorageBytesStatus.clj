(ns com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SnapshotInfo$StorageBytesStatus]))

(def UPDATING
  "Enum Constant.

  Indicates that the size of the snapshot is being updated.

  type: com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus"
  SnapshotInfo$StorageBytesStatus/UPDATING)

(def UP_TO_DATE
  "Enum Constant.

  Indicates that the size of the snapshot is up-to-date.

  type: com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus"
  SnapshotInfo$StorageBytesStatus/UP_TO_DATE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SnapshotInfo.StorageBytesStatus c : SnapshotInfo.StorageBytesStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus[]`"
  ([]
    (SnapshotInfo$StorageBytesStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus [^java.lang.String name]
    (SnapshotInfo$StorageBytesStatus/valueOf name)))

