(ns com.google.cloud.compute.deprecated.Compute$SubnetworkField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SubnetworkField]))

(def CREATION_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/CREATION_TIMESTAMP)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/DESCRIPTION)

(def GATEWAY_ADDRESS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/GATEWAY_ADDRESS)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/ID)

(def IP_CIDR_RANGE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/IP_CIDR_RANGE)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/NAME)

(def NETWORK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/NETWORK)

(def REGION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/REGION)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$SubnetworkField"
  Compute$SubnetworkField/SELF_LINK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.SubnetworkField c : Compute.SubnetworkField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$SubnetworkField[]`"
  ([]
    (Compute$SubnetworkField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$SubnetworkField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$SubnetworkField [^java.lang.String name]
    (Compute$SubnetworkField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$SubnetworkField this]
    (-> this (.getSelector))))

