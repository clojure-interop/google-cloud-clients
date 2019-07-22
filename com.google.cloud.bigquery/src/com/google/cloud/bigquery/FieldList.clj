(ns com.google.cloud.bigquery.FieldList
  "Google BigQuery Table schema fields (columns). Each field has a unique name and index. Fields
  with duplicate names are not allowed in BigQuery schema."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery FieldList]))

(defn *of
  "Returns a new FieldList object, which contains a collection of Field objects in
   preserved order and represent schema columns.

  fields - the schema fields - `com.google.cloud.bigquery.Field`

  returns: `com.google.cloud.bigquery.FieldList`"
  (^com.google.cloud.bigquery.FieldList [^com.google.cloud.bigquery.Field fields]
    (FieldList/of fields)))

(defn get
  "Get schema field by index.

  index - field (column) index - `int`

  returns: `com.google.cloud.bigquery.Field`"
  (^com.google.cloud.bigquery.Field [^FieldList this ^Integer index]
    (-> this (.get index))))

(defn get-index
  "Get schema field's index by name.

  name - field (column) name - `java.lang.String`

  returns: `int`"
  (^Integer [^FieldList this ^java.lang.String name]
    (-> this (.getIndex name))))

(defn size
  "Total number of fields (columns) in the schema.

  returns: `int`"
  (^Integer [^FieldList this]
    (-> this (.size))))

