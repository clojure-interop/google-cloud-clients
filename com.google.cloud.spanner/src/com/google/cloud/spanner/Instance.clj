(ns com.google.cloud.spanner.Instance
  "Represents a Cloud Spanner Instance. Instance adds a layer of service related
  functionality over InstanceInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Instance]))

(defn reload
  "returns: `com.google.cloud.spanner.Instance`"
  (^com.google.cloud.spanner.Instance [^Instance this]
    (-> this (.reload))))

(defn delete
  ""
  ([^Instance this]
    (-> this (.delete))))

(defn update
  "fields-to-update - `com.google.cloud.spanner.InstanceInfo$InstanceField`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.cloud.spanner.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`"
  (^com.google.api.gax.longrunning.OperationFuture [^Instance this ^com.google.cloud.spanner.InstanceInfo$InstanceField fields-to-update]
    (-> this (.update fields-to-update))))

(defn list-databases
  "returns: `com.google.api.gax.paging.Page<com.google.cloud.spanner.Database>`"
  (^com.google.api.gax.paging.Page [^Instance this]
    (-> this (.listDatabases))))

(defn get-database
  "database-id - `java.lang.String`

  returns: `com.google.cloud.spanner.Database`"
  (^com.google.cloud.spanner.Database [^Instance this ^java.lang.String database-id]
    (-> this (.getDatabase database-id))))

(defn create-database
  "Creates a new database in this instance.

  database-id - the id of the database which will be created. It must conform to the regular expression [a-z][a-z0-9_\\-]*[a-z0-9] and be between 2 and 30 characters in length - `java.lang.String`
  statements - DDL statements to run while creating the database, for example CREATE TABLE MyTable ( ... ). This should not include CREATE DATABASE statement. - `java.lang.Iterable`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.cloud.spanner.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^Instance this ^java.lang.String database-id ^java.lang.Iterable statements]
    (-> this (.createDatabase database-id statements))))

(defn to-builder
  "returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^Instance this]
    (-> this (.toBuilder))))

