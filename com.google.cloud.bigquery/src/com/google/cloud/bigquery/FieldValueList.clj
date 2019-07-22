(ns com.google.cloud.bigquery.FieldValueList
  "Google BigQuery Table Field Values class, which represents a row in returned query result (table
  row). Tables rows can be retrieved as a result of a query or when listing table data.

  Depending on how a corresponding query was executed, each row (an instance of FieldValueList) may or may not contain related schema. If schema is not provided, the individual
  cells of the row will still be accessible by index but not by name."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery FieldValueList]))

(defn *of
  "Creates an instance of FieldValueList, useful for testing.

   This method is unstable. See this discussion for more
   context.

  row - `java.util.List`
  schema - `com.google.cloud.bigquery.FieldList`

  returns: `com.google.cloud.bigquery.FieldValueList`"
  (^com.google.cloud.bigquery.FieldValueList [^java.util.List row ^com.google.cloud.bigquery.FieldList schema]
    (FieldValueList/of row schema)))

(defn get
  "Gets field value by index.

  index - field value index - `int`

  returns: `com.google.cloud.bigquery.FieldValue`"
  (^com.google.cloud.bigquery.FieldValue [^FieldValueList this ^Integer index]
    (-> this (.get index))))

(defn has-schema?
  "Returns true if schema is provided, false otherwise.

  returns: `boolean`"
  (^Boolean [^FieldValueList this]
    (-> this (.hasSchema))))

(defn size
  "Returns the total number of field values in the row.

  returns: `int`"
  (^Integer [^FieldValueList this]
    (-> this (.size))))

