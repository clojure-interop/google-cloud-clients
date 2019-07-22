(ns com.google.cloud.spanner.DatabaseAdminClient
  "Client to do admin operations on a Cloud Spanner Database."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner DatabaseAdminClient]))

(defn create-database
  "Creates a new database in a Cloud Spanner instance.

   Example to create database.



   String instanceId = my_instance_id;
   String databaseId = my_database_id;
   Operation<Database, CreateDatabaseMetadata> op = dbAdminClient
       .createDatabase(
           instanceId,
           databaseId,
           Arrays.asList(
               \"CREATE TABLE Singers (\\n\"
                    \"  SingerId   INT64 NOT NULL,\\n\"
                    \"  FirstName  STRING(1024),\\n\"
                    \"  LastName   STRING(1024),\\n\"
                    \"  SingerInfo BYTES(MAX)\\n\"
                    \") PRIMARY KEY (SingerId)\",
               \"CREATE TABLE Albums (\\n\"
                    \"  SingerId     INT64 NOT NULL,\\n\"
                    \"  AlbumId      INT64 NOT NULL,\\n\"
                    \"  AlbumTitle   STRING(MAX)\\n\"
                    \") PRIMARY KEY (SingerId, AlbumId),\\n\"
                    \"  INTERLEAVE IN PARENT Singers ON DELETE CASCADE\"));
   Database db = op.waitFor().getResult();

  instance-id - the id of the instance in which to create the database. - `java.lang.String`
  database-id - the id of the database which will be created. It must conform to the regular expression [a-z][a-z0-9_\\-]*[a-z0-9] and be between 2 and 30 characters in length - `java.lang.String`
  statements - DDL statements to run while creating the database, for example CREATE TABLE MyTable ( ... ). This should not include CREATE DATABASE statement. - `java.lang.Iterable`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.cloud.spanner.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^DatabaseAdminClient this ^java.lang.String instance-id ^java.lang.String database-id ^java.lang.Iterable statements]
    (-> this (.createDatabase instance-id database-id statements))))

(defn get-database
  "Gets the current state of a Cloud Spanner database.

   Example to getDatabase.



   String instanceId = my_instance_id;
   String databaseId = my_database_id;
   Database db = dbAdminClient.getDatabase(instanceId, databaseId);

  instance-id - `java.lang.String`
  database-id - `java.lang.String`

  returns: `com.google.cloud.spanner.Database`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.Database [^DatabaseAdminClient this ^java.lang.String instance-id ^java.lang.String database-id]
    (-> this (.getDatabase instance-id database-id))))

(defn update-database-ddl
  "Enqueues the given DDL statements to be applied, in order but not necessarily all at once, to
   the database schema at some point (or points) in the future. The server checks that the
   statements are executable (syntactically valid, name tables that exist, etc.) before enqueueing
   them, but they may still fail upon later execution (e.g., if a statement from another batch of
   statements is applied first and it conflicts in some way, or if there is some data-related
   problem like a `NULL` value in a column to which `NOT NULL` would be added). If a statement
   fails, all subsequent statements in the batch are automatically cancelled.

   Example to update the database DDL.



   String instanceId = my_instance_id;
   String databaseId = my_database_id;
   dbAdminClient.updateDatabaseDdl(instanceId,
       databaseId,
       Arrays.asList(\"ALTER TABLE Albums ADD COLUMN MarketingBudget INT64\"),
       null).waitFor();

  instance-id - `java.lang.String`
  database-id - `java.lang.String`
  statements - `java.lang.Iterable`
  operation-id - Operation id assigned to this operation. If null, system will autogenerate one. This must be unique within a database abd must be a valid identifier [a-zA-Z][a-zA-Z0-9_]*. - `java.lang.String`

  returns: `com.google.api.gax.longrunning.OperationFuture<java.lang.Void,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^DatabaseAdminClient this ^java.lang.String instance-id ^java.lang.String database-id ^java.lang.Iterable statements ^java.lang.String operation-id]
    (-> this (.updateDatabaseDdl instance-id database-id statements operation-id))))

(defn drop-database
  "Drops a Cloud Spanner database.

   Example to drop a Cloud Spanner database.



   String instanceId = my_instance_id;
   String databaseId = my_database_id;
   dbAdminClient.dropDatabase(instanceId, databaseId);

  instance-id - `java.lang.String`
  database-id - `java.lang.String`

  throws: com.google.cloud.spanner.SpannerException"
  ([^DatabaseAdminClient this ^java.lang.String instance-id ^java.lang.String database-id]
    (-> this (.dropDatabase instance-id database-id))))

(defn get-database-ddl
  "Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This
   method does not show pending schema updates.

   Example to get the schema of a Cloud Spanner database.



   String instanceId = my_instance_id;
   String databaseId = my_database_id;
   List<String> statementsInDb = dbAdminClient.getDatabaseDdl(instanceId, databaseId);

  instance-id - `java.lang.String`
  database-id - `java.lang.String`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DatabaseAdminClient this ^java.lang.String instance-id ^java.lang.String database-id]
    (-> this (.getDatabaseDdl instance-id database-id))))

(defn list-databases
  "Returns the list of Cloud Spanner database in the given instance.

   Example to get the list of Cloud Spanner database in the given instance.



   String instanceId = my_instance_id;
   Page<Database> page = dbAdminClient.listDatabases(instanceId, Options.pageSize(1));
   List<Database> dbs = new ArrayList<>();
   while (page != null) {
     Database db = Iterables.getOnlyElement(page.getValues());
     dbs.add(db);
     page = page.getNextPage();
   }

  instance-id - `java.lang.String`
  options - `com.google.cloud.spanner.Options$ListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.spanner.Database>`"
  (^com.google.api.gax.paging.Page [^DatabaseAdminClient this ^java.lang.String instance-id ^com.google.cloud.spanner.Options$ListOption options]
    (-> this (.listDatabases instance-id options))))

