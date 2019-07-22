(ns com.google.cloud.bigquery.ViewDefinition
  "Google BigQuery view table definition. BigQuery's views are logical views, not materialized
  views, which means that the query that defines the view is re-executed every time the view is
  queried."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ViewDefinition]))

(defn ->view-definition
  "Constructor."
  (^ViewDefinition []
    (new ViewDefinition )))

(defn *new-builder
  "Returns a builder for a BigQuery view definition.

  query - the query used to generate the table - `java.lang.String`
  functions - user-defined functions that can be used by the query - `java.util.List`

  returns: `com.google.cloud.bigquery.ViewDefinition$Builder`"
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^java.lang.String query ^java.util.List functions]
    (ViewDefinition/newBuilder query functions))
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^java.lang.String query]
    (ViewDefinition/newBuilder query)))

(defn *of
  "Creates a BigQuery view definition given a query and some user-defined functions.

  query - the query used to generate the table - `java.lang.String`
  functions - user-defined functions that can be used by the query - `java.util.List`

  returns: `com.google.cloud.bigquery.ViewDefinition`"
  (^com.google.cloud.bigquery.ViewDefinition [^java.lang.String query ^java.util.List functions]
    (ViewDefinition/of query functions))
  (^com.google.cloud.bigquery.ViewDefinition [^java.lang.String query]
    (ViewDefinition/of query)))

(defn get-query
  "Returns the query used to create the view.

  returns: `java.lang.String`"
  (^java.lang.String [^ViewDefinition this]
    (-> this (.getQuery))))

(defn get-user-defined-functions
  "Returns user defined functions that can be used by getQuery(). Returns null if
   not set.

  returns: `java.util.List<com.google.cloud.bigquery.UserDefinedFunction>`"
  (^java.util.List [^ViewDefinition this]
    (-> this (.getUserDefinedFunctions))))

(defn use-legacy-sql
  "Returns whether to use BigQuery's legacy SQL dialect for this query. By default this property
   is set to false. If set to false, the query will use BigQuery's Standard SQL. If set to null or true, legacy SQL dialect is used. This property is experimental and might be
   subject to change.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ViewDefinition this]
    (-> this (.useLegacySql))))

(defn to-builder
  "Returns a builder for the ViewInfo object.

  returns: `com.google.cloud.bigquery.ViewDefinition$Builder`"
  (^com.google.cloud.bigquery.ViewDefinition$Builder [^ViewDefinition this]
    (-> this (.toBuilder))))

