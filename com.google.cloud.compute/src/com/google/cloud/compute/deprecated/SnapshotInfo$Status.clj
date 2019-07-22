(ns com.google.cloud.compute.deprecated.SnapshotInfo$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SnapshotInfo$Status]))

(def CREATING
  "Enum Constant.

  The snapshot is being created.

  type: com.google.cloud.compute.deprecated.SnapshotInfo$Status"
  SnapshotInfo$Status/CREATING)

(def DELETING
  "Enum Constant.

  The snapshot is being deleted.

  type: com.google.cloud.compute.deprecated.SnapshotInfo$Status"
  SnapshotInfo$Status/DELETING)

(def FAILED
  "Enum Constant.

  Snapshot's creation failed.

  type: com.google.cloud.compute.deprecated.SnapshotInfo$Status"
  SnapshotInfo$Status/FAILED)

(def READY
  "Enum Constant.

  Snapshot has been successfully created.

  type: com.google.cloud.compute.deprecated.SnapshotInfo$Status"
  SnapshotInfo$Status/READY)

(def UPLOADING
  "Enum Constant.

  Snapshot is being uploaded.

  type: com.google.cloud.compute.deprecated.SnapshotInfo$Status"
  SnapshotInfo$Status/UPLOADING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SnapshotInfo.Status c : SnapshotInfo.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.SnapshotInfo$Status[]`"
  ([]
    (SnapshotInfo$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.SnapshotInfo$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.SnapshotInfo$Status [^java.lang.String name]
    (SnapshotInfo$Status/valueOf name)))

