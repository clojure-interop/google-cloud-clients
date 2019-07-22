(ns com.google.cloud.datastore.ValueType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ValueType]))

(def NULL
  "Enum Constant.

  Represents a null value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/NULL)

(def STRING
  "Enum Constant.

  Represents a string value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/STRING)

(def ENTITY
  "Enum Constant.

  Represents an entity value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/ENTITY)

(def LIST
  "Enum Constant.

  Represents a list of Values.

  type: com.google.cloud.datastore.ValueType"
  ValueType/LIST)

(def KEY
  "Enum Constant.

  Represents a key as a value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/KEY)

(def LONG
  "Enum Constant.

  Represents a long value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/LONG)

(def DOUBLE
  "Enum Constant.

  Represents a double value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/DOUBLE)

(def BOOLEAN
  "Enum Constant.

  Represents a boolean value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/BOOLEAN)

(def TIMESTAMP
  "Enum Constant.

  Represents a Timestamp value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/TIMESTAMP)

(def BLOB
  "Enum Constant.

  Represents a Blob value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/BLOB)

(def RAW_VALUE
  "Enum Constant.

  Represents a raw/unparsed value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/RAW_VALUE)

(def LAT_LNG
  "Enum Constant.

  Represents a LatLng value.

  type: com.google.cloud.datastore.ValueType"
  ValueType/LAT_LNG)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ValueType c : ValueType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.datastore.ValueType[]`"
  ([]
    (ValueType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.datastore.ValueType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.datastore.ValueType [^java.lang.String name]
    (ValueType/valueOf name)))

