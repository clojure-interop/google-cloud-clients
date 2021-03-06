(ns com.google.cloud.datastore.Batch$Response
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Batch$Response]))

(defn get-generated-keys
  "Returns a list of keys generated by a batch.

  returns: `java.util.List<com.google.cloud.datastore.Key>`"
  (^java.util.List [^Batch$Response this]
    (-> this (.getGeneratedKeys))))

