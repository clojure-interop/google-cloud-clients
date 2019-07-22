(ns com.google.cloud.datastore.LongValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore LongValue$Builder]))

(defn get-meaning
  "Description copied from interface: ValueBuilder

  returns: `int`"
  (^Integer [^LongValue$Builder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Description copied from interface: ValueBuilder

  meaning - `int`

  returns: `B`"
  ([^LongValue$Builder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^LongValue$Builder this]
    (-> this (.getValueType))))

(defn build
  "returns: `com.google.cloud.datastore.LongValue`"
  (^com.google.cloud.datastore.LongValue [^LongValue$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^LongValue$Builder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^LongValue$Builder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "value - `V`

  returns: `B`"
  ([^LongValue$Builder this value]
    (-> this (.set value))))

(defn get
  "returns: `V`"
  ([^LongValue$Builder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^LongValue$Builder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

