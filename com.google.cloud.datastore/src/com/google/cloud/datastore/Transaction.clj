(ns com.google.cloud.datastore.Transaction
  "A Google cloud datastore transaction. Similar to Batch any write operation that is
  applied on a transaction will only be sent to the Datastore upon commit(). A call to
  rollback() will invalidate the transaction and discard the changes. Any read operation
  that is done by a transaction will be part of it and therefore a commit is guaranteed to
  fail if an entity was modified outside of the transaction after it was read. Write operation on
  this transaction will not be reflected by read operation (as the changes are only sent to the
  Datastore upon commit. A usage example:



  Transaction transaction = datastore.newTransaction();
  try {
    Entity entity = transaction.get(key);
    if (!entity.contains(\"last_name\") || entity.isNull(\"last_name\")) {
      String[] name = entity.getString(\"name\").split(\" \");
      entity = Entity.newBuilder(entity)
          .remove(\"name\")
          .set(\"first_name\", name[0])
          .set(\"last_name\", name[1])
          .build();
      transaction.update(entity);
      transaction.commit();
    }
  } finally {
    if (transaction.isActive()) {
      transaction.rollback();
    }
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Transaction]))

(defn fetch
  "Returns a list with a value for each given key (ordered by input). null values are
   returned for nonexistent keys. When possible prefer using DatastoreReader.get(Key...) to avoid eagerly
   loading the results. The requested entities will be part of this Datastore transaction (so a commit is
   guaranteed to fail if any of the entities was changed by others after they were seen by this
   transaction) but any write changes in this transaction will not be reflected by the returned
   entities.

   Example of fetching a list of entities for several keys.



   String firstKeyName = \"my_first_key_name\";
   String secondKeyName = \"my_second_key_name\";
   KeyFactory keyFactory = datastore.newKeyFactory().setKind(\"MyKind\");
   Key firstKey = keyFactory.newKey(firstKeyName);
   Key secondKey = keyFactory.newKey(secondKeyName);
   List<Entity> entities = transaction.fetch(firstKey, secondKey);
   for (Entity entity : entities) {
     // do something with the entity
   }
   transaction.commit();

  keys - `com.google.cloud.datastore.Key`

  returns: `java.util.List<com.google.cloud.datastore.Entity>`

  throws: com.google.cloud.datastore.DatastoreException - upon failure or if no longer active"
  (^java.util.List [^Transaction this ^com.google.cloud.datastore.Key keys]
    (-> this (.fetch keys))))

(defn active?
  "Returns true if the transaction is still active (was not committed or rolledback).

   Example of verifying if a transaction is active.



   // create an entity
   KeyFactory keyFactory = datastore.newKeyFactory().setKind(\"MyKind\");
   Key key = datastore.allocateId(keyFactory.newKey());
   Entity entity = Entity.newBuilder(key).set(\"description\", \"active()\").build();
   // calling transaction.active() now would return true
   try {
     // add the entity and commit
     transaction.put(entity);
     transaction.commit();
   } finally {
     // if committing succeeded
     // then transaction.active() will be false
     if (transaction.isActive()) {
       // otherwise it's true and we need to rollback
       transaction.rollback();
     }
   }

  returns: `boolean`"
  (^Boolean [^Transaction this]
    (-> this (.isActive))))

(defn delete
  "A datastore delete operation. It is OK to request the deletion of a non-existing key. This operation will also remove from this batch any prior writes for entities
   with the same keys. This operation will also remove from this transaction any prior writes for
   entities with the same keys.

   Example of deleting multiple entities.



   String keyName1 = \"my_key_name1\";
   String keyName2 = \"my_key_name2\";
   Key key1 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName1);
   Key key2 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName2);
   transaction.delete(key1, key2);
   transaction.commit();

  keys - `com.google.cloud.datastore.Key`

  throws: com.google.cloud.datastore.DatastoreException - upon failure or if no longer active"
  ([^Transaction this ^com.google.cloud.datastore.Key keys]
    (-> this (.delete keys))))

(defn put
  "A Datastore put (a.k.a upsert) operation: inserts an entity if it does not exist, updates it
   otherwise. This method will automatically allocate an id if necessary. This operation will also remove from this writer any prior writes for the same
   entity. This operation will also remove from this transaction any prior writes for the
   same entity.

   Example of putting a single entity.



   String keyName = \"my_key_name\";
   Key key = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName);
   Entity.Builder entityBuilder = Entity.newBuilder(key);
   entityBuilder.set(\"propertyName\", \"value\");
   Entity entity = entityBuilder.build();
   transaction.put(entity);
   transaction.commit();

  entity - the entity to put - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - if id allocation for an entity with an incomplete key failed or if the transaction is no longer active"
  (^com.google.cloud.datastore.Entity [^Transaction this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.put entity))))

(defn run
  "Submits a Query and returns its result. The entities returned by the result of this query will be part of this Datastore
   transaction (so a commit is guaranteed to fail if any of the entities was changed by others
   after the query was performed) but any write changes in this transaction will not be reflected
   by the result.

   Example of running a query to find all entities with an ancestor.



   String parentKeyName = \"my_parent_key_name\";
   KeyFactory keyFactory = datastore.newKeyFactory().setKind(\"ParentKind\");
   Key parentKey = keyFactory.newKey(parentKeyName);
   // Build a query
   Query<Entity> query = Query.newEntityQueryBuilder()
       .setKind(\"MyKind\")
       .setFilter(PropertyFilter.hasAncestor(parentKey))
       .build();
   QueryResults<Entity> results = transaction.run(query);
   List<Entity> entities = Lists.newArrayList();
   while (results.hasNext()) {
     Entity result = results.next();
     // do something with result
     entities.add(result);
   }
   transaction.commit();

  query - `com.google.cloud.datastore.Query`

  returns: `<T> com.google.cloud.datastore.QueryResults<T>`

  throws: com.google.cloud.datastore.DatastoreException - upon failure or if no longer active"
  ([^Transaction this ^com.google.cloud.datastore.Query query]
    (-> this (.run query))))

(defn update
  "A Datastore update operation. The operation will fail if an entity with the same key does not
   already exist. This operation will be converted to DatastoreBatchWriter.put(com.google.cloud.datastore.FullEntity<?>) operation for entities that were
   already added or put in this writer. This operation will be converted to put(com.google.cloud.datastore.FullEntity<?>) operation for entities that were
   already added or put in this writer.

   Example of updating multiple entities.



   String keyName1 = \"my_key_name1\";
   String keyName2 = \"my_key_name2\";
   Key key1 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName1);
   Entity.Builder entityBuilder1 = Entity.newBuilder(key1);
   entityBuilder1.set(\"propertyName\", \"value3\");
   Entity entity1 = entityBuilder1.build();

   Key key2 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName2);
   Entity.Builder entityBuilder2 = Entity.newBuilder(key2);
   entityBuilder2.set(\"propertyName\", \"value4\");
   Entity entity2 = entityBuilder2.build();

   transaction.update(entity1, entity2);
   transaction.commit();

  entities - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - if an entity is marked for deletion in this transaction or if the transaction is no longer active"
  ([^Transaction this ^com.google.cloud.datastore.Entity entities]
    (-> this (.update entities))))

(defn commit
  "Commit the transaction.

   Example of committing a transaction.



   // create an entity
   KeyFactory keyFactory = datastore.newKeyFactory().setKind(\"MyKind\");
   Key key = datastore.allocateId(keyFactory.newKey());
   Entity entity = Entity.newBuilder(key).set(\"description\", \"commit()\").build();

   // add the entity and commit
   try {
     transaction.put(entity);
     transaction.commit();
   } catch (DatastoreException ex) {
     // handle exception
   }

  returns: `com.google.cloud.datastore.Transaction$Response`

  throws: com.google.cloud.datastore.DatastoreException - if could not commit the transaction or if no longer active"
  (^com.google.cloud.datastore.Transaction$Response [^Transaction this]
    (-> this (.commit))))

(defn get-transaction-id
  "returns: `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^Transaction this]
    (-> this (.getTransactionId))))

(defn get-datastore
  "Returns the transaction associated Datastore.

  returns: `com.google.cloud.datastore.Datastore`"
  (^com.google.cloud.datastore.Datastore [^Transaction this]
    (-> this (.getDatastore))))

(defn rollback
  "Rollback the transaction.

   Example of rolling back a transaction.



   // create an entity
   KeyFactory keyFactory = datastore.newKeyFactory().setKind(\"MyKind\");
   Key key = datastore.allocateId(keyFactory.newKey());
   Entity entity = Entity.newBuilder(key).set(\"description\", \"rollback()\").build();

   // add the entity and rollback
   transaction.put(entity);
   transaction.rollback();
   // calling transaction.commit() now would fail

  throws: com.google.cloud.datastore.DatastoreException - if transaction was already committed"
  ([^Transaction this]
    (-> this (.rollback))))

(defn add
  "Datastore add operation: inserts the provided entity. This method will automatically allocate
   an id if necessary. If entity has a complete key and was already marked for deletion in this
   writer, the operation will be changed to DatastoreBatchWriter.put(com.google.cloud.datastore.FullEntity<?>).

   Example of adding a single entity.



   String keyName = \"my_key_name\";
   Key key = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName);
   Entity.Builder entityBuilder = Entity.newBuilder(key);
   entityBuilder.set(\"propertyName\", \"value\");
   Entity entity = entityBuilder.build();
   transaction.add(entity);
   transaction.commit();

  entity - the entity to add - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - if a given entity with the same complete key was already added to this writer, if the transaction is no longer active or if id allocation for an entity with an incomplete key failed"
  (^com.google.cloud.datastore.Entity [^Transaction this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.add entity))))

(defn put-with-deferred-id-allocation
  "Datastore put operation. This method will also allocate id for any entity with an incomplete
   key. As opposed to put(FullEntity) and put(FullEntity...), this method will
   defer any necessary id allocation to commit time.

   Example of putting multiple entities with deferred id allocation.



   IncompleteKey key1 = datastore.newKeyFactory().setKind(\"MyKind\").newKey();
   FullEntity.Builder entityBuilder1 = FullEntity.newBuilder(key1);
   entityBuilder1.set(\"propertyName\", \"value1\");
   FullEntity entity1 = entityBuilder1.build();

   IncompleteKey key2 = datastore.newKeyFactory().setKind(\"MyKind\").newKey();
   FullEntity.Builder entityBuilder2 = FullEntity.newBuilder(key2);
   entityBuilder2.set(\"propertyName\", \"value2\");
   FullEntity entity2 = entityBuilder2.build();

   transaction.putWithDeferredIdAllocation(entity1, entity2);
   Response response = transaction.commit();

  entities - `com.google.cloud.datastore.FullEntity`

  throws: java.lang.IllegalArgumentException - if any of the given entities is missing a key"
  ([^Transaction this ^com.google.cloud.datastore.FullEntity entities]
    (-> this (.putWithDeferredIdAllocation entities))))

(defn add-with-deferred-id-allocation
  "Datastore add operation. This method will also allocate id for any entity with an incomplete
   key. As opposed to add(FullEntity) and add(FullEntity...), this method will
   defer any necessary id allocation to commit time.

   Example of adding multiple entities with deferred id allocation.



   IncompleteKey key1 = datastore.newKeyFactory().setKind(\"MyKind\").newKey();
   FullEntity.Builder entityBuilder1 = FullEntity.newBuilder(key1);
   entityBuilder1.set(\"propertyName\", \"value1\");
   FullEntity entity1 = entityBuilder1.build();

   IncompleteKey key2 = datastore.newKeyFactory().setKind(\"MyKind\").newKey();
   FullEntity.Builder entityBuilder2 = FullEntity.newBuilder(key2);
   entityBuilder2.set(\"propertyName\", \"value2\");
   FullEntity entity2 = entityBuilder2.build();

   transaction.addWithDeferredIdAllocation(entity1, entity2);
   Response response = transaction.commit();

  entities - `com.google.cloud.datastore.FullEntity`

  throws: com.google.cloud.datastore.DatastoreException - if a given entity with a complete key was already added to this transaction or if the transaction is no longer active"
  ([^Transaction this ^com.google.cloud.datastore.FullEntity entities]
    (-> this (.addWithDeferredIdAllocation entities))))

(defn get
  "Returns an Entity for the given Key or null if it doesn't exist. The requested entity will be part of this Datastore transaction (so a commit is
   guaranteed to fail if entity was changed by others after it was seen by this transaction) but
   any write changes in this transaction will not be reflected by the returned entity.

   Example of getting an entity for a given key.



   String keyName = \"my_key_name\";
   Key key = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName);
   Entity entity = transaction.get(key);
   transaction.commit();
   // Do something with the entity

  key - `com.google.cloud.datastore.Key`

  returns: `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure or if no longer active"
  (^com.google.cloud.datastore.Entity [^Transaction this ^com.google.cloud.datastore.Key key]
    (-> this (.get key))))

