(ns com.google.cloud.datastore.Cursor
  "A Google Cloud Datastore cursor. The cursor can be used to as a starting point or an ending point
  for a Query"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Cursor]))

(defn *from-url-safe
  "Create a Cursor given its URL safe encoded form.

  url-safe - `java.lang.String`

  returns: `com.google.cloud.datastore.Cursor`"
  (^com.google.cloud.datastore.Cursor [^java.lang.String url-safe]
    (Cursor/fromUrlSafe url-safe)))

(defn *copy-from
  "bytes - `byte[]`

  returns: `com.google.cloud.datastore.Cursor`"
  (^com.google.cloud.datastore.Cursor [bytes]
    (Cursor/copyFrom bytes)))

(defn hash-code
  "returns: `int`"
  (^Integer [^Cursor this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Cursor this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Cursor this]
    (-> this (.toString))))

(defn to-url-safe
  "Returns the cursor in an encoded form that can be used as part of a URL.

  returns: `java.lang.String`"
  (^java.lang.String [^Cursor this]
    (-> this (.toUrlSafe))))

