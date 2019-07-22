(ns com.google.cloud.firestore.collection.StandardComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection StandardComparator]))

(defn *get-comparator
  "clazz - `java.lang.Class`

  returns: `<T extends java.lang.Comparable<T>> com.google.cloud.firestore.collection.StandardComparator<T>`"
  ([^java.lang.Class clazz]
    (StandardComparator/getComparator clazz)))

(defn compare
  "o-1 - `A`
  o-2 - `A`

  returns: `int`"
  (^Integer [^StandardComparator this o-1 o-2]
    (-> this (.compare o-1 o-2))))

