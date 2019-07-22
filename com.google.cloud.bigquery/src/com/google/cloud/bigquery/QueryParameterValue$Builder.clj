(ns com.google.cloud.bigquery.QueryParameterValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery QueryParameterValue$Builder]))

(defn ->builder
  "Constructor."
  (^QueryParameterValue$Builder []
    (new QueryParameterValue$Builder )))

(defn set-value
  "Sets the value to the given scalar value.

  value - `java.lang.String`

  returns: `com.google.cloud.bigquery.QueryParameterValue$Builder`"
  (^com.google.cloud.bigquery.QueryParameterValue$Builder [^QueryParameterValue$Builder this ^java.lang.String value]
    (-> this (.setValue value))))

(defn set-array-values
  "Sets array values. The type must set to ARRAY.

  array-values - `java.util.List`

  returns: `com.google.cloud.bigquery.QueryParameterValue$Builder`"
  (^com.google.cloud.bigquery.QueryParameterValue$Builder [^QueryParameterValue$Builder this ^java.util.List array-values]
    (-> this (.setArrayValues array-values))))

(defn set-type
  "Sets the parameter data type.

  type - `com.google.cloud.bigquery.StandardSQLTypeName`

  returns: `com.google.cloud.bigquery.QueryParameterValue$Builder`"
  (^com.google.cloud.bigquery.QueryParameterValue$Builder [^QueryParameterValue$Builder this ^com.google.cloud.bigquery.StandardSQLTypeName type]
    (-> this (.setType type))))

(defn set-array-type
  "Sets the data type of the array elements. The type must set to ARRAY.

  array-type - `com.google.cloud.bigquery.StandardSQLTypeName`

  returns: `com.google.cloud.bigquery.QueryParameterValue$Builder`"
  (^com.google.cloud.bigquery.QueryParameterValue$Builder [^QueryParameterValue$Builder this ^com.google.cloud.bigquery.StandardSQLTypeName array-type]
    (-> this (.setArrayType array-type))))

(defn build
  "Creates a QueryParameterValue object.

  returns: `com.google.cloud.bigquery.QueryParameterValue`"
  (^com.google.cloud.bigquery.QueryParameterValue [^QueryParameterValue$Builder this]
    (-> this (.build))))

