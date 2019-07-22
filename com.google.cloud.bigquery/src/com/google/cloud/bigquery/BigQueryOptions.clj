(ns com.google.cloud.bigquery.BigQueryOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQueryOptions]))

(defn *get-default-http-transport-options
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions []
    (BigQueryOptions/getDefaultHttpTransportOptions )))

(defn *get-default-instance
  "returns: `com.google.cloud.bigquery.BigQueryOptions`"
  (^com.google.cloud.bigquery.BigQueryOptions []
    (BigQueryOptions/getDefaultInstance )))

(defn *new-builder
  "returns: `com.google.cloud.bigquery.BigQueryOptions$Builder`"
  (^com.google.cloud.bigquery.BigQueryOptions$Builder []
    (BigQueryOptions/newBuilder )))

(defn get-location
  "returns: `java.lang.String`"
  (^java.lang.String [^BigQueryOptions this]
    (-> this (.getLocation))))

(defn set-throw-not-found
  "set-throw-not-found - `boolean`"
  ([^BigQueryOptions this ^Boolean set-throw-not-found]
    (-> this (.setThrowNotFound set-throw-not-found))))

(defn get-throw-not-found?
  "returns: `boolean`"
  (^Boolean [^BigQueryOptions this]
    (-> this (.getThrowNotFound))))

(defn to-builder
  "returns: `com.google.cloud.bigquery.BigQueryOptions$Builder`"
  (^com.google.cloud.bigquery.BigQueryOptions$Builder [^BigQueryOptions this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigQueryOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigQueryOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

