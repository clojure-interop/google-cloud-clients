(ns com.google.cloud.bigquery.StandardTableDefinition$StreamingBuffer
  "Google BigQuery Table's Streaming Buffer information. This class contains information on a
  table's streaming buffer as the estimated size in number of rows/bytes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery StandardTableDefinition$StreamingBuffer]))

(defn get-estimated-rows
  "Returns a lower-bound estimate of the number of rows currently in the streaming buffer.

  returns: `java.lang.Long`"
  (^java.lang.Long [^StandardTableDefinition$StreamingBuffer this]
    (-> this (.getEstimatedRows))))

(defn get-estimated-bytes
  "Returns a lower-bound estimate of the number of bytes currently in the streaming buffer.

  returns: `java.lang.Long`"
  (^java.lang.Long [^StandardTableDefinition$StreamingBuffer this]
    (-> this (.getEstimatedBytes))))

(defn get-oldest-entry-time
  "Returns the timestamp of the oldest entry in the streaming buffer, in milliseconds since
   epoch. Returns null if the streaming buffer is empty.

  returns: `java.lang.Long`"
  (^java.lang.Long [^StandardTableDefinition$StreamingBuffer this]
    (-> this (.getOldestEntryTime))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StandardTableDefinition$StreamingBuffer this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StandardTableDefinition$StreamingBuffer this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StandardTableDefinition$StreamingBuffer this ^java.lang.Object obj]
    (-> this (.equals obj))))

