(ns com.google.cloud.datastore.BlobValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore BlobValue]))

(defn ->blob-value
  "Constructor.

  blob - `com.google.cloud.datastore.Blob`"
  (^BlobValue [^com.google.cloud.datastore.Blob blob]
    (new BlobValue blob)))

(defn *of
  "blob - `com.google.cloud.datastore.Blob`

  returns: `com.google.cloud.datastore.BlobValue`"
  (^com.google.cloud.datastore.BlobValue [^com.google.cloud.datastore.Blob blob]
    (BlobValue/of blob)))

(defn *new-builder
  "blob - `com.google.cloud.datastore.Blob`

  returns: `com.google.cloud.datastore.BlobValue$Builder`"
  (^com.google.cloud.datastore.BlobValue$Builder [^com.google.cloud.datastore.Blob blob]
    (BlobValue/newBuilder blob)))

(defn to-builder
  "returns: `com.google.cloud.datastore.BlobValue$Builder`"
  (^com.google.cloud.datastore.BlobValue$Builder [^BlobValue this]
    (-> this (.toBuilder))))

