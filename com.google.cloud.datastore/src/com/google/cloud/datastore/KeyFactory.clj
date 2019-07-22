(ns com.google.cloud.datastore.KeyFactory
  "A helper for creating keys for a specific Datastore, using its associated projectId and
  namespace."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore KeyFactory]))

(defn ->key-factory
  "Constructor.

  project-id - `java.lang.String`
  namespace - `java.lang.String`"
  (^KeyFactory [^java.lang.String project-id ^java.lang.String namespace]
    (new KeyFactory project-id namespace))
  (^KeyFactory [^java.lang.String project-id]
    (new KeyFactory project-id)))

(defn new-key
  "name - `java.lang.String`

  returns: `com.google.cloud.datastore.Key`"
  (^com.google.cloud.datastore.Key [^KeyFactory this ^java.lang.String name]
    (-> this (.newKey name)))
  (^com.google.cloud.datastore.IncompleteKey [^KeyFactory this]
    (-> this (.newKey))))

(defn reset
  "Resets the KeyFactory to its initial state.

  returns: this for chaining - `com.google.cloud.datastore.KeyFactory`"
  (^com.google.cloud.datastore.KeyFactory [^KeyFactory this]
    (-> this (.reset))))

