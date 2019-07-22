(ns com.google.cloud.bigquery.ModelTableDefinition$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ModelTableDefinition$Builder]))

(defn ->builder
  "Constructor."
  (^ModelTableDefinition$Builder []
    (new ModelTableDefinition$Builder )))

(defn set-num-bytes
  "num-bytes - `java.lang.Long`

  returns: `com.google.cloud.bigquery.ModelTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ModelTableDefinition$Builder [^ModelTableDefinition$Builder this ^java.lang.Long num-bytes]
    (-> this (.setNumBytes num-bytes))))

(defn set-location
  "location - `java.lang.String`

  returns: `com.google.cloud.bigquery.ModelTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ModelTableDefinition$Builder [^ModelTableDefinition$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn set-type
  "type - `com.google.cloud.bigquery.TableDefinition$Type`

  returns: `com.google.cloud.bigquery.ModelTableDefinition$Builder`"
  (^com.google.cloud.bigquery.ModelTableDefinition$Builder [^ModelTableDefinition$Builder this ^com.google.cloud.bigquery.TableDefinition$Type type]
    (-> this (.setType type))))

(defn build
  "Creates a ModelTableDefinition object.

  returns: `com.google.cloud.bigquery.ModelTableDefinition`"
  (^com.google.cloud.bigquery.ModelTableDefinition [^ModelTableDefinition$Builder this]
    (-> this (.build))))

