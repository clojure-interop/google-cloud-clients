(ns com.google.cloud.spanner.DatabaseInfo
  "Represents a Cloud Spanner database."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner DatabaseInfo]))

(defn ->database-info
  "Constructor.

  id - `com.google.cloud.spanner.DatabaseId`
  state - `com.google.cloud.spanner.DatabaseInfo$State`"
  (^DatabaseInfo [^com.google.cloud.spanner.DatabaseId id ^com.google.cloud.spanner.DatabaseInfo$State state]
    (new DatabaseInfo id state)))

(defn get-id
  "Returns the database id.

  returns: `com.google.cloud.spanner.DatabaseId`"
  (^com.google.cloud.spanner.DatabaseId [^DatabaseInfo this]
    (-> this (.getId))))

(defn get-state
  "Returns the state of the database.

  returns: `com.google.cloud.spanner.DatabaseInfo$State`"
  (^com.google.cloud.spanner.DatabaseInfo$State [^DatabaseInfo this]
    (-> this (.getState))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DatabaseInfo this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DatabaseInfo this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DatabaseInfo this]
    (-> this (.toString))))

