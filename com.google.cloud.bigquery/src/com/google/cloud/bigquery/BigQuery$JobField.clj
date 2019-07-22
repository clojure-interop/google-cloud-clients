(ns com.google.cloud.bigquery.BigQuery$JobField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$JobField]))

(def CONFIGURATION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/CONFIGURATION)

(def ETAG
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/ETAG)

(def ID
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/ID)

(def JOB_REFERENCE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/JOB_REFERENCE)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/SELF_LINK)

(def STATISTICS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/STATISTICS)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/STATUS)

(def USER_EMAIL
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$JobField"
  BigQuery$JobField/USER_EMAIL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BigQuery.JobField c : BigQuery.JobField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.BigQuery$JobField[]`"
  ([]
    (BigQuery$JobField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.BigQuery$JobField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.BigQuery$JobField [^java.lang.String name]
    (BigQuery$JobField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$JobField this]
    (-> this (.getSelector))))

