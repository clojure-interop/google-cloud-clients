(ns com.google.cloud.bigquery.StandardSQLDataType$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardSQLDataType$Builder]))

(defn ->builder
  "Constructor."
  (^StandardSQLDataType$Builder []
    (new StandardSQLDataType$Builder )))

(defn set-array-element-type
  "Sets the type of an array's elements, when the TypeKind is ARRAY.

  array-element-type - `com.google.cloud.bigquery.StandardSQLDataType`

  returns: `com.google.cloud.bigquery.StandardSQLDataType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLDataType$Builder [^StandardSQLDataType$Builder this ^com.google.cloud.bigquery.StandardSQLDataType array-element-type]
    (-> this (.setArrayElementType array-element-type))))

(defn set-struct-type
  "Sets the struct type definition (list of fields) when the TypeKind is STRUCT.

  struct-type - `com.google.cloud.bigquery.StandardSQLStructType`

  returns: `com.google.cloud.bigquery.StandardSQLDataType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLDataType$Builder [^StandardSQLDataType$Builder this ^com.google.cloud.bigquery.StandardSQLStructType struct-type]
    (-> this (.setStructType struct-type))))

(defn set-type-kind
  "Sets the top-level type of this data type. Can be any standard SQL data type. For more
   information, see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types

  type-kind - `java.lang.String`

  returns: `com.google.cloud.bigquery.StandardSQLDataType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLDataType$Builder [^StandardSQLDataType$Builder this ^java.lang.String type-kind]
    (-> this (.setTypeKind type-kind))))

(defn build
  "Creates a StandardSQLDataType object.

  returns: `com.google.cloud.bigquery.StandardSQLDataType`"
  (^com.google.cloud.bigquery.StandardSQLDataType [^StandardSQLDataType$Builder this]
    (-> this (.build))))

