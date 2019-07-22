(ns com.google.cloud.bigquery.StandardSQLTypeName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardSQLTypeName]))

(def BOOL
  "Enum Constant.

  A Boolean value (true or false).

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/BOOL)

(def INT64
  "Enum Constant.

  A 64-bit signed integer value.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/INT64)

(def FLOAT64
  "Enum Constant.

  A 64-bit IEEE binary floating-point value.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/FLOAT64)

(def NUMERIC
  "Enum Constant.

  A decimal value with 38 digits of precision and 9 digits of scale.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/NUMERIC)

(def STRING
  "Enum Constant.

  Variable-length character (Unicode) data.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/STRING)

(def BYTES
  "Enum Constant.

  Variable-length binary data.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/BYTES)

(def STRUCT
  "Enum Constant.

  Container of ordered fields each with a type (required) and field name (optional).

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/STRUCT)

(def ARRAY
  "Enum Constant.

  Ordered list of zero or more elements of any non-array type.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/ARRAY)

(def TIMESTAMP
  "Enum Constant.

  Represents an absolute point in time, with microsecond precision. Values range between the
   years 1 and 9999, inclusive.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/TIMESTAMP)

(def DATE
  "Enum Constant.

  Represents a logical calendar date. Values range between the years 1 and 9999, inclusive.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/DATE)

(def TIME
  "Enum Constant.

  Represents a time, independent of a specific date, to microsecond precision.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/TIME)

(def DATETIME
  "Enum Constant.

  Represents a year, month, day, hour, minute, second, and subsecond (microsecond precision).

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/DATETIME)

(def GEOGRAPHY
  "Enum Constant.

  Represents a set of geographic points, represented as a Well Known Text (WKT) string.

  type: com.google.cloud.bigquery.StandardSQLTypeName"
  StandardSQLTypeName/GEOGRAPHY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StandardSQLTypeName c : StandardSQLTypeName.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.StandardSQLTypeName[]`"
  ([]
    (StandardSQLTypeName/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.StandardSQLTypeName`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.StandardSQLTypeName [^java.lang.String name]
    (StandardSQLTypeName/valueOf name)))

