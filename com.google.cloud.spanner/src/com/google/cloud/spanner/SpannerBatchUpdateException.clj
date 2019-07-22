(ns com.google.cloud.spanner.SpannerBatchUpdateException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SpannerBatchUpdateException]))

(defn get-update-counts
  "Returns the number of rows affected by each statement that is successfully run.

  returns: `long[]`"
  ([^SpannerBatchUpdateException this]
    (-> this (.getUpdateCounts))))

