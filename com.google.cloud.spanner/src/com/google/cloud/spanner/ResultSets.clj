(ns com.google.cloud.spanner.ResultSets
  "Utility methods for working with ResultSet."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ResultSets]))

(defn *for-rows
  "Creates a pre-populated ResultSet

  type - row type of the rows in the returned ResultSet - `com.google.cloud.spanner.Type`
  rows - the rows in the returned ResultSet. - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.ResultSet`"
  (^com.google.cloud.spanner.ResultSet [^com.google.cloud.spanner.Type type ^java.lang.Iterable rows]
    (ResultSets/forRows type rows)))

