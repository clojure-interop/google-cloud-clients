(ns com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow
  "Wraps a ReadModifyWriteRowRequest."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models ReadModifyWriteRow]))

(defn *create
  "table-id - `java.lang.String`
  key - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow`"
  (^com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow [^java.lang.String table-id ^java.lang.String key]
    (ReadModifyWriteRow/create table-id key)))

(defn append
  "Appends the value to the existing value of the cell. If the targeted cell is unset, it will be
   treated as containing the empty string.

  family-name - `java.lang.String`
  qualifier - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow`"
  (^com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow [^ReadModifyWriteRow this ^java.lang.String family-name ^java.lang.String qualifier ^java.lang.String value]
    (-> this (.append family-name qualifier value))))

(defn increment
  "Adds `amount` be added to the existing value. If the targeted cell is unset, it will be treated
   as containing a zero. Otherwise, the targeted cell must contain an 8-byte value (interpreted as
   a 64-bit big-endian signed integer), or the entire request will fail.

  family-name - `java.lang.String`
  qualifier - `java.lang.String`
  amount - `long`

  returns: `com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow`"
  (^com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow [^ReadModifyWriteRow this ^java.lang.String family-name ^java.lang.String qualifier ^Long amount]
    (-> this (.increment family-name qualifier amount))))

(defn to-proto
  "request-context - `com.google.cloud.bigtable.data.v2.internal.RequestContext`

  returns: `com.google.bigtable.v2.ReadModifyWriteRowRequest`"
  (^com.google.bigtable.v2.ReadModifyWriteRowRequest [^ReadModifyWriteRow this ^com.google.cloud.bigtable.data.v2.internal.RequestContext request-context]
    (-> this (.toProto request-context))))

