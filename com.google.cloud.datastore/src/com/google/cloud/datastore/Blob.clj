(ns com.google.cloud.datastore.Blob
  "A Google Cloud Datastore Blob. This class is immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Blob]))

(defn *copy-from
  "bytes - `byte[]`

  returns: `com.google.cloud.datastore.Blob`"
  (^com.google.cloud.datastore.Blob [bytes]
    (Blob/copyFrom bytes)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Blob this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Blob this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Blob this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-length
  "Returns the size of this blob.

  returns: `int`"
  (^Integer [^Blob this]
    (-> this (.getLength))))

(defn to-byte-array
  "Returns a copy as byte array.

  returns: `byte[]`"
  ([^Blob this]
    (-> this (.toByteArray))))

(defn as-read-only-byte-buffer
  "Returns a read-only ByteBuffer for this blob content.

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^Blob this]
    (-> this (.asReadOnlyByteBuffer))))

(defn as-input-stream
  "Returns an InputStream for this blob content.

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^Blob this]
    (-> this (.asInputStream))))

(defn copy-to
  "Copies bytes into a ByteBuffer.

  target - `java.nio.ByteBuffer`

  throws: java.nio.ReadOnlyBufferException - if the target is read-only"
  ([^Blob this ^java.nio.ByteBuffer target]
    (-> this (.copyTo target))))

