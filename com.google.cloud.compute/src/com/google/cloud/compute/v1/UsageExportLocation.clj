(ns com.google.cloud.compute.v1.UsageExportLocation
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UsageExportLocation]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UsageExportLocation`

  returns: `com.google.cloud.compute.v1.UsageExportLocation$Builder`"
  (^com.google.cloud.compute.v1.UsageExportLocation$Builder [^com.google.cloud.compute.v1.UsageExportLocation prototype]
    (UsageExportLocation/newBuilder prototype))
  (^com.google.cloud.compute.v1.UsageExportLocation$Builder []
    (UsageExportLocation/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UsageExportLocation`"
  (^com.google.cloud.compute.v1.UsageExportLocation []
    (UsageExportLocation/getDefaultInstance )))

(defn get-bucket-name
  "The name of an existing bucket in Cloud Storage where the usage report object is stored. The
   Google Service Account is granted write access to this bucket. This can either be the bucket
   name by itself, such as example-bucket, or the bucket name with gs:// or
   https://storage.googleapis.com/ in front of it, such as gs://example-bucket.

  returns: `java.lang.String`"
  (^java.lang.String [^UsageExportLocation this]
    (-> this (.getBucketName))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UsageExportLocation this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UsageExportLocation this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UsageExportLocation this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UsageExportLocation this]
    (-> this (.getApiMessageRequestBody))))

(defn get-report-name-prefix
  "An optional prefix for the name of the usage report object stored in bucketName. If not
   supplied, defaults to usage. The report is stored as a CSV file named
   report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific
   Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.

  returns: `java.lang.String`"
  (^java.lang.String [^UsageExportLocation this]
    (-> this (.getReportNamePrefix))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UsageExportLocation this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UsageExportLocation this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UsageExportLocation$Builder`"
  (^com.google.cloud.compute.v1.UsageExportLocation$Builder [^UsageExportLocation this]
    (-> this (.toBuilder))))

