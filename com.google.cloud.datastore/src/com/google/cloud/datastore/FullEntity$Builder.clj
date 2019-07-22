(ns com.google.cloud.datastore.FullEntity$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore FullEntity$Builder]))

(defn build
  "returns: `com.google.cloud.datastore.FullEntity<K>`"
  (^com.google.cloud.datastore.FullEntity [^FullEntity$Builder this]
    (-> this (.build))))

