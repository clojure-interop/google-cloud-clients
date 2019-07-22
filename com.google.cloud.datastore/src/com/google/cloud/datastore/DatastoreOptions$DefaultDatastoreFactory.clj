(ns com.google.cloud.datastore.DatastoreOptions$DefaultDatastoreFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreOptions$DefaultDatastoreFactory]))

(defn ->default-datastore-factory
  "Constructor."
  (^DatastoreOptions$DefaultDatastoreFactory []
    (new DatastoreOptions$DefaultDatastoreFactory )))

(defn create
  "options - `com.google.cloud.datastore.DatastoreOptions`

  returns: `com.google.cloud.datastore.Datastore`"
  (^com.google.cloud.datastore.Datastore [^DatastoreOptions$DefaultDatastoreFactory this ^com.google.cloud.datastore.DatastoreOptions options]
    (-> this (.create options))))

