(ns com.google.cloud.datastore.DatastoreWriter
  "An interface to represent Google Cloud Datastore write operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreWriter]))

(defn add
  "Datastore add operation: inserts the provided entity. This method will automatically allocate
   an id if necessary.

  entity - the entity to add - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.cloud.datastore.Entity [^DatastoreWriter this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.add entity))))

(defn update
  "A Datastore update operation. The operation will fail if an entity with the same key does not
   already exist.

  entities - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  ([^DatastoreWriter this ^com.google.cloud.datastore.Entity entities]
    (-> this (.update entities))))

(defn put
  "A Datastore put (a.k.a upsert) operation: inserts an entity if it does not exist, updates it
   otherwise. This method will automatically allocate an id if necessary.

  entity - the entity to put - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.cloud.datastore.Entity [^DatastoreWriter this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.put entity))))

(defn delete
  "A datastore delete operation. It is OK to request the deletion of a non-existing key.

  keys - `com.google.cloud.datastore.Key`"
  ([^DatastoreWriter this ^com.google.cloud.datastore.Key keys]
    (-> this (.delete keys))))

