(ns com.google.cloud.datastore.ProjectionEntityQuery
  "An implementation of a Google Cloud Datastore projection entity query that can be constructed by
  providing all the specific query elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ProjectionEntityQuery]))

(defn to-builder
  "returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder [^ProjectionEntityQuery this]
    (-> this (.toBuilder))))

