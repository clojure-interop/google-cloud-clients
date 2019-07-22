(ns com.google.cloud.bigquery.ModelTableDefinition
  "A Google BigQuery Model table definition. This definition is used to represent a BigQuery ML
  model."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ModelTableDefinition]))

(defn ->model-table-definition
  "Constructor."
  (^ModelTableDefinition []
    (new ModelTableDefinition )))

(defn *new-builder
  "Returns a builder for a BigQuery ML model table definition.

  returns: `com.google.cloud.bigquery.ModelTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ModelTableDefinition$Builder []
    (ModelTableDefinition/newBuilder )))

(defn get-num-bytes
  "Returns the size of this table in bytes, excluding any data in the streaming buffer.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ModelTableDefinition this]
    (-> this (.getNumBytes))))

(defn get-location
  "Returns the geographic location where the table should reside. This value is inherited from the
   dataset.

  returns: `java.lang.String`"
  (^java.lang.String [^ModelTableDefinition this]
    (-> this (.getLocation))))

(defn to-builder
  "Returns a builder for the <ModelTableDefinition object.

  returns: `com.google.cloud.bigquery.ModelTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ModelTableDefinition$Builder [^ModelTableDefinition this]
    (-> this (.toBuilder))))

