(ns com.google.cloud.bigquery.ExtractJobConfiguration
  "Google BigQuery extract job configuration. An extract job exports a BigQuery table to Google
  Cloud Storage. The extract destination provided as URIs that point to objects in Google Cloud
  Storage. Extract job configurations have JobConfiguration.Type.EXTRACT type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ExtractJobConfiguration]))

(defn *new-builder
  "Creates a builder for a BigQuery Extract Job configuration given source table and destination
   URI.

  source-table - `com.google.cloud.bigquery.TableId`
  destination-uri - `java.lang.String`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^com.google.cloud.bigquery.TableId source-table ^java.lang.String destination-uri]
    (ExtractJobConfiguration/newBuilder source-table destination-uri)))

(defn *of
  "Returns a BigQuery Extract Job configuration for the given source table, format and destination
   URI.

  source-table - `com.google.cloud.bigquery.TableId`
  destination-uri - `java.lang.String`
  format - `java.lang.String`

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration [^com.google.cloud.bigquery.TableId source-table ^java.lang.String destination-uri ^java.lang.String format]
    (ExtractJobConfiguration/of source-table destination-uri format))
  (^com.google.cloud.bigquery.ExtractJobConfiguration [^com.google.cloud.bigquery.TableId source-table ^java.lang.String destination-uri]
    (ExtractJobConfiguration/of source-table destination-uri)))

(defn get-source-table
  "Returns the table to export.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^ExtractJobConfiguration this]
    (-> this (.getSourceTable))))

(defn print-header
  "Returns whether an header row is printed with the result.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ExtractJobConfiguration this]
    (-> this (.printHeader))))

(defn get-compression
  "Returns the compression value of exported files.

  returns: `java.lang.String`"
  (^java.lang.String [^ExtractJobConfiguration this]
    (-> this (.getCompression))))

(defn get-format
  "Returns the exported files format.

  returns: `java.lang.String`"
  (^java.lang.String [^ExtractJobConfiguration this]
    (-> this (.getFormat))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ExtractJobConfiguration this]
    (-> this (.hashCode))))

(defn get-field-delimiter
  "Returns the delimiter used between fields in the exported data.

  returns: `java.lang.String`"
  (^java.lang.String [^ExtractJobConfiguration this]
    (-> this (.getFieldDelimiter))))

(defn get-destination-uris
  "Returns the list of fully-qualified Google Cloud Storage URIs where the extracted table should
   be written.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ExtractJobConfiguration this]
    (-> this (.getDestinationUris))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ExtractJobConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Description copied from class: JobConfiguration

  returns: `com.google.cloud.bigquery.ExtractJobConfiguration$Builder`"
  (^com.google.cloud.bigquery.ExtractJobConfiguration$Builder [^ExtractJobConfiguration this]
    (-> this (.toBuilder))))

