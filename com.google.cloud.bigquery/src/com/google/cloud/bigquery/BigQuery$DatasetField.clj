(ns com.google.cloud.bigquery.BigQuery$DatasetField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$DatasetField]))

(def ACCESS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/ACCESS)

(def CREATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/CREATION_TIME)

(def DATASET_REFERENCE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/DATASET_REFERENCE)

(def DEFAULT_TABLE_EXPIRATION_MS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/DEFAULT_TABLE_EXPIRATION_MS)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/DESCRIPTION)

(def ETAG
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/ETAG)

(def FRIENDLY_NAME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/FRIENDLY_NAME)

(def ID
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/ID)

(def LABELS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/LABELS)

(def LAST_MODIFIED_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/LAST_MODIFIED_TIME)

(def LOCATION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/LOCATION)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$DatasetField"
  BigQuery$DatasetField/SELF_LINK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BigQuery.DatasetField c : BigQuery.DatasetField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.BigQuery$DatasetField[]`"
  ([]
    (BigQuery$DatasetField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.BigQuery$DatasetField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.BigQuery$DatasetField [^java.lang.String name]
    (BigQuery$DatasetField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$DatasetField this]
    (-> this (.getSelector))))

