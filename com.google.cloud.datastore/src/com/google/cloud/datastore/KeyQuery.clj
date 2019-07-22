(ns com.google.cloud.datastore.KeyQuery
  "An implementation of a Google Cloud Datastore key-only query that can be constructed by providing
  all the specific query elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore KeyQuery]))

(defn to-builder
  "returns: `com.google.cloud.datastore.KeyQuery$Builder`"
  (^com.google.cloud.datastore.KeyQuery$Builder [^KeyQuery this]
    (-> this (.toBuilder))))

