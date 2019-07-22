(ns com.google.cloud.datastore.ReadOption$EventualConsistency
  "Specifies eventual consistency for reads from Datastore. Lookups and ancestor queries using
  this option permit Datastore to return stale results."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ReadOption$EventualConsistency]))

(defn eventual?
  "returns: `boolean`"
  (^Boolean [^ReadOption$EventualConsistency this]
    (-> this (.isEventual))))

