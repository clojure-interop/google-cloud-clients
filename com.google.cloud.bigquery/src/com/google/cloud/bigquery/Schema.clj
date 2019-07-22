(ns com.google.cloud.bigquery.Schema
  "This class represents the schema for a Google BigQuery Table or data source."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Schema]))

(defn *of
  "Creates a Schema object given a list of fields.

  fields - `java.lang.Iterable`

  returns: `com.google.cloud.bigquery.Schema`"
  (^com.google.cloud.bigquery.Schema [^java.lang.Iterable fields]
    (Schema/of fields)))

(defn get-fields
  "Returns the fields in the current table schema.

  returns: `com.google.cloud.bigquery.FieldList`"
  (^com.google.cloud.bigquery.FieldList [^Schema this]
    (-> this (.getFields))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Schema this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Schema this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Schema this ^java.lang.Object obj]
    (-> this (.equals obj))))

