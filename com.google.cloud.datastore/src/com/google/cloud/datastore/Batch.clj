(ns com.google.cloud.datastore.Batch
  "An interface to represent a batch of write operations. Any write operation that is applied on a
  batch will only be sent to the Datastore upon submit(). A usage example:



  Entity entity1 = datastore.get(key1);
  Batch batch = datastore.newBatch();
  Entity entity2 = Entity.newBuilder(key2).set(\"name\", \"John\").build();
  entity1 = Entity.newBuilder(entity1).clear().setNull(\"bla\").build();
  Entity entity3 = Entity.newBuilder(key3).set(\"title\", \"title\").build();
  batch.update(entity1);
  batch.add(entity2, entity3);
  batch.submit();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Batch]))

(defn add
  "Datastore add operation: inserts the provided entity. This method will automatically allocate
   an id if necessary. If entity has a complete key and was already marked for deletion in this
   writer, the operation will be changed to DatastoreBatchWriter.put(com.google.cloud.datastore.FullEntity<?>).

   If an entity for entity.getKey() does not exists, entity is inserted.
   Otherwise, submit() will throw a DatastoreException with BaseServiceException.getReason() equal to \"ALREADY_EXISTS\".

  entity - the entity to add - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`"
  (^com.google.cloud.datastore.Entity [^Batch this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.add entity))))

(defn submit
  "Submit the batch to the Datastore.

  returns: `com.google.cloud.datastore.Batch$Response`

  throws: com.google.cloud.datastore.DatastoreException - if there was any failure or if batch is not longer active"
  (^com.google.cloud.datastore.Batch$Response [^Batch this]
    (-> this (.submit))))

(defn get-datastore
  "Returns the batch associated Datastore.

  returns: `com.google.cloud.datastore.Datastore`"
  (^com.google.cloud.datastore.Datastore [^Batch this]
    (-> this (.getDatastore))))

