(ns com.google.cloud.bigquery.RoutineInfo$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery RoutineInfo$Builder]))

(defn ->builder
  "Constructor."
  (^RoutineInfo$Builder []
    (new RoutineInfo$Builder )))

(defn set-routine-type
  "Sets the routine type for the Builder (e.g. SCALAR_FUNCTION).

   See https://cloud.google.com/bigquery/docs/reference/rest/v2/routines

  routine-type - `java.lang.String`

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^RoutineInfo$Builder this ^java.lang.String routine-type]
    (-> this (.setRoutineType routine-type))))

(defn set-language
  "Sets the language for the routine (e.g. SQL or JAVASCRIPT)

  language - `java.lang.String`

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^RoutineInfo$Builder this ^java.lang.String language]
    (-> this (.setLanguage language))))

(defn set-arguments
  "Specifies the list of input/output arguments for the routine.

  argument-list - `java.util.List`

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^RoutineInfo$Builder this ^java.util.List argument-list]
    (-> this (.setArguments argument-list))))

(defn set-return-type
  "Sets the return type of the routine.

   Optional if language = \"SQL\"; required otherwise.

   If absent, the return type is inferred from definitionBody at query time in each query
   that references this routine. If present, then the evaluated result will be cast to the
   specified returned type at query time.

  return-type - `com.google.cloud.bigquery.StandardSQLDataType`

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^RoutineInfo$Builder this ^com.google.cloud.bigquery.StandardSQLDataType return-type]
    (-> this (.setReturnType return-type))))

(defn set-imported-libraries
  "Optional. If language = \"JAVASCRIPT\", this field stores the path of the imported JAVASCRIPT
   libraries as a list of gs:// URLs.

  imported-libraries-list - `java.util.List`

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^RoutineInfo$Builder this ^java.util.List imported-libraries-list]
    (-> this (.setImportedLibraries imported-libraries-list))))

(defn set-body
  "Required. The body of the routine.

   For functions, this is the expression in the AS clause.

   If language=SQL, it is the substring inside (but excluding) the parentheses. For example,
   for the function created with the following statement:

   CREATE FUNCTION JoinLines(x string, y string) as (concat(x, \"\\n\", y))

   The definitionBody is concat(x, \"\\n\", y) (\\n is not replaced with linebreak).

   If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the
   function created with the following statement:

   CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS 'return \"\\n\";\\n'

   The definitionBody is

   return \"\\n\";\\n

   Note that both \\n are replaced with linebreaks.

  body - `java.lang.String`

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^RoutineInfo$Builder this ^java.lang.String body]
    (-> this (.setBody body))))

(defn build
  "Creates a RoutineInfo object.

  returns: `com.google.cloud.bigquery.RoutineInfo`"
  (^com.google.cloud.bigquery.RoutineInfo [^RoutineInfo$Builder this]
    (-> this (.build))))

