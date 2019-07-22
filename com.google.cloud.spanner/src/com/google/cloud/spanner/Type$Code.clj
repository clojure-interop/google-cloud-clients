(ns com.google.cloud.spanner.Type$Code
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Type$Code]))

(def BOOL
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/BOOL)

(def INT64
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/INT64)

(def FLOAT64
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/FLOAT64)

(def STRING
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/STRING)

(def BYTES
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/BYTES)

(def TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/TIMESTAMP)

(def DATE
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/DATE)

(def ARRAY
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/ARRAY)

(def STRUCT
  "Enum Constant.

  type: com.google.cloud.spanner.Type$Code"
  Type$Code/STRUCT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Type.Code c : Type.Code.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.Type$Code[]`"
  ([]
    (Type$Code/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.Type$Code`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.Type$Code [^java.lang.String name]
    (Type$Code/valueOf name)))

