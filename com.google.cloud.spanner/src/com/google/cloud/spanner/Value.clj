(ns com.google.cloud.spanner.Value
  "Represents a value to be consumed by the Cloud Spanner API. A value can be NULL or
  non-NULL; regardless, values always have an associated type.

  The Value API is optimized for construction, since this is the majority use-case when
  using this class with the Cloud Spanner libraries. The factory method signatures and internal
  representations are design to minimize memory usage and object creation while still maintaining
  the immutability contract of this class. In particular, arrays of primitive types can be
  constructed without requiring boxing into collections of wrapper types. The getters in this class
  are intended primarily for test purposes, and so do not share the same performance
  characteristics; in particular, getters for array types may be expensive.

  Value instances are immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Value]))

(def *-commit-timestamp
  "Static Constant.

  Placeholder value to be passed to a mutation to make Cloud Spanner store the commit timestamp
   in that column. The commit timestamp is the timestamp corresponding to when Cloud Spanner
   commits the transaction containing the mutation.

   Note that this particular timestamp instance has no semantic meaning. In particular the
   value of seconds and nanoseconds in this timestamp are meaningless. This placeholder can only
   be used for columns that have set the option \"(allow_commit_timestamp=true)\" in the schema.

   When reading the value stored in such a column, the value returned is an actual timestamp
   corresponding to the commit time of the transaction, which has no relation to this placeholder.

  type: com.google.cloud.Timestamp"
  Value/COMMIT_TIMESTAMP)

(defn *bool-array
  "Returns an ARRAY<BOOL> value that takes its elements from a region of an array.

  v - the source of element values, which may be null to produce a value for which isNull() is true - `boolean[]`
  pos - the start position of v to copy values from. Ignored if v is null. - `int`
  length - the number of values to copy from v. Ignored if v is null. - `int`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [v ^Integer pos ^Integer length]
    (Value/boolArray v pos length))
  (^com.google.cloud.spanner.Value [v]
    (Value/boolArray v)))

(defn *date-array
  "Returns an ARRAY<DATE> value. The range [1678-01-01, 2262-01-01) is the legal interval
   for cloud spanner dates. A write to a date column is rejected if the value is outside of that
   interval.

  v - the source of element values. This may be null to produce a value for which isNull() is true. Individual elements may also be null. - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.Iterable v]
    (Value/dateArray v)))

(defn *string-array
  "Returns an ARRAY<STRING> value.

  v - the source of element values. This may be null to produce a value for which isNull() is true. Individual elements may also be null. - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.Iterable v]
    (Value/stringArray v)))

(defn *string
  "Returns a STRING value.

  v - the value, which may be null - `java.lang.String`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.String v]
    (Value/string v)))

(defn *timestamp-array
  "Returns an ARRAY<TIMESTAMP> value.

  v - the source of element values. This may be null to produce a value for which isNull() is true. Individual elements may also be null. - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.Iterable v]
    (Value/timestampArray v)))

(defn *float-64
  "Returns a FLOAT64 value.

  v - the value, which may be null - `java.lang.Double`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.Double v]
    (Value/float64 v)))

(defn *int-64
  "Returns an INT64 value.

  v - the value, which may be null - `java.lang.Long`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.Long v]
    (Value/int64 v)))

(defn *timestamp
  "Returns a TIMESTAMP value.

  v - `com.google.cloud.Timestamp`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^com.google.cloud.Timestamp v]
    (Value/timestamp v)))

(defn *int-64-array
  "Returns an ARRAY<INT64> value that takes its elements from a region of an array.

  v - the source of element values, which may be null to produce a value for which isNull() is true - `long[]`
  pos - the start position of v to copy values from. Ignored if v is null. - `int`
  length - the number of values to copy from v. Ignored if v is null. - `int`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [v ^Integer pos ^Integer length]
    (Value/int64Array v pos length))
  (^com.google.cloud.spanner.Value [v]
    (Value/int64Array v)))

(defn *bool
  "Returns a BOOL value.

  v - the value, which may be null - `java.lang.Boolean`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.Boolean v]
    (Value/bool v)))

(defn *bytes
  "Returns a BYTES value.

  v - the value, which may be null - `com.google.cloud.ByteArray`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^com.google.cloud.ByteArray v]
    (Value/bytes v)))

(defn *float-64-array
  "Returns an ARRAY<FLOAT64> value that takes its elements from a region of an array.

  v - the source of element values, which may be null to produce a value for which isNull() is true - `double[]`
  pos - the start position of v to copy values from. Ignored if v is null. - `int`
  length - the number of values to copy from v. Ignored if v is null. - `int`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [v ^Integer pos ^Integer length]
    (Value/float64Array v pos length))
  (^com.google.cloud.spanner.Value [v]
    (Value/float64Array v)))

(defn *bytes-array
  "Returns an ARRAY<BYTES> value.

  v - the source of element values. This may be null to produce a value for which isNull() is true. Individual elements may also be null. - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^java.lang.Iterable v]
    (Value/bytesArray v)))

(defn *struct-array
  "Returns an ARRAY<STRUCT<...>> value.

  element-type - `com.google.cloud.spanner.Type`
  v - the source of element values. This may be null to produce a value for which isNull() is true. Individual elements may also be null. - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^com.google.cloud.spanner.Type element-type ^java.lang.Iterable v]
    (Value/structArray element-type v)))

(defn *date
  "Returns a DATE value. The range [1678-01-01, 2262-01-01) is the legal interval for
   cloud spanner dates. A write to a date column is rejected if the value is outside of that
   interval.

  v - `com.google.cloud.Date`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^com.google.cloud.Date v]
    (Value/date v)))

(defn *struct
  "Returns a STRUCT value of Type type.

  type - the type of the STRUCT value - `com.google.cloud.spanner.Type`
  v - the struct STRUCT value. This may be null to produce a value for which isNull() is true. If non-null, StructReader.getType() must match type. - `com.google.cloud.spanner.Struct`

  returns: `com.google.cloud.spanner.Value`"
  (^com.google.cloud.spanner.Value [^com.google.cloud.spanner.Type type ^com.google.cloud.spanner.Struct v]
    (Value/struct type v))
  (^com.google.cloud.spanner.Value [^com.google.cloud.spanner.Struct v]
    (Value/struct v)))

(defn get-struct
  "Returns the value of a STRUCT-typed instance.

  returns: `com.google.cloud.spanner.Struct`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^com.google.cloud.spanner.Struct [^Value this]
    (-> this (.getStruct))))

(defn get-type
  "Returns the type of this value. This will return a type even if isNull() is true.

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type [^Value this]
    (-> this (.getType))))

(defn null?
  "Returns true if this instance represents a NULL value.

  returns: `boolean`"
  (^Boolean [^Value this]
    (-> this (.isNull))))

(defn get-float-64
  "Returns the value of a FLOAT64-typed instance.

  returns: `double`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^Double [^Value this]
    (-> this (.getFloat64))))

(defn get-bytes-array
  "Returns the value of an ARRAY<BYTES>-typed instance. While the returned list itself
   will never be null, elements of that list may be null.

  returns: `java.util.List<com.google.cloud.ByteArray>`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.util.List [^Value this]
    (-> this (.getBytesArray))))

(defn get-string
  "Returns the value of a STRING-typed instance.

  returns: `java.lang.String`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.lang.String [^Value this]
    (-> this (.getString))))

(defn get-bool-array
  "Returns the value of an ARRAY<BOOL>-typed instance. While the returned list itself will
   never be null, elements of that list may be null.

  returns: `java.util.List<java.lang.Boolean>`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.util.List [^Value this]
    (-> this (.getBoolArray))))

(defn get-timestamp
  "Returns the value of a TIMESTAMP-typed instance.

  returns: `com.google.cloud.Timestamp`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type or isCommitTimestamp()."
  (^com.google.cloud.Timestamp [^Value this]
    (-> this (.getTimestamp))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Value this]
    (-> this (.toString))))

(defn get-bytes
  "Returns the value of a BYTES-typed instance.

  returns: `com.google.cloud.ByteArray`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^com.google.cloud.ByteArray [^Value this]
    (-> this (.getBytes))))

(defn get-int-64-array
  "Returns the value of an ARRAY<INT64>-typed instance. While the returned list itself
   will never be null, elements of that list may be null.

  returns: `java.util.List<java.lang.Long>`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.util.List [^Value this]
    (-> this (.getInt64Array))))

(defn get-date
  "Returns the value of a DATE-typed instance.

  returns: `com.google.cloud.Date`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^com.google.cloud.Date [^Value this]
    (-> this (.getDate))))

(defn get-float-64-array
  "Returns the value of an ARRAY<FLOAT64>-typed instance. While the returned list itself
   will never be null, elements of that list may be null.

  returns: `java.util.List<java.lang.Double>`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.util.List [^Value this]
    (-> this (.getFloat64Array))))

(defn commit-timestamp?
  "Returns true if this is a commit timestamp value.

  returns: `boolean`"
  (^Boolean [^Value this]
    (-> this (.isCommitTimestamp))))

(defn get-timestamp-array
  "Returns the value of an ARRAY<TIMESTAMP>-typed instance. While the returned list itself
   will never be null, elements of that list may be null.

  returns: `java.util.List<com.google.cloud.Timestamp>`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.util.List [^Value this]
    (-> this (.getTimestampArray))))

(defn get-bool?
  "Returns the value of a BOOL-typed instance.

  returns: `boolean`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^Boolean [^Value this]
    (-> this (.getBool))))

(defn get-string-array
  "Returns the value of an ARRAY<STRING>-typed instance. While the returned list itself
   will never be null, elements of that list may be null.

  returns: `java.util.List<java.lang.String>`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.util.List [^Value this]
    (-> this (.getStringArray))))

(defn get-int-64
  "Returns the value of a INT64-typed instance.

  returns: `long`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^Long [^Value this]
    (-> this (.getInt64))))

(defn get-date-array
  "Returns the value of an ARRAY<DATE>-typed instance. While the returned list itself will
   never be null, elements of that list may be null.

  returns: `java.util.List<com.google.cloud.Date>`

  throws: java.lang.IllegalStateException - if isNull() or the value is not of the expected type"
  (^java.util.List [^Value this]
    (-> this (.getDateArray))))

