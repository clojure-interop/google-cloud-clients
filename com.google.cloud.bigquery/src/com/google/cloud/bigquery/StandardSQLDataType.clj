(ns com.google.cloud.bigquery.StandardSQLDataType
  "Represents Standard SQL data type information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardSQLDataType]))

(defn ->standard-sql-data-type
  "Constructor."
  (^StandardSQLDataType []
    (new StandardSQLDataType )))

(defn *new-builder
  "Returns a new builder initialized with the type kind.

  type-kind - `java.lang.String`

  returns: `com.google.cloud.bigquery.StandardSQLDataType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLDataType$Builder [^java.lang.String type-kind]
    (StandardSQLDataType/newBuilder type-kind))
  (^com.google.cloud.bigquery.StandardSQLDataType$Builder []
    (StandardSQLDataType/newBuilder )))

(defn get-type-kind
  "Returns the type kind of the data type.

   Can be any standard SQL data type. For more information, see
   https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types

  returns: `java.lang.String`"
  (^java.lang.String [^StandardSQLDataType this]
    (-> this (.getTypeKind))))

(defn get-array-element-type
  "Returns the type of an ARRAY's elements.

  returns: `com.google.cloud.bigquery.StandardSQLDataType`"
  (^com.google.cloud.bigquery.StandardSQLDataType [^StandardSQLDataType this]
    (-> this (.getArrayElementType))))

(defn get-struct-type
  "Returns the struct definition's list of fields for a STRUCT type.

  returns: `com.google.cloud.bigquery.StandardSQLStructType`"
  (^com.google.cloud.bigquery.StandardSQLStructType [^StandardSQLDataType this]
    (-> this (.getStructType))))

(defn to-builder
  "returns: `com.google.cloud.bigquery.StandardSQLDataType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLDataType$Builder [^StandardSQLDataType this]
    (-> this (.toBuilder))))

