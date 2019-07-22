(ns com.google.cloud.bigquery.BigtableColumn
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigtableColumn]))

(defn ->bigtable-column
  "Constructor."
  (^BigtableColumn []
    (new BigtableColumn )))

(defn get-qualifier-encoded
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableColumn this]
    (-> this (.getQualifierEncoded))))

(defn get-field-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableColumn this]
    (-> this (.getFieldName))))

(defn get-only-read-latest?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BigtableColumn this]
    (-> this (.getOnlyReadLatest))))

(defn get-encoding
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableColumn this]
    (-> this (.getEncoding))))

(defn get-type
  "returns: `java.lang.String`"
  (^java.lang.String [^BigtableColumn this]
    (-> this (.getType))))

