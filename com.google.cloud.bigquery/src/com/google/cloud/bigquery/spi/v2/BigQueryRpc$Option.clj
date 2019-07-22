(ns com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.spi.v2 BigQueryRpc$Option]))

(def FIELDS
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/FIELDS)

(def DELETE_CONTENTS
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/DELETE_CONTENTS)

(def ALL_DATASETS
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/ALL_DATASETS)

(def ALL_USERS
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/ALL_USERS)

(def LABEL_FILTER
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/LABEL_FILTER)

(def MIN_CREATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/MIN_CREATION_TIME)

(def MAX_CREATION_TIME
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/MAX_CREATION_TIME)

(def MAX_RESULTS
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/MAX_RESULTS)

(def PAGE_TOKEN
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/PAGE_TOKEN)

(def START_INDEX
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/START_INDEX)

(def STATE_FILTER
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/STATE_FILTER)

(def TIMEOUT
  "Enum Constant.

  type: com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option"
  BigQueryRpc$Option/TIMEOUT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BigQueryRpc.Option c : BigQueryRpc.Option.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option[]`"
  ([]
    (BigQueryRpc$Option/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option [^java.lang.String name]
    (BigQueryRpc$Option/valueOf name)))

(defn value
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQueryRpc$Option this]
    (-> this (.value))))

