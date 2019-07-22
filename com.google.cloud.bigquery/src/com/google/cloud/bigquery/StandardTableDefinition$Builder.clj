(ns com.google.cloud.bigquery.StandardTableDefinition$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardTableDefinition$Builder]))

(defn ->builder
  "Constructor."
  (^StandardTableDefinition$Builder []
    (new StandardTableDefinition$Builder )))

(defn set-location
  "location - `java.lang.String`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn set-clustering
  "Set the clustering configuration for the table. If not set, the table is not clustered.
   Clustering is only available for partitioned tables.

  clustering - `com.google.cloud.bigquery.Clustering`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^com.google.cloud.bigquery.Clustering clustering]
    (-> this (.setClustering clustering))))

(defn set-type
  "type - `com.google.cloud.bigquery.TableDefinition$Type`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^com.google.cloud.bigquery.TableDefinition$Type type]
    (-> this (.setType type))))

(defn set-num-rows
  "num-rows - `java.lang.Long`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^java.lang.Long num-rows]
    (-> this (.setNumRows num-rows))))

(defn set-streaming-buffer
  "streaming-buffer - `com.google.cloud.bigquery.StandardTableDefinition$StreamingBuffer`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^com.google.cloud.bigquery.StandardTableDefinition$StreamingBuffer streaming-buffer]
    (-> this (.setStreamingBuffer streaming-buffer))))

(defn build
  "Creates a StandardTableDefinition object.

  returns: `com.google.cloud.bigquery.StandardTableDefinition`"
  (^com.google.cloud.bigquery.StandardTableDefinition [^StandardTableDefinition$Builder this]
    (-> this (.build))))

(defn set-num-bytes
  "num-bytes - `java.lang.Long`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^java.lang.Long num-bytes]
    (-> this (.setNumBytes num-bytes))))

(defn set-schema
  "Sets the table schema.

  schema - `com.google.cloud.bigquery.Schema`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^com.google.cloud.bigquery.Schema schema]
    (-> this (.setSchema schema))))

(defn set-time-partitioning
  "Sets the time partitioning configuration for the table. If not set, the table is not
   time-partitioned.

  time-partitioning - `com.google.cloud.bigquery.TimePartitioning`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^com.google.cloud.bigquery.TimePartitioning time-partitioning]
    (-> this (.setTimePartitioning time-partitioning))))

(defn set-num-long-term-bytes
  "num-long-term-bytes - `java.lang.Long`

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition$Builder this ^java.lang.Long num-long-term-bytes]
    (-> this (.setNumLongTermBytes num-long-term-bytes))))

