(ns com.google.cloud.bigquery.RoutineId
  "RoutineId represents the identifier for a given Routine."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery RoutineId]))

(defn *of
  "Creates a routine identity given project, dataset, and routine identifiers. *

  project - `java.lang.String`
  dataset - `java.lang.String`
  routine - `java.lang.String`

  returns: `com.google.cloud.bigquery.RoutineId`"
  (^com.google.cloud.bigquery.RoutineId [^java.lang.String project ^java.lang.String dataset ^java.lang.String routine]
    (RoutineId/of project dataset routine))
  (^com.google.cloud.bigquery.RoutineId [^java.lang.String dataset ^java.lang.String routine]
    (RoutineId/of dataset routine)))

(defn get-project
  "Return corresponding project ID for this routine. *

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineId this]
    (-> this (.getProject))))

(defn get-dataset
  "Return corresponding dataset ID for this routine. *

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineId this]
    (-> this (.getDataset))))

(defn get-routine
  "Return corresponding routine ID for this routine. *

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineId this]
    (-> this (.getRoutine))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RoutineId this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RoutineId this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RoutineId this]
    (-> this (.toString))))

