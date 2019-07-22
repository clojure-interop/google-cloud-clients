(ns com.google.cloud.bigquery.TableId
  "Google BigQuery Table identity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableId]))

(defn *of
  "Creates a table identity given project's, dataset's and table's user-defined ids.

  project - `java.lang.String`
  dataset - `java.lang.String`
  table - `java.lang.String`

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^java.lang.String project ^java.lang.String dataset ^java.lang.String table]
    (TableId/of project dataset table))
  (^com.google.cloud.bigquery.TableId [^java.lang.String dataset ^java.lang.String table]
    (TableId/of dataset table)))

(defn get-project
  "Returns project's user-defined id.

  returns: `java.lang.String`"
  (^java.lang.String [^TableId this]
    (-> this (.getProject))))

(defn get-dataset
  "Returns dataset's user-defined id.

  returns: `java.lang.String`"
  (^java.lang.String [^TableId this]
    (-> this (.getDataset))))

(defn get-table
  "Returns table's user-defined id.

  returns: `java.lang.String`"
  (^java.lang.String [^TableId this]
    (-> this (.getTable))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TableId this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TableId this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TableId this]
    (-> this (.toString))))

