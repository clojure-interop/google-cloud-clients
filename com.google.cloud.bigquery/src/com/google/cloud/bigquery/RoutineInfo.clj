(ns com.google.cloud.bigquery.RoutineInfo
  "Google BigQuery routine information. A Routine is an API abstraction that encapsulates several
  related concepts inside the BigQuery service, including scalar user defined functions (UDFS) and
  stored procedures.

  For more information about the REST representation of routines, see:
  https://cloud.google.com/bigquery/docs/reference/rest/v2/routines

  For more information about working with scalar functions, see:
  https://cloud.google.com/bigquery/docs/reference/standard-sql/user-defined-functions"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery RoutineInfo]))

(defn *new-builder
  "Returns a builder for a RoutineInfo object given routine identity.

  routine-id - `com.google.cloud.bigquery.RoutineId`

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^com.google.cloud.bigquery.RoutineId routine-id]
    (RoutineInfo/newBuilder routine-id)))

(defn *of
  "Returns a RoutineInfo object given routine identity.

  routine-id - `com.google.cloud.bigquery.RoutineId`

  returns: `com.google.cloud.bigquery.RoutineInfo`"
  (^com.google.cloud.bigquery.RoutineInfo [^com.google.cloud.bigquery.RoutineId routine-id]
    (RoutineInfo/of routine-id)))

(defn get-arguments
  "Returns the list of arguments for the routine.

  returns: `java.util.List<com.google.cloud.bigquery.RoutineArgument>`"
  (^java.util.List [^RoutineInfo this]
    (-> this (.getArguments))))

(defn get-language
  "Returns the language of the routine. Currently supported languages include SQL and JAVASCRIPT.

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineInfo this]
    (-> this (.getLanguage))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RoutineInfo this]
    (-> this (.toString))))

(defn get-etag
  "Returns the hash of the routine resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineInfo this]
    (-> this (.getEtag))))

(defn get-return-type
  "If specified, returns the data type returned from the routine.

  returns: `com.google.cloud.bigquery.StandardSQLDataType`"
  (^com.google.cloud.bigquery.StandardSQLDataType [^RoutineInfo this]
    (-> this (.getReturnType))))

(defn get-routine-type
  "Returns the type of the routine, e.g. SCALAR_FUNCTION.

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineInfo this]
    (-> this (.getRoutineType))))

(defn get-body
  "Returns the definition body of the routine.

  returns: `java.lang.String`"
  (^java.lang.String [^RoutineInfo this]
    (-> this (.getBody))))

(defn get-last-modified-time
  "Returns the last modification time of the routine, represented as milliseconds since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^RoutineInfo this]
    (-> this (.getLastModifiedTime))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RoutineInfo this]
    (-> this (.hashCode))))

(defn get-imported-libraries
  "Returns the list of imported libraries for the routine. Only relevant for routines implemented
   using the JAVASCRIPT language.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RoutineInfo this]
    (-> this (.getImportedLibraries))))

(defn get-routine-id
  "Returns the RoutineId identified for the routine resource. *

  returns: `com.google.cloud.bigquery.RoutineId`"
  (^com.google.cloud.bigquery.RoutineId [^RoutineInfo this]
    (-> this (.getRoutineId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RoutineInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-creation-time
  "Returns the creation time of the routine, represented as milliseconds since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^RoutineInfo this]
    (-> this (.getCreationTime))))

(defn to-builder
  "Returns a builder pre-populated using the current values of this routine.

  returns: `com.google.cloud.bigquery.RoutineInfo$Builder`"
  (^com.google.cloud.bigquery.RoutineInfo$Builder [^RoutineInfo this]
    (-> this (.toBuilder))))

