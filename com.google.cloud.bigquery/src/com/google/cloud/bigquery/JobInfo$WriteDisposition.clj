(ns com.google.cloud.bigquery.JobInfo$WriteDisposition
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobInfo$WriteDisposition]))

(def WRITE_TRUNCATE
  "Enum Constant.

  Configures the job to overwrite the table data if table already exists.

  type: com.google.cloud.bigquery.JobInfo$WriteDisposition"
  JobInfo$WriteDisposition/WRITE_TRUNCATE)

(def WRITE_APPEND
  "Enum Constant.

  Configures the job to append data to the table if it already exists.

  type: com.google.cloud.bigquery.JobInfo$WriteDisposition"
  JobInfo$WriteDisposition/WRITE_APPEND)

(def WRITE_EMPTY
  "Enum Constant.

  Configures the job to fail with a duplicate error if the table already exists.

  type: com.google.cloud.bigquery.JobInfo$WriteDisposition"
  JobInfo$WriteDisposition/WRITE_EMPTY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JobInfo.WriteDisposition c : JobInfo.WriteDisposition.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.JobInfo$WriteDisposition[]`"
  ([]
    (JobInfo$WriteDisposition/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.JobInfo$WriteDisposition`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.JobInfo$WriteDisposition [^java.lang.String name]
    (JobInfo$WriteDisposition/valueOf name)))

