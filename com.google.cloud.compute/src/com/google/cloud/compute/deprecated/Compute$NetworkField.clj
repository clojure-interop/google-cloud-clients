(ns com.google.cloud.compute.deprecated.Compute$NetworkField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$NetworkField]))

(def IPV4_RANGE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/IPV4_RANGE)

(def AUTO_CREATE_SUBNETWORKS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/AUTO_CREATE_SUBNETWORKS)

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/DESCRIPTION)

(def GATEWAY_IPV4
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/GATEWAY_IPV4)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/ID)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/NAME)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/SELF_LINK)

(def SUBNETWORKS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$NetworkField"
  Compute$NetworkField/SUBNETWORKS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.NetworkField c : Compute.NetworkField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$NetworkField[]`"
  ([]
    (Compute$NetworkField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$NetworkField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$NetworkField [^java.lang.String name]
    (Compute$NetworkField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$NetworkField this]
    (-> this (.getSelector))))

