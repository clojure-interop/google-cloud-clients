(ns com.google.cloud.spanner.Database
  "Represents a Cloud Spanner database. Database adds a layer of service related
  functionality over DatabaseInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Database]))

(defn ->database
  "Constructor.

  id - `com.google.cloud.spanner.DatabaseId`
  state - `com.google.cloud.spanner.DatabaseInfo$State`
  db-client - `com.google.cloud.spanner.DatabaseAdminClient`"
  (^Database [^com.google.cloud.spanner.DatabaseId id ^com.google.cloud.spanner.DatabaseInfo$State state ^com.google.cloud.spanner.DatabaseAdminClient db-client]
    (new Database id state db-client)))

(defn reload
  "Fetches the database's current information.

  returns: `com.google.cloud.spanner.Database`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.Database [^Database this]
    (-> this (.reload))))

(defn update-ddl
  "Enqueues the given DDL statements to be applied, in order but not necessarily all at once, to
   the database schema at some point (or points) in the future. The server checks that the
   statements are executable (syntactically valid, name tables that exist, etc.) before enqueueing
   them, but they may still fail upon later execution (e.g., if a statement from another batch of
   statements is applied first and it conflicts in some way, or if there is some data-related
   problem like a `NULL` value in a column to which `NOT NULL` would be added). If a statement
   fails, all subsequent statements in the batch are automatically cancelled.

  statements - `java.lang.Iterable`
  operation-id - Operation id assigned to this operation. If null, system will autogenerate one. This must be unique within a database abd must be a valid identifier [a-zA-Z][a-zA-Z0-9_]*. - `java.lang.String`

  returns: `com.google.api.gax.longrunning.OperationFuture<java.lang.Void,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^Database this ^java.lang.Iterable statements ^java.lang.String operation-id]
    (-> this (.updateDdl statements operation-id))))

(defn drop
  "Drops this database.

  throws: com.google.cloud.spanner.SpannerException"
  ([^Database this]
    (-> this (.drop))))

(defn get-ddl
  "Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This
   method does not show pending schema updates.

  returns: `java.lang.Iterable<java.lang.String>`

  throws: com.google.cloud.spanner.SpannerException"
  (^java.lang.Iterable [^Database this]
    (-> this (.getDdl))))

