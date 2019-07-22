(ns com.google.cloud.spanner.ValueBinder
  "An interface for binding a Value in some context. Users of the Cloud Spanner client
  library never create a ValueBinder directly; instead this interface is returned from
  other parts of the library involved in Value construction. For example, Mutation.WriteBuilder.set(String) returns a binder to bind a column value, and Statement#bind(String) returns a binder to bind a parameter to a value.

  ValueBinder subclasses typically carry state and are therefore not thread-safe,
  although the core implementation itself is thread-safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ValueBinder]))

(defn to-bytes-array
  "Binds to Value.bytesArray(values)

  values - `java.lang.Iterable`

  returns: `R`"
  ([^ValueBinder this ^java.lang.Iterable values]
    (-> this (.toBytesArray values))))

(defn to-timestamp-array
  "Binds to Value.timestampArray(values)

  values - `java.lang.Iterable`

  returns: `R`"
  ([^ValueBinder this ^java.lang.Iterable values]
    (-> this (.toTimestampArray values))))

(defn to-string-array
  "Binds to Value.stringArray(values)

  values - `java.lang.Iterable`

  returns: `R`"
  ([^ValueBinder this ^java.lang.Iterable values]
    (-> this (.toStringArray values))))

(defn to-date-array
  "Binds to Value.dateArray(values)

  values - `java.lang.Iterable`

  returns: `R`"
  ([^ValueBinder this ^java.lang.Iterable values]
    (-> this (.toDateArray values))))

(defn to-struct-array
  "Binds to Value.structArray(fieldTypes, values)

  element-type - `com.google.cloud.spanner.Type`
  values - `java.lang.Iterable`

  returns: `R`"
  ([^ValueBinder this ^com.google.cloud.spanner.Type element-type ^java.lang.Iterable values]
    (-> this (.toStructArray element-type values))))

(defn to-int-64-array
  "Binds to Value.int64Array(values, pos, length)

  values - `long[]`
  pos - `int`
  length - `int`

  returns: `R`"
  ([^ValueBinder this values ^Integer pos ^Integer length]
    (-> this (.toInt64Array values pos length)))
  ([^ValueBinder this values]
    (-> this (.toInt64Array values))))

(defn to
  "Binds a nullable Struct reference with given Type to Value.struct(type,value

  type - `com.google.cloud.spanner.Type`
  value - `com.google.cloud.spanner.Struct`

  returns: `R`"
  ([^ValueBinder this ^com.google.cloud.spanner.Type type ^com.google.cloud.spanner.Struct value]
    (-> this (.to type value)))
  ([^ValueBinder this ^com.google.cloud.spanner.Value value]
    (-> this (.to value))))

(defn to-bool-array
  "Binds to Value.boolArray(values, int, pos)

  values - `boolean[]`
  pos - `int`
  length - `int`

  returns: `R`"
  ([^ValueBinder this values ^Integer pos ^Integer length]
    (-> this (.toBoolArray values pos length)))
  ([^ValueBinder this values]
    (-> this (.toBoolArray values))))

(defn to-float-64-array
  "Binds to Value.float64Array(values, pos, length)

  values - `double[]`
  pos - `int`
  length - `int`

  returns: `R`"
  ([^ValueBinder this values ^Integer pos ^Integer length]
    (-> this (.toFloat64Array values pos length)))
  ([^ValueBinder this values]
    (-> this (.toFloat64Array values))))

