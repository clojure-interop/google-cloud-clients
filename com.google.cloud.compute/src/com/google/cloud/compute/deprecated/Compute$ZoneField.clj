(ns com.google.cloud.compute.deprecated.Compute$ZoneField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ZoneField]))

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/DESCRIPTION)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/ID)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/NAME)

(def REGION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/REGION)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/SELF_LINK)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/STATUS)

(def DEPRECATED
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$ZoneField"
  Compute$ZoneField/DEPRECATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.ZoneField c : Compute.ZoneField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$ZoneField[]`"
  ([]
    (Compute$ZoneField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$ZoneField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$ZoneField [^java.lang.String name]
    (Compute$ZoneField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$ZoneField this]
    (-> this (.getSelector))))

