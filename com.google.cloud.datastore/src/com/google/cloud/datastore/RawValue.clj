(ns com.google.cloud.datastore.RawValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore RawValue]))

(defn to-builder
  "returns: `com.google.cloud.datastore.RawValue$Builder`"
  (^com.google.cloud.datastore.RawValue$Builder [^RawValue this]
    (-> this (.toBuilder))))

