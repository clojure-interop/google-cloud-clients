(ns com.google.cloud.bigquery.BigQuery$ModelField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$ModelField]))

(def CREATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/CREATION_TIME)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/DESCRIPTION)

(def ETAG
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/ETAG)

(def EXPIRATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/EXPIRATION_TIME)

(def FRIENDLY_NAME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/FRIENDLY_NAME)

(def LABELS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/LABELS)

(def LAST_MODIFIED_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/LAST_MODIFIED_TIME)

(def LOCATION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/LOCATION)

(def MODEL_REFERENCE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/MODEL_REFERENCE)

(def TRAINING_RUNS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/TRAINING_RUNS)

(def LABEL_COLUMNS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/LABEL_COLUMNS)

(def FEATURE_COLUMNS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/FEATURE_COLUMNS)

(def TYPE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$ModelField"
  BigQuery$ModelField/TYPE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BigQuery.ModelField c : BigQuery.ModelField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.BigQuery$ModelField[]`"
  ([]
    (BigQuery$ModelField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.BigQuery$ModelField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.BigQuery$ModelField [^java.lang.String name]
    (BigQuery$ModelField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$ModelField this]
    (-> this (.getSelector))))

