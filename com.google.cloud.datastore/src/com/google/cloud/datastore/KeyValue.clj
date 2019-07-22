(ns com.google.cloud.datastore.KeyValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore KeyValue]))

(defn ->key-value
  "Constructor.

  key - `com.google.cloud.datastore.Key`"
  (^KeyValue [^com.google.cloud.datastore.Key key]
    (new KeyValue key)))

(defn *of
  "key - `com.google.cloud.datastore.Key`

  returns: `com.google.cloud.datastore.KeyValue`"
  (^com.google.cloud.datastore.KeyValue [^com.google.cloud.datastore.Key key]
    (KeyValue/of key)))

(defn *new-builder
  "key - `com.google.cloud.datastore.Key`

  returns: `com.google.cloud.datastore.KeyValue$Builder`"
  (^com.google.cloud.datastore.KeyValue$Builder [^com.google.cloud.datastore.Key key]
    (KeyValue/newBuilder key)))

(defn to-builder
  "returns: `com.google.cloud.datastore.KeyValue$Builder`"
  (^com.google.cloud.datastore.KeyValue$Builder [^KeyValue this]
    (-> this (.toBuilder))))

