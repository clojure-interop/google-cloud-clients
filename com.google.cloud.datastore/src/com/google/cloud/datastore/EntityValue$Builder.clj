(ns com.google.cloud.datastore.EntityValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore EntityValue$Builder]))

(defn get-meaning
  "Description copied from interface: ValueBuilder

  returns: `int`"
  (^Integer [^EntityValue$Builder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Description copied from interface: ValueBuilder

  meaning - `int`

  returns: `B`"
  ([^EntityValue$Builder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^EntityValue$Builder this]
    (-> this (.getValueType))))

(defn build
  "returns: `com.google.cloud.datastore.EntityValue`"
  (^com.google.cloud.datastore.EntityValue [^EntityValue$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^EntityValue$Builder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^EntityValue$Builder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "value - `V`

  returns: `B`"
  ([^EntityValue$Builder this value]
    (-> this (.set value))))

(defn get
  "returns: `V`"
  ([^EntityValue$Builder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^EntityValue$Builder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

