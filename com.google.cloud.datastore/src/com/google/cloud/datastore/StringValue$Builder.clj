(ns com.google.cloud.datastore.StringValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore StringValue$Builder]))

(defn get-meaning
  "Description copied from interface: ValueBuilder

  returns: `int`"
  (^Integer [^StringValue$Builder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Description copied from interface: ValueBuilder

  meaning - `int`

  returns: `B`"
  ([^StringValue$Builder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^StringValue$Builder this]
    (-> this (.getValueType))))

(defn build
  "returns: `com.google.cloud.datastore.StringValue`"
  (^com.google.cloud.datastore.StringValue [^StringValue$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^StringValue$Builder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^StringValue$Builder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "value - `V`

  returns: `B`"
  ([^StringValue$Builder this value]
    (-> this (.set value))))

(defn get
  "returns: `V`"
  ([^StringValue$Builder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^StringValue$Builder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

