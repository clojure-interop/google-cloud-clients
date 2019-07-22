(ns com.google.cloud.bigquery.DatasetId
  "Google BigQuery Dataset identity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery DatasetId]))

(defn *of
  "Creates a dataset identity given project's and dataset's user-defined ids.

  project - `java.lang.String`
  dataset - `java.lang.String`

  returns: `com.google.cloud.bigquery.DatasetId`"
  (^com.google.cloud.bigquery.DatasetId [^java.lang.String project ^java.lang.String dataset]
    (DatasetId/of project dataset))
  (^com.google.cloud.bigquery.DatasetId [^java.lang.String dataset]
    (DatasetId/of dataset)))

(defn get-project
  "Returns project's user-defined id.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetId this]
    (-> this (.getProject))))

(defn get-dataset
  "Returns dataset's user-defined id.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetId this]
    (-> this (.getDataset))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DatasetId this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DatasetId this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DatasetId this]
    (-> this (.toString))))

