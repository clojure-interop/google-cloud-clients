(ns com.google.cloud.compute.v1.UsageExportLocation$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UsageExportLocation$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UsageExportLocation`

  returns: `com.google.cloud.compute.v1.UsageExportLocation$Builder`"
  (^com.google.cloud.compute.v1.UsageExportLocation$Builder [^UsageExportLocation$Builder this ^com.google.cloud.compute.v1.UsageExportLocation other]
    (-> this (.mergeFrom other))))

(defn get-bucket-name
  "The name of an existing bucket in Cloud Storage where the usage report object is stored. The
   Google Service Account is granted write access to this bucket. This can either be the bucket
   name by itself, such as example-bucket, or the bucket name with gs:// or
   https://storage.googleapis.com/ in front of it, such as gs://example-bucket.

  returns: `java.lang.String`"
  (^java.lang.String [^UsageExportLocation$Builder this]
    (-> this (.getBucketName))))

(defn set-bucket-name
  "The name of an existing bucket in Cloud Storage where the usage report object is stored. The
   Google Service Account is granted write access to this bucket. This can either be the bucket
   name by itself, such as example-bucket, or the bucket name with gs:// or
   https://storage.googleapis.com/ in front of it, such as gs://example-bucket.

  bucket-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsageExportLocation$Builder`"
  (^com.google.cloud.compute.v1.UsageExportLocation$Builder [^UsageExportLocation$Builder this ^java.lang.String bucket-name]
    (-> this (.setBucketName bucket-name))))

(defn get-report-name-prefix
  "An optional prefix for the name of the usage report object stored in bucketName. If not
   supplied, defaults to usage. The report is stored as a CSV file named
   report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to
   Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming
   conventions.

  returns: `java.lang.String`"
  (^java.lang.String [^UsageExportLocation$Builder this]
    (-> this (.getReportNamePrefix))))

(defn set-report-name-prefix
  "An optional prefix for the name of the usage report object stored in bucketName. If not
   supplied, defaults to usage. The report is stored as a CSV file named
   report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to
   Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming
   conventions.

  report-name-prefix - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsageExportLocation$Builder`"
  (^com.google.cloud.compute.v1.UsageExportLocation$Builder [^UsageExportLocation$Builder this ^java.lang.String report-name-prefix]
    (-> this (.setReportNamePrefix report-name-prefix))))

(defn build
  "returns: `com.google.cloud.compute.v1.UsageExportLocation`"
  (^com.google.cloud.compute.v1.UsageExportLocation [^UsageExportLocation$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UsageExportLocation$Builder`"
  (^com.google.cloud.compute.v1.UsageExportLocation$Builder [^UsageExportLocation$Builder this]
    (-> this (.clone))))

