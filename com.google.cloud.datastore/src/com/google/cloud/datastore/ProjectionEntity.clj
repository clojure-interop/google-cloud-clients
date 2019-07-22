(ns com.google.cloud.datastore.ProjectionEntity
  "A projection entity is a result of a Google Cloud Datastore projection query. A projection entity
  holds one or more properties, represented by a name (as String) and a value (as Value), and may have a Key."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ProjectionEntity]))

(defn *new-builder
  "copy-from - `com.google.cloud.datastore.ProjectionEntity`

  returns: `com.google.cloud.datastore.ProjectionEntity$Builder`"
  (^com.google.cloud.datastore.ProjectionEntity$Builder [^com.google.cloud.datastore.ProjectionEntity copy-from]
    (ProjectionEntity/newBuilder copy-from)))

(defn get-timestamp
  "Description copied from class: BaseEntity

  name - `java.lang.String`

  returns: `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^ProjectionEntity this ^java.lang.String name]
    (-> this (.getTimestamp name))))

(defn get-blob
  "Description copied from class: BaseEntity

  name - `java.lang.String`

  returns: `com.google.cloud.datastore.Blob`"
  (^com.google.cloud.datastore.Blob [^ProjectionEntity this ^java.lang.String name]
    (-> this (.getBlob name))))

