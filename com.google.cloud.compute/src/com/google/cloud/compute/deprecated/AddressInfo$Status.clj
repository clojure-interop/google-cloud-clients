(ns com.google.cloud.compute.deprecated.AddressInfo$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressInfo$Status]))

(def RESERVED
  "Enum Constant.

  The address is reserved for the project and is available for use.

  type: com.google.cloud.compute.deprecated.AddressInfo$Status"
  AddressInfo$Status/RESERVED)

(def IN_USE
  "Enum Constant.

  The address is currently being used and thus not available.

  type: com.google.cloud.compute.deprecated.AddressInfo$Status"
  AddressInfo$Status/IN_USE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AddressInfo.Status c : AddressInfo.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.AddressInfo$Status[]`"
  ([]
    (AddressInfo$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.AddressInfo$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.AddressInfo$Status [^java.lang.String name]
    (AddressInfo$Status/valueOf name)))

