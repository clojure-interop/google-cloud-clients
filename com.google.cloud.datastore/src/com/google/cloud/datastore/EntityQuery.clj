(ns com.google.cloud.datastore.EntityQuery
  "An implementation of a Google Cloud Datastore entity query that can be constructed by providing
  all the specific query elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore EntityQuery]))

(defn to-builder
  "returns: `com.google.cloud.datastore.EntityQuery$Builder`"
  (^com.google.cloud.datastore.EntityQuery$Builder [^EntityQuery this]
    (-> this (.toBuilder))))

