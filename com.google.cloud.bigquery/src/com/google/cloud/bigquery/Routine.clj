(ns com.google.cloud.bigquery.Routine
  "A Google BigQuery Routine.

  Objects of this class are immutable. Operations that modify the routine like update(com.google.cloud.bigquery.BigQuery.RoutineOption...)
  return a new object. To get a routine object with the most recent information use reload(com.google.cloud.bigquery.BigQuery.RoutineOption...)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Routine]))

(defn read-object
  "in - `java.io.ObjectInputStream`

  throws: java.io.IOException"
  ([^Routine this ^java.io.ObjectInputStream in]
    (-> this (.readObject in))))

(defn delete
  "Deletes this routine.

  returns: true if routine was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Routine this]
    (-> this (.delete))))

(defn update
  "Update's the routine's information with this Routine's information. This method does not allow
   changing the RoutineId identifier of the routine. A new Routine is returned.

  options - `com.google.cloud.bigquery.BigQuery$RoutineOption`

  returns: `com.google.cloud.bigquery.Routine`"
  (^com.google.cloud.bigquery.Routine [^Routine this ^com.google.cloud.bigquery.BigQuery$RoutineOption options]
    (-> this (.update options))))

(defn reload
  "Fetches this routine's latest information. Returns null if the routine does not exist.

  options - `com.google.cloud.bigquery.BigQuery$RoutineOption`

  returns: `com.google.cloud.bigquery.Routine`"
  (^com.google.cloud.bigquery.Routine [^Routine this ^com.google.cloud.bigquery.BigQuery$RoutineOption options]
    (-> this (.reload options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Routine this]
    (-> this (.hashCode))))

(defn get-big-query
  "Returns the routine's BigQuery object used to issue requests.

  returns: `com.google.cloud.bigquery.BigQuery`"
  (^com.google.cloud.bigquery.BigQuery [^Routine this]
    (-> this (.getBigQuery))))

(defn exists?
  "Checks if this routine exists.

  returns: `boolean`"
  (^Boolean [^Routine this]
    (-> this (.exists))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Routine this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Description copied from class: RoutineInfo

  returns: `com.google.cloud.bigquery.Routine$Builder`"
  (^com.google.cloud.bigquery.Routine$Builder [^Routine this]
    (-> this (.toBuilder))))

