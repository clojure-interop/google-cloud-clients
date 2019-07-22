(ns com.google.cloud.bigquery.BigQuery$RoutineListOption
  "Class for specifying routine list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$RoutineListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of routines returned per page.

  page-size - `long`

  returns: `com.google.cloud.bigquery.BigQuery$RoutineListOption`"
  (^com.google.cloud.bigquery.BigQuery$RoutineListOption [^Long page-size]
    (BigQuery$RoutineListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing routines.

  page-token - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQuery$RoutineListOption`"
  (^com.google.cloud.bigquery.BigQuery$RoutineListOption [^java.lang.String page-token]
    (BigQuery$RoutineListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQuery$RoutineListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQuery$RoutineListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$RoutineListOption this]
    (-> this (.toString))))

