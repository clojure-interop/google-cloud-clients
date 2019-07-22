(ns com.google.cloud.spanner.KeySet
  "Defines a collection of Cloud Spanner keys and/or key ranges. All the keys are expected to be in
  the same table or index. The keys need not be sorted in any particular way.

  If the same key is specified multiple times in the set (for example if two ranges, two keys,
  or a key and a range overlap), the Cloud Spanner backend behaves as if the key were only
  specified once. However, the KeySet object itself does not perform any de-duplication.

  KeySet instances are immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner KeySet]))

(defn *single-key
  "Creates a key set containing a single key. key should contain exactly as many elements
   as there are columns in the primary or index key with this this key set is used.

  key - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeySet`"
  (^com.google.cloud.spanner.KeySet [^com.google.cloud.spanner.Key key]
    (KeySet/singleKey key)))

(defn *range
  "Creates a key set containing a single range. See KeyRange for details of how to specify
   ranges.

  range - `com.google.cloud.spanner.KeyRange`

  returns: `com.google.cloud.spanner.KeySet`"
  (^com.google.cloud.spanner.KeySet [^com.google.cloud.spanner.KeyRange range]
    (KeySet/range range)))

(defn *prefix-range
  "Creates a key set that covers all keys where the first prefix.size() components match
   prefix exactly.

  prefix - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeySet`"
  (^com.google.cloud.spanner.KeySet [^com.google.cloud.spanner.Key prefix]
    (KeySet/prefixRange prefix)))

(defn *all
  "Creates a key set that will retrieve all rows of a table or index.

  returns: `com.google.cloud.spanner.KeySet`"
  (^com.google.cloud.spanner.KeySet []
    (KeySet/all )))

(defn *new-builder
  "Returns a new builder that can be used to construct a key set.

  returns: `com.google.cloud.spanner.KeySet$Builder`"
  (^com.google.cloud.spanner.KeySet$Builder []
    (KeySet/newBuilder )))

(defn get-keys
  "Returns the keys in this set.

  returns: `java.lang.Iterable<com.google.cloud.spanner.Key>`"
  (^java.lang.Iterable [^KeySet this]
    (-> this (.getKeys))))

(defn get-ranges
  "Returns the ranges in this set.

  returns: `java.lang.Iterable<com.google.cloud.spanner.KeyRange>`"
  (^java.lang.Iterable [^KeySet this]
    (-> this (.getRanges))))

(defn all?
  "Indicates whether the set will retrieve all rows in a table or index.

  returns: `boolean`"
  (^Boolean [^KeySet this]
    (-> this (.isAll))))

(defn to-builder
  "Returns a builder initialized with the contents of this set.

  returns: `com.google.cloud.spanner.KeySet$Builder`"
  (^com.google.cloud.spanner.KeySet$Builder [^KeySet this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^KeySet this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^KeySet this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^KeySet this]
    (-> this (.hashCode))))

