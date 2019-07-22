(ns com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter
  "DSL for adding filters to the interleave list."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$InterleaveFilter]))

(defn filter
  "Adds a Filters.Filter to the interleave list.

  filter - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter [^Filters$InterleaveFilter this ^com.google.cloud.bigtable.data.v2.models.Filters$Filter filter]
    (-> this (.filter filter))))

(defn to-proto
  "returns: `com.google.bigtable.v2.RowFilter`"
  (^com.google.bigtable.v2.RowFilter [^Filters$InterleaveFilter this]
    (-> this (.toProto))))

(defn clone
  "returns: `com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter [^Filters$InterleaveFilter this]
    (-> this (.clone))))

