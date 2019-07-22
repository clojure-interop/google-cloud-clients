(ns com.google.cloud.datastore.LongValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore LongValue]))

(defn ->long-value
  "Constructor.

  value - `long`"
  (^LongValue [^Long value]
    (new LongValue value)))

(defn *of
  "value - `long`

  returns: `com.google.cloud.datastore.LongValue`"
  (^com.google.cloud.datastore.LongValue [^Long value]
    (LongValue/of value)))

(defn *new-builder
  "value - `long`

  returns: `com.google.cloud.datastore.LongValue$Builder`"
  (^com.google.cloud.datastore.LongValue$Builder [^Long value]
    (LongValue/newBuilder value)))

(defn to-builder
  "returns: `com.google.cloud.datastore.LongValue$Builder`"
  (^com.google.cloud.datastore.LongValue$Builder [^LongValue this]
    (-> this (.toBuilder))))

