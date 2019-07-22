(ns com.google.cloud.datastore.DoubleValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DoubleValue$Builder]))

(defn ->builder
  "Constructor."
  (^DoubleValue$Builder []
    (new DoubleValue$Builder )))

(defn get-meaning
  "Description copied from interface: ValueBuilder

  returns: `int`"
  (^Integer [^DoubleValue$Builder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Description copied from interface: ValueBuilder

  meaning - `int`

  returns: `B`"
  ([^DoubleValue$Builder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^DoubleValue$Builder this]
    (-> this (.getValueType))))

(defn build
  "returns: `com.google.cloud.datastore.DoubleValue`"
  (^com.google.cloud.datastore.DoubleValue [^DoubleValue$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^DoubleValue$Builder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^DoubleValue$Builder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "value - `V`

  returns: `B`"
  ([^DoubleValue$Builder this value]
    (-> this (.set value))))

(defn get
  "returns: `V`"
  ([^DoubleValue$Builder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^DoubleValue$Builder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

