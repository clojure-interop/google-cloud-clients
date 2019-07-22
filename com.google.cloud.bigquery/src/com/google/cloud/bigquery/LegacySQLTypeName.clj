(ns com.google.cloud.bigquery.LegacySQLTypeName
  "A type used in legacy SQL contexts. NOTE: some contexts use a mix of types; for example, for
  queries that use standard SQL, the return types are the legacy SQL types."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery LegacySQLTypeName]))

(def *-bytes
  "Static Constant.

  Variable-length binary data.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/BYTES)

(def *-string
  "Static Constant.

  Variable-length character (Unicode) data.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/STRING)

(def *-integer
  "Static Constant.

  A 64-bit signed integer value.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/INTEGER)

(def *-float
  "Static Constant.

  A 64-bit IEEE binary floating-point value.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/FLOAT)

(def *-numeric
  "Static Constant.

  A decimal value with 38 digits of precision and 9 digits of scale. Note, support for this type
   is limited in legacy SQL.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/NUMERIC)

(def *-boolean
  "Static Constant.

  A Boolean value (true or false).

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/BOOLEAN)

(def *-timestamp
  "Static Constant.

  Represents an absolute point in time, with microsecond precision.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/TIMESTAMP)

(def *-date
  "Static Constant.

  Represents a logical calendar date. Note, support for this type is limited in legacy SQL.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/DATE)

(def *-geography
  "Static Constant.

  Represents a set of geographic points, represented as a Well Known Text (WKT) string.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/GEOGRAPHY)

(def *-time
  "Static Constant.

  Represents a time, independent of a specific date, to microsecond precision. Note, support for
   this type is limited in legacy SQL.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/TIME)

(def *-datetime
  "Static Constant.

  Represents a year, month, day, hour, minute, second, and subsecond (microsecond precision).
   Note, support for this type is limited in legacy SQL.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/DATETIME)

(def *-record
  "Static Constant.

  A record type with a nested schema.

  type: com.google.cloud.bigquery.LegacySQLTypeName"
  LegacySQLTypeName/RECORD)

(defn *legacy-sql-type-name
  "Converts StandardSQLTypeName to LegacySQLTypeName

  type - `com.google.cloud.bigquery.StandardSQLTypeName`

  returns: `com.google.cloud.bigquery.LegacySQLTypeName`"
  (^com.google.cloud.bigquery.LegacySQLTypeName [^com.google.cloud.bigquery.StandardSQLTypeName type]
    (LegacySQLTypeName/legacySQLTypeName type)))

(defn *value-of-strict
  "Get the LegacySQLTypeName for the given String constant, and throw an exception if the constant
   is not recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.LegacySQLTypeName`"
  (^com.google.cloud.bigquery.LegacySQLTypeName [^java.lang.String constant]
    (LegacySQLTypeName/valueOfStrict constant)))

(defn *value-of
  "Get the LegacySQLTypeName for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.LegacySQLTypeName`"
  (^com.google.cloud.bigquery.LegacySQLTypeName [^java.lang.String constant]
    (LegacySQLTypeName/valueOf constant)))

(defn *values
  "Return the known values for LegacySQLTypeName.

  returns: `com.google.cloud.bigquery.LegacySQLTypeName[]`"
  ([]
    (LegacySQLTypeName/values )))

(defn get-standard-type
  "Provides the standard SQL type name equivalent to this type name.

  returns: `com.google.cloud.bigquery.StandardSQLTypeName`"
  (^com.google.cloud.bigquery.StandardSQLTypeName [^LegacySQLTypeName this]
    (-> this (.getStandardType))))

