(ns com.google.cloud.firestore.collection.RBTreeSortedMap
  "This is a red-black tree backed implementation of ImmutableSortedMap. This has better asymptotic
  complexity for large collections, but performs worse in practice than an ArraySortedMap for small
  collections. It also uses about twice as much memory.

  Note: This package is copied from https://github.com/firebase/firebase-admin-java/tree/master/
  src/main/java/com/google/firebase/database/collection"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection RBTreeSortedMap]))

(defn *build-from
  "keys - `java.util.List`
  values - `java.util.Map`
  translator - `com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator`
  comparator - `java.util.Comparator`

  returns: `<A,B,C> com.google.cloud.firestore.collection.RBTreeSortedMap<A,C>`"
  ([^java.util.List keys ^java.util.Map values ^com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator translator ^java.util.Comparator comparator]
    (RBTreeSortedMap/buildFrom keys values translator comparator)))

(defn *from-map
  "values - `java.util.Map`
  comparator - `java.util.Comparator`

  returns: `<A,B> com.google.cloud.firestore.collection.RBTreeSortedMap<A,B>`"
  ([^java.util.Map values ^java.util.Comparator comparator]
    (RBTreeSortedMap/fromMap values comparator)))

(defn reverse-iterator-from
  "key - `K`

  returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^RBTreeSortedMap this key]
    (-> this (.reverseIteratorFrom key))))

(defn get-min-key
  "returns: `K`"
  ([^RBTreeSortedMap this]
    (-> this (.getMinKey))))

(defn iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^RBTreeSortedMap this]
    (-> this (.iterator))))

(defn get-predecessor-key
  "key - `K`

  returns: `K`"
  ([^RBTreeSortedMap this key]
    (-> this (.getPredecessorKey key))))

(defn remove
  "key - `K`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedMap<K,V>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedMap [^RBTreeSortedMap this key]
    (-> this (.remove key))))

(defn get-successor-key
  "key - `K`

  returns: `K`"
  ([^RBTreeSortedMap this key]
    (-> this (.getSuccessorKey key))))

(defn iterator-from
  "key - `K`

  returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^RBTreeSortedMap this key]
    (-> this (.iteratorFrom key))))

(defn reverse-iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^RBTreeSortedMap this]
    (-> this (.reverseIterator))))

(defn get-comparator
  "returns: `java.util.Comparator<K>`"
  (^java.util.Comparator [^RBTreeSortedMap this]
    (-> this (.getComparator))))

(defn insert
  "key - `K`
  value - `V`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedMap<K,V>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedMap [^RBTreeSortedMap this key value]
    (-> this (.insert key value))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^RBTreeSortedMap this]
    (-> this (.isEmpty))))

(defn get-max-key
  "returns: `K`"
  ([^RBTreeSortedMap this]
    (-> this (.getMaxKey))))

(defn size
  "returns: `int`"
  (^Integer [^RBTreeSortedMap this]
    (-> this (.size))))

(defn index-of
  "key - `K`

  returns: `int`"
  (^Integer [^RBTreeSortedMap this key]
    (-> this (.indexOf key))))

(defn contains-key
  "key - `K`

  returns: `boolean`"
  (^Boolean [^RBTreeSortedMap this key]
    (-> this (.containsKey key))))

(defn get
  "key - `K`

  returns: `V`"
  ([^RBTreeSortedMap this key]
    (-> this (.get key))))

(defn in-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$NodeVisitor`"
  ([^RBTreeSortedMap this ^com.google.cloud.firestore.collection.LLRBNode$NodeVisitor visitor]
    (-> this (.inOrderTraversal visitor))))

