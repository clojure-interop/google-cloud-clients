(ns com.google.cloud.datastore.ValueBuilder
  "A common interface for Value builders."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ValueBuilder]))

(defn get-meaning
  "Deprecated. This library preserves the field for backwards compatibility.

  returns: `int`"
  (^Integer [^ValueBuilder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Deprecated. This library preserves the field for backwards compatibility.

  meaning - `int`

  returns: `B`"
  ([^ValueBuilder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^ValueBuilder this]
    (-> this (.getValueType))))

(defn build
  "returns: `P`"
  ([^ValueBuilder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^ValueBuilder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^ValueBuilder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "value - `V`

  returns: `B`"
  ([^ValueBuilder this value]
    (-> this (.set value))))

(defn get
  "returns: `V`"
  ([^ValueBuilder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^ValueBuilder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

