(ns com.google.cloud.compute.deprecated.Compute$InstanceField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$InstanceField]))

(def CAN_IP_FORWARD
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/CAN_IP_FORWARD)

(def CPU_PLATFORM
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/CPU_PLATFORM)

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/DESCRIPTION)

(def DISKS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/DISKS)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/ID)

(def MACHINE_TYPE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/MACHINE_TYPE)

(def METADATA
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/METADATA)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/NAME)

(def NETWORK_INTERFACES
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/NETWORK_INTERFACES)

(def SCHEDULING
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/SCHEDULING)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/SELF_LINK)

(def SERVICE_ACCOUNTS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/SERVICE_ACCOUNTS)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/STATUS)

(def STATUS_MESSAGE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/STATUS_MESSAGE)

(def TAGS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/TAGS)

(def ZONE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$InstanceField"
  Compute$InstanceField/ZONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.InstanceField c : Compute.InstanceField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$InstanceField[]`"
  ([]
    (Compute$InstanceField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$InstanceField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$InstanceField [^java.lang.String name]
    (Compute$InstanceField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$InstanceField this]
    (-> this (.getSelector))))

