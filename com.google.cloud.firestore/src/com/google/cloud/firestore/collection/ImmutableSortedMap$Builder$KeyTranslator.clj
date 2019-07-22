(ns com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection ImmutableSortedMap$Builder$KeyTranslator]))

(defn translate
  "key - `C`

  returns: `D`"
  ([^ImmutableSortedMap$Builder$KeyTranslator this key]
    (-> this (.translate key))))

