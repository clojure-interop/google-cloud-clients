(ns com.google.cloud.datastore.TimestampValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore TimestampValue]))

(defn ->timestamp-value
  "Constructor.

  timestamp - `com.google.cloud.Timestamp`"
  (^TimestampValue [^com.google.cloud.Timestamp timestamp]
    (new TimestampValue timestamp)))

(defn *of
  "timestamp - `com.google.cloud.Timestamp`

  returns: `com.google.cloud.datastore.TimestampValue`"
  (^com.google.cloud.datastore.TimestampValue [^com.google.cloud.Timestamp timestamp]
    (TimestampValue/of timestamp)))

(defn *new-builder
  "timestamp - `com.google.cloud.Timestamp`

  returns: `com.google.cloud.datastore.TimestampValue$Builder`"
  (^com.google.cloud.datastore.TimestampValue$Builder [^com.google.cloud.Timestamp timestamp]
    (TimestampValue/newBuilder timestamp)))

(defn to-builder
  "returns: `com.google.cloud.datastore.TimestampValue$Builder`"
  (^com.google.cloud.datastore.TimestampValue$Builder [^TimestampValue this]
    (-> this (.toBuilder))))

