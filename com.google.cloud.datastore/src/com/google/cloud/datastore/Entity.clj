(ns com.google.cloud.datastore.Entity
  "An entity is the Google Cloud Datastore persistent data object for a specific key. An entity will
  always have a complete Key."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Entity]))

(defn *new-builder
  "key - `com.google.cloud.datastore.Key`
  copy-from - `com.google.cloud.datastore.FullEntity`

  returns: `com.google.cloud.datastore.Entity$Builder`"
  (^com.google.cloud.datastore.Entity$Builder [^com.google.cloud.datastore.Key key ^com.google.cloud.datastore.FullEntity copy-from]
    (Entity/newBuilder key copy-from))
  (^com.google.cloud.datastore.Entity$Builder [^com.google.cloud.datastore.Key key]
    (Entity/newBuilder key)))

