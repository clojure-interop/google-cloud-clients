(ns com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type
  "The type of network access configuration. The only supported value is ONE_TO_ONE_NAT."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated NetworkInterface$AccessConfig$Type]))

(def *-one-to-one-nat
  "Static Constant.

  type: com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type"
  NetworkInterface$AccessConfig$Type/ONE_TO_ONE_NAT)

(defn *value-of-strict
  "Get the Type for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type [^java.lang.String constant]
    (NetworkInterface$AccessConfig$Type/valueOfStrict constant)))

(defn *value-of
  "Get the Type for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type`"
  (^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type [^java.lang.String constant]
    (NetworkInterface$AccessConfig$Type/valueOf constant)))

(defn *values
  "Return the known values for Type.

  returns: `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type[]`"
  ([]
    (NetworkInterface$AccessConfig$Type/values )))

