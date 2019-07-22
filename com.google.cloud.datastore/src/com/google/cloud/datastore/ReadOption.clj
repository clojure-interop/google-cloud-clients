(ns com.google.cloud.datastore.ReadOption
  "Specifies options for read operations in Datastore, namely getting/fetching entities and running
  queries."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ReadOption]))

(defn *eventual-consistency
  "Returns a ReadOption that specifies eventual consistency, allowing Datastore to return
   stale results from gets, fetches, and ancestor queries.

  returns: `com.google.cloud.datastore.ReadOption$EventualConsistency`"
  (^com.google.cloud.datastore.ReadOption$EventualConsistency []
    (ReadOption/eventualConsistency )))

