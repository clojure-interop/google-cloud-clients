(ns com.google.cloud.bigquery.JobConfiguration$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobConfiguration$Type]))

(def COPY
  "Enum Constant.

  A Copy Job copies an existing table to another new or existing table. Instances of JobConfiguration for this type are implemented by CopyJobConfiguration.

  type: com.google.cloud.bigquery.JobConfiguration$Type"
  JobConfiguration$Type/COPY)

(def EXTRACT
  "Enum Constant.

  An Extract Job exports a BigQuery table to Google Cloud Storage. Instances of JobConfiguration for this type are implemented by ExtractJobConfiguration.

  type: com.google.cloud.bigquery.JobConfiguration$Type"
  JobConfiguration$Type/EXTRACT)

(def LOAD
  "Enum Constant.

  A Load Job loads data from one of several formats into a table. Instances of JobConfiguration for this type are implemented by LoadJobConfiguration.

  type: com.google.cloud.bigquery.JobConfiguration$Type"
  JobConfiguration$Type/LOAD)

(def QUERY
  "Enum Constant.

  A Query Job runs a query against BigQuery data. Instances of JobConfiguration for
   this type are implemented by QueryJobConfiguration.

  type: com.google.cloud.bigquery.JobConfiguration$Type"
  JobConfiguration$Type/QUERY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JobConfiguration.Type c : JobConfiguration.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.JobConfiguration$Type[]`"
  ([]
    (JobConfiguration$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.JobConfiguration$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.JobConfiguration$Type [^java.lang.String name]
    (JobConfiguration$Type/valueOf name)))

