(ns com.google.cloud.bigquery.QueryParameterValue
  "A value for a QueryParameter along with its type.

  A static factory method is provided for each of the possible types (e.g. int64(Long)
  for StandardSQLTypeName.INT64). Alternatively, an instance can be constructed by calling of(Object, Class) with the value and a Class object, which will use these mappings:




    Boolean: StandardSQLTypeName.BOOL
    String: StandardSQLTypeName.STRING
    Integer: StandardSQLTypeName.INT64
    Long: StandardSQLTypeName.INT64
    Double: StandardSQLTypeName.FLOAT64
    Float: StandardSQLTypeName.FLOAT64
    BigDecimal: StandardSQLTypeName.NUMERIC


  No other types are supported through that entry point. The other types can be created by
  calling of(Object, StandardSQLTypeName) with the value and a particular
  StandardSQLTypeName enum value.

  Struct parameters are currently not supported."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery QueryParameterValue]))

(defn *numeric
  "Creates a QueryParameterValue object with a type of NUMERIC.

  value - `java.math.BigDecimal`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.math.BigDecimal value]
    (QueryParameterValue/numeric value)))

(defn *string
  "Creates a QueryParameterValue object with a type of STRING.

  value - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.String value]
    (QueryParameterValue/string value)))

(defn *of
  "Creates a QueryParameterValue object with the given value and type.

  value - `T`
  type - `java.lang.Class`

  returns: `<T> com.google.cloud.bigquery.QueryParameterValue`"
  ([value ^java.lang.Class type]
    (QueryParameterValue/of value type)))

(defn *float-64
  "Creates a QueryParameterValue object with a type of FLOAT64.

  value - `java.lang.Double`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.Double value]
    (QueryParameterValue/float64 value)))

(defn *int-64
  "Creates a QueryParameterValue object with a type of INT64.

  value - `java.lang.Long`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.Long value]
    (QueryParameterValue/int64 value)))

(defn *timestamp
  "Creates a QueryParameterValue object with a type of TIMESTAMP.

  value - `java.lang.Long`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.Long value]
    (QueryParameterValue/timestamp value)))

(defn *date-time
  "Creates a QueryParameterValue object with a type of DATETIME. Must be in the format
   \"yyyy-MM-dd HH:mm:ss.SSSSSS\", e.g. \"\"2014-08-19 12:41:35.220000\".

  value - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.String value]
    (QueryParameterValue/dateTime value)))

(defn *new-builder
  "Returns a builder for the QueryParameterValue object.

  returns: `com.google.cloud.bigquery.QueryParameterValue$Builder`"
  (^com.google.cloud.bigquery.QueryParameterValue$Builder []
    (QueryParameterValue/newBuilder )))

(defn *bool
  "Creates a QueryParameterValue object with a type of BOOL.

  value - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.Boolean value]
    (QueryParameterValue/bool value)))

(defn *bytes
  "Creates a QueryParameterValue object with a type of BYTES.

  value - `byte[]`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [value]
    (QueryParameterValue/bytes value)))

(defn *time
  "Creates a QueryParameterValue object with a type of TIME. Must be in the format
   \"HH:mm:ss.SSSSSS\", e.g. \"12:41:35.220000\".

  value - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.String value]
    (QueryParameterValue/time value)))

(defn *date
  "Creates a QueryParameterValue object with a type of DATE. Must be in the format
   \"yyyy-MM-dd\", e.g. \"2014-08-19\".

  value - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^java.lang.String value]
    (QueryParameterValue/date value)))

(defn *array
  "Creates a QueryParameterValue object with a type of ARRAY, and an array element type
   based on the given class.

  array - `T[]`
  clazz - `java.lang.Class`

  returns: `<T> com.google.cloud.bigquery.QueryParameterValue`"
  ([array ^java.lang.Class clazz]
    (QueryParameterValue/array array clazz)))

(defn get-value
  "Returns the value of this parameter.

  returns: `java.lang.String`"
  (^java.lang.String [^QueryParameterValue this]
    (-> this (.getValue))))

(defn get-array-values
  "Returns the array values of this parameter. The returned list, if not null, is immutable.

  returns: `java.util.List<com.google.cloud.bigquery.QueryParameterValue>`"
  (^java.util.List [^QueryParameterValue this]
    (-> this (.getArrayValues))))

(defn get-type
  "Returns the data type of this parameter.

  returns: `com.google.cloud.bigquery.StandardSQLTypeName`"
  (^com.google.cloud.bigquery.StandardSQLTypeName [^QueryParameterValue this]
    (-> this (.getType))))

(defn get-array-type
  "Returns the data type of the array elements.

  returns: `com.google.cloud.bigquery.StandardSQLTypeName`"
  (^com.google.cloud.bigquery.StandardSQLTypeName [^QueryParameterValue this]
    (-> this (.getArrayType))))

(defn to-builder
  "Returns a builder for a QueryParameterValue object with given value.

  returns: `com.google.cloud.bigquery.QueryParameterValue$Builder`"
  (^com.google.cloud.bigquery.QueryParameterValue$Builder [^QueryParameterValue this]
    (-> this (.toBuilder))))

