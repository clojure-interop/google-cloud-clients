(ns com.google.cloud.datastore.BaseKey
  "Base class for keys."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore BaseKey]))

(defn get-project-id
  "Returns the key's projectId.

  returns: `java.lang.String`"
  (^java.lang.String [^BaseKey this]
    (-> this (.getProjectId))))

(defn get-namespace
  "Returns the key's namespace or null if not provided.

  returns: `java.lang.String`"
  (^java.lang.String [^BaseKey this]
    (-> this (.getNamespace))))

(defn get-ancestors
  "Returns an immutable list with the key's ancestors.

  returns: `java.util.List<com.google.cloud.datastore.PathElement>`"
  (^java.util.List [^BaseKey this]
    (-> this (.getAncestors))))

(defn get-kind
  "Returns the key's kind.

  returns: `java.lang.String`"
  (^java.lang.String [^BaseKey this]
    (-> this (.getKind))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseKey this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BaseKey this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseKey this ^java.lang.Object obj]
    (-> this (.equals obj))))

