(ns com.google.cloud.firestore.collection.ImmutableSortedMap$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection ImmutableSortedMap$Builder]))

(defn ->builder
  "Constructor."
  (^ImmutableSortedMap$Builder []
    (new ImmutableSortedMap$Builder )))

(defn *empty-map
  "comparator - `java.util.Comparator`

  returns: `<K,V> com.google.cloud.firestore.collection.ImmutableSortedMap<K,V>`"
  ([^java.util.Comparator comparator]
    (ImmutableSortedMap$Builder/emptyMap comparator)))

(defn *identity-translator
  "returns: `<A> com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator<A,A>`"
  ([]
    (ImmutableSortedMap$Builder/identityTranslator )))

(defn *from-map
  "values - `java.util.Map`
  comparator - `java.util.Comparator`

  returns: `<A,B> com.google.cloud.firestore.collection.ImmutableSortedMap<A,B>`"
  ([^java.util.Map values ^java.util.Comparator comparator]
    (ImmutableSortedMap$Builder/fromMap values comparator)))

(defn *build-from
  "keys - `java.util.List`
  values - `java.util.Map`
  translator - `com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator`
  comparator - `java.util.Comparator`

  returns: `<A,B,C> com.google.cloud.firestore.collection.ImmutableSortedMap<A,C>`"
  ([^java.util.List keys ^java.util.Map values ^com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator translator ^java.util.Comparator comparator]
    (ImmutableSortedMap$Builder/buildFrom keys values translator comparator)))

