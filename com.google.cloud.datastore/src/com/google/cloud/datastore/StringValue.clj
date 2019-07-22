(ns com.google.cloud.datastore.StringValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore StringValue]))

(defn ->string-value
  "Constructor.

  value - `java.lang.String`"
  (^StringValue [^java.lang.String value]
    (new StringValue value)))

(defn *of
  "value - `java.lang.String`

  returns: `com.google.cloud.datastore.StringValue`"
  (^com.google.cloud.datastore.StringValue [^java.lang.String value]
    (StringValue/of value)))

(defn *new-builder
  "value - `java.lang.String`

  returns: `com.google.cloud.datastore.StringValue$Builder`"
  (^com.google.cloud.datastore.StringValue$Builder [^java.lang.String value]
    (StringValue/newBuilder value)))

(defn to-builder
  "returns: `com.google.cloud.datastore.StringValue$Builder`"
  (^com.google.cloud.datastore.StringValue$Builder [^StringValue this]
    (-> this (.toBuilder))))

