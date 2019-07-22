(ns com.google.cloud.bigtable.data.v2.models.Filters$QualifierFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$QualifierFilter]))

(defn regex
  "Matches only cells from columns whose qualifiers satisfy the given RE2 regex. Note that, since column
   qualifiers can contain arbitrary bytes, the `\\C` escape sequence must be used if a true
   wildcard is desired. The `.` character will not match the new line character `\\n`, which may
   be present in a binary qualifier.

  regex - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$QualifierFilter this ^java.lang.String regex]
    (-> this (.regex regex))))

(defn exact-match
  "Matches only cells from columns whose qualifiers equal the value.

  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$QualifierFilter this ^java.lang.String value]
    (-> this (.exactMatch value))))

(defn range-within-family
  "Construct a Filters.QualifierRangeFilter that can create a ColumnRange oriented
   Filters.Filter.

  family - `java.lang.String`

  returns: a new Filters.QualifierRangeFilter - `com.google.cloud.bigtable.data.v2.models.Filters$QualifierRangeFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$QualifierRangeFilter [^Filters$QualifierFilter this ^java.lang.String family]
    (-> this (.rangeWithinFamily family))))

