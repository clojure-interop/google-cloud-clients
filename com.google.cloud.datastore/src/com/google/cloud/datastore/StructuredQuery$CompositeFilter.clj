(ns com.google.cloud.datastore.StructuredQuery$CompositeFilter
  "A class representing a filter composed of a combination of other filters."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore StructuredQuery$CompositeFilter]))

(defn *and
  "first - `com.google.cloud.datastore.StructuredQuery$Filter`
  other - `com.google.cloud.datastore.StructuredQuery$Filter`

  returns: `com.google.cloud.datastore.StructuredQuery$CompositeFilter`"
  (^com.google.cloud.datastore.StructuredQuery$CompositeFilter [^com.google.cloud.datastore.StructuredQuery$Filter first ^com.google.cloud.datastore.StructuredQuery$Filter other]
    (StructuredQuery$CompositeFilter/and first other)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StructuredQuery$CompositeFilter this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StructuredQuery$CompositeFilter this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StructuredQuery$CompositeFilter this ^java.lang.Object obj]
    (-> this (.equals obj))))

