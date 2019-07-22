(ns com.google.cloud.bigtable.data.v2.models.Filters$ValueRangeFilter
  "Matches only cells with values that fall within the given value range."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$ValueRangeFilter]))

(defn to-proto
  "returns: `com.google.bigtable.v2.RowFilter`"
  (^com.google.bigtable.v2.RowFilter [^Filters$ValueRangeFilter this]
    (-> this (.toProto))))

(defn clone
  "returns: `com.google.cloud.bigtable.data.v2.models.Filters$ValueRangeFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ValueRangeFilter [^Filters$ValueRangeFilter this]
    (-> this (.clone))))

(defn of
  "Creates a new Range with the specified inclusive start and the specified exclusive
   end.

  start-closed - `java.lang.String`
  end-open - `java.lang.String`

  returns: `R`"
  ([^Filters$ValueRangeFilter this ^java.lang.String start-closed ^java.lang.String end-open]
    (-> this (.of start-closed end-open))))

(defn start-open
  "Creates a new Range with the specified exclusive start and the current end.

  start - `java.lang.String`

  returns: `R`"
  ([^Filters$ValueRangeFilter this ^java.lang.String start]
    (-> this (.startOpen start))))

(defn start-closed
  "Creates a new Range with the specified inclusive start and the current end.

  start - `java.lang.String`

  returns: `R`"
  ([^Filters$ValueRangeFilter this ^java.lang.String start]
    (-> this (.startClosed start))))

(defn end-open
  "Creates a new Range with the specified exclusive end and the current start.

  end - `java.lang.String`

  returns: `R`"
  ([^Filters$ValueRangeFilter this ^java.lang.String end]
    (-> this (.endOpen end))))

(defn end-closed
  "Creates a new Range with the specified inclusive end and the current start.

  end - `java.lang.String`

  returns: `R`"
  ([^Filters$ValueRangeFilter this ^java.lang.String end]
    (-> this (.endClosed end))))

