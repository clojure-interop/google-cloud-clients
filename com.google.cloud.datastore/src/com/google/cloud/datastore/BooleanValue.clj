(ns com.google.cloud.datastore.BooleanValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore BooleanValue]))

(defn ->boolean-value
  "Constructor.

  value - `boolean`"
  (^BooleanValue [^Boolean value]
    (new BooleanValue value)))

(defn *of
  "value - `boolean`

  returns: `com.google.cloud.datastore.BooleanValue`"
  (^com.google.cloud.datastore.BooleanValue [^Boolean value]
    (BooleanValue/of value)))

(defn *new-builder
  "value - `boolean`

  returns: `com.google.cloud.datastore.BooleanValue$Builder`"
  (^com.google.cloud.datastore.BooleanValue$Builder [^Boolean value]
    (BooleanValue/newBuilder value)))

(defn to-builder
  "returns: `com.google.cloud.datastore.BooleanValue$Builder`"
  (^com.google.cloud.datastore.BooleanValue$Builder [^BooleanValue this]
    (-> this (.toBuilder))))

