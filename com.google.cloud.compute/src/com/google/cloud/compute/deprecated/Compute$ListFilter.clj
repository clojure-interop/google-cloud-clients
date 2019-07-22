(ns com.google.cloud.compute.deprecated.Compute$ListFilter
  "Base class for list filters."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ListFilter]))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$ListFilter this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$ListFilter this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$ListFilter this]
    (-> this (.toString))))

