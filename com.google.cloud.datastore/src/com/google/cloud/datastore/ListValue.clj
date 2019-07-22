(ns com.google.cloud.datastore.ListValue
  "A Google Cloud Datastore list value. A list value is a list of Value objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ListValue]))

(defn ->list-value
  "Constructor.

  first - `com.google.cloud.datastore.Value`
  other - `com.google.cloud.datastore.Value`"
  (^ListValue [^com.google.cloud.datastore.Value first ^com.google.cloud.datastore.Value other]
    (new ListValue first other))
  (^ListValue [^java.util.List values]
    (new ListValue values)))

(defn *of
  "Creates a ListValue object given a number of Value objects.

  first - `com.google.cloud.datastore.Value`
  other - `com.google.cloud.datastore.Value`

  returns: `com.google.cloud.datastore.ListValue`"
  (^com.google.cloud.datastore.ListValue [^com.google.cloud.datastore.Value first ^com.google.cloud.datastore.Value other]
    (ListValue/of first other))
  (^com.google.cloud.datastore.ListValue [^java.util.List values]
    (ListValue/of values)))

(defn *new-builder
  "Returns a builder for ListValue objects.

  returns: `com.google.cloud.datastore.ListValue$Builder`"
  (^com.google.cloud.datastore.ListValue$Builder []
    (ListValue/newBuilder )))

(defn to-builder
  "Returns a builder for the list value object.

  returns: `com.google.cloud.datastore.ListValue$Builder`"
  (^com.google.cloud.datastore.ListValue$Builder [^ListValue this]
    (-> this (.toBuilder))))

