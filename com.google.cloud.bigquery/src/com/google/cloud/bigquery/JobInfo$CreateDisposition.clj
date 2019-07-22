(ns com.google.cloud.bigquery.JobInfo$CreateDisposition
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobInfo$CreateDisposition]))

(def CREATE_IF_NEEDED
  "Enum Constant.

  Configures the job to create the table if it does not exist.

  type: com.google.cloud.bigquery.JobInfo$CreateDisposition"
  JobInfo$CreateDisposition/CREATE_IF_NEEDED)

(def CREATE_NEVER
  "Enum Constant.

  Configures the job to fail with a not-found error if the table does not exist.

  type: com.google.cloud.bigquery.JobInfo$CreateDisposition"
  JobInfo$CreateDisposition/CREATE_NEVER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JobInfo.CreateDisposition c : JobInfo.CreateDisposition.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.JobInfo$CreateDisposition[]`"
  ([]
    (JobInfo$CreateDisposition/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.JobInfo$CreateDisposition`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.JobInfo$CreateDisposition [^java.lang.String name]
    (JobInfo$CreateDisposition/valueOf name)))

