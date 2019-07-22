(ns com.google.cloud.spanner.AbstractStructReader
  "Base class for assisting StructReader implementations.

  This class implements the majority of the StructReader interface, leaving subclasses
  to implement core data access via the getTypeNameInternal() methods. AbstractStructReader guarantees that these will only be called for non-NULL columns of a
  type appropriate for the method."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner AbstractStructReader]))

(defn ->abstract-struct-reader
  "Constructor."
  (^AbstractStructReader []
    (new AbstractStructReader )))

(defn null?
  "Description copied from interface: StructReader

  column-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^AbstractStructReader this ^java.lang.String column-name]
    (-> this (.isNull column-name))))

(defn get-bytes-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<com.google.cloud.ByteArray>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getBytesList column-index))))

(defn get-struct-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<com.google.cloud.spanner.Struct>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getStructList column-index))))

(defn get-string
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^AbstractStructReader this ^Integer column-index]
    (-> this (.getString column-index))))

(defn get-column-count
  "Description copied from interface: StructReader

  returns: `int`"
  (^Integer [^AbstractStructReader this]
    (-> this (.getColumnCount))))

(defn get-date-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<com.google.cloud.Date>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getDateList column-index))))

(defn get-long-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getLongList column-index))))

(defn get-double-array
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `double[]`"
  ([^AbstractStructReader this ^Integer column-index]
    (-> this (.getDoubleArray column-index))))

(defn get-timestamp
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^AbstractStructReader this ^Integer column-index]
    (-> this (.getTimestamp column-index))))

(defn get-bytes
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `com.google.cloud.ByteArray`"
  (^com.google.cloud.ByteArray [^AbstractStructReader this ^Integer column-index]
    (-> this (.getBytes column-index))))

(defn get-string-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getStringList column-index))))

(defn get-date
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `com.google.cloud.Date`"
  (^com.google.cloud.Date [^AbstractStructReader this ^Integer column-index]
    (-> this (.getDate column-index))))

(defn get-long
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `long`"
  (^Long [^AbstractStructReader this ^Integer column-index]
    (-> this (.getLong column-index))))

(defn get-boolean-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getBooleanList column-index))))

(defn get-column-type
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type [^AbstractStructReader this ^Integer column-index]
    (-> this (.getColumnType column-index))))

(defn get-timestamp-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<com.google.cloud.Timestamp>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getTimestampList column-index))))

(defn get-double-list
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^AbstractStructReader this ^Integer column-index]
    (-> this (.getDoubleList column-index))))

(defn get-boolean-array
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `boolean[]`"
  ([^AbstractStructReader this ^Integer column-index]
    (-> this (.getBooleanArray column-index))))

(defn get-long-array
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `long[]`"
  ([^AbstractStructReader this ^Integer column-index]
    (-> this (.getLongArray column-index))))

(defn get-boolean?
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `boolean`"
  (^Boolean [^AbstractStructReader this ^Integer column-index]
    (-> this (.getBoolean column-index))))

(defn get-double
  "Description copied from interface: StructReader

  column-index - `int`

  returns: `double`"
  (^Double [^AbstractStructReader this ^Integer column-index]
    (-> this (.getDouble column-index))))

(defn get-column-index
  "Description copied from interface: StructReader

  column-name - `java.lang.String`

  returns: `int`"
  (^Integer [^AbstractStructReader this ^java.lang.String column-name]
    (-> this (.getColumnIndex column-name))))

