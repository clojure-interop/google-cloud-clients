(ns com.google.cloud.bigquery.StandardSQLStructType
  "A set of fields contained within a SQL STRUCT in Google BigQuery."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardSQLStructType]))

(defn ->standard-sql-struct-type
  "Constructor."
  (^StandardSQLStructType []
    (new StandardSQLStructType )))

(defn *new-builder
  "Returns a builder for a StandardSQLStructType object with the specified fields.

  field-list - `java.util.List`

  returns: `com.google.cloud.bigquery.StandardSQLStructType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLStructType$Builder [^java.util.List field-list]
    (StandardSQLStructType/newBuilder field-list))
  (^com.google.cloud.bigquery.StandardSQLStructType$Builder []
    (StandardSQLStructType/newBuilder )))

(defn get-fields
  "Returns the list of fields within a struct type.

  returns: `java.util.List<com.google.cloud.bigquery.StandardSQLField>`"
  (^java.util.List [^StandardSQLStructType this]
    (-> this (.getFields))))

(defn to-builder
  "Returns a builder pre-populated using the current values of this field.

  returns: `com.google.cloud.bigquery.StandardSQLStructType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLStructType$Builder [^StandardSQLStructType this]
    (-> this (.toBuilder))))

