(ns com.google.cloud.bigtable.data.v2.models.Filters$OffsetFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$OffsetFilter]))

(defn cells-per-row
  "Skips the first N cells of each row, matching all subsequent cells. If duplicate cells are
   present, as is possible when using an Filters.InterleaveFilter, each copy of the cell is
   counted separately.

  count - `int`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$OffsetFilter this ^Integer count]
    (-> this (.cellsPerRow count))))

