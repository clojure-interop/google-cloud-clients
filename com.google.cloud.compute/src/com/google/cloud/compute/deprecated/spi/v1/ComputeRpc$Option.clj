(ns com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated.spi.v1 ComputeRpc$Option]))

(def FIELDS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option"
  ComputeRpc$Option/FIELDS)

(def MAX_RESULTS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option"
  ComputeRpc$Option/MAX_RESULTS)

(def PAGE_TOKEN
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option"
  ComputeRpc$Option/PAGE_TOKEN)

(def FILTER
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option"
  ComputeRpc$Option/FILTER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ComputeRpc.Option c : ComputeRpc.Option.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option[]`"
  ([]
    (ComputeRpc$Option/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.spi.v1.ComputeRpc$Option [^java.lang.String name]
    (ComputeRpc$Option/valueOf name)))

(defn value
  "returns: `java.lang.String`"
  (^java.lang.String [^ComputeRpc$Option this]
    (-> this (.value))))

