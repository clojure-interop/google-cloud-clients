(ns com.google.cloud.datastore.TimestampValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore TimestampValue$Builder]))

(defn get-meaning
  "Description copied from interface: ValueBuilder

  returns: `int`"
  (^Integer [^TimestampValue$Builder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Description copied from interface: ValueBuilder

  meaning - `int`

  returns: `B`"
  ([^TimestampValue$Builder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^TimestampValue$Builder this]
    (-> this (.getValueType))))

(defn build
  "returns: `com.google.cloud.datastore.TimestampValue`"
  (^com.google.cloud.datastore.TimestampValue [^TimestampValue$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^TimestampValue$Builder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^TimestampValue$Builder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "value - `V`

  returns: `B`"
  ([^TimestampValue$Builder this value]
    (-> this (.set value))))

(defn get
  "returns: `V`"
  ([^TimestampValue$Builder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^TimestampValue$Builder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

