(ns com.google.cloud.spanner.KeySet$Builder
  "Builder for KeySet instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner KeySet$Builder]))

(defn add-key
  "Adds a key to the key set. key should contain exactly as many elements as there are
   columns in the primary or index key with this this key set is used.

  key - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeySet$Builder`"
  (^com.google.cloud.spanner.KeySet$Builder [^KeySet$Builder this ^com.google.cloud.spanner.Key key]
    (-> this (.addKey key))))

(defn add-range
  "Adds a range to the key set. See KeyRange for details of how to specify ranges.

  range - `com.google.cloud.spanner.KeyRange`

  returns: `com.google.cloud.spanner.KeySet$Builder`"
  (^com.google.cloud.spanner.KeySet$Builder [^KeySet$Builder this ^com.google.cloud.spanner.KeyRange range]
    (-> this (.addRange range))))

(defn set-all
  "Makes the key set retrieve all rows of a table or index.

  returns: `com.google.cloud.spanner.KeySet$Builder`"
  (^com.google.cloud.spanner.KeySet$Builder [^KeySet$Builder this]
    (-> this (.setAll))))

(defn build
  "returns: `com.google.cloud.spanner.KeySet`"
  (^com.google.cloud.spanner.KeySet [^KeySet$Builder this]
    (-> this (.build))))

