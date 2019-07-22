(ns com.google.cloud.bigquery.CsvOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery CsvOptions$Builder]))

(defn set-allow-jagged-rows
  "Set whether BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records
   with missing trailing columns are treated as bad records, and if there are too many bad
   records, an invalid error is returned in the job result. By default, rows with missing
   trailing columns are considered bad records.

  allow-jagged-rows - `boolean`

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder [^CsvOptions$Builder this ^Boolean allow-jagged-rows]
    (-> this (.setAllowJaggedRows allow-jagged-rows))))

(defn set-allow-quoted-new-lines
  "Sets whether BigQuery should allow quoted data sections that contain newline characters in a
   CSV file. By default quoted newline are not allowed.

  allow-quoted-new-lines - `boolean`

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder [^CsvOptions$Builder this ^Boolean allow-quoted-new-lines]
    (-> this (.setAllowQuotedNewLines allow-quoted-new-lines))))

(defn set-encoding
  "Sets the character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The
   default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split
   using the values set in setQuote(String) and setFieldDelimiter(String).

  encoding - `java.lang.String`

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder [^CsvOptions$Builder this ^java.lang.String encoding]
    (-> this (.setEncoding encoding))))

(defn set-field-delimiter
  "Sets the separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1
   encoding, and then uses the first byte of the encoded string to split the data in its raw,
   binary state. BigQuery also supports the escape sequence \"\\t\" to specify a tab separator. The
   default value is a comma (',').

  field-delimiter - `java.lang.String`

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder [^CsvOptions$Builder this ^java.lang.String field-delimiter]
    (-> this (.setFieldDelimiter field-delimiter))))

(defn set-quote
  "Sets the value that is used to quote data sections in a CSV file. BigQuery converts the
   string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split
   the data in its raw, binary state. The default value is a double-quote ('\"'). If your data
   does not contain quoted sections, set the property value to an empty string. If your data
   contains quoted newline characters, you must also set setAllowQuotedNewLines(boolean) property to true.

  quote - `java.lang.String`

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder [^CsvOptions$Builder this ^java.lang.String quote]
    (-> this (.setQuote quote))))

(defn set-skip-leading-rows
  "Sets the number of rows at the top of a CSV file that BigQuery will skip when reading the
   data. The default value is 0. This property is useful if you have header rows in the file
   that should be skipped.

  skip-leading-rows - `long`

  returns: `com.google.cloud.bigquery.CsvOptions$Builder`"
  (^com.google.cloud.bigquery.CsvOptions$Builder [^CsvOptions$Builder this ^Long skip-leading-rows]
    (-> this (.setSkipLeadingRows skip-leading-rows))))

(defn build
  "Creates a CsvOptions object.

  returns: `com.google.cloud.bigquery.CsvOptions`"
  (^com.google.cloud.bigquery.CsvOptions [^CsvOptions$Builder this]
    (-> this (.build))))

