(ns com.google.cloud.bigtable.data.v2.models.Filters$TimestampFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$TimestampFilter]))

(defn range
  "Matches only cells with timestamps within the given range.

  returns: a Filters.TimestampRangeFilter on which start / end timestamps can be specified. - `com.google.cloud.bigtable.data.v2.models.Filters$TimestampRangeFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$TimestampRangeFilter [^Filters$TimestampFilter this]
    (-> this (.range))))

