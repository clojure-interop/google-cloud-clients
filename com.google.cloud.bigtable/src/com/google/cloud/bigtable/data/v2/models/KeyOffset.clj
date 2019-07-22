(ns com.google.cloud.bigtable.data.v2.models.KeyOffset
  "Represents the offset of a row key in a table."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models KeyOffset]))

(defn ->key-offset
  "Constructor."
  (^KeyOffset []
    (new KeyOffset )))

(defn *create
  "key - `com.google.protobuf.ByteString`
  offset-bytes - `long`

  returns: `com.google.cloud.bigtable.data.v2.models.KeyOffset`"
  (^com.google.cloud.bigtable.data.v2.models.KeyOffset [^com.google.protobuf.ByteString key ^Long offset-bytes]
    (KeyOffset/create key offset-bytes)))

(defn get-key
  "A row key value that is returned as part of the response of BigtableDataClient.sampleRowKeysAsync(String). The key
   represents end boundary of one of the contiguous sections in a list of approximately equal
   sized sections.

   Note that row key may not have ever been written to or read from, and users should therefore
   not make any assumptions about the row key structure that are specific to their use case.

  returns: `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^KeyOffset this]
    (-> this (.getKey))))

(defn get-offset-bytes
  "Approximate total storage space used by all rows in the table which precede getKey().
   Buffering the contents of all rows between two subsequent samples would require space roughly
   equal to the difference in their getOffsetBytes() fields.

  returns: `long`"
  (^Long [^KeyOffset this]
    (-> this (.getOffsetBytes))))

