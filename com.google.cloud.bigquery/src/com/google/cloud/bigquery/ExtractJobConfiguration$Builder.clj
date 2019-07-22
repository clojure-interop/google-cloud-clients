(ns com.google.cloud.bigquery.ExtractJobConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ExtractJobConfiguration$Builder]))

(defn set-source-table
  "Sets the table to export.

  source-table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^ExtractJobConfiguration$Builder this ^com.google.cloud.bigquery.TableId source-table]
    (-> this (.setSourceTable source-table))))

(defn set-destination-uris
  "Sets the list of fully-qualified Google Cloud Storage URIs (e.g. gs://bucket/path) where the
   extracted table should be written.

  destination-uris - `java.util.List`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^ExtractJobConfiguration$Builder this ^java.util.List destination-uris]
    (-> this (.setDestinationUris destination-uris))))

(defn set-print-header
  "Sets whether to print out a header row in the results. By default an header is printed.

  print-header - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^ExtractJobConfiguration$Builder this ^java.lang.Boolean print-header]
    (-> this (.setPrintHeader print-header))))

(defn set-field-delimiter
  "Sets the delimiter to use between fields in the exported data. By default \",\" is used.

  field-delimiter - `java.lang.String`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^ExtractJobConfiguration$Builder this ^java.lang.String field-delimiter]
    (-> this (.setFieldDelimiter field-delimiter))))

(defn set-format
  "Sets the exported file format. If not set table is exported in CSV format.


   Destination Format

  format - `java.lang.String`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^ExtractJobConfiguration$Builder this ^java.lang.String format]
    (-> this (.setFormat format))))

(defn set-compression
  "Sets the compression value to use for exported files. If not set exported files are not
   compressed.


   Compression

  compression - `java.lang.String`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^ExtractJobConfiguration$Builder this ^java.lang.String compression]
    (-> this (.setCompression compression))))

(defn build
  "Description copied from class: JobConfiguration.Builder

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration [^ExtractJobConfiguration$Builder this]
    (-> this (.build))))

