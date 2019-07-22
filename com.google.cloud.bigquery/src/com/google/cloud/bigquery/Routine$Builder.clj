(ns com.google.cloud.bigquery.Routine$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Routine$Builder]))

(defn set-routine-type
  "Description copied from class: RoutineInfo.Builder

  routine-type - `java.lang.String`

  returns: `com.google.cloud.bigquery.Routine$Builder`"
  (^com.google.cloud.bigquery.Routine$Builder [^Routine$Builder this ^java.lang.String routine-type]
    (-> this (.setRoutineType routine-type))))

(defn set-language
  "Description copied from class: RoutineInfo.Builder

  language - `java.lang.String`

  returns: `com.google.cloud.bigquery.Routine$Builder`"
  (^com.google.cloud.bigquery.Routine$Builder [^Routine$Builder this ^java.lang.String language]
    (-> this (.setLanguage language))))

(defn set-arguments
  "Description copied from class: RoutineInfo.Builder

  arguments - `java.util.List`

  returns: `com.google.cloud.bigquery.Routine$Builder`"
  (^com.google.cloud.bigquery.Routine$Builder [^Routine$Builder this ^java.util.List arguments]
    (-> this (.setArguments arguments))))

(defn set-return-type
  "Description copied from class: RoutineInfo.Builder

  return-type - `com.google.cloud.bigquery.StandardSQLDataType`

  returns: `com.google.cloud.bigquery.Routine$Builder`"
  (^com.google.cloud.bigquery.Routine$Builder [^Routine$Builder this ^com.google.cloud.bigquery.StandardSQLDataType return-type]
    (-> this (.setReturnType return-type))))

(defn set-imported-libraries
  "Description copied from class: RoutineInfo.Builder

  libraries - `java.util.List`

  returns: `com.google.cloud.bigquery.Routine$Builder`"
  (^com.google.cloud.bigquery.Routine$Builder [^Routine$Builder this ^java.util.List libraries]
    (-> this (.setImportedLibraries libraries))))

(defn set-body
  "Description copied from class: RoutineInfo.Builder

  body - `java.lang.String`

  returns: `com.google.cloud.bigquery.Routine$Builder`"
  (^com.google.cloud.bigquery.Routine$Builder [^Routine$Builder this ^java.lang.String body]
    (-> this (.setBody body))))

(defn build
  "Description copied from class: RoutineInfo.Builder

  returns: `com.google.cloud.bigquery.Routine`"
  (^com.google.cloud.bigquery.Routine [^Routine$Builder this]
    (-> this (.build))))

