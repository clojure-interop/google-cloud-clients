(ns com.google.cloud.bigtable.data.v2.models.Range$TimestampRange
  "Concrete Range for timestamps"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Range$TimestampRange]))

(defn *unbounded
  "returns: `com.google.cloud.bigtable.data.v2.models.Range$TimestampRange`"
  (^com.google.cloud.bigtable.data.v2.models.Range$TimestampRange []
    (Range$TimestampRange/unbounded )))

(defn *create
  "closed-start - `long`
  open-end - `long`

  returns: `com.google.cloud.bigtable.data.v2.models.Range$TimestampRange`"
  (^com.google.cloud.bigtable.data.v2.models.Range$TimestampRange [^Long closed-start ^Long open-end]
    (Range$TimestampRange/create closed-start open-end)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Range$TimestampRange this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Range$TimestampRange this]
    (-> this (.hashCode))))

