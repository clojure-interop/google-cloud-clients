(ns com.google.cloud.bigquery.StandardSQLStructType$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardSQLStructType$Builder]))

(defn ->builder
  "Constructor."
  (^StandardSQLStructType$Builder []
    (new StandardSQLStructType$Builder )))

(defn set-fields
  "Sets the fields of the struct type.

  fields - `java.util.List`

  returns: `com.google.cloud.bigquery.StandardSQLStructType$Builder`"
  (^com.google.cloud.bigquery.StandardSQLStructType$Builder [^StandardSQLStructType$Builder this ^java.util.List fields]
    (-> this (.setFields fields))))

(defn build
  "Creates a StandardSQLStructType object.

  returns: `com.google.cloud.bigquery.StandardSQLStructType`"
  (^com.google.cloud.bigquery.StandardSQLStructType [^StandardSQLStructType$Builder this]
    (-> this (.build))))

