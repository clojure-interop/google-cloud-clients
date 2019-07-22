(ns com.google.cloud.bigquery.RoutineArgument
  "An argument for a BigQuery Routine."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery RoutineArgument]))

(defn ->routine-argument
  "Constructor."
  (^RoutineArgument []
    (new RoutineArgument )))

(defn *new-builder
  "Returns a builder for a  object.

  returns: `com.google.cloud.bigquery.RoutineArgument$Builder`"
  (^com.google.cloud.bigquery.RoutineArgument$Builder []
    (RoutineArgument/newBuilder )))

(defn get-name
  "Returns the name of the argument.

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineArgument this]
    (-> this (.getName))))

(defn get-kind
  "Returns the kind of the argument.

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineArgument this]
    (-> this (.getKind))))

(defn get-mode
  "Returns the mode of the argument.

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineArgument this]
    (-> this (.getMode))))

(defn get-data-type
  "returns: `com.google.cloud.bigquery.StandardSQLDataType`"
  (^com.google.cloud.bigquery.StandardSQLDataType [^RoutineArgument this]
    (-> this (.getDataType))))

(defn to-builder
  "Returns a builder pre-populated using the current values of this RoutineArgument.

  returns: `com.google.cloud.bigquery.RoutineArgument$Builder`"
  (^com.google.cloud.bigquery.RoutineArgument$Builder [^RoutineArgument this]
    (-> this (.toBuilder))))

