(ns com.google.cloud.datastore.NullValue$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore NullValue$Builder]))

(defn get-meaning
  "Description copied from interface: ValueBuilder

  returns: `int`"
  (^Integer [^NullValue$Builder this]
    (-> this (.getMeaning))))

(defn set-meaning
  "Description copied from interface: ValueBuilder

  meaning - `int`

  returns: `B`"
  ([^NullValue$Builder this ^Integer meaning]
    (-> this (.setMeaning meaning))))

(defn get-value-type
  "returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^NullValue$Builder this]
    (-> this (.getValueType))))

(defn build
  "returns: `com.google.cloud.datastore.NullValue`"
  (^com.google.cloud.datastore.NullValue [^NullValue$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `P`

  returns: `B`"
  ([^NullValue$Builder this other]
    (-> this (.mergeFrom other))))

(defn get-exclude-from-indexes?
  "returns: `boolean`"
  (^Boolean [^NullValue$Builder this]
    (-> this (.getExcludeFromIndexes))))

(defn set
  "value - `java.lang.Void`

  returns: `com.google.cloud.datastore.NullValue$Builder`"
  (^com.google.cloud.datastore.NullValue$Builder [^NullValue$Builder this ^java.lang.Void value]
    (-> this (.set value))))

(defn get
  "returns: `V`"
  ([^NullValue$Builder this]
    (-> this (.get))))

(defn set-exclude-from-indexes
  "exclude-from-indexes - `boolean`

  returns: `B`"
  ([^NullValue$Builder this ^Boolean exclude-from-indexes]
    (-> this (.setExcludeFromIndexes exclude-from-indexes))))

