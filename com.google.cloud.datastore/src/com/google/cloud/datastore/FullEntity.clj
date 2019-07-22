(ns com.google.cloud.datastore.FullEntity
  "A full entity is a BaseEntity that holds all the properties associated with a Datastore
  entity (as opposed to ProjectionEntity)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore FullEntity]))

(defn *new-builder
  "key - `K`

  returns: `<K extends com.google.cloud.datastore.IncompleteKey> com.google.cloud.datastore.FullEntity$Builder<K>`"
  ([key]
    (FullEntity/newBuilder key))
  (^com.google.cloud.datastore.FullEntity$Builder []
    (FullEntity/newBuilder )))

