(ns com.google.cloud.datastore.DatastoreBatchWriter
  "An interface to represent a batch of write operations. All write operation for a batch writer
  will be applied to the Datastore in one RPC call."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreBatchWriter]))

(defn add-with-deferred-id-allocation
  "Datastore add operation. This method will also allocate id for any entity with an incomplete
   key. As opposed to add(FullEntity) and add(FullEntity...), this method will
   defer any necessary id allocation to submit time.

  entities - `com.google.cloud.datastore.FullEntity`

  throws: java.lang.IllegalArgumentException - if any of the given entities is missing a key"
  ([^DatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entities]
    (-> this (.addWithDeferredIdAllocation entities))))

(defn add
  "Datastore add operation: inserts the provided entity. This method will automatically allocate
   an id if necessary. If entity has a complete key and was already marked for deletion in this
   writer, the operation will be changed to put(com.google.cloud.datastore.FullEntity<?>).

  entity - the entity to add - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - if a given entity with the same complete key was already added to this writer, if writer is not active or if id allocation for an entity with an incomplete key failed"
  (^com.google.cloud.datastore.Entity [^DatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.add entity))))

(defn update
  "A Datastore update operation. The operation will fail if an entity with the same key does not
   already exist. This operation will be converted to put(com.google.cloud.datastore.FullEntity<?>) operation for entities that were
   already added or put in this writer.

  entities - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - if an entity is marked for deletion in this writer or if not active"
  ([^DatastoreBatchWriter this ^com.google.cloud.datastore.Entity entities]
    (-> this (.update entities))))

(defn delete
  "A datastore delete operation. It is OK to request the deletion of a non-existing key. This operation will also remove from this batch any prior writes for entities
   with the same keys.

  keys - `com.google.cloud.datastore.Key`

  throws: com.google.cloud.datastore.DatastoreException - if not active"
  ([^DatastoreBatchWriter this ^com.google.cloud.datastore.Key keys]
    (-> this (.delete keys))))

(defn put-with-deferred-id-allocation
  "Datastore put operation. This method will also allocate id for any entity with an incomplete
   key. As opposed to put(FullEntity) and put(FullEntity...), this method will
   defer any necessary id allocation to submit time.

  entities - `com.google.cloud.datastore.FullEntity`

  throws: java.lang.IllegalArgumentException - if any of the given entities is missing a key"
  ([^DatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entities]
    (-> this (.putWithDeferredIdAllocation entities))))

(defn put
  "A Datastore put (a.k.a upsert) operation: inserts an entity if it does not exist, updates it
   otherwise. This method will automatically allocate an id if necessary. This operation will also remove from this writer any prior writes for the same
   entity.

  entity - the entity to put - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - if not active or if id allocation for an entity with an incomplete key failed"
  (^com.google.cloud.datastore.Entity [^DatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.put entity))))

(defn active?
  "Returns true if still active (write operations were not sent to the Datastore).

  returns: `boolean`"
  (^Boolean [^DatastoreBatchWriter this]
    (-> this (.isActive))))

