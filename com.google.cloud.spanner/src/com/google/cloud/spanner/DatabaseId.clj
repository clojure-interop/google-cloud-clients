(ns com.google.cloud.spanner.DatabaseId
  "Represents an id of a Cloud Spanner database resource."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner DatabaseId]))

(defn *of
  "Creates a DatabaseId given project, instance and database IDs.

  project - `java.lang.String`
  instance - `java.lang.String`
  database - `java.lang.String`

  returns: `com.google.cloud.spanner.DatabaseId`"
  (^com.google.cloud.spanner.DatabaseId [^java.lang.String project ^java.lang.String instance ^java.lang.String database]
    (DatabaseId/of project instance database))
  (^com.google.cloud.spanner.DatabaseId [^com.google.cloud.spanner.InstanceId instance-id ^java.lang.String database]
    (DatabaseId/of instance-id database)))

(defn get-instance-id
  "Returns the instance id for this databse.

  returns: `com.google.cloud.spanner.InstanceId`"
  (^com.google.cloud.spanner.InstanceId [^DatabaseId this]
    (-> this (.getInstanceId))))

(defn get-database
  "Returns the database id.

  returns: `java.lang.String`"
  (^java.lang.String [^DatabaseId this]
    (-> this (.getDatabase))))

(defn get-name
  "Returns the name of this database.

  returns: `java.lang.String`"
  (^java.lang.String [^DatabaseId this]
    (-> this (.getName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DatabaseId this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DatabaseId this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DatabaseId this]
    (-> this (.toString))))

