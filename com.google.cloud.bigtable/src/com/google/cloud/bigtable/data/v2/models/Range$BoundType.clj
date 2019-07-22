(ns com.google.cloud.bigtable.data.v2.models.Range$BoundType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Range$BoundType]))

(def OPEN
  "Enum Constant.

  type: com.google.cloud.bigtable.data.v2.models.Range$BoundType"
  Range$BoundType/OPEN)

(def CLOSED
  "Enum Constant.

  type: com.google.cloud.bigtable.data.v2.models.Range$BoundType"
  Range$BoundType/CLOSED)

(def UNBOUNDED
  "Enum Constant.

  type: com.google.cloud.bigtable.data.v2.models.Range$BoundType"
  Range$BoundType/UNBOUNDED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Range.BoundType c : Range.BoundType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigtable.data.v2.models.Range$BoundType[]`"
  ([]
    (Range$BoundType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigtable.data.v2.models.Range$BoundType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigtable.data.v2.models.Range$BoundType [^java.lang.String name]
    (Range$BoundType/valueOf name)))

