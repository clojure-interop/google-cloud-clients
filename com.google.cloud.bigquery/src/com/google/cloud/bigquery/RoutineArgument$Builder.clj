(ns com.google.cloud.bigquery.RoutineArgument$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery RoutineArgument$Builder]))

(defn ->builder
  "Constructor."
  (^RoutineArgument$Builder []
    (new RoutineArgument$Builder )))

(defn set-name
  "Sets the argument name.

  name - `java.lang.String`

  returns: `com.google.cloud.bigquery.RoutineArgument$Builder`"
  (^com.google.cloud.bigquery.RoutineArgument$Builder [^RoutineArgument$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "Sets the kind of argument.

   A FIXED_TYPE argument is a fully specified type. It can be a struct or an array, but not a
   table.

   An ANY_TYPE argument is any type. It can be a struct or an array, but not a table.

  kind - `java.lang.String`

  returns: `com.google.cloud.bigquery.RoutineArgument$Builder`"
  (^com.google.cloud.bigquery.RoutineArgument$Builder [^RoutineArgument$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-mode
  "Optionally specifies the input/output mode of the argument.

   An IN mode argument is input-only. An OUT mode argument is output-only. An INOUT mode
   argument is both an input and output.

  mode - `java.lang.String`

  returns: `com.google.cloud.bigquery.RoutineArgument$Builder`"
  (^com.google.cloud.bigquery.RoutineArgument$Builder [^RoutineArgument$Builder this ^java.lang.String mode]
    (-> this (.setMode mode))))

(defn set-data-type
  "Sets the data type specification for the argument. It is required except for ANY_TYPE
   argument kinds.

  data-type - `com.google.cloud.bigquery.StandardSQLDataType`

  returns: `com.google.cloud.bigquery.RoutineArgument$Builder`"
  (^com.google.cloud.bigquery.RoutineArgument$Builder [^RoutineArgument$Builder this ^com.google.cloud.bigquery.StandardSQLDataType data-type]
    (-> this (.setDataType data-type))))

(defn build
  "Creates a RoutineArgument object.

  returns: `com.google.cloud.bigquery.RoutineArgument`"
  (^com.google.cloud.bigquery.RoutineArgument [^RoutineArgument$Builder this]
    (-> this (.build))))

