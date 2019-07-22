(ns com.google.cloud.datastore.ListValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ListValue$Builder]))

(defn get-meaning
  "Description copied from interface: ValueBuilder

  returns: `int`"
  (^Integer [^ListValue$Builder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Description copied from interface: ValueBuilder

  meaning - `int`

  returns: `B`"
  ([^ListValue$Builder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^ListValue$Builder this]
    (-> this (.getValueType))))

(defn build
  "Creates a ListValue object.

  returns: `com.google.cloud.datastore.ListValue`"
  (^com.google.cloud.datastore.ListValue [^ListValue$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^ListValue$Builder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^ListValue$Builder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "Sets the list of values of this ListValue builder to values. The provided
   list is copied.

  values - `java.util.List`

  returns: `com.google.cloud.datastore.ListValue$Builder`"
  (^com.google.cloud.datastore.ListValue$Builder [^ListValue$Builder this ^java.util.List values]
    (-> this (.set values))))

(defn add-value
  "Adds the provided values to the ListValue builder.

  first - `com.google.cloud.datastore.Value`
  other - `com.google.cloud.datastore.Value`

  returns: `com.google.cloud.datastore.ListValue$Builder`"
  (^com.google.cloud.datastore.ListValue$Builder [^ListValue$Builder this ^com.google.cloud.datastore.Value first ^com.google.cloud.datastore.Value other]
    (-> this (.addValue first other))))

(defn get
  "returns: `java.util.List<? extends com.google.cloud.datastore.Value<?>>`"
  ([^ListValue$Builder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^ListValue$Builder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

