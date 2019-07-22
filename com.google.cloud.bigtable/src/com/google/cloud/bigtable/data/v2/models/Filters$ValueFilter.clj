(ns com.google.cloud.bigtable.data.v2.models.Filters$ValueFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$ValueFilter]))

(defn regex
  "Matches only cells with values that satisfy the given RE2 regex. Note that, since cell values
   can contain arbitrary bytes, the `\\C` escape sequence must be used if a true wildcard is
   desired. The `.` character will not match the new line character `\\n`, which may be present
   in a binary value.

  regex - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$ValueFilter this ^java.lang.String regex]
    (-> this (.regex regex))))

(defn exact-match
  "Matches only cells with values that match the given value.

  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$ValueFilter this ^java.lang.String value]
    (-> this (.exactMatch value))))

(defn range
  "Construct a Filters.ValueRangeFilter that can create a ValueRange oriented Filters.Filter.

  returns: a new Filters.ValueRangeFilter - `com.google.cloud.bigtable.data.v2.models.Filters$ValueRangeFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ValueRangeFilter [^Filters$ValueFilter this]
    (-> this (.range))))

(defn strip
  "Replaces each cell's value with the empty string.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$ValueFilter this]
    (-> this (.strip))))

