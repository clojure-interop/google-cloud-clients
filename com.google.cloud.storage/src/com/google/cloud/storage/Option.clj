(ns com.google.cloud.storage.Option
  "Base class for Storage operation option."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Option]))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Option this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Option this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Option this]
    (-> this (.toString))))

