(ns com.google.cloud.spanner.Type
  "Describes a type in the Cloud Spanner type system. Types can either be primitive (for example,
  INT64 and STRING) or composite (for example, ARRAY<INT64> or STRUCT<INT64,STRING>).

  Type instances are immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Type]))

(defn *string
  "Returns the descriptor for the STRING type: a variable-length Unicode character string.

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type []
    (Type/string )))

(defn *float-64
  "Returns the descriptor for the FLOAT64 type: a floating point type with the same value
   domain as a Java {code double}.

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type []
    (Type/float64 )))

(defn *int-64
  "Returns the descriptor for the INT64 type: an integral type with the same value domain
   as a Java long.

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type []
    (Type/int64 )))

(defn *timestamp
  "Returns the descriptor for the TIMESTAMP type: a nano precision timestamp in the range
   [0000-01-01 00:00:00, 9999-12-31 23:59:59.999999999 UTC].

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type []
    (Type/timestamp )))

(defn *bool
  "Returns the descriptor for the BOOL type.

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type []
    (Type/bool )))

(defn *bytes
  "Returns the descriptor for the BYTES type: a variable-length byte string.

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type []
    (Type/bytes )))

(defn *date
  "Returns the descriptor for the DATE type: a timezone independent date in the range
   [1678-01-01, 2262-01-01).

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type []
    (Type/date )))

(defn *struct
  "Returns a descriptor for a STRUCT type: an ordered collection of named and typed
   fields.

  fields - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type [^java.lang.Iterable fields]
    (Type/struct fields)))

(defn *array
  "Returns a descriptor for an array of elementType.

  element-type - `com.google.cloud.spanner.Type`

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type [^com.google.cloud.spanner.Type element-type]
    (Type/array element-type)))

(defn get-code
  "Returns the type code corresponding to this type.

  returns: `com.google.cloud.spanner.Type$Code`"
  (^com.google.cloud.spanner.Type$Code [^Type this]
    (-> this (.getCode))))

(defn get-array-element-type
  "Returns the type descriptor for elements of this ARRAY type.

  returns: `com.google.cloud.spanner.Type`

  throws: java.lang.IllegalStateException - if code() != Code.ARRAY"
  (^com.google.cloud.spanner.Type [^Type this]
    (-> this (.getArrayElementType))))

(defn get-struct-fields
  "Returns the fields of this STRUCT type.

  returns: an immutable list of the fields - `java.util.List<com.google.cloud.spanner.Type$StructField>`

  throws: java.lang.IllegalStateException - if code() != Code.STRUCT"
  (^java.util.List [^Type this]
    (-> this (.getStructFields))))

(defn get-field-index
  "Returns the index of the field named fieldName in this STRUCT type.

  field-name - `java.lang.String`

  returns: `int`

  throws: java.lang.IllegalArgumentException - if there is not exactly one element of getStructFields() with Type.StructField.getName() equal to fieldName"
  (^Integer [^Type this ^java.lang.String field-name]
    (-> this (.getFieldIndex field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Type this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Type this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Type this]
    (-> this (.hashCode))))

