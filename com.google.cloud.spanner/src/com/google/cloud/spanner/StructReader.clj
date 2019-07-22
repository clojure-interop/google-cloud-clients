(ns com.google.cloud.spanner.StructReader
  "A base interface for reading the fields of a STRUCT. The Cloud Spanner yields StructReader instances as one of the subclasses ResultSet or Struct, most
  commonly as the result of a read or query operation. At any point in time, a StructReader
  provides access to a single tuple of data comprising multiple typed columns. Each column may have
  a NULL or non-NULL value; in both cases, columns always have a type.

  Column values are accessed using the getTypeName() methods; a set of methods exists
  for each Java type that a column may be read as, and depending on the type of the column, only a
  subset of those methods will be appropriate. For example, getString(int) and getString(String) exist for reading columns of type Type.string(); attempting to call
  those methods for columns of other types will result in an IllegalStateException. The
  getTypeName() methods should only be called for non-NULL values, otherwise a
  NullPointerException is raised; isNull(int)/isNull(String) can be used
  to test for NULL-ness if necessary.

  All methods for accessing a column have overloads that accept an int column index and
  a String column name. Column indices are zero-based. The column name overloads will fail
  with IllegalArgumentException if the column name does not appear exactly once in this
  instance's getType(). The int overloads are typically more efficient than their
  String counterparts.

  StructReader itself does not define whether the implementing type is mutable or
  immutable. For example, ResultSet is a mutable implementation of StructReader,
  where the StructReader methods provide access to the row that the result set is currently
  positioned over and ResultSet.next() changes that view to the next row, whereas Struct is an immutable implementation of StructReader."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner StructReader]))

(defn get-type
  "Returns the type of the underlying data. This will always be a STRUCT type, with fields
   corresponding to the data's columns. For the result of a read or query, this will always match
   the columns passed to the read() call or named in the query text, in order.

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type [^StructReader this]
    (-> this (.getType))))

(defn null?
  "Returns true if a column contains a NULL value.

  column-index - `int`

  returns: `boolean`"
  (^Boolean [^StructReader this ^Integer column-index]
    (-> this (.isNull column-index))))

(defn get-bytes-list
  "Returns the value of a non-NULL column with type Type.array(Type.bytes()).

  column-index - `int`

  returns: `java.util.List<com.google.cloud.ByteArray>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getBytesList column-index))))

(defn get-struct-list
  "Returns the value of a non-NULL column with type Type.array(Type.struct(...)).

  column-index - `int`

  returns: `java.util.List<com.google.cloud.spanner.Struct>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getStructList column-index))))

(defn get-string
  "Returns the value of a non-NULL column with type Type.string().

  column-index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^StructReader this ^Integer column-index]
    (-> this (.getString column-index))))

(defn get-column-count
  "Returns the number of columns in the underlying data. This includes any columns with NULL values.

  returns: `int`"
  (^Integer [^StructReader this]
    (-> this (.getColumnCount))))

(defn get-date-list
  "Returns the value of a non-NULL column with type Type.array(Type.date()).

  column-index - `int`

  returns: `java.util.List<com.google.cloud.Date>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getDateList column-index))))

(defn get-long-list
  "Returns the value of a non-NULL column with type Type.array(Type.int64()).

  column-index - `int`

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getLongList column-index))))

(defn get-double-array
  "Returns the value of a non-NULL column with type Type.array(Type.float64()).

  column-index - `int`

  returns: `double[]`

  throws: java.lang.NullPointerException - if any element of the array value is NULL. If the array may contain NULL values, use getDoubleList(int) instead."
  ([^StructReader this ^Integer column-index]
    (-> this (.getDoubleArray column-index))))

(defn get-timestamp
  "Returns the value of a non-NULL column with type Type.timestamp().

  column-index - `int`

  returns: `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^StructReader this ^Integer column-index]
    (-> this (.getTimestamp column-index))))

(defn get-bytes
  "Returns the value of a non-NULL column with type Type.bytes().

  column-index - `int`

  returns: `com.google.cloud.ByteArray`"
  (^com.google.cloud.ByteArray [^StructReader this ^Integer column-index]
    (-> this (.getBytes column-index))))

(defn get-string-list
  "Returns the value of a non-NULL column with type Type.array(Type.string()).

  column-index - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getStringList column-index))))

(defn get-date
  "Returns the value of a non-NULL column with type Type.date().

  column-index - `int`

  returns: `com.google.cloud.Date`"
  (^com.google.cloud.Date [^StructReader this ^Integer column-index]
    (-> this (.getDate column-index))))

(defn get-long
  "Returns the value of a non-NULL column with type Type.int64().

  column-index - `int`

  returns: `long`"
  (^Long [^StructReader this ^Integer column-index]
    (-> this (.getLong column-index))))

(defn get-boolean-list
  "Returns the value of a non-NULL column with type Type.array(Type.bool()).

  column-index - `int`

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getBooleanList column-index))))

(defn get-column-type
  "Returns the type of a column.

  column-index - `int`

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type [^StructReader this ^Integer column-index]
    (-> this (.getColumnType column-index))))

(defn get-timestamp-list
  "Returns the value of a non-NULL column with type Type.array(Type.timestamp()).

  column-index - `int`

  returns: `java.util.List<com.google.cloud.Timestamp>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getTimestampList column-index))))

(defn get-double-list
  "Returns the value of a non-NULL column with type Type.array(Type.float64()).

  column-index - `int`

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^StructReader this ^Integer column-index]
    (-> this (.getDoubleList column-index))))

(defn get-boolean-array
  "Returns the value of a non-NULL column with type Type.array(Type.bool()).

  column-index - `int`

  returns: `boolean[]`

  throws: java.lang.NullPointerException - if any element of the array value is NULL. If the array may contain NULL values, use getBooleanList(int) instead."
  ([^StructReader this ^Integer column-index]
    (-> this (.getBooleanArray column-index))))

(defn get-long-array
  "Returns the value of a non-NULL column with type Type.array(Type.int64()).

  column-index - `int`

  returns: `long[]`

  throws: java.lang.NullPointerException - if any element of the array value is NULL. If the array may contain NULL values, use getLongList(int) instead."
  ([^StructReader this ^Integer column-index]
    (-> this (.getLongArray column-index))))

(defn get-boolean?
  "Returns the value of a non-NULL column with type Type.bool().

  column-index - `int`

  returns: `boolean`"
  (^Boolean [^StructReader this ^Integer column-index]
    (-> this (.getBoolean column-index))))

(defn get-double
  "Returns the value of a non-NULL column with type Type.float64().

  column-index - `int`

  returns: `double`"
  (^Double [^StructReader this ^Integer column-index]
    (-> this (.getDouble column-index))))

(defn get-column-index
  "Returns the index of the column named columnName.

  column-name - `java.lang.String`

  returns: `int`

  throws: java.lang.IllegalArgumentException - if there is not exactly one element of type().structFields() with Type.StructField.getName() equal to columnName"
  (^Integer [^StructReader this ^java.lang.String column-name]
    (-> this (.getColumnIndex column-name))))

