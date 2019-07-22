(ns com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$AttachedDiskConfiguration$InterfaceType]))

(def SCSI
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType"
  AttachedDisk$AttachedDiskConfiguration$InterfaceType/SCSI)

(def NVME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType"
  AttachedDisk$AttachedDiskConfiguration$InterfaceType/NVME)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AttachedDisk.AttachedDiskConfiguration.InterfaceType c : AttachedDisk.AttachedDiskConfiguration.InterfaceType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType[]`"
  ([]
    (AttachedDisk$AttachedDiskConfiguration$InterfaceType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType [^java.lang.String name]
    (AttachedDisk$AttachedDiskConfiguration$InterfaceType/valueOf name)))

