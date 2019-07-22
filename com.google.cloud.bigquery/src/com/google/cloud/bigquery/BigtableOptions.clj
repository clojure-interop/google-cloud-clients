(ns com.google.cloud.bigquery.BigtableOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigtableOptions]))

(defn *new-builder
  "returns: `com.google.cloud.bigquery.BigtableOptions.Builder`"
  (^com.google.cloud.bigquery.BigtableOptions.Builder []
    (BigtableOptions/newBuilder )))

(defn get-ignore-unspecified-column-families?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BigtableOptions this]
    (-> this (.getIgnoreUnspecifiedColumnFamilies))))

(defn get-read-rowkey-as-string?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BigtableOptions this]
    (-> this (.getReadRowkeyAsString))))

(defn get-column-families
  "returns: `java.util.List<com.google.cloud.bigquery.BigtableColumnFamily>`"
  (^java.util.List [^BigtableOptions this]
    (-> this (.getColumnFamilies))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableOptions this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigtableOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigtableOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

