(ns com.google.cloud.datastore.IncompleteKey$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore IncompleteKey$Builder]))

(defn build
  "returns: `com.google.cloud.datastore.IncompleteKey`"
  (^com.google.cloud.datastore.IncompleteKey [^IncompleteKey$Builder this]
    (-> this (.build))))

