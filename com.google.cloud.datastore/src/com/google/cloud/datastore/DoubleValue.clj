(ns com.google.cloud.datastore.DoubleValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DoubleValue]))

(defn ->double-value
  "Constructor.

  value - `double`"
  (^DoubleValue [^Double value]
    (new DoubleValue value)))

(defn *of
  "value - `double`

  returns: `com.google.cloud.datastore.DoubleValue`"
  (^com.google.cloud.datastore.DoubleValue [^Double value]
    (DoubleValue/of value)))

(defn *new-builder
  "value - `double`

  returns: `com.google.cloud.datastore.DoubleValue$Builder`"
  (^com.google.cloud.datastore.DoubleValue$Builder [^Double value]
    (DoubleValue/newBuilder value)))

(defn to-builder
  "returns: `com.google.cloud.datastore.DoubleValue$Builder`"
  (^com.google.cloud.datastore.DoubleValue$Builder [^DoubleValue this]
    (-> this (.toBuilder))))

