(ns com.google.cloud.compute.deprecated.Compute$MachineTypeField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$MachineTypeField]))

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/DESCRIPTION)

(def GUEST_CPUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/GUEST_CPUS)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/ID)

(def IMAGE_SPACE_GB
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/IMAGE_SPACE_GB)

(def MAXIMUM_PERSISTENT_DISKS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/MAXIMUM_PERSISTENT_DISKS)

(def MAXIMUM_PERSISTENT_DISKS_SIZE_GB
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/MAXIMUM_PERSISTENT_DISKS_SIZE_GB)

(def MEMORY_MB
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/MEMORY_MB)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/NAME)

(def SCRATCH_DISKS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/SCRATCH_DISKS)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/SELF_LINK)

(def ZONE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/ZONE)

(def DEPRECATED
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$MachineTypeField"
  Compute$MachineTypeField/DEPRECATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.MachineTypeField c : Compute.MachineTypeField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$MachineTypeField[]`"
  ([]
    (Compute$MachineTypeField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$MachineTypeField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeField [^java.lang.String name]
    (Compute$MachineTypeField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$MachineTypeField this]
    (-> this (.getSelector))))

