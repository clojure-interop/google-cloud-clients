(ns com.google.cloud.firestore.collection.ImmutableSortedMapIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection ImmutableSortedMapIterator]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ImmutableSortedMapIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `java.util.Map$Entry<K,V>`"
  (^java.util.Map$Entry [^ImmutableSortedMapIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^ImmutableSortedMapIterator this]
    (-> this (.remove))))

