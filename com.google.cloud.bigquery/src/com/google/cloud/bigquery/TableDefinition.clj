(ns com.google.cloud.bigquery.TableDefinition
  "Base class for a Google BigQuery table definition."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableDefinition]))

(defn ->table-definition
  "Constructor."
  (^TableDefinition []
    (new TableDefinition )))

(defn get-type
  "Returns the table's type. If this table is simple table the method returns TableDefinition.Type.TABLE.
   If this table is an external table this method returns TableDefinition.Type.EXTERNAL. If this table is
   a view table this method returns TableDefinition.Type.VIEW.

  returns: `com.google.cloud.bigquery.TableDefinition$Type`"
  (^com.google.cloud.bigquery.TableDefinition$Type [^TableDefinition this]
    (-> this (.getType))))

(defn get-schema
  "Returns the table's schema.

  returns: `com.google.cloud.bigquery.Schema`"
  (^com.google.cloud.bigquery.Schema [^TableDefinition this]
    (-> this (.getSchema))))

(defn to-builder
  "Returns a builder for the object.

  returns: `com.google.cloud.bigquery.TableDefinition$Builder`"
  (^com.google.cloud.bigquery.TableDefinition$Builder [^TableDefinition this]
    (-> this (.toBuilder))))

