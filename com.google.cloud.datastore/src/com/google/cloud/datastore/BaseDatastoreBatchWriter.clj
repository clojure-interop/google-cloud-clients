(ns com.google.cloud.datastore.BaseDatastoreBatchWriter
  "Base class for DatastoreBatchWriter."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore BaseDatastoreBatchWriter]))

(defn add-with-deferred-id-allocation
  "Description copied from interface: DatastoreBatchWriter

  entities - `com.google.cloud.datastore.FullEntity`"
  ([^BaseDatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entities]
    (-> this (.addWithDeferredIdAllocation entities))))

(defn add
  "Description copied from interface: DatastoreBatchWriter

  entity - the entity to add - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`"
  (^com.google.cloud.datastore.Entity [^BaseDatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.add entity))))

(defn update
  "Description copied from interface: DatastoreBatchWriter

  entities - `com.google.cloud.datastore.Entity`"
  ([^BaseDatastoreBatchWriter this ^com.google.cloud.datastore.Entity entities]
    (-> this (.update entities))))

(defn put
  "Description copied from interface: DatastoreBatchWriter

  entity - the entity to put - `com.google.cloud.datastore.FullEntity`

  returns: an Entity with the same properties and a key that is either newly allocated or
       the same one if key is already complete - `com.google.cloud.datastore.Entity`"
  (^com.google.cloud.datastore.Entity [^BaseDatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entity]
    (-> this (.put entity))))

(defn put-with-deferred-id-allocation
  "Description copied from interface: DatastoreBatchWriter

  entities - `com.google.cloud.datastore.FullEntity`"
  ([^BaseDatastoreBatchWriter this ^com.google.cloud.datastore.FullEntity entities]
    (-> this (.putWithDeferredIdAllocation entities))))

(defn delete
  "Description copied from interface: DatastoreBatchWriter

  keys - `com.google.cloud.datastore.Key`"
  ([^BaseDatastoreBatchWriter this ^com.google.cloud.datastore.Key keys]
    (-> this (.delete keys))))

(defn active?
  "Description copied from interface: DatastoreBatchWriter

  returns: `boolean`"
  (^Boolean [^BaseDatastoreBatchWriter this]
    (-> this (.isActive))))

