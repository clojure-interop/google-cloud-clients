(ns com.google.cloud.bigquery.ModelId
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ModelId]))

(defn *of
  "Creates a model identity given project, dataset, and model identifiers. *

  project - `java.lang.String`
  dataset - `java.lang.String`
  model - `java.lang.String`

  returns: `com.google.cloud.bigquery.ModelId`"
  (^com.google.cloud.bigquery.ModelId [^java.lang.String project ^java.lang.String dataset ^java.lang.String model]
    (ModelId/of project dataset model))
  (^com.google.cloud.bigquery.ModelId [^java.lang.String dataset ^java.lang.String model]
    (ModelId/of dataset model)))

(defn get-project
  "Return corresponding project ID for this model. *

  returns: `java.lang.String`"
  (^java.lang.String [^ModelId this]
    (-> this (.getProject))))

(defn get-dataset
  "Return corresponding dataset ID for this model. *

  returns: `java.lang.String`"
  (^java.lang.String [^ModelId this]
    (-> this (.getDataset))))

(defn get-model
  "Return corresponding model ID for this model. *

  returns: `java.lang.String`"
  (^java.lang.String [^ModelId this]
    (-> this (.getModel))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ModelId this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ModelId this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ModelId this]
    (-> this (.toString))))

