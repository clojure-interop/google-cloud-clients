(ns com.google.cloud.compute.deprecated.Compute$RegionField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$RegionField]))

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/DESCRIPTION)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/ID)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/NAME)

(def QUOTAS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/QUOTAS)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/SELF_LINK)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/STATUS)

(def ZONES
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/ZONES)

(def DEPRECATED
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$RegionField"
  Compute$RegionField/DEPRECATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.RegionField c : Compute.RegionField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$RegionField[]`"
  ([]
    (Compute$RegionField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$RegionField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$RegionField [^java.lang.String name]
    (Compute$RegionField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$RegionField this]
    (-> this (.getSelector))))

