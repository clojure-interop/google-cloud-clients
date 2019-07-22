(ns com.google.cloud.bigquery.ExternalTableDefinition
  "Google BigQuery external table definition. BigQuery's external tables are tables whose data
  reside outside of BigQuery but can be queried as normal BigQuery tables. External tables are
  experimental and might be subject to change or removed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ExternalTableDefinition]))

(defn ->external-table-definition
  "Constructor."
  (^ExternalTableDefinition []
    (new ExternalTableDefinition )))

(defn *new-builder
  "Creates a builder for an ExternalTableDefinition object.

  source-uris - the fully-qualified URIs that point to your data in Google Cloud Storage. Each URI can contain one '*' wildcard character that must come after the bucket's name. Size limits related to load jobs apply to external data sources, plus an additional limit of 10 GB maximum size across all URIs. - `java.util.List`
  schema - the schema for the external data - `com.google.cloud.bigquery.Schema`
  format - the source format of the external data - `com.google.cloud.bigquery.FormatOptions`

  returns: a builder for an ExternalTableDefinition object given source URIs, schema and format - `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^java.util.List source-uris ^com.google.cloud.bigquery.Schema schema ^com.google.cloud.bigquery.FormatOptions format]
    (ExternalTableDefinition/newBuilder source-uris schema format)))

(defn *of
  "Creates an ExternalTableDefinition object.

  source-uris - the fully-qualified URIs that point to your data in Google Cloud Storage. Each URI can contain one '*' wildcard character that must come after the bucket's name. Size limits related to load jobs apply to external data sources, plus an additional limit of 10 GB maximum size across all URIs. - `java.util.List`
  schema - the schema for the external data - `com.google.cloud.bigquery.Schema`
  format - the source format of the external data - `com.google.cloud.bigquery.FormatOptions`

  returns: an ExternalTableDefinition object given source URIs, schema and format - `com.google.cloud.bigquery.ExternalTableDefinition`"
  (^com.google.cloud.bigquery.ExternalTableDefinition [^java.util.List source-uris ^com.google.cloud.bigquery.Schema schema ^com.google.cloud.bigquery.FormatOptions format]
    (ExternalTableDefinition/of source-uris schema format)))

(defn get-source-uris-immut
  "returns: `com.google.common.collect.ImmutableList<java.lang.String>`"
  (^com.google.common.collect.ImmutableList [^ExternalTableDefinition this]
    (-> this (.getSourceUrisImmut))))

(defn get-ignore-unknown-values?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ExternalTableDefinition this]
    (-> this (.getIgnoreUnknownValues))))

(defn get-compression
  "Returns the compression type of the data source.

  returns: `java.lang.String`"
  (^java.lang.String [^ExternalTableDefinition this]
    (-> this (.getCompression))))

(defn get-max-bad-records
  "Returns the maximum number of bad records that BigQuery can ignore when reading data. If the
   number of bad records exceeds this value, an invalid error is returned in the job result.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ExternalTableDefinition this]
    (-> this (.getMaxBadRecords))))

(defn ignore-unknown-values
  "Returns whether BigQuery should allow extra values that are not represented in the table
   schema. If true, the extra values are ignored. If false, records with extra columns are treated
   as bad records, and if there are too many bad records, an invalid error is returned in the job
   result. The default value is false. The value of getFormatOptions() determines what
   BigQuery treats as an extra value.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ExternalTableDefinition this]
    (-> this (.ignoreUnknownValues))))

(defn get-source-uris
  "Returns the fully-qualified URIs that point to your data in Google Cloud Storage. Each URI can
   contain one '*' wildcard character that must come after the bucket's name. Size limits related
   to load jobs apply to external data sources, plus an additional limit of 10 GB maximum size
   across all URIs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ExternalTableDefinition this]
    (-> this (.getSourceUris))))

(defn get-format-options
  "Returns the source format, and possibly some parsing options, of the external data. Supported
   formats are CSV and NEWLINE_DELIMITED_JSON.

  returns: `<F extends com.google.cloud.bigquery.FormatOptions> F`"
  ([^ExternalTableDefinition this]
    (-> this (.getFormatOptions))))

(defn get-autodetect?
  "[Experimental] Returns whether automatic detection of schema and format options should be
   performed.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ExternalTableDefinition this]
    (-> this (.getAutodetect))))

(defn to-builder
  "Returns a builder for the ExternalTableDefinition object.

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition this]
    (-> this (.toBuilder))))

