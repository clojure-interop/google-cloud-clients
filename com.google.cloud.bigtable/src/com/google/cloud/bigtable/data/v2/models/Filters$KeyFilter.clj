(ns com.google.cloud.bigtable.data.v2.models.Filters$KeyFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$KeyFilter]))

(defn regex
  "Matches only cells from rows whose keys satisfy the given RE2 regex. In other words, passes
   through the entire row when the key matches, and otherwise produces an empty row. Note that,
   since row keys can contain arbitrary bytes, the `\\C` escape sequence must be used if a true
   wildcard is desired. The `.` character will not match the new line character `\\n`, which may
   be present in a binary key.

  regex - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$KeyFilter this ^java.lang.String regex]
    (-> this (.regex regex))))

(defn exact-match
  "Matches only cells from rows whose keys equal the value. In other words, passes through the
   entire row when the key matches, and otherwise produces an empty row.

  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$KeyFilter this ^java.lang.String value]
    (-> this (.exactMatch value))))

(defn sample
  "Matches all cells from a row with `probability`, and matches no cells from the row with
   probability 1-`probability`.

  probability - `double`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$KeyFilter this ^Double probability]
    (-> this (.sample probability))))

