(ns com.google.cloud.spanner.Struct
  "Represents a non-NULL value of Type.Code.STRUCT. Such values are a tuple of named
  and typed columns, where individual columns may be null. Individual rows from a read or query
  operation can be considered as structs; ResultSet.getCurrentRowAsStruct() allows an
  immutable struct to be created from the row that the result set is currently positioned over.

  Struct instances are immutable.

  This class does not support representing typed NULL Struct values.

  However, struct values inside SQL queries are always typed and can be externally
  supplied to a query only in the form of struct/array-of-struct query parameter values for which
  typed NULL struct values can be specified in the following ways:

  1. As a standalone NULL struct value or as a nested struct field value, constructed
  using ValueBinder.to(Type, Struct) or Value.struct(Type, Struct).

  2. As as a null Struct reference representing a NULL struct typed element
  value inside an array/list of 'Struct' references, that is used to construct an
  array-of-struct value using Value.structArray(Type, Iterable) or ValueBinder.toStructArray(Type, Iterable). In this case, the type of the NULL struct
  value is assumed to be the same as the explicitly specified struct element type of the
  array/list."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Struct]))

(defn *new-builder
  "Returns a builder for creating a non-NULL Struct instance.

  returns: `com.google.cloud.spanner.Struct$Builder`"
  (^com.google.cloud.spanner.Struct$Builder []
    (Struct/newBuilder )))

(defn get-struct
  "TODO(user) : Consider moving these methods to the StructReader interface once STRUCT-typed
   columns are supported in ResultSet.

  column-index - `int`

  returns: `com.google.cloud.spanner.Struct`"
  (^com.google.cloud.spanner.Struct [^Struct this ^Integer column-index]
    (-> this (.getStruct column-index))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Struct this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Struct this]
    (-> this (.hashCode))))

