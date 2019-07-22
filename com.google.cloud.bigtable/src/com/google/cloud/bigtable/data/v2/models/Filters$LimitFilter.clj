(ns com.google.cloud.bigtable.data.v2.models.Filters$LimitFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$LimitFilter]))

(defn cells-per-row
  "Matches only the first N cells of each row. If duplicate cells are present, as is possible
   when using an Interleave, each copy of the cell is counted separately.

  count - `int`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$LimitFilter this ^Integer count]
    (-> this (.cellsPerRow count))))

(defn cells-per-column
  "Matches only the most recent `count` cells within each column. For example, if count=2, this
   filter would match column `foo:bar` at timestamps 10 and 9 skip all earlier cells in
   `foo:bar`, and then begin matching again in column `foo:bar2`. If duplicate cells are
   present, as is possible when using an Filters.InterleaveFilter, each copy of the cell is
   counted separately.

  count - `int`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$LimitFilter this ^Integer count]
    (-> this (.cellsPerColumn count))))

