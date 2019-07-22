(ns com.google.cloud.bigquery.BigQuery$TableField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery$TableField]))

(def CREATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/CREATION_TIME)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/DESCRIPTION)

(def ETAG
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/ETAG)

(def EXPIRATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/EXPIRATION_TIME)

(def EXTERNAL_DATA_CONFIGURATION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/EXTERNAL_DATA_CONFIGURATION)

(def FRIENDLY_NAME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/FRIENDLY_NAME)

(def ID
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/ID)

(def LABELS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/LABELS)

(def LAST_MODIFIED_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/LAST_MODIFIED_TIME)

(def LOCATION
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/LOCATION)

(def NUM_BYTES
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/NUM_BYTES)

(def NUM_ROWS
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/NUM_ROWS)

(def SCHEMA
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/SCHEMA)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/SELF_LINK)

(def STREAMING_BUFFER
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/STREAMING_BUFFER)

(def TABLE_REFERENCE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/TABLE_REFERENCE)

(def TIME_PARTITIONING
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/TIME_PARTITIONING)

(def TYPE
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/TYPE)

(def VIEW
  "Enum Constant.

  type: com.google.cloud.bigquery.BigQuery$TableField"
  BigQuery$TableField/VIEW)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BigQuery.TableField c : BigQuery.TableField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.BigQuery$TableField[]`"
  ([]
    (BigQuery$TableField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.BigQuery$TableField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.BigQuery$TableField [^java.lang.String name]
    (BigQuery$TableField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^BigQuery$TableField this]
    (-> this (.getSelector))))

