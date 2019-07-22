(ns com.google.cloud.firestore.collection.ImmutableSortedSet
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection ImmutableSortedSet]))

(defn ->immutable-sorted-set
  "Constructor.

  elems - `java.util.List`
  comparator - `java.util.Comparator`"
  (^ImmutableSortedSet [^java.util.List elems ^java.util.Comparator comparator]
    (new ImmutableSortedSet elems comparator)))

(defn reverse-iterator-from
  "entry - `T`

  returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^ImmutableSortedSet this entry]
    (-> this (.reverseIteratorFrom entry))))

(defn get-max-entry
  "returns: `T`"
  ([^ImmutableSortedSet this]
    (-> this (.getMaxEntry))))

(defn contains
  "entry - `T`

  returns: `boolean`"
  (^Boolean [^ImmutableSortedSet this entry]
    (-> this (.contains entry))))

(defn iterator
  "returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^ImmutableSortedSet this]
    (-> this (.iterator))))

(defn remove
  "entry - `T`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedSet<T>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedSet [^ImmutableSortedSet this entry]
    (-> this (.remove entry))))

(defn iterator-from
  "entry - `T`

  returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^ImmutableSortedSet this entry]
    (-> this (.iteratorFrom entry))))

(defn reverse-iterator
  "returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^ImmutableSortedSet this]
    (-> this (.reverseIterator))))

(defn insert
  "entry - `T`

  returns: `com.google.cloud.firestore.collection.ImmutableSortedSet<T>`"
  (^com.google.cloud.firestore.collection.ImmutableSortedSet [^ImmutableSortedSet this entry]
    (-> this (.insert entry))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ImmutableSortedSet this]
    (-> this (.hashCode))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ImmutableSortedSet this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^ImmutableSortedSet this]
    (-> this (.size))))

(defn index-of
  "entry - `T`

  returns: `int`"
  (^Integer [^ImmutableSortedSet this entry]
    (-> this (.indexOf entry))))

(defn get-min-entry
  "returns: `T`"
  ([^ImmutableSortedSet this]
    (-> this (.getMinEntry))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImmutableSortedSet this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-predecessor-entry
  "entry - `T`

  returns: `T`"
  ([^ImmutableSortedSet this entry]
    (-> this (.getPredecessorEntry entry))))

