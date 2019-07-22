(ns com.google.cloud.bigquery.TimePartitioning$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TimePartitioning$Builder]))

(defn ->builder
  "Constructor."
  (^TimePartitioning$Builder []
    (new TimePartitioning$Builder )))

(defn set-expiration-ms
  "expiration-ms - `java.lang.Long`

  returns: `com.google.cloud.bigquery.TimePartitioning$Builder`"
  (^com.google.cloud.bigquery.TimePartitioning$Builder [^TimePartitioning$Builder this ^java.lang.Long expiration-ms]
    (-> this (.setExpirationMs expiration-ms))))

(defn set-require-partition-filter
  "require-partition-filter - `java.lang.Boolean`

  returns: `com.google.cloud.bigquery.TimePartitioning$Builder`"
  (^com.google.cloud.bigquery.TimePartitioning$Builder [^TimePartitioning$Builder this ^java.lang.Boolean require-partition-filter]
    (-> this (.setRequirePartitionFilter require-partition-filter))))

(defn set-field
  "field - `java.lang.String`

  returns: `com.google.cloud.bigquery.TimePartitioning$Builder`"
  (^com.google.cloud.bigquery.TimePartitioning$Builder [^TimePartitioning$Builder this ^java.lang.String field]
    (-> this (.setField field))))

(defn build
  "returns: `com.google.cloud.bigquery.TimePartitioning`"
  (^com.google.cloud.bigquery.TimePartitioning [^TimePartitioning$Builder this]
    (-> this (.build))))

