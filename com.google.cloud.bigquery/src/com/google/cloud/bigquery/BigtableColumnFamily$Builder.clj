(ns com.google.cloud.bigquery.BigtableColumnFamily$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigtableColumnFamily$Builder]))

(defn ->builder
  "Constructor."
  (^BigtableColumnFamily$Builder []
    (new BigtableColumnFamily$Builder )))

(defn set-family-id
  "Identifier of the column family.

  family-id - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigtableColumnFamily$Builder`"
  (^com.google.cloud.bigquery.BigtableColumnFamily$Builder [^BigtableColumnFamily$Builder this ^java.lang.String family-id]
    (-> this (.setFamilyID family-id))))

(defn set-columns
  "Lists of columns that should be exposed as individual fields as opposed to a list of (column
   name, value) pairs. All columns whose qualifier matches a qualifier in this list can be
   accessed as .. Other columns can be accessed as a list through .Column field.

  columns - `java.util.List`

  returns: `com.google.cloud.bigquery.BigtableColumnFamily$Builder`"
  (^com.google.cloud.bigquery.BigtableColumnFamily$Builder [^BigtableColumnFamily$Builder this ^java.util.List columns]
    (-> this (.setColumns columns))))

(defn set-encoding
  "The encoding of the values when the type is not STRING.

   Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings.
   BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions.

   This can be overridden for a specific column by listing that column in 'columns' and
   specifying an encoding for it.

  encoding - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigtableColumnFamily$Builder`"
  (^com.google.cloud.bigquery.BigtableColumnFamily$Builder [^BigtableColumnFamily$Builder this ^java.lang.String encoding]
    (-> this (.setEncoding encoding))))

(defn set-only-read-latest
  "If true, only the latest version of values are exposed for all columns in this column family.
   This can be overridden for a specific column by listing that column in 'columns' and
   specifying a different setting for that column.

  only-read-latest - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.BigtableColumnFamily$Builder`"
  (^com.google.cloud.bigquery.BigtableColumnFamily$Builder [^BigtableColumnFamily$Builder this ^java.lang.Boolean only-read-latest]
    (-> this (.setOnlyReadLatest only-read-latest))))

(defn set-type
  "The type to convert the value in cells of this column family. The values are expected to be
   encoded using HBase Bytes.toBytes function when using the BINARY encoding value.

   Following BigQuery types are allowed (case-sensitive): BYTES STRING INTEGER FLOAT BOOLEAN.

   The default type is BYTES. This can be overridden for a specific column by listing that
   column in 'columns' and specifying a type for it.

  type - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigtableColumnFamily$Builder`"
  (^com.google.cloud.bigquery.BigtableColumnFamily$Builder [^BigtableColumnFamily$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn build
  "returns: `com.google.cloud.bigquery.BigtableColumnFamily`"
  (^com.google.cloud.bigquery.BigtableColumnFamily [^BigtableColumnFamily$Builder this]
    (-> this (.build))))

