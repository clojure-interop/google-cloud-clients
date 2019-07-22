(ns com.google.cloud.firestore.collection.ImmutableSortedMap
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection ImmutableSortedMap]))

(defn ->immutable-sorted-map
  "Constructor."
  (^ImmutableSortedMap []
    (new ImmutableSortedMap )))

(defn reverse-iterator-from
  "key - `K`

  returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ImmutableSortedMap this key]
    (-> this (.reverseIteratorFrom key))))

(defn get-min-key
  "returns: `K`"
  ([^ImmutableSortedMap this]
    (-> this (.getMinKey))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ImmutableSortedMap this]
    (-> this (.toString))))

(defn iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ImmutableSortedMap this]
    (-> this (.iterator))))

(defn get-predecessor-key
  "key - `K`

  returns: `K`"
  ([^ImmutableSortedMap this key]
    (-> this (.getPredecessorKey key))))

(defn remove
  "key - `K`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedMap<K,V>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedMap [^ImmutableSortedMap this key]
    (-> this (.remove key))))

(defn get-successor-key
  "key - `K`

  returns: `K`"
  ([^ImmutableSortedMap this key]
    (-> this (.getSuccessorKey key))))

(defn iterator-from
  "key - `K`

  returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ImmutableSortedMap this key]
    (-> this (.iteratorFrom key))))

(defn reverse-iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ImmutableSortedMap this]
    (-> this (.reverseIterator))))

(defn get-comparator
  "returns: `java.util.Comparator<K>`"
  (^java.util.Comparator [^ImmutableSortedMap this]
    (-> this (.getComparator))))

(defn insert
  "key - `K`
  value - `V`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedMap<K,V>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedMap [^ImmutableSortedMap this key value]
    (-> this (.insert key value))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ImmutableSortedMap this]
    (-> this (.hashCode))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ImmutableSortedMap this]
    (-> this (.isEmpty))))

(defn get-max-key
  "returns: `K`"
  ([^ImmutableSortedMap this]
    (-> this (.getMaxKey))))

(defn size
  "returns: `int`"
  (^Integer [^ImmutableSortedMap this]
    (-> this (.size))))

(defn index-of
  "key - `K`

  returns: `int`"
  (^Integer [^ImmutableSortedMap this key]
    (-> this (.indexOf key))))

(defn contains-key
  "key - `K`

  returns: `boolean`"
  (^Boolean [^ImmutableSortedMap this key]
    (-> this (.containsKey key))))

(defn get
  "key - `K`

  returns: `V`"
  ([^ImmutableSortedMap this key]
    (-> this (.get key))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImmutableSortedMap this ^java.lang.Object o]
    (-> this (.equals o))))

(defn in-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$NodeVisitor`"
  ([^ImmutableSortedMap this ^com.google.cloud.firestore.collection.LLRBNode$NodeVisitor visitor]
    (-> this (.inOrderTraversal visitor))))

