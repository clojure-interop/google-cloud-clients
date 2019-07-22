(ns com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter
  "DSL for adding filters to a chain."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$ChainFilter]))

(defn filter
  "Add a filter to chain.

  filter - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter [^Filters$ChainFilter this ^com.google.cloud.bigtable.data.v2.models.Filters$Filter filter]
    (-> this (.filter filter))))

(defn to-proto
  "returns: `com.google.bigtable.v2.RowFilter`"
  (^com.google.bigtable.v2.RowFilter [^Filters$ChainFilter this]
    (-> this (.toProto))))

(defn clone
  "Makes a deep copy of the Chain.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter [^Filters$ChainFilter this]
    (-> this (.clone))))

