(ns com.google.cloud.bigquery.StandardSQLField$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardSQLField$Builder]))

(defn ->builder
  "Constructor."
  (^StandardSQLField$Builder []
    (new StandardSQLField$Builder )))

(defn set-name
  "Sets the name of the field.

  name - `java.lang.String`

  returns: `com.google.cloud.bigquery.StandardSQLField$Builder`"
  (^com.google.cloud.bigquery.StandardSQLField$Builder [^StandardSQLField$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-data-type
  "Sets the data type of the field.

  data-type - `com.google.cloud.bigquery.StandardSQLDataType`

  returns: `com.google.cloud.bigquery.StandardSQLField$Builder`"
  (^com.google.cloud.bigquery.StandardSQLField$Builder [^StandardSQLField$Builder this ^com.google.cloud.bigquery.StandardSQLDataType data-type]
    (-> this (.setDataType data-type))))

(defn build
  "Creates a StandardSQLField object.

  returns: `com.google.cloud.bigquery.StandardSQLField`"
  (^com.google.cloud.bigquery.StandardSQLField [^StandardSQLField$Builder this]
    (-> this (.build))))

