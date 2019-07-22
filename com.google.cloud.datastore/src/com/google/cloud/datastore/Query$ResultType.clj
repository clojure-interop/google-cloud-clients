(ns com.google.cloud.datastore.Query$ResultType
  "This class represents the expected type of the result. ENTITY: A full entity represented by
  Entity. PROJECTION_ENTITY: A projection entity, represented by ProjectionEntity. KEY: An entity's Key."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Query$ResultType]))

(def *-entity
  "Static Constant.

  type: com.google.cloud.datastore.Query$ResultType<com.google.cloud.datastore.Entity>"
  Query$ResultType/ENTITY)

(def *-key
  "Static Constant.

  type: com.google.cloud.datastore.Query$ResultType<com.google.cloud.datastore.Key>"
  Query$ResultType/KEY)

(def *-projection-entity
  "Static Constant.

  type: com.google.cloud.datastore.Query$ResultType<com.google.cloud.datastore.ProjectionEntity>"
  Query$ResultType/PROJECTION_ENTITY)

(defn result-class
  "returns: `java.lang.Class<V>`"
  (^java.lang.Class [^Query$ResultType this]
    (-> this (.resultClass))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Query$ResultType this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Query$ResultType this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Query$ResultType this]
    (-> this (.toString))))

