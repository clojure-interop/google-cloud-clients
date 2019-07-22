(ns com.google.cloud.spanner.Key
  "Represents a row key in a Cloud Spanner table or index. A key is a tuple of values constrained to
  the scalar Cloud Spanner types: currently these are BOOLEAN, INT64, FLOAT64, STRING, BYTES and TIMESTAMP. Values may be null where the table
  definition permits it.

  Key is used to define the row, or endpoints of a range of rows, to retrieve in read
  operations or to delete in a mutation.

  Key instances are immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Key]))

(defn *of
  "Construct a key with parts specified by values. Each object in values must be
   either null or one of the following supported types:


     Boolean for the BOOL Cloud Spanner type
     Integer, Long for INT64
     Float, Double for FLOAT64
     String for STRING
     ByteArray for BYTES

  values - `java.lang.Object`

  returns: `com.google.cloud.spanner.Key`

  throws: java.lang.IllegalArgumentException - if any member of values is not a supported type"
  (^com.google.cloud.spanner.Key [^java.lang.Object values]
    (Key/of values)))

(defn *new-builder
  "Returns a new builder for constructing a key.

  returns: `com.google.cloud.spanner.Key$Builder`"
  (^com.google.cloud.spanner.Key$Builder []
    (Key/newBuilder )))

(defn size
  "Returns the number of parts in this key, including null values.

  returns: `int`"
  (^Integer [^Key this]
    (-> this (.size))))

(defn get-parts
  "Returns the parts in this key. Each part is represented by the corresponding Cloud Spanner
   type's canonical Java type, as listed below. Note that other types supported by of(Object...) are converted to one of the canonical types.


     BOOL is represented by Boolean
     INT64 is represented by Long
     FLOAT64 is represented by Double
     STRING is represented by String
     BYTES is represented by ByteArray
     TIMESTAMP is represented by Timestamp
     DATE is represented by Date

  returns: an unmodifiable list containing the key parts - `java.lang.Iterable<java.lang.Object>`"
  (^java.lang.Iterable [^Key this]
    (-> this (.getParts))))

(defn to-builder
  "Returns a builder initialized with the value of this key.

  returns: `com.google.cloud.spanner.Key$Builder`"
  (^com.google.cloud.spanner.Key$Builder [^Key this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Key this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Key this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Key this]
    (-> this (.hashCode))))

