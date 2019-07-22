(ns com.google.cloud.spanner.Partition
  "Defines the segments of data to be read in a batch read/query context. They can be serialized and
  processed across several different machines or proccesses."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Partition]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Partition this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Partition this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Partition this]
    (-> this (.hashCode))))

