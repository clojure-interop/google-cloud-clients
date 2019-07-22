(ns com.google.cloud.datastore.EntityValue
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore EntityValue]))

(defn ->entity-value
  "Constructor.

  entity - `com.google.cloud.datastore.FullEntity`"
  (^EntityValue [^com.google.cloud.datastore.FullEntity entity]
    (new EntityValue entity)))

(defn *of
  "entity - `com.google.cloud.datastore.FullEntity`

  returns: `com.google.cloud.datastore.EntityValue`"
  (^com.google.cloud.datastore.EntityValue [^com.google.cloud.datastore.FullEntity entity]
    (EntityValue/of entity)))

(defn *new-builder
  "entity - `com.google.cloud.datastore.FullEntity`

  returns: `com.google.cloud.datastore.EntityValue$Builder`"
  (^com.google.cloud.datastore.EntityValue$Builder [^com.google.cloud.datastore.FullEntity entity]
    (EntityValue/newBuilder entity)))

(defn to-builder
  "returns: `com.google.cloud.datastore.EntityValue$Builder`"
  (^com.google.cloud.datastore.EntityValue$Builder [^EntityValue this]
    (-> this (.toBuilder))))

