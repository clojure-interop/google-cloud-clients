(ns com.google.cloud.bigquery.CsvOptions
  "Google BigQuery options for CSV format. This class wraps some properties of CSV files used by
  BigQuery to parse external data."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery CsvOptions]))

(defn *new-builder
  "Returns a builder for a CsvOptions object.

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder []
    (CsvOptions/newBuilder )))

(defn get-encoding
  "Returns the character encoding of the data. The supported values are UTF-8 or ISO-8859-1. If
   not set, UTF-8 is used. BigQuery decodes the data after the raw, binary data has been split
   using the values set in getQuote() and getFieldDelimiter().

  returns: `java.lang.String`"
  (^java.lang.String [^CsvOptions this]
    (-> this (.getEncoding))))

(defn get-quote
  "Returns the value that is used to quote data sections in a CSV file.

  returns: `java.lang.String`"
  (^java.lang.String [^CsvOptions this]
    (-> this (.getQuote))))

(defn allow-jagged-rows
  "Returns whether BigQuery should accept rows that are missing trailing optional columns. If
   true, BigQuery treats missing trailing columns as null values. If false,
   records with missing trailing columns are treated as bad records, and if the number of bad
   records exceeds ExternalTableDefinition.getMaxBadRecords(), an invalid error is
   returned in the job result.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CsvOptions this]
    (-> this (.allowJaggedRows))))

(defn get-skip-leading-rows
  "Returns the number of rows at the top of a CSV file that BigQuery will skip when reading the
   data.

  returns: `java.lang.Long`"
  (^java.lang.Long [^CsvOptions this]
    (-> this (.getSkipLeadingRows))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CsvOptions this]
    (-> this (.toString))))

(defn allow-quoted-new-lines
  "Returns whether BigQuery should allow quoted data sections that contain newline characters in a
   CSV file.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CsvOptions this]
    (-> this (.allowQuotedNewLines))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CsvOptions this]
    (-> this (.hashCode))))

(defn get-field-delimiter
  "Returns the separator for fields in a CSV file.

  returns: `java.lang.String`"
  (^java.lang.String [^CsvOptions this]
    (-> this (.getFieldDelimiter))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CsvOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the CsvOptions object.

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder [^CsvOptions this]
    (-> this (.toBuilder))))

