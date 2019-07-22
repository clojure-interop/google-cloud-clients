(ns com.google.cloud.firestore.Blob
  "Immutable class representing an array of bytes in Firestore."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore Blob]))

(defn *from-byte-string
  "Creates a new Blob instance from the provided ByteString.

  byte-string - The byteString to use for this Blob instance. - `com.google.protobuf.ByteString`

  returns: The new Blob instance - `com.google.cloud.firestore.Blob`"
  (^com.google.cloud.firestore.Blob [^com.google.protobuf.ByteString byte-string]
    (Blob/fromByteString byte-string)))

(defn *from-bytes
  "Creates a new Blob instance from the provided bytes. Makes a copy of the bytes passed in.

  bytes - The bytes to use for this Blob instance. - `byte[]`

  returns: The new Blob instance - `com.google.cloud.firestore.Blob`"
  (^com.google.cloud.firestore.Blob [bytes]
    (Blob/fromBytes bytes)))

(defn to-byte-string
  "Returns the backing data as a ByteString.

  returns: The bytes of this blob as a byteString - `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^Blob this]
    (-> this (.toByteString))))

(defn to-bytes
  "Returns a copy of the underlying bytes as a byte[] array.

  returns: The bytes of this blob as a byte[] array. - `byte[]`"
  ([^Blob this]
    (-> this (.toBytes))))

(defn equals
  "Returns true if this Blob is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this Blob is equal to the provided object. - `boolean`"
  (^Boolean [^Blob this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Blob this]
    (-> this (.hashCode))))

