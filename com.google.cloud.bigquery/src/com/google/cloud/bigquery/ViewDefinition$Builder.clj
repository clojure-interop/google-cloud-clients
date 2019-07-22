(ns com.google.cloud.bigquery.ViewDefinition$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ViewDefinition$Builder]))

(defn ->builder
  "Constructor."
  (^ViewDefinition$Builder []
    (new ViewDefinition$Builder )))

(defn set-query
  "Sets the query used to create the view.

  query - `java.lang.String`

  returns: `com.google.cloud.bigquery.ViewDefinition$Builder`"
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^ViewDefinition$Builder this ^java.lang.String query]
    (-> this (.setQuery query))))

(defn set-user-defined-functions
  "Sets user defined functions that can be used by ViewDefinition.getQuery().

  user-defined-functions - `java.util.List`

  returns: `com.google.cloud.bigquery.ViewDefinition$Builder`"
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^ViewDefinition$Builder this ^java.util.List user-defined-functions]
    (-> this (.setUserDefinedFunctions user-defined-functions))))

(defn set-use-legacy-sql
  "Sets whether to use BigQuery's legacy SQL dialect for this query. By default this property is
   set to false. If set to false, the query will use BigQuery's Standard SQL.

   If set to null or true, legacy SQL dialect is used. This property is
   experimental and might be subject to change.

  use-legacy-sql - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.ViewDefinition$Builder`"
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^ViewDefinition$Builder this ^java.lang.Boolean use-legacy-sql]
    (-> this (.setUseLegacySql use-legacy-sql))))

(defn set-type
  "type - `com.google.cloud.bigquery.TableDefinition$Type`

  returns: `com.google.cloud.bigquery.ViewDefinition$Builder`"
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^ViewDefinition$Builder this ^com.google.cloud.bigquery.TableDefinition$Type type]
    (-> this (.setType type))))

(defn set-schema
  "Sets the table schema.

  schema - `com.google.cloud.bigquery.Schema`

  returns: `com.google.cloud.bigquery.ViewDefinition$Builder`"
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^ViewDefinition$Builder this ^com.google.cloud.bigquery.Schema schema]
    (-> this (.setSchema schema))))

(defn build
  "Creates a ViewDefinition object.

  returns: `com.google.cloud.bigquery.ViewDefinition`"
  (^com.google.cloud.bigquery.ViewDefinition [^ViewDefinition$Builder this]
    (-> this (.build))))

