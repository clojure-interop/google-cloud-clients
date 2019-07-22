(ns com.google.cloud.bigquery.BigtableColumn$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigtableColumn$Builder]))

(defn ->builder
  "Constructor."
  (^BigtableColumn$Builder []
    (new BigtableColumn$Builder )))

(defn set-qualifier-encoded
  "Qualifier of the column.

   Columns in the parent column family that has this exact qualifier are exposed as . field.
   If the qualifier is valid UTF-8 string, it can be specified in the qualifier_string field.
   Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is
   the same as the column qualifier. However, if the qualifier is not a valid BigQuery field
   identifier, a valid identifier must be provided as field_name.

  qualifier-encoded - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigtableColumn$Builder`"
  (^com.google.cloud.bigquery.BigtableColumn$Builder [^BigtableColumn$Builder this ^java.lang.String qualifier-encoded]
    (-> this (.setQualifierEncoded qualifier-encoded))))

(defn set-field-name
  "If the qualifier is not a valid BigQuery field identifier, a valid identifier must be
   provided as the column field name and is used as field name in queries.

  field-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigtableColumn$Builder`"
  (^com.google.cloud.bigquery.BigtableColumn$Builder [^BigtableColumn$Builder this ^java.lang.String field-name]
    (-> this (.setFieldName field-name))))

(defn set-only-read-latest
  "If this is set, only the latest version of value in this column are exposed.

   'onlyReadLatest' can also be set at the column family level. However, the setting at the
   column level takes precedence if 'onlyReadLatest' is set at both levels.

  only-read-latest - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.BigtableColumn$Builder`"
  (^com.google.cloud.bigquery.BigtableColumn$Builder [^BigtableColumn$Builder this ^java.lang.Boolean only-read-latest]
    (-> this (.setOnlyReadLatest only-read-latest))))

(defn set-encoding
  "The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT
   - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using
   HBase Bytes.toBytes family of functions.

   Encoding can also be set at the column family level. However, the setting at the column
   level takes precedence if 'encoding' is set at both levels.

  encoding - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigtableColumn$Builder`"
  (^com.google.cloud.bigquery.BigtableColumn$Builder [^BigtableColumn$Builder this ^java.lang.String encoding]
    (-> this (.setEncoding encoding))))

(defn set-type
  "The type to convert the value in cells of this column.

   The values are expected to be encoded using HBase Bytes.toBytes function when using the
   BINARY encoding value. Following BigQuery types are allowed (case-sensitive): BYTES STRING
   INTEGER FLOAT BOOLEAN Default type is BYTES.

   'type' can also be set at the column family level. However, the setting at the column
   level takes precedence if 'type' is set at both levels.

  type - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigtableColumn$Builder`"
  (^com.google.cloud.bigquery.BigtableColumn$Builder [^BigtableColumn$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn build
  "returns: `com.google.cloud.bigquery.BigtableColumn`"
  (^com.google.cloud.bigquery.BigtableColumn [^BigtableColumn$Builder this]
    (-> this (.build))))

