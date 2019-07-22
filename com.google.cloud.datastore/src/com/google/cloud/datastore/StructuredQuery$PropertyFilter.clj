(ns com.google.cloud.datastore.StructuredQuery$PropertyFilter
  "A class representing a filter based on a single property or ancestor."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore StructuredQuery$PropertyFilter]))

(defn *lt
  "property - `java.lang.String`
  value - `com.google.cloud.datastore.Value`

  returns: `com.google.cloud.datastore.StructuredQuery$PropertyFilter`"
  (^com.google.cloud.datastore.StructuredQuery$PropertyFilter [^java.lang.String property ^com.google.cloud.datastore.Value value]
    (StructuredQuery$PropertyFilter/lt property value)))

(defn *le
  "property - `java.lang.String`
  value - `com.google.cloud.datastore.Value`

  returns: `com.google.cloud.datastore.StructuredQuery$PropertyFilter`"
  (^com.google.cloud.datastore.StructuredQuery$PropertyFilter [^java.lang.String property ^com.google.cloud.datastore.Value value]
    (StructuredQuery$PropertyFilter/le property value)))

(defn *gt
  "property - `java.lang.String`
  value - `com.google.cloud.datastore.Value`

  returns: `com.google.cloud.datastore.StructuredQuery$PropertyFilter`"
  (^com.google.cloud.datastore.StructuredQuery$PropertyFilter [^java.lang.String property ^com.google.cloud.datastore.Value value]
    (StructuredQuery$PropertyFilter/gt property value)))

(defn *ge
  "property - `java.lang.String`
  value - `com.google.cloud.datastore.Value`

  returns: `com.google.cloud.datastore.StructuredQuery$PropertyFilter`"
  (^com.google.cloud.datastore.StructuredQuery$PropertyFilter [^java.lang.String property ^com.google.cloud.datastore.Value value]
    (StructuredQuery$PropertyFilter/ge property value)))

(defn *eq
  "property - `java.lang.String`
  value - `com.google.cloud.datastore.Value`

  returns: `com.google.cloud.datastore.StructuredQuery$PropertyFilter`"
  (^com.google.cloud.datastore.StructuredQuery$PropertyFilter [^java.lang.String property ^com.google.cloud.datastore.Value value]
    (StructuredQuery$PropertyFilter/eq property value)))

(defn *has-ancestor
  "key - `com.google.cloud.datastore.Key`

  returns: `com.google.cloud.datastore.StructuredQuery$PropertyFilter`"
  (^com.google.cloud.datastore.StructuredQuery$PropertyFilter [^com.google.cloud.datastore.Key key]
    (StructuredQuery$PropertyFilter/hasAncestor key)))

(defn *is-null
  "property - `java.lang.String`

  returns: `com.google.cloud.datastore.StructuredQuery$PropertyFilter`"
  (^com.google.cloud.datastore.StructuredQuery$PropertyFilter [^java.lang.String property]
    (StructuredQuery$PropertyFilter/isNull property)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StructuredQuery$PropertyFilter this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StructuredQuery$PropertyFilter this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StructuredQuery$PropertyFilter this ^java.lang.Object obj]
    (-> this (.equals obj))))

