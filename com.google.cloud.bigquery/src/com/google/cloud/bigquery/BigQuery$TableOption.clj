(ns com.google.cloud.bigquery.BigQuery$TableOption
  "Class for specifying table get, create and update options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$TableOption]))

(defn *fields
  "Returns an option to specify the table's fields to be returned by the RPC call. If this
   option is not provided all table's fields are returned. TableOption.fields can be
   used to specify only the fields of interest. TableInfo.getTableId() and type (which is
   part of TableInfo.getDefinition()) are always returned, even if not specified.

  fields - `com.google.cloud.bigquery.BigQuery$TableField`

  returns: `com.google.cloud.bigquery.BigQuery$TableOption`"
  (^com.google.cloud.bigquery.BigQuery$TableOption [^com.google.cloud.bigquery.BigQuery$TableField fields]
    (BigQuery$TableOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$TableOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$TableOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$TableOption this]
    (-> this (.toString))))

