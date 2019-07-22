(ns com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType
  "StatementType represents possible types of SQL statements reported as part of the
  QueryStatistics of a BigQuery job."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatistics$QueryStatistics$StatementType]))

(def *-select
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/SELECT)

(def *-update
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/UPDATE)

(def *-insert
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/INSERT)

(def *-delete
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/DELETE)

(def *-create-table
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/CREATE_TABLE)

(def *-create-table-as-select
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/CREATE_TABLE_AS_SELECT)

(def *-create-view
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/CREATE_VIEW)

(def *-create-model
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/CREATE_MODEL)

(def *-create-function
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/CREATE_FUNCTION)

(def *-create-procedure
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/CREATE_PROCEDURE)

(def *-alter-table
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/ALTER_TABLE)

(def *-alter-view
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/ALTER_VIEW)

(def *-drop-table
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/DROP_TABLE)

(def *-drop-view
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/DROP_VIEW)

(def *-drop-function
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/DROP_FUNCTION)

(def *-drop-procedure
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/DROP_PROCEDURE)

(def *-merge
  "Static Constant.

  type: com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType"
  JobStatistics$QueryStatistics$StatementType/MERGE)

(defn *value-of-strict
  "Get the StatementType for the given String constant, and throw an exception if the constant
   is not recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType`"
  (^com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType [^java.lang.String constant]
    (JobStatistics$QueryStatistics$StatementType/valueOfStrict constant)))

(defn *value-of
  "Get the State for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType`"
  (^com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType [^java.lang.String constant]
    (JobStatistics$QueryStatistics$StatementType/valueOf constant)))

(defn *values
  "Return the known values for State.

  returns: `com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType[]`"
  ([]
    (JobStatistics$QueryStatistics$StatementType/values )))

