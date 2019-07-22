(ns com.google.cloud.datastore.DatastoreOptions$DefaultDatastoreRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreOptions$DefaultDatastoreRpcFactory]))

(defn ->default-datastore-rpc-factory
  "Constructor."
  (^DatastoreOptions$DefaultDatastoreRpcFactory []
    (new DatastoreOptions$DefaultDatastoreRpcFactory )))

(defn create
  "options - `com.google.cloud.datastore.DatastoreOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^DatastoreOptions$DefaultDatastoreRpcFactory this ^com.google.cloud.datastore.DatastoreOptions options]
    (-> this (.create options))))

