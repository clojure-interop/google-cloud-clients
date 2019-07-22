(ns com.google.cloud.bigtable.data.v2.models.Range
  "Range API.

  This base class represents the API for all ranges in the Cloud Bigtable client. Please note
  this mutable type. It's intended to support fluent DSLs.For example:



  // A Range that encloses all strings
  ByteStringRange.unbounded();

  // Range that includes all strings including \"begin\" up until \"end\"
  ByteStringRange.unbounded().of(\"start\", \"end\");

  // Create a Bytestring range with an unbounded start and the inclusive end \"end\"
  ByteStringRange.unbounded().endClosed(\"end\");

  // Ranges are mutable, so take care to clone them to get a new instance
  ByteStringRange r1 = ByteStringRange.of(\"a\", \"z\");
  ByteStringRange r2 = r1.clone().endUnbounded();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Range]))

(defn of
  "Creates a new Range with the specified inclusive start and the specified exclusive end.

  start-closed - `T`
  end-open - `T`

  returns: `R`"
  ([^Range this start-closed end-open]
    (-> this (.of start-closed end-open))))

(defn start-unbounded
  "Creates a new Range with an unbounded start and the current end.

  returns: `R`"
  ([^Range this]
    (-> this (.startUnbounded))))

(defn end-open
  "Creates a new Range with the specified exclusive end and the current start.

  end - `T`

  returns: `R`"
  ([^Range this end]
    (-> this (.endOpen end))))

(defn start-closed
  "Creates a new Range with the specified inclusive start and the current end.

  start - `T`

  returns: `R`"
  ([^Range this start]
    (-> this (.startClosed start))))

(defn start-open
  "Creates a new Range with the specified exclusive start and the current end.

  start - `T`

  returns: `R`"
  ([^Range this start]
    (-> this (.startOpen start))))

(defn end-closed
  "Creates a new Range with the specified inclusive end and the current start.

  end - `T`

  returns: `R`"
  ([^Range this end]
    (-> this (.endClosed end))))

(defn get-end
  "Gets the current end value.

  returns: `T`

  throws: java.lang.IllegalStateException - If the current getEndBound() is Range.BoundType.UNBOUNDED."
  ([^Range this]
    (-> this (.getEnd))))

(defn get-start-bound
  "Gets the current start Range.BoundType.

  returns: `com.google.cloud.bigtable.data.v2.models.Range$BoundType`"
  (^com.google.cloud.bigtable.data.v2.models.Range$BoundType [^Range this]
    (-> this (.getStartBound))))

(defn get-start
  "Gets the current start value.

  returns: `T`

  throws: java.lang.IllegalStateException - If the current getStartBound() is Range.BoundType.UNBOUNDED."
  ([^Range this]
    (-> this (.getStart))))

(defn end-unbounded
  "Creates a new Range with the current start and an unbounded end.

  returns: `R`"
  ([^Range this]
    (-> this (.endUnbounded))))

(defn get-end-bound
  "Gets the current end Range.BoundType.

  returns: `com.google.cloud.bigtable.data.v2.models.Range$BoundType`"
  (^com.google.cloud.bigtable.data.v2.models.Range$BoundType [^Range this]
    (-> this (.getEndBound))))

