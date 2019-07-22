(ns com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter
  "DSL for configuring a conditional filter."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$ConditionFilter]))

(defn then
  "Sets (replaces) the filter to apply when the predicate is true.

  filter - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter [^Filters$ConditionFilter this ^com.google.cloud.bigtable.data.v2.models.Filters$Filter filter]
    (-> this (.then filter))))

(defn otherwise
  "Sets (replaces) the filter to apply when the predicate is false.

  filter - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter [^Filters$ConditionFilter this ^com.google.cloud.bigtable.data.v2.models.Filters$Filter filter]
    (-> this (.otherwise filter))))

(defn to-proto
  "returns: `com.google.bigtable.v2.RowFilter`"
  (^com.google.bigtable.v2.RowFilter [^Filters$ConditionFilter this]
    (-> this (.toProto))))

(defn clone
  "returns: `com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter [^Filters$ConditionFilter this]
    (-> this (.clone))))

