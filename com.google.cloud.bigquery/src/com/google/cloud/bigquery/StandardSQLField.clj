(ns com.google.cloud.bigquery.StandardSQLField
  "A Google BigQuery SQL Field."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardSQLField]))

(defn ->standard-sql-field
  "Constructor."
  (^StandardSQLField []
    (new StandardSQLField )))

(defn *new-builder
  "Returns a builder for a StandardSQLField object with the specified field name and data
   type.

  name - `java.lang.String`
  data-type - `com.google.cloud.bigquery.StandardSQLDataType`

  returns: `com.google.cloud.bigquery.StandardSQLField$Builder`"
  (^com.google.cloud.bigquery.StandardSQLField$Builder [^java.lang.String name ^com.google.cloud.bigquery.StandardSQLDataType data-type]
    (StandardSQLField/newBuilder name data-type))
  (^com.google.cloud.bigquery.StandardSQLField$Builder [^com.google.cloud.bigquery.StandardSQLDataType data-type]
    (StandardSQLField/newBuilder data-type))
  (^com.google.cloud.bigquery.StandardSQLField$Builder []
    (StandardSQLField/newBuilder )))

(defn get-name
  "Returns the field name.

  returns: `java.lang.String`"
  (^java.lang.String [^StandardSQLField this]
    (-> this (.getName))))

(defn get-data-type
  "Returns the field's data type.

  returns: `com.google.cloud.bigquery.StandardSQLDataType`"
  (^com.google.cloud.bigquery.StandardSQLDataType [^StandardSQLField this]
    (-> this (.getDataType))))

(defn to-builder
  "Returns a builder pre-populated using the current values of this field.

  returns: `com.google.cloud.bigquery.StandardSQLField$Builder`"
  (^com.google.cloud.bigquery.StandardSQLField$Builder [^StandardSQLField this]
    (-> this (.toBuilder))))

