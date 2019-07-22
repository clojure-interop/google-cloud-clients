(ns com.google.cloud.datastore.Value
  "Base class for all Google Cloud Datastore value types. All values must be associated with a
  non-null content (except NullValue). All values are immutable (including their content).
  To edit (a copy) use toBuilder(). Unsupported value (deprecated or unrecognized) would
  be represented by RawValue."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Value]))

(defn get-type
  "Returns the type of this value.

  returns: `com.google.cloud.datastore.ValueType`"
  (^com.google.cloud.datastore.ValueType [^Value this]
    (-> this (.getType))))

(defn exclude-from-indexes
  "Returns whether this value should be excluded from indexes.

  returns: `boolean`"
  (^Boolean [^Value this]
    (-> this (.excludeFromIndexes))))

(defn get
  "returns: `V`"
  ([^Value this]
    (-> this (.get))))

(defn to-builder
  "returns: `com.google.cloud.datastore.ValueBuilder<?,?,?>`"
  (^com.google.cloud.datastore.ValueBuilder [^Value this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Value this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Value this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Value this ^java.lang.Object obj]
    (-> this (.equals obj))))

