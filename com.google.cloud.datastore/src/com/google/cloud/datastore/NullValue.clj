(ns com.google.cloud.datastore.NullValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore NullValue]))

(defn ->null-value
  "Constructor."
  (^NullValue []
    (new NullValue )))

(defn *of
  "returns: `com.google.cloud.datastore.NullValue`"
  (^com.google.cloud.datastore.NullValue []
    (NullValue/of )))

(defn *new-builder
  "returns: `com.google.cloud.datastore.NullValue$Builder`"
  (^com.google.cloud.datastore.NullValue$Builder []
    (NullValue/newBuilder )))

(defn to-builder
  "returns: `com.google.cloud.datastore.NullValue$Builder`"
  (^com.google.cloud.datastore.NullValue$Builder [^NullValue this]
    (-> this (.toBuilder))))

