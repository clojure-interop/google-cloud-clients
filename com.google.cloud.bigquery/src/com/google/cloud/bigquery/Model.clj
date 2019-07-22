(ns com.google.cloud.bigquery.Model
  "A Google BigQuery ML Model.

  Objects of this class are immutable. Operations that modify the table like update(com.google.cloud.bigquery.BigQuery.ModelOption...)
  return a new object. To get a Model object with the most recent information use reload(com.google.cloud.bigquery.BigQuery.ModelOption...)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Model]))

(defn exists?
  "Check if this model exists.

  returns: true if this table exists, false otherwise - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Model this]
    (-> this (.exists))))

(defn reload
  "Fetches current model's state from the service. Returns null if the model does not
   exist. A new Model is returned.

  options - model options - `com.google.cloud.bigquery.BigQuery$ModelOption`

  returns: a Model object with latest information or null if not found - `com.google.cloud.bigquery.Model`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Model [^Model this ^com.google.cloud.bigquery.BigQuery$ModelOption options]
    (-> this (.reload options))))

(defn update
  "Updates the model's information with this model's information. Dataset and model identifiers
   cannot be updated. A new Model object is returned.

  options - dataset options - `com.google.cloud.bigquery.BigQuery$ModelOption`

  returns: a Model object with updated information - `com.google.cloud.bigquery.Model`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Model [^Model this ^com.google.cloud.bigquery.BigQuery$ModelOption options]
    (-> this (.update options))))

(defn delete
  "Deletes this model.

  returns: true if model was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Model this]
    (-> this (.delete))))

(defn get-big-query
  "Return's the model's BigQuery object used to issue requests. *

  returns: `com.google.cloud.bigquery.BigQuery`"
  (^com.google.cloud.bigquery.BigQuery [^Model this]
    (-> this (.getBigQuery))))

(defn to-builder
  "returns: `com.google.cloud.bigquery.Model$Builder`"
  (^com.google.cloud.bigquery.Model$Builder [^Model this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Model this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Model this]
    (-> this (.hashCode))))

