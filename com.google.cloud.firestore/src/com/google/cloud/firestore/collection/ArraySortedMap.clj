(ns com.google.cloud.firestore.collection.ArraySortedMap
  "This is an array backed implementation of ImmutableSortedMap. It uses arrays and linear lookups
  to achieve good memory efficiency while maintaining good performance for small collections. To
  avoid degrading performance with increasing collection size it will automatically convert to a
  RBTreeSortedMap after an insert call above a certain threshold.

  Note: This package is copied from https://github.com/firebase/firebase-admin-java/tree/master/
  src/main/java/com/google/firebase/database/collection"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection ArraySortedMap]))

(defn ->array-sorted-map
  "Constructor.

  comparator - `java.util.Comparator`"
  (^ArraySortedMap [^java.util.Comparator comparator]
    (new ArraySortedMap comparator)))

(defn *build-from
  "keys - `java.util.List`
  values - `java.util.Map`
  translator - `com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator`
  comparator - `java.util.Comparator`

  returns: `<A,B,C> com.google.cloud.firestore.collection.ArraySortedMap<A,C>`"
  ([^java.util.List keys ^java.util.Map values ^com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator translator ^java.util.Comparator comparator]
    (ArraySortedMap/buildFrom keys values translator comparator)))

(defn *from-map
  "map - `java.util.Map`
  comparator - `java.util.Comparator`

  returns: `<K,V> com.google.cloud.firestore.collection.ArraySortedMap<K,V>`"
  ([^java.util.Map map ^java.util.Comparator comparator]
    (ArraySortedMap/fromMap map comparator)))

(defn reverse-iterator-from
  "key - `K`

  returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ArraySortedMap this key]
    (-> this (.reverseIteratorFrom key))))

(defn get-min-key
  "returns: `K`"
  ([^ArraySortedMap this]
    (-> this (.getMinKey))))

(defn iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ArraySortedMap this]
    (-> this (.iterator))))

(defn get-predecessor-key
  "key - `K`

  returns: `K`"
  ([^ArraySortedMap this key]
    (-> this (.getPredecessorKey key))))

(defn remove
  "key - `K`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedMap<K,V>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedMap [^ArraySortedMap this key]
    (-> this (.remove key))))

(defn get-successor-key
  "key - `K`

  returns: `K`"
  ([^ArraySortedMap this key]
    (-> this (.getSuccessorKey key))))

(defn iterator-from
  "key - `K`

  returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ArraySortedMap this key]
    (-> this (.iteratorFrom key))))

(defn reverse-iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^ArraySortedMap this]
    (-> this (.reverseIterator))))

(defn get-comparator
  "returns: `java.util.Comparator<K>`"
  (^java.util.Comparator [^ArraySortedMap this]
    (-> this (.getComparator))))

(defn insert
  "key - `K`
  value - `V`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedMap<K,V>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedMap [^ArraySortedMap this key value]
    (-> this (.insert key value))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ArraySortedMap this]
    (-> this (.isEmpty))))

(defn get-max-key
  "returns: `K`"
  ([^ArraySortedMap this]
    (-> this (.getMaxKey))))

(defn size
  "returns: `int`"
  (^Integer [^ArraySortedMap this]
    (-> this (.size))))

(defn index-of
  "key - `K`

  returns: `int`"
  (^Integer [^ArraySortedMap this key]
    (-> this (.indexOf key))))

(defn contains-key
  "key - `K`

  returns: `boolean`"
  (^Boolean [^ArraySortedMap this key]
    (-> this (.containsKey key))))

(defn get
  "key - `K`

  returns: `V`"
  ([^ArraySortedMap this key]
    (-> this (.get key))))

(defn in-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$NodeVisitor`"
  ([^ArraySortedMap this ^com.google.cloud.firestore.collection.LLRBNode$NodeVisitor visitor]
    (-> this (.inOrderTraversal visitor))))

