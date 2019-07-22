(ns com.google.cloud.bigquery.BigQueryOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQueryOptions$Builder]))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.bigquery.BigQueryOptions$Builder`"
  (^com.google.cloud.bigquery.BigQueryOptions$Builder [^BigQueryOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn set-location
  "location - `java.lang.String`

  returns: `com.google.cloud.bigquery.BigQueryOptions$Builder`"
  (^com.google.cloud.bigquery.BigQueryOptions$Builder [^BigQueryOptions$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn build
  "returns: `com.google.cloud.bigquery.BigQueryOptions`"
  (^com.google.cloud.bigquery.BigQueryOptions [^BigQueryOptions$Builder this]
    (-> this (.build))))

