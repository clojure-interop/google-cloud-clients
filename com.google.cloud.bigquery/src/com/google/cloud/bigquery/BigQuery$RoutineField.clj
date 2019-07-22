(ns com.google.cloud.bigquery.BigQuery$RoutineField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$RoutineField]))

(def ARGUMENTS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/ARGUMENTS)

(def CREATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/CREATION_TIME)

(def DEFINITION_BODY
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/DEFINITION_BODY)

(def ETAG
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/ETAG)

(def IMPORTED_LIBRARIES
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/IMPORTED_LIBRARIES)

(def LANGUAGE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/LANGUAGE)

(def LAST_MODIFIED_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/LAST_MODIFIED_TIME)

(def RETURN_TYPE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/RETURN_TYPE)

(def ROUTINE_REFERENCE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/ROUTINE_REFERENCE)

(def ROUTINE_TYPE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$RoutineField"
  BigQuery$RoutineField/ROUTINE_TYPE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BigQuery.RoutineField c : BigQuery.RoutineField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.BigQuery$RoutineField[]`"
  ([]
    (BigQuery$RoutineField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.BigQuery$RoutineField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.BigQuery$RoutineField [^java.lang.String name]
    (BigQuery$RoutineField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$RoutineField this]
    (-> this (.getSelector))))

