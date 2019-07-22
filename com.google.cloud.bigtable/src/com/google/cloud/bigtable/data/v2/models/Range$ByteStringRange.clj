(ns com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange
  "Concrete Range for ByteStrings"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Range$ByteStringRange]))

(defn *prefix
  "prefix - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange`"
  (^com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange [^java.lang.String prefix]
    (Range$ByteStringRange/prefix prefix)))

(defn *unbounded
  "returns: `com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange`"
  (^com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange []
    (Range$ByteStringRange/unbounded )))

(defn *create
  "closed-start - `com.google.protobuf.ByteString`
  open-end - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange`"
  (^com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange [^com.google.protobuf.ByteString closed-start ^com.google.protobuf.ByteString open-end]
    (Range$ByteStringRange/create closed-start open-end)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Range$ByteStringRange this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Range$ByteStringRange this]
    (-> this (.hashCode))))

(defn of
  "Creates a new Range with the specified inclusive start and the specified exclusive
   end.

  start-closed - `java.lang.String`
  end-open - `java.lang.String`

  returns: `R`"
  ([^Range$ByteStringRange this ^java.lang.String start-closed ^java.lang.String end-open]
    (-> this (.of start-closed end-open))))

(defn start-open
  "Creates a new Range with the specified exclusive start and the current end.

  start - `java.lang.String`

  returns: `R`"
  ([^Range$ByteStringRange this ^java.lang.String start]
    (-> this (.startOpen start))))

(defn start-closed
  "Creates a new Range with the specified inclusive start and the current end.

  start - `java.lang.String`

  returns: `R`"
  ([^Range$ByteStringRange this ^java.lang.String start]
    (-> this (.startClosed start))))

(defn end-open
  "Creates a new Range with the specified exclusive end and the current start.

  end - `java.lang.String`

  returns: `R`"
  ([^Range$ByteStringRange this ^java.lang.String end]
    (-> this (.endOpen end))))

(defn end-closed
  "Creates a new Range with the specified inclusive end and the current start.

  end - `java.lang.String`

  returns: `R`"
  ([^Range$ByteStringRange this ^java.lang.String end]
    (-> this (.endClosed end))))

