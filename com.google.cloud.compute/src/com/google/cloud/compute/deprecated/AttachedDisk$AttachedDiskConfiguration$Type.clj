(ns com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AttachedDisk$AttachedDiskConfiguration$Type]))

(def PERSISTENT
  "Enum Constant.

  A persistent disk attached to a VM instance. Such an attached disk must already exist or
   can be created along with the instance by using AttachedDisk.CreateDiskConfiguration. A
   persistent disk can be attached to other VM instances.

  type: com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type"
  AttachedDisk$AttachedDiskConfiguration$Type/PERSISTENT)

(def SCRATCH
  "Enum Constant.

  A scratch disk is created with the VM instance it is attached to. Scratch disks are only
   available to their VM instance.

  type: com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type"
  AttachedDisk$AttachedDiskConfiguration$Type/SCRATCH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AttachedDisk.AttachedDiskConfiguration.Type c : AttachedDisk.AttachedDiskConfiguration.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type[]`"
  ([]
    (AttachedDisk$AttachedDiskConfiguration$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type [^java.lang.String name]
    (AttachedDisk$AttachedDiskConfiguration$Type/valueOf name)))

