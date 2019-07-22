(ns com.google.cloud.storage.Acl$Entity
  "Base class for Access Control List entities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$Entity]))

(defn get-type
  "Returns the type of entity.

  returns: `com.google.cloud.storage.Acl$Entity$Type`"
  (^com.google.cloud.storage.Acl$Entity$Type [^Acl$Entity this]
    (-> this (.getType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Acl$Entity this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Acl$Entity this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Acl$Entity this]
    (-> this (.toString))))

