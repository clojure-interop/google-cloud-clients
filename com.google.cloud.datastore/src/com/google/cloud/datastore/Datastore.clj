(ns com.google.cloud.datastore.Datastore
  "An interface for Google Cloud Datastore."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Datastore]))

(defn new-batch
  "Returns a new Batch for processing multiple write operations in one request.

   Example of starting a new batch.



   String keyName1 = \"my_key_name_1\";
   String keyName2 = \"my_key_name_2\";
   Key key1 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName1);
   Key key2 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName2);
   Batch batch = datastore.newBatch();
   Entity entity1 = Entity.newBuilder(key1).set(\"name\", \"John\").build();
   Entity entity2 = Entity.newBuilder(key2).set(\"title\", \"title\").build();
   batch.add(entity1);
   batch.add(entity2);
   batch.submit();

  returns: `com.google.cloud.datastore.Batch`"
  (^com.google.cloud.datastore.Batch [^Datastore this]
    (-> this (.newBatch))))

(defn fetch
  "Returns a list with a value for each given key (ordered by input). null values are
   returned for nonexistent keys. When possible prefer using DatastoreReader.get(Key...) to avoid eagerly
   loading the results. ReadOptions can be specified if desired.

   Example of fetching a list of Entity objects.



   String firstKeyName = \"my_first_key_name\";
   String secondKeyName = \"my_second_key_name\";
   KeyFactory keyFactory = datastore.newKeyFactory().setKind(\"MyKind\");
   Key firstKey = keyFactory.newKey(firstKeyName);
   Key secondKey = keyFactory.newKey(secondKeyName);
   List<Entity> entities = datastore.fetch(Lists.newArrayList(firstKey, secondKey));
   for (Entity entity : entities) {
     // do something with the entity
   }

  keys - `java.lang.Iterable`
  options - `com.google.cloud.datastore.ReadOption`

  returns: `java.util.List<com.google.cloud.datastore.Entity>`"
  (^java.util.List [^Datastore this ^java.lang.Iterable keys ^com.google.cloud.datastore.ReadOption options]
    (-> this (.fetch keys options))))

(defn new-transaction
  "Returns a new Datastore transaction.

  options - a transaction option indicating the mode of the transaction (read-only or read-write) - `com.google.datastore.v1.TransactionOptions`

  returns: `com.google.cloud.datastore.Transaction`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.cloud.datastore.Transaction [^Datastore this ^com.google.datastore.v1.TransactionOptions options]
    (-> this (.newTransaction options)))
  (^com.google.cloud.datastore.Transaction [^Datastore this]
    (-> this (.newTransaction))))

(defn delete
  "A datastore delete operation. It is OK to request the deletion of a non-existing key.

   Example of deleting multiple entities.



   String keyName1 = \"my_key_name1\";
   String keyName2 = \"my_key_name2\";
   Key key1 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName1);
   Key key2 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName2);
   datastore.delete(key1, key2);

  keys - `com.google.cloud.datastore.Key`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  ([^Datastore this ^com.google.cloud.datastore.Key keys]
    (-> this (.delete keys))))

(defn put
  "A Datastore put (a.k.a upsert) operation: inserts an entity if it does not exist, updates it
   otherwise. This method will automatically allocate an id if necessary.

   Example of putting a single entity.



   String keyName = \"my_key_name\";
   Key key = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName);
   Entity.Builder entityBuilder = Entity.newBuilder(key);
   entityBuilder.set(\"propertyName\", \"value\");
   Entity entity = entityBuilder.build();
   datastore.put(entity);

  entity - the entity to put - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.cloud.datastore.Entity [^Datastore this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.put entity))))

(defn run
  "Submits a Query and returns its result. ReadOptions can be specified if
   desired.

   Example of running a query to find all entities of one kind.



   String kind = \"my_kind\";
   StructuredQuery<Entity> query = Query.newEntityQueryBuilder()
       .setKind(kind)
       .build();
   QueryResults<Entity> results = datastore.run(query);
   List<Entity> entities = Lists.newArrayList();
   while (results.hasNext()) {
     Entity result = results.next();
     // do something with result
     entities.add(result);
   }

   Example of running a query to find all entities with a matching property value.



   String kind = \"my_kind\";
   String property = \"my_property\";
   String value = \"my_value\";
   StructuredQuery<Entity> query = Query.newEntityQueryBuilder()
       .setKind(kind)
       .setFilter(PropertyFilter.eq(property, value))
       .build();
   QueryResults<Entity> results = datastore.run(query);
   List<Entity> entities = Lists.newArrayList();
   while (results.hasNext()) {
     Entity result = results.next();
     // do something with result
     entities.add(result);
   }

  query - `com.google.cloud.datastore.Query`
  options - `com.google.cloud.datastore.ReadOption`

  returns: `<T> com.google.cloud.datastore.QueryResults<T>`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  ([^Datastore this ^com.google.cloud.datastore.Query query ^com.google.cloud.datastore.ReadOption options]
    (-> this (.run query options))))

(defn update
  "A Datastore update operation. The operation will fail if an entity with the same key does not
   already exist.

   Example of updating multiple entities.



   String keyName1 = \"my_key_name_1\";
   String keyName2 = \"my_key_name_2\";
   Key key1 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName1);
   Entity.Builder entityBuilder1 = Entity.newBuilder(key1);
   entityBuilder1.set(\"propertyName\", \"updatedValue1\");
   Entity entity1 = entityBuilder1.build();

   Key key2 = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName2);
   Entity.Builder entityBuilder2 = Entity.newBuilder(key2);
   entityBuilder2.set(\"propertyName\", \"updatedValue2\");
   Entity entity2 = entityBuilder2.build();

   datastore.update(entity1, entity2);

  entities - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  ([^Datastore this ^com.google.cloud.datastore.Entity entities]
    (-> this (.update entities))))

(defn new-key-factory
  "Returns a new KeyFactory for this service

   Example of creating a KeyFactory.



   KeyFactory keyFactory = datastore.newKeyFactory();

  returns: `com.google.cloud.datastore.KeyFactory`"
  (^com.google.cloud.datastore.KeyFactory [^Datastore this]
    (-> this (.newKeyFactory))))

(defn add
  "Datastore add operation: inserts the provided entity. This method will automatically allocate
   an id if necessary.

   If an entity for entity.getKey() does not exist, entity is inserted.
   Otherwise, a DatastoreException is thrown with BaseServiceException.getReason()
   equal to \"ALREADY_EXISTS\".

   Example of adding a single entity.



   String keyName = \"my_key_name\";
   Key key = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName);
   Entity.Builder entityBuilder = Entity.newBuilder(key);
   entityBuilder.set(\"propertyName\", \"value\");
   Entity entity = entityBuilder.build();
   try {
     datastore.add(entity);
   } catch (DatastoreException ex) {
     if (\"ALREADY_EXISTS\".equals(ex.getReason())) {
       // entity.getKey() already exists
     }
   }

  entity - the entity to add - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure or if an entity for entity.getKey() already exists"
  (^com.google.cloud.datastore.Entity [^Datastore this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.add entity))))

(defn run-in-transaction
  "Invokes the callback's Datastore.TransactionCallable.run(com.google.cloud.datastore.DatastoreReaderWriter) method with a DatastoreReaderWriter that is associated with a new transaction. The transaction will be
   committed upon successful invocation. Any thrown exception will cause the transaction to
   rollback and will be propagated as a DatastoreException with the original exception as
   its root cause. If TransactionOptions is set to read-write mode, previous transaction
   Id in the options will be automatically populated each time a transaction is retried.

   Example of running in a transaction.



   String callableResult = \"my_callable_result\";
   TransactionCallable<String> callable = new TransactionCallable<String>() {
     public String run(DatastoreReaderWriter readerWriter) {
       // use readerWriter to run in transaction
       return callableResult;
     }
   };

   TransactionOptions options = TransactionOptions.newBuilder()
       .setReadWrite(TransactionOptions.ReadWrite
           .getDefaultInstance())
       .build();

   String result = datastore.runInTransaction(callable, options);

  callable - the callback to call with a newly created transactional readerWriter - `com.google.cloud.datastore.Datastore$TransactionCallable`
  options - the Transaction options indicating whether the transaction mode is Read-only or Read-Write - `com.google.datastore.v1.TransactionOptions`

  returns: `<T> T`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  ([^Datastore this ^com.google.cloud.datastore.Datastore$TransactionCallable callable ^com.google.datastore.v1.TransactionOptions options]
    (-> this (.runInTransaction callable options)))
  ([^Datastore this ^com.google.cloud.datastore.Datastore$TransactionCallable callable]
    (-> this (.runInTransaction callable))))

(defn get
  "Returns an Entity for the given Key or null if it doesn't exist. ReadOptions can be specified if desired.

   Example of getting an entity.



   String keyName = \"my_key_name\";
   Key key = datastore.newKeyFactory().setKind(\"MyKind\").newKey(keyName);
   Entity entity = datastore.get(key);
   // Do something with the entity

  key - `com.google.cloud.datastore.Key`
  options - `com.google.cloud.datastore.ReadOption`

  returns: `com.google.cloud.datastore.Entity`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.cloud.datastore.Entity [^Datastore this ^com.google.cloud.datastore.Key key ^com.google.cloud.datastore.ReadOption options]
    (-> this (.get key options))))

(defn allocate-id
  "Allocate a unique id for the given key. The returned key will have the same information
   (projectId, kind, namespace and ancestors) as the given key and will have a newly assigned id.

   Example of allocating an id.



   KeyFactory keyFactory = datastore.newKeyFactory().setKind(\"MyKind\");
   IncompleteKey incompleteKey = keyFactory.newKey();

   // let cloud datastore automatically assign an id
   Key key = datastore.allocateId(incompleteKey);

  key - `com.google.cloud.datastore.IncompleteKey`

  returns: `com.google.cloud.datastore.Key`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.cloud.datastore.Key [^Datastore this ^com.google.cloud.datastore.IncompleteKey key]
    (-> this (.allocateId key))))

