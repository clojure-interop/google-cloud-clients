(ns com.google.cloud.compute.deprecated.Compute$AddressField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$AddressField]))

(def ADDRESS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/ADDRESS)

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/DESCRIPTION)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/ID)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/NAME)

(def REGION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/REGION)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/SELF_LINK)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/STATUS)

(def USERS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$AddressField"
  Compute$AddressField/USERS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.AddressField c : Compute.AddressField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$AddressField[]`"
  ([]
    (Compute$AddressField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$AddressField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$AddressField [^java.lang.String name]
    (Compute$AddressField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$AddressField this]
    (-> this (.getSelector))))

