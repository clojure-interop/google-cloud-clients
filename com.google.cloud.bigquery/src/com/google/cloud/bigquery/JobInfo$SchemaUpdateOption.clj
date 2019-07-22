(ns com.google.cloud.bigquery.JobInfo$SchemaUpdateOption
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobInfo$SchemaUpdateOption]))

(def ALLOW_FIELD_ADDITION
  "Enum Constant.

  Allow adding a nullable field to the schema.

  type: com.google.cloud.bigquery.JobInfo$SchemaUpdateOption"
  JobInfo$SchemaUpdateOption/ALLOW_FIELD_ADDITION)

(def ALLOW_FIELD_RELAXATION
  "Enum Constant.

  Allow relaxing a required field in the original schema to nullable.

  type: com.google.cloud.bigquery.JobInfo$SchemaUpdateOption"
  JobInfo$SchemaUpdateOption/ALLOW_FIELD_RELAXATION)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JobInfo.SchemaUpdateOption c : JobInfo.SchemaUpdateOption.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.JobInfo$SchemaUpdateOption[]`"
  ([]
    (JobInfo$SchemaUpdateOption/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.JobInfo$SchemaUpdateOption`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.JobInfo$SchemaUpdateOption [^java.lang.String name]
    (JobInfo$SchemaUpdateOption/valueOf name)))

