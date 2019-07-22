(ns com.google.cloud.bigquery.JobStatus$State
  "Possible states that a BigQuery Job can assume."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobStatus$State]))

(def *-pending
  "Static Constant.

  The BigQuery Job is waiting to be executed.

  type: com.google.cloud.bigquery.JobStatus$State"
  JobStatus$State/PENDING)

(def *-running
  "Static Constant.

  The BigQuery Job is being executed.

  type: com.google.cloud.bigquery.JobStatus$State"
  JobStatus$State/RUNNING)

(def *-done
  "Static Constant.

  The BigQuery Job has completed either succeeding or failing. If failed JobStatus.getError()
   will be non-null.

  type: com.google.cloud.bigquery.JobStatus$State"
  JobStatus$State/DONE)

(defn *value-of-strict
  "Get the State for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobStatus$State`"
  (^com.google.cloud.bigquery.JobStatus$State [^java.lang.String constant]
    (JobStatus$State/valueOfStrict constant)))

(defn *value-of
  "Get the State for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.JobStatus$State`"
  (^com.google.cloud.bigquery.JobStatus$State [^java.lang.String constant]
    (JobStatus$State/valueOf constant)))

(defn *values
  "Return the known values for State.

  returns: `com.google.cloud.bigquery.JobStatus$State[]`"
  ([]
    (JobStatus$State/values )))

