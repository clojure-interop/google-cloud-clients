(ns com.google.cloud.bigquery.TableDefinition$Builder
  "Base builder for table definitions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableDefinition$Builder]))

(defn ->builder
  "Constructor."
  (^TableDefinition$Builder []
    (new TableDefinition$Builder )))

(defn set-type
  "type - `com.google.cloud.bigquery.TableDefinition$Type`

  returns: `B`"
  ([^TableDefinition$Builder this ^com.google.cloud.bigquery.TableDefinition$Type type]
    (-> this (.setType type))))

(defn set-schema
  "Sets the table schema.

  schema - `com.google.cloud.bigquery.Schema`

  returns: `B`"
  ([^TableDefinition$Builder this ^com.google.cloud.bigquery.Schema schema]
    (-> this (.setSchema schema))))

(defn build
  "Creates an object.

  returns: `T`"
  ([^TableDefinition$Builder this]
    (-> this (.build))))

