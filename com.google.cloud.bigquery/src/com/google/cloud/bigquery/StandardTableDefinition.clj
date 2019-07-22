(ns com.google.cloud.bigquery.StandardTableDefinition
  "A Google BigQuery default table definition. This definition is used for standard, two-dimensional
  tables with individual records organized in rows, and a data type assigned to each column (also
  called a field). Individual fields within a record may contain nested and repeated children
  fields. Every table is described by a schema that describes field names, types, and other
  information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardTableDefinition]))

(defn ->standard-table-definition
  "Constructor."
  (^StandardTableDefinition []
    (new StandardTableDefinition )))

(defn *new-builder
  "Returns a builder for a BigQuery standard table definition.

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder []
    (StandardTableDefinition/newBuilder )))

(defn *of
  "Creates a BigQuery standard table definition given its schema.

  schema - the schema of the table - `com.google.cloud.bigquery.Schema`

  returns: `com.google.cloud.bigquery.StandardTableDefinition`"
  (^com.google.cloud.bigquery.StandardTableDefinition [^com.google.cloud.bigquery.Schema schema]
    (StandardTableDefinition/of schema)))

(defn get-num-bytes
  "Returns the size of this table in bytes, excluding any data in the streaming buffer.

  returns: `java.lang.Long`"
  (^java.lang.Long [^StandardTableDefinition this]
    (-> this (.getNumBytes))))

(defn get-num-long-term-bytes
  "Returns the number of bytes considered \"long-term storage\" for reduced billing purposes.

  returns: `java.lang.Long`"
  (^java.lang.Long [^StandardTableDefinition this]
    (-> this (.getNumLongTermBytes))))

(defn get-num-rows
  "Returns the number of rows in this table, excluding any data in the streaming buffer.

  returns: `java.lang.Long`"
  (^java.lang.Long [^StandardTableDefinition this]
    (-> this (.getNumRows))))

(defn get-location
  "Returns the geographic location where the table should reside. This value is inherited from the
   dataset.

  returns: `java.lang.String`"
  (^java.lang.String [^StandardTableDefinition this]
    (-> this (.getLocation))))

(defn get-streaming-buffer
  "Returns information on the table's streaming buffer if any exists. Returns null if no
   streaming buffer exists.

  returns: `com.google.cloud.bigquery.StandardTableDefinition$StreamingBuffer`"
  (^com.google.cloud.bigquery.StandardTableDefinition$StreamingBuffer [^StandardTableDefinition this]
    (-> this (.getStreamingBuffer))))

(defn get-time-partitioning
  "Returns the time partitioning configuration for this table. If null, the table is not
   time-partitioned.

  returns: `com.google.cloud.bigquery.TimePartitioning`"
  (^com.google.cloud.bigquery.TimePartitioning [^StandardTableDefinition this]
    (-> this (.getTimePartitioning))))

(defn get-clustering
  "Returns the clustering configuration for this table. If null, the table is not
   clustered.

  returns: `com.google.cloud.bigquery.Clustering`"
  (^com.google.cloud.bigquery.Clustering [^StandardTableDefinition this]
    (-> this (.getClustering))))

(defn to-builder
  "Returns a builder for the StandardTableDefinition object.

  returns: `com.google.cloud.bigquery.StandardTableDefinition$Builder`"
  (^com.google.cloud.bigquery.StandardTableDefinition$Builder [^StandardTableDefinition this]
    (-> this (.toBuilder))))

