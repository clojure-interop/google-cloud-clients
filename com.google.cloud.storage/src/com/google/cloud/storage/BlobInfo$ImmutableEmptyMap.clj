(ns com.google.cloud.storage.BlobInfo$ImmutableEmptyMap
  "This class is meant for internal use only. Users are discouraged from using this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BlobInfo$ImmutableEmptyMap]))

(defn ->immutable-empty-map
  "Constructor."
  (^BlobInfo$ImmutableEmptyMap []
    (new BlobInfo$ImmutableEmptyMap )))

(defn entry-set
  "returns: `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^BlobInfo$ImmutableEmptyMap this]
    (-> this (.entrySet))))

