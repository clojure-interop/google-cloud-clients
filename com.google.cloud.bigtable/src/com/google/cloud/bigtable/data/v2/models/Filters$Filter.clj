(ns com.google.cloud.bigtable.data.v2.models.Filters$Filter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$Filter]))

(defn to-proto
  "returns: `com.google.bigtable.v2.RowFilter`"
  (^com.google.bigtable.v2.RowFilter [^Filters$Filter this]
    (-> this (.toProto))))

