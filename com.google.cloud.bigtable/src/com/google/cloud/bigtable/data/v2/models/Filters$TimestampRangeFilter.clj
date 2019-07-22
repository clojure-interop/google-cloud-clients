(ns com.google.cloud.bigtable.data.v2.models.Filters$TimestampRangeFilter
  "Matches only cells with microsecond timestamps within the given range."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$TimestampRangeFilter]))

(defn to-proto
  "returns: `com.google.bigtable.v2.RowFilter`"
  (^com.google.bigtable.v2.RowFilter [^Filters$TimestampRangeFilter this]
    (-> this (.toProto))))

(defn clone
  "returns: `com.google.cloud.bigtable.data.v2.models.Filters$TimestampRangeFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$TimestampRangeFilter [^Filters$TimestampRangeFilter this]
    (-> this (.clone))))

