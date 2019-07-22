(ns com.google.cloud.bigquery.FormatOptions
  "Base class for Google BigQuery format options. These class define the format of external data
  used by BigQuery, for either federated tables or load jobs.

  Load jobs support the following formats: AVRO, CSV, DATASTORE_BACKUP, GOOGLE_SHEETS, JSON,
  ORC, PARQUET

  Federated tables can be defined against following formats: AVRO, BIGTABLE, CSV,
  DATASTORE_BACKUP, GOOGLE_SHEETS, JSON"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery FormatOptions]))

(defn *json
  "Default options for NEWLINE_DELIMITED_JSON format.

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions []
    (FormatOptions/json )))

(defn *orc
  "Default options for the ORC format.

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions []
    (FormatOptions/orc )))

(defn *of
  "Default options for the provided format.

  format - `java.lang.String`

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions [^java.lang.String format]
    (FormatOptions/of format)))

(defn *avro
  "Default options for AVRO format.

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions []
    (FormatOptions/avro )))

(defn *parquet
  "Default options for PARQUET format.

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions []
    (FormatOptions/parquet )))

(defn *google-sheets
  "Default options for GOOGLE_SHEETS format.

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions []
    (FormatOptions/googleSheets )))

(defn *csv
  "Default options for CSV format.

  returns: `com.google.cloud.bigquery.CsvOptions`"
  (^com.google.cloud.bigquery.CsvOptions []
    (FormatOptions/csv )))

(defn *bigtable
  "Default options for BIGTABLE format.

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions []
    (FormatOptions/bigtable )))

(defn *datastore-backup
  "Default options for DATASTORE_BACKUP format.

  returns: `com.google.cloud.bigquery.FormatOptions`"
  (^com.google.cloud.bigquery.FormatOptions []
    (FormatOptions/datastoreBackup )))

(defn get-type
  "Returns the external data format, as a string.

  returns: `java.lang.String`"
  (^java.lang.String [^FormatOptions this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FormatOptions this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FormatOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FormatOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

