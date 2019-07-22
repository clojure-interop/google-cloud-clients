(ns com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient
  "Client for creating, configuring, and deleting Cloud Bigtable tables

  Provides access to the table schemas only, not the data stored within the tables.

  See the individual methods for example code.

  Sample code to get started:



  try(BigtableTableAdminClient client =  BigtableTableAdminClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
    CreateTable request =
      CreateTableRequest.of(\"my-table\")
        .addFamily(\"cf1\")
        .addFamily(\"cf2\", GCRULES.maxVersions(10))
        .addSplit(ByteString.copyFromUtf8(\"b\"))
        .addSplit(ByteString.copyFromUtf8(\"q\"));
    client.createTable(request);
  }

  Note: close() needs to be called on the client object to clean up resources such as threads.
  In the example above, try-with-resources is used, which automatically calls close().

  This class can be customized by passing in a custom instance of BigtableTableAdminSettings to
  create(). For example:

  To customize credentials:



  BigtableTableAdminSettings tableAdminSettings = BigtableTableAdminSettings.newBuilder()
    .setProjectId(\"[PROJECT]\")
    .setInstanceId(\"[INSTANCE]\")
    .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
    .build();

  BigtableTableAdminClient client =
    BigtableTableAdminClient.create(tableAdminSettings);

  To customize the endpoint:



  BigtableTableAdminSettings.Builder tableAdminSettingsBuilder = BigtableTableAdminSettings.newBuilder()
    .setProjectId(\"[PROJECT]\")
    .setInstanceId(\"[INSTANCE]\");

  tableAdminSettingsBuilder.stubSettings()
    .setEndpoint(myEndpoint).build();

  BigtableTableAdminClient client = BigtableTableAdminClient.create(tableAdminSettingsBuilder.build());"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2 BigtableTableAdminClient]))

(defn *create
  "Constructs an instance of BigtableTableAdminClient with the given instance name and stub.

  project-id - `java.lang.String`
  instance-id - `java.lang.String`
  stub - `com.google.cloud.bigtable.admin.v2.stub.EnhancedBigtableTableAdminStub`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient`"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient [^java.lang.String project-id ^java.lang.String instance-id ^com.google.cloud.bigtable.admin.v2.stub.EnhancedBigtableTableAdminStub stub]
    (BigtableTableAdminClient/create project-id instance-id stub))
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient [^java.lang.String project-id ^java.lang.String instance-id]
    (BigtableTableAdminClient/create project-id instance-id))
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient [^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings settings]
    (BigtableTableAdminClient/create settings)))

(defn get-project-id
  "Gets the project ID of the instance whose tables this client manages.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableTableAdminClient this]
    (-> this (.getProjectId))))

(defn modify-families-async
  "Asynchronously creates, updates, and drops column families as specified in the request.

   Sample code:



   ApiFuture<Table> modifiedTableFuture = client.modifyFamiliesAsync(
     ModifyColumnFamiliesRequest.of(tableId)
       .addFamily(\"cf1\")
       .addFamily(\"cf2\", GCRULES.maxAge(Duration.ofSeconds(1000, 20000)))
       .updateFamily(
         \"cf3\",
         GCRULES.union()
           .rule(GCRULES.maxAge(Duration.ofSeconds(100)))
           .rule(GCRULES.maxVersions(1))
         )
       .addFamily(
         \"cf4\",
         GCRULES.intersection()
           .rule(GCRULES.maxAge(Duration.ofSeconds(2000)))
           .rule(GCRULES.maxVersions(10))
       )
       .dropFamily(\"cf5\")
   );

   ApiFutures.addCallback(
     modifiedTableFuture,
     new ApiFutureCallback<Table>() {
       public void onSuccess(Table table) {
         System.out.println(\"Modified table: \"  table.getTableName());
         System.out.println(\"Resulting families:\");

         for (ColumnFamily cf : modifiedTable.getColumnFamilies()) {
           System.out.println(cf.getId());
         }
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  request - `com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Table>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest request]
    (-> this (.modifyFamiliesAsync request))))

(defn delete-table-async
  "Asynchronously deletes the table specified by the table ID.

   Sample code:



   ApiFuture<Void> future = client.deleteTableAsync(\"my-table\");

   ApiFutures.addCallback(
     future,
     new ApiFutureCallback<Void>() {
       public void onSuccess(Void ignored) {
         System.out.println(\"Successfully deleted the table\");
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  table-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.deleteTableAsync table-id))))

(defn drop-all-rows
  "Drops all data in the table.

   Sample code:



   client.dropAllRows(\"my-table\");

  table-id - `java.lang.String`"
  ([^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.dropAllRows table-id))))

(defn await-replication-async
  "Returns a future that is resolved when replication has caught up to the point when this method
   was called. This allows callers to make sure that their mutations have been replicated across
   all of their clusters.

   Sample code:



   ApiFuture<Void> replicationFuture = client.awaitReplicationAsync(\"my-table\");

   ApiFutures.addCallback(
     replicationFuture,
     new ApiFutureCallback<Void>() {
       public void onSuccess(Table table) {
         System.out.println(\"All clusters are now consistent\");
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  table-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.awaitReplicationAsync table-id))))

(defn list-tables
  "Lists all table IDs in the instance.

   Sample code:



   List<String> tableIds = client.listTables();
   for(String tableId: tableIds) {
     System.out.println(name.getTable());
   }

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BigtableTableAdminClient this]
    (-> this (.listTables))))

(defn delete-table
  "Deletes the table specified by the table ID.

   Sample code:



   client.deleteTable(\"my-table\");

  table-id - `java.lang.String`"
  ([^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.deleteTable table-id))))

(defn modify-families
  "Creates, updates and drops column families as specified in the request.

   Sample code:



   Table modifiedTable = client.modifyFamilies(
     ModifyColumnFamiliesRequest.of(tableId)
       .addFamily(\"cf1\")
       .addFamily(\"cf2\", GCRULES.maxAge(Duration.ofSeconds(1000, 20000)))
       .updateFamily(
         \"cf3\",
         GCRULES.union()
           .rule(GCRULES.maxAge(Duration.ofSeconds(100)))
           .rule(GCRULES.maxVersions(1))
         )
       .addFamily(
         \"cf4\",
         GCRULES.intersection()
           .rule(GCRULES.maxAge(Duration.ofSeconds(2000)))
           .rule(GCRULES.maxVersions(10))
       )
       .dropFamily(\"cf5\")
   );

   System.out.println(\"Resulting families:\");

   for (ColumnFamily cf : modifiedTable.getColumnFamilies()) {
     System.out.println(cf.getId());
   }

  request - `com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest`

  returns: `com.google.cloud.bigtable.admin.v2.models.Table`"
  (^com.google.cloud.bigtable.admin.v2.models.Table [^BigtableTableAdminClient this ^com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest request]
    (-> this (.modifyFamilies request))))

(defn drop-all-rows-async
  "Asynchronously drops all data in the table.

   Sample code:



   ApiFuture<Void> dropFuture = client.dropAllRowsAsync(\"my-table\");

   ApiFutures.addCallback(
     dropFuture,
     new ApiFutureCallback<Void>() {
       public void onSuccess(Void tableNames) {
         System.out.println(\"Successfully dropped all data\");
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  table-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.dropAllRowsAsync table-id))))

(defn get-table-async
  "Asynchronously gets the table metadata by table ID.

   Sample code:



   ApiFuture<Table> tableFuture = client.getTableAsync(\"my-table\");

   ApiFutures.addCallback(
     tableFuture,
     new ApiFutureCallback<Table>() {
       public void onSuccess(Table table) {
         System.out.println(\"Got metadata for table: \"  table.getId());
         System.out.println(\"Column families:\");
         for (ColumnFamily cf : table.getColumnFamilies()) {
           System.out.println(cf.getId());
         }
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  table-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Table>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.getTableAsync table-id))))

(defn close
  ""
  ([^BigtableTableAdminClient this]
    (-> this (.close))))

(defn await-replication
  "Blocks the current thread until replication has caught up to the point when this method was
   called. This allows callers to make sure that their mutations have been replicated across all
   of their clusters.

   Sample code



   client.awaitReplication(\"my-table\");

  table-id - `java.lang.String`

  throws: com.google.api.gax.retrying.PollException - when polling exceeds the total timeout"
  ([^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.awaitReplication table-id))))

(defn create-table-async
  "Asynchronously creates a new table with the specified configuration.

   Sample code:



   // A table with a single column family, which retains values up to 7 days.
   ApiFuture<Table> tableFuture = client.createTableAsync(
     CreateTableRequest.of(\"my-table\")
       .addFamily(\"cf\", GCRULES.maxAge(Duration.ofDays(7)))
   );

   // Another table with more complex garbage collection rules.
   ApiFuture<Table> tableFuture = client.createTableAsync(
     CreateTableRequest.of(\"my-table\")
       .addFamily(\"cf\", GCRULES.intersection()
         .rule(GCRULES.maxAge(120, TimeUnit.HOURS))
         .rule(GCRULES.maxVersions(10))
       )
   );

   ApiFutures.addCallback(
     tableFuture,
     new ApiFutureCallback<Table>() {
       public void onSuccess(Table table) {
         System.out.println(\"Created table: \"  table.getTableName());
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  request - `com.google.cloud.bigtable.admin.v2.models.CreateTableRequest`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Table>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateTableRequest request]
    (-> this (.createTableAsync request))))

(defn drop-row-range
  "Drops rows by the specified row key prefix and table ID.

   Please note that this method is considered part of the admin API and is rate limited.

   Sample code:



   client.dropRowRange(\"my-table\", \"prefix\");

  table-id - `java.lang.String`
  row-key-prefix - `java.lang.String`"
  ([^BigtableTableAdminClient this ^java.lang.String table-id ^java.lang.String row-key-prefix]
    (-> this (.dropRowRange table-id row-key-prefix))))

(defn drop-row-range-async
  "Asynchronously drops rows by the specified row key prefix and table ID.

   Please note that this method is considered part of the admin API and is rate limited.

   Sample code:



   ApiFuture<Void> dropFuture = client.dropRowRangeAsync(\"my-table\", \"prefix\");

   ApiFutures.addCallback(
     dropFuture,
     new ApiFutureCallback<Void>() {
       public void onSuccess(Void tableNames) {
         System.out.println(\"Successfully dropped row range.\");
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  table-id - `java.lang.String`
  row-key-prefix - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^java.lang.String table-id ^java.lang.String row-key-prefix]
    (-> this (.dropRowRangeAsync table-id row-key-prefix))))

(defn create-table
  "Creates a new table with the specified configuration.

   Sample code:



   // A table with a single column family, which retains only the latest value.
   Table table = client.createTable(
     CreateTableRequest.of(\"my-table\")
       .addFamily(\"cf2\", GCRULES.maxVersions(1))
   );

   // Another table with more complex garbage collection rules.
   Table table = client.createTable(
     CreateTableRequest.of(\"my-table\")
       .addFamily(\"cf2\", GCRULES.union()
         .rule(GCRULES.maxAge(Duration.ofDays(30)))
         .rule(GCRULES.maxVersions(5))
       )
   );

  request - `com.google.cloud.bigtable.admin.v2.models.CreateTableRequest`

  returns: `com.google.cloud.bigtable.admin.v2.models.Table`"
  (^com.google.cloud.bigtable.admin.v2.models.Table [^BigtableTableAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateTableRequest request]
    (-> this (.createTable request))))

(defn get-table
  "Gets the table metadata by table ID.

   Sample code:



   Table table = client.getTable(\"my-table\");

   System.out.println(\"Got metadata for table: \"  table.getId());
   System.out.println(\"Column families:\");

   for (ColumnFamily cf : table.getColumnFamilies()) {
     System.out.println(cf.getId());
   }

  table-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.Table`"
  (^com.google.cloud.bigtable.admin.v2.models.Table [^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.getTable table-id))))

(defn exists?
  "Checks if the table specified by the table ID exists.

   Sample code:



   if(client.exists(\"my-table\")) {
     System.out.println(\"Table exists\");
   }

  table-id - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.exists table-id))))

(defn exists-async
  "Asynchronously checks if the table specified by the table ID exists.

   Sample code:



   ApiFuture<Boolean> found = client.existsAsync(\"my-table\");

   ApiFutures.addCallback(
    found,
    new ApiFutureCallback<Boolean>() {
      public void onSuccess(Boolean found) {
        if (found) {
          System.out.println(\"Table exists\");
        } else {
          System.out.println(\"Table not found\");
        }
      }

      public void onFailure(Throwable t) {
        t.printStackTrace();
      }
    },
    MoreExecutors.directExecutor()
   );

  table-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this ^java.lang.String table-id]
    (-> this (.existsAsync table-id))))

(defn get-instance-id
  "Gets the ID of the instance whose tables this client manages.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableTableAdminClient this]
    (-> this (.getInstanceId))))

(defn list-tables-async
  "Asynchronously lists all table IDs in the instance.

   Sample code:



   ApiFuture<List<String>> listFuture = client.listTables();

   ApiFutures.addCallback(
     listFuture,
     new ApiFutureCallback<List<String>>() {
       public void onSuccess(List<String> tableIds) {
         System.out.println(\"Got list of tables:\");
         for (String tableId : tableIds) {
           System.out.println(tableId);
         }
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor()
   );

  returns: `com.google.api.core.ApiFuture<java.util.List<java.lang.String>>`"
  (^com.google.api.core.ApiFuture [^BigtableTableAdminClient this]
    (-> this (.listTablesAsync))))

