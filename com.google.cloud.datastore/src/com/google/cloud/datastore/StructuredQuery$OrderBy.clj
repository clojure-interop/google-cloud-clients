(ns com.google.cloud.datastore.StructuredQuery$OrderBy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore StructuredQuery$OrderBy]))

(defn ->order-by
  "Constructor.

  property - `java.lang.String`
  direction - `com.google.cloud.datastore.StructuredQuery$OrderBy$Direction`"
  (^StructuredQuery$OrderBy [^java.lang.String property ^com.google.cloud.datastore.StructuredQuery$OrderBy$Direction direction]
    (new StructuredQuery$OrderBy property direction)))

(defn *asc
  "property - `java.lang.String`

  returns: `com.google.cloud.datastore.StructuredQuery$OrderBy`"
  (^com.google.cloud.datastore.StructuredQuery$OrderBy [^java.lang.String property]
    (StructuredQuery$OrderBy/asc property)))

(defn *desc
  "property - `java.lang.String`

  returns: `com.google.cloud.datastore.StructuredQuery$OrderBy`"
  (^com.google.cloud.datastore.StructuredQuery$OrderBy [^java.lang.String property]
    (StructuredQuery$OrderBy/desc property)))

(defn hash-code
  "returns: `int`"
  (^Integer [^StructuredQuery$OrderBy this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StructuredQuery$OrderBy this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-property
  "Returns the property according to which the query result should be ordered.

  returns: `java.lang.String`"
  (^java.lang.String [^StructuredQuery$OrderBy this]
    (-> this (.getProperty))))

(defn get-direction
  "Returns the order's direction.

  returns: `com.google.cloud.datastore.StructuredQuery$OrderBy$Direction`"
  (^com.google.cloud.datastore.StructuredQuery$OrderBy$Direction [^StructuredQuery$OrderBy this]
    (-> this (.getDirection))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StructuredQuery$OrderBy this]
    (-> this (.toString))))

