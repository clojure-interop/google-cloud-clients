(ns com.google.cloud.compute.deprecated.NetworkConfiguration$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkConfiguration$Type]))

(def STANDARD
  "Enum Constant.

  A Google Compute Engine network with no subnetworks.

  type: com.google.cloud.compute.deprecated.NetworkConfiguration$Type"
  NetworkConfiguration$Type/STANDARD)

(def SUBNET
  "Enum Constant.

  A Google Compute Engine network that supports the creation of subnetworks (either automatic
   or manual).

  type: com.google.cloud.compute.deprecated.NetworkConfiguration$Type"
  NetworkConfiguration$Type/SUBNET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NetworkConfiguration.Type c : NetworkConfiguration.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.NetworkConfiguration$Type[]`"
  ([]
    (NetworkConfiguration$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.NetworkConfiguration$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.NetworkConfiguration$Type [^java.lang.String name]
    (NetworkConfiguration$Type/valueOf name)))

