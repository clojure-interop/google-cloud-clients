(ns com.google.cloud.datastore.DatastoreReader
  "An interface to represent Google Cloud Datastore read operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreReader]))

(defn get
  "Returns an Entity for the given Key or null if it doesn't exist.

  key - `com.google.cloud.datastore.Key`

  returns: `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.cloud.datastore.Entity [^DatastoreReader this ^com.google.cloud.datastore.Key key]
    (-> this (.get key))))

(defn fetch
  "Returns a list with a value for each given key (ordered by input). null values are
   returned for nonexistent keys. When possible prefer using get(Key...) to avoid eagerly
   loading the results.

  keys - `com.google.cloud.datastore.Key`

  returns: `java.util.List<com.google.cloud.datastore.Entity>`"
  (^java.util.List [^DatastoreReader this ^com.google.cloud.datastore.Key keys]
    (-> this (.fetch keys))))

(defn run
  "Submits a Query and returns its result.

  query - `com.google.cloud.datastore.Query`

  returns: `<T> com.google.cloud.datastore.QueryResults<T>`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  ([^DatastoreReader this ^com.google.cloud.datastore.Query query]
    (-> this (.run query))))

