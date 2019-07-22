(ns com.google.cloud.bigquery.ExternalTableDefinition$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ExternalTableDefinition$Builder]))

(defn ->builder
  "Constructor."
  (^ExternalTableDefinition$Builder []
    (new ExternalTableDefinition$Builder )))

(defn set-type
  "type - `com.google.cloud.bigquery.TableDefinition$Type`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^com.google.cloud.bigquery.TableDefinition$Type type]
    (-> this (.setType type))))

(defn set-source-uris
  "Sets the fully-qualified URIs that point to your data in Google Cloud Storage (e.g.
   gs://bucket/path). Each URI can contain one '*' wildcard character that must come after the
   bucket's name. Size limits related to load jobs apply to external data sources, plus an
   additional limit of 10 GB maximum size across all URIs.

   For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully
   specified and valid HTTPS URL for a Google Cloud Bigtable table.

   For Google Cloud Datastore backup URIs: Exactly one URI can be specified. Also, the '*'
   wildcard character is not allowed.

  source-uris - `java.util.List`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^java.util.List source-uris]
    (-> this (.setSourceUris source-uris))))

(defn set-autodetect
  "[Experimental] Sets detection of schema and format options automatically. Any option
   specified explicitly will be honored.

  autodetect - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^java.lang.Boolean autodetect]
    (-> this (.setAutodetect autodetect))))

(defn set-ignore-unknown-values
  "Sets whether BigQuery should allow extra values that are not represented in the table schema.
   If true, the extra values are ignored. If false, records with extra columns are treated as
   bad records, and if there are too many bad records, an invalid error is returned in the job
   result. The default value is false. The value set with setFormatOptions(FormatOptions) property determines what BigQuery treats as an extra value.

  ignore-unknown-values - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^java.lang.Boolean ignore-unknown-values]
    (-> this (.setIgnoreUnknownValues ignore-unknown-values))))

(defn set-max-bad-records
  "Sets the maximum number of bad records that BigQuery can ignore when reading data. If the
   number of bad records exceeds this value, an invalid error is returned in the job result. The
   default value is 0, which requires that all records are valid.

  max-bad-records - `java.lang.Integer`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^java.lang.Integer max-bad-records]
    (-> this (.setMaxBadRecords max-bad-records))))

(defn build
  "Creates an ExternalTableDefinition object.

  returns: `com.google.cloud.bigquery.ExternalTableDefinition`"
  (^com.google.cloud.bigquery.ExternalTableDefinition [^ExternalTableDefinition$Builder this]
    (-> this (.build))))

(defn set-schema
  "Sets the table schema.

  schema - `com.google.cloud.bigquery.Schema`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^com.google.cloud.bigquery.Schema schema]
    (-> this (.setSchema schema))))

(defn set-compression
  "Sets compression type of the data source. By default no compression is assumed.

  compression - `java.lang.String`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^java.lang.String compression]
    (-> this (.setCompression compression))))

(defn set-format-options
  "Sets the source format, and possibly some parsing options, of the external data. Supported
   formats are CSV and NEWLINE_DELIMITED_JSON.


   Source Format

  format-options - `com.google.cloud.bigquery.FormatOptions`

  returns: `com.google.cloud.bigquery.ExternalTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ExternalTableDefinition$Builder [^ExternalTableDefinition$Builder this ^com.google.cloud.bigquery.FormatOptions format-options]
    (-> this (.setFormatOptions format-options))))

