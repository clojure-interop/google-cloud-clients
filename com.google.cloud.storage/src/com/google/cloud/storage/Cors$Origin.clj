(ns com.google.cloud.storage.Cors$Origin
  "Class for a CORS origin."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Cors$Origin]))

(defn *any
  "Returns an Origin object for all possible origins.

  returns: `com.google.cloud.storage.Cors$Origin`"
  (^com.google.cloud.storage.Cors$Origin []
    (Cors$Origin/any )))

(defn *of
  "Returns an Origin object for the given scheme, host and port.

  scheme - `java.lang.String`
  host - `java.lang.String`
  port - `int`

  returns: `com.google.cloud.storage.Cors$Origin`"
  (^com.google.cloud.storage.Cors$Origin [^java.lang.String scheme ^java.lang.String host ^Integer port]
    (Cors$Origin/of scheme host port))
  (^com.google.cloud.storage.Cors$Origin [^java.lang.String value]
    (Cors$Origin/of value)))

(defn hash-code
  "returns: `int`"
  (^Integer [^Cors$Origin this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Cors$Origin this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Cors$Origin this]
    (-> this (.toString))))

(defn get-value
  "returns: `java.lang.String`"
  (^java.lang.String [^Cors$Origin this]
    (-> this (.getValue))))

