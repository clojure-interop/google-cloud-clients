(ns com.google.cloud.bigtable.data.v2.BigtableDataClient
  "Client for reading from and writing to existing Bigtable tables.

  This class provides the ability to make remote calls to the backing service. Sample code to
  get started:



  try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
    for(Row row : bigtableDataClient.readRows(Query.create(\"[TABLE]\")) {
      // Do something with row
    }
  }

  Note: close() needs to be called on the bigtableDataClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method, like `readRows()`. With this type of method, the fields of the
        request type have been converted into function parameters. It may be the case that not all
        fields are available as parameters, and not every API method will have a flattened method
        entry point.
    A \"callable\" method, like `readRowsCallable()`. This type of method takes no parameters and
        returns an immutable API callable object, which can be used to initiate calls to the
        service.


  All RPC related errors are represented as subclasses of ApiException. For example, a nonexistent table will trigger a NotFoundException. Async methods will wrap the error inside the future.
  Synchronous methods will re-throw the async error but will try to preserve the caller's
  stacktrace by attaching a suppressed exception at the callsite. This allows callers to use
  typesafe exceptions, without losing their callsite. Streaming methods (ie. readRows) will
  re-throw the async exception (like sync methods) when starting iteration.

  See the individual methods for example code.

  This class can be customized by passing in a custom instance of BigtableDataSettings to
  create(). For example:

  To customize credentials:



  BigtableDataSettings bigtableDataSettings =
      BigtableDataSettings.newBuilder()
          .setProjectId(\"[PROJECT]\")
          .setInstanceId(\"[INSTANCE]\")
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  try(BigtableDataClient bigtableDataClient = BigtableDataClient.create(bigtableDataSettings)) {
    // ..
  }

  To customize the endpoint:



  BigtableDataSettings.Builder bigtableDataSettingsBuilder =
      BigtableDataSettings.newBuilder()
        .setProjectId(\"[PROJECT]\")
        .setInstanceId(\"[INSTANCE]\");

  bigtableDataSettingsBuilder.stubSettings()
        .setEndpoint(myEndpoint).build();

  try(BigtableDataClient bigtableDataClient = BigtableDataClient.create(bigtableDataSettingsBuilder.build())) {
    // ..
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2 BigtableDataClient]))

(defn *create
  "Constructs an instance of BigtableDataClient with default settings.

  project-id - The project id of the instance to connect to. - `java.lang.String`
  instance-id - The id of the instance to connect to. - `java.lang.String`

  returns: A new client. - `com.google.cloud.bigtable.data.v2.BigtableDataClient`

  throws: java.io.IOException - If any."
  (^com.google.cloud.bigtable.data.v2.BigtableDataClient [^java.lang.String project-id ^java.lang.String instance-id]
    (BigtableDataClient/create project-id instance-id))
  (^com.google.cloud.bigtable.data.v2.BigtableDataClient [^com.google.cloud.bigtable.data.v2.BigtableDataSettings settings]
    (BigtableDataClient/create settings)))

(defn new-bulk-mutation-batcher
  "Mutates multiple rows in a batch. Each individual row is mutated atomically as in MutateRow,
   but the entire batch is not executed atomically.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     try (BulkMutationBatcher batcher = bigtableDataClient.newBulkMutationBatcher()) {
       for (String someValue : someCollection) {
         RowMutation mutation = RowMutation.create(\"[TABLE]\", \"[ROW KEY]\")
           .setCell(\"[FAMILY NAME]\", \"[QUALIFIER]\", \"[VALUE]\");

         ApiFuture<Void> entryFuture = batcher.add(mutation);
       }
     } catch (BulkMutationFailure failure) {
       // Handle error
     }
     // After `batcher` is closed, all mutations have been applied
   }

  returns: `(value="This surface is likely to change as the batching surface evolves.")  com.google.cloud.bigtable.data.v2.models.BulkMutationBatcher`"
  ([^BigtableDataClient this]
    (-> this (.newBulkMutationBatcher))))

(defn sample-row-keys-async
  "Convenience method to asynchronously return a sample of row keys in the table. The returned row
   keys will delimit contiguous sections of the table of approximately equal size, which can be
   used to break up the data for distributed tasks like mapreduces.

   Sample code:



   try (BigtableClient bigtableDataClient = BigtableClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     ApiFuture<List<KeyOffset>> keyOffsetsFuture = bigtableClient.sampleRowKeysAsync(\"[TABLE]\");

     ApiFutures.addCallback(keyOffsetsFuture, new ApiFutureCallback<List<KeyOffset>>() {
       public void onFailure(Throwable t) {
         if (t instanceof NotFoundException) {
           System.out.println(\"Tried to sample keys of a non-existent table\");
         } else {
           t.printStackTrace();
         }
       }
       public void onSuccess(List<KeyOffset> keyOffsets) {
         System.out.println(\"Got key offsets: \"  keyOffsets);
       }
     }, MoreExecutors.directExecutor());
   }

  table-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.util.List<com.google.cloud.bigtable.data.v2.models.KeyOffset>>`"
  (^com.google.api.core.ApiFuture [^BigtableDataClient this ^java.lang.String table-id]
    (-> this (.sampleRowKeysAsync table-id))))

(defn check-and-mutate-row-callable
  "Mutates a row atomically based on the output of a filter.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     ConditionalRowMutation mutation = ConditionalRowMutation.create(\"[TABLE]\", \"[KEY]\")
       .condition(FILTERS.value().regex(\"old-value\"))
       .then(
         Mutation.create()
           .setCell(\"[FAMILY]\", \"[QUALIFIER]\", \"[VALUE]\")
         );

     // Sync style
     try {
       boolean success = bigtableDataClient.checkAndMutateRowCallable().call(mutation);
       if (!success) {
         System.out.println(\"Row did not match conditions\");
       }
     } catch (NotFoundException e) {
       System.out.println(\"Tried to mutate a non-existent table\");
     } catch (RuntimeException e) {
       e.printStackTrace();
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation,java.lang.Boolean>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigtableDataClient this]
    (-> this (.checkAndMutateRowCallable))))

(defn read-rows-async
  "Convenience method for asynchronously streaming the results of a Query.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     String tableId = \"[TABLE]\";

     Query query = Query.create(tableId)
            .range(\"[START KEY]\", \"[END KEY]\")
            .filter(FILTERS.qualifier().regex(\"[COLUMN PREFIX].*\"));

     bigtableDataClient.readRowsAsync(query, new ResponseObserver<Row>() {
       StreamController controller;
       int count = 0;

       public void onStart(StreamController controller) {
         this.controller = controller;
       }
       public void onResponse(Row row) {
         if (++count > 10) {
           controller.cancel();
           return;
         }
         // Do something with Row
       }
       public void onError(Throwable t) {
         if (t instanceof NotFoundException) {
           System.out.println(\"Tried to read a non-existent table\");
         } else {
           t.printStackTrace();
         }
       }
       public void onComplete() {
         // Handle stream completion
       }
     });
   }

  query - `com.google.cloud.bigtable.data.v2.models.Query`
  observer - `com.google.api.gax.rpc.ResponseObserver`"
  ([^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.Query query ^com.google.api.gax.rpc.ResponseObserver observer]
    (-> this (.readRowsAsync query observer))))

(defn read-row-async
  "Convenience method for asynchronously reading a single row. If the row does not exist, the
   future's value will be null.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     String tableId = \"[TABLE]\";

    // Build the filter expression
     Filters.Filter filter = FILTERS.chain()
           .filter(FILTERS.qualifier().regex(\"prefix.*\"))
           .filter(FILTERS.limit().cellsPerRow(10));

     ApiFuture<Row> futureResult = bigtableDataClient.readRowAsync(tableId, \"key\", filter);

     ApiFutures.addCallback(futureResult, new ApiFutureCallback<Row>() {
       public void onFailure(Throwable t) {
         if (t instanceof NotFoundException) {
           System.out.println(\"Tried to read a non-existent table\");
         } else {
           t.printStackTrace();
         }
       }
       public void onSuccess(Row row) {
         if (result != null) {
            System.out.println(\"Got row: \"  result);
         }
       }
     }, MoreExecutors.directExecutor());
   }

  table-id - `java.lang.String`
  row-key - `java.lang.String`
  filter - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.core.ApiFuture [^BigtableDataClient this ^java.lang.String table-id ^java.lang.String row-key ^com.google.cloud.bigtable.data.v2.models.Filters$Filter filter]
    (-> this (.readRowAsync table-id row-key filter)))
  (^com.google.api.core.ApiFuture [^BigtableDataClient this ^java.lang.String table-id ^java.lang.String row-key]
    (-> this (.readRowAsync table-id row-key))))

(defn bulk-mutation-callable
  "Mutates multiple rows in a batch. Each individual row is mutated atomically as in MutateRow,
   but the entire batch is not executed atomically. Unlike newBulkMutationBatcher(), this
   method expects the mutations to be pre-batched.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     BulkMutation batch = BulkMutation.create(\"[TABLE]\");
     for (String someValue : someCollection) {
       ApiFuture<Void> entryFuture = batch.add(\"[ROW KEY]\",
         Mutation.create().setCell(\"[FAMILY NAME]\", \"[QUALIFIER]\", \"[VALUE]\");
     }
     bigtableDataClient.bulkMutationCallable().call(batch);
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigtable.data.v2.models.BulkMutation,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigtableDataClient this]
    (-> this (.bulkMutationCallable))))

(defn read-modify-write-row-callable
  "Modifies a row atomically on the server. The method reads the latest existing timestamp and
   value from the specified columns and writes a new entry. The new value for the timestamp is the
   greater of the existing timestamp or the current server time. The method returns the new
   contents of all modified cells.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     ReadModifyWriteRow mutation = ReadModifyWriteRow.create(\"[TABLE]\", \"[KEY]\")
       .increment(\"[FAMILY]\", \"[QUALIFIER]\", 1)
       .append(\"[FAMILY2]\", \"[QUALIFIER2]\", \"suffix\");

     try {
       Row row = bigtableDataClient.readModifyWriteRowCallable().call(mutation);
     } catch (NotFoundException e) {
       System.out.println(\"Tried to mutate a non-existent table\");
     } catch (RuntimeException e) {
       e.printStackTrace();
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigtableDataClient this]
    (-> this (.readModifyWriteRowCallable))))

(defn bulk-mutate-rows-async
  "Convenience method to mutate multiple rows in a batch. Each individual row is mutated
   atomically as in MutateRow, but the entire batch is not executed atomically. Unlike newBulkMutationBatcher(), this method expects the mutations to be pre-batched.

   Sample code:



   try (BigtableClient bigtableClient = BigtableClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     BulkMutation batch = BulkMutation.create(\"[TABLE]\");
     for (String someValue : someCollection) {
       ApiFuture<Void> entryFuture = batch.add(\"[ROW KEY]\",
         Mutation.create().setCell(\"[FAMILY NAME]\", \"[QUALIFIER]\", \"[VALUE]\"));
     }
     ApiFuture<Void> resultFuture = bigtableDataClient.bulkMutateRowsAsync(batch);

     ApiFutures.addCallback(resultFuture, new ApiFutureCallback<Void>() {
       public void onFailure(Throwable t) {
         if (t instanceof BulkMutationFailure) {
           System.out.println(\"Some entries failed to apply\");
         } else {
           t.printStackTrace();
         }
       }
       public void onSuccess(Void ignored) {
         System.out.println(\"Successfully applied all mutation\");
       }
     }, MoreExecutors.directExecutor());
   }

  mutation - `com.google.cloud.bigtable.data.v2.models.BulkMutation`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.BulkMutation mutation]
    (-> this (.bulkMutateRowsAsync mutation))))

(defn check-and-mutate-row-async
  "Convenience method to asynchronously mutate a row atomically based on the output of a filter.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     ConditionalRowMutation mutation = ConditionalRowMutation.create(\"[TABLE]\", \"[KEY]\")
       .condition(FILTERS.value().regex(\"old-value\"))
       .then(
         Mutation.create()
           .setCell(\"[FAMILY]\", \"[QUALIFIER]\", \"[VALUE]\")
         );

     ApiFuture<Boolean> future = bigtableDataClient.checkAndMutateRowAsync(mutation);

     ApiFutures.addCallback(future, new ApiFutureCallback<Boolean>() {
       public void onFailure(Throwable t) {
         if (t instanceof NotFoundException) {
           System.out.println(\"Tried to mutate a non-existent table\");
         } else {
           t.printStackTrace();
         }
       }
       public void onSuccess(Boolean wasApplied) {
         System.out.println(\"Row was modified: \"  wasApplied);
       }
     }, MoreExecutors.directExecutor());
   }

  mutation - `com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation`

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`"
  (^com.google.api.core.ApiFuture [^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation mutation]
    (-> this (.checkAndMutateRowAsync mutation))))

(defn check-and-mutate-row
  "Convenience method to synchronously mutate a row atomically based on the output of a filter.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     ConditionalRowMutation mutation = ConditionalRowMutation.create(\"[TABLE]\", \"[KEY]\")
       .condition(FILTERS.value().regex(\"old-value\"))
       .then(
         Mutation.create()
           .setCell(\"[FAMILY]\", \"[QUALIFIER]\", \"[VALUE]\")
         );

     Boolean result = bigtableDataClient.checkAndMutateRow(mutation);
   } catch(ApiException e) {
     e.printStackTrace();
   }

  mutation - `com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation`

  returns: `java.lang.Boolean`

  throws: com.google.api.gax.rpc.ApiException - when a serverside error occurs"
  (^java.lang.Boolean [^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation mutation]
    (-> this (.checkAndMutateRow mutation))))

(defn read-row-callable
  "Reads a single row. This callable allows for customization of the logical representation of a
   row. It's meant for advanced use cases.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     String tableId = \"[TABLE]\";

     Query query = Query.create(tableId)
            .rowKey(\"[KEY]\")
            .filter(FILTERS.qualifier().regex(\"[COLUMN PREFIX].*\"));

     // Synchronous invocation
     CustomRow row = bigtableDataClient.readRowCallable(new CustomRowAdapter()).call(query));
     // Do something with row
   }

  row-adapter - `com.google.cloud.bigtable.data.v2.models.RowAdapter`

  returns: `<RowT> com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigtable.data.v2.models.Query,RowT>`"
  ([^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.RowAdapter row-adapter]
    (-> this (.readRowCallable row-adapter)))
  (^com.google.api.gax.rpc.UnaryCallable [^BigtableDataClient this]
    (-> this (.readRowCallable))))

(defn read-row
  "Convenience method for synchronously reading a single row. If the row does not exist, the value
   will be null.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     String tableId = \"[TABLE]\";

    // Build the filter expression
    Filter filter = FILTERS.chain()
           .filter(FILTERS.qualifier().regex(\"prefix.*\"))
           .filter(FILTERS.limit().cellsPerRow(10));

     Row row = bigtableDataClient.readRow(tableId, \"key\", filter);
     // Do something with row, for example, display all cells
     if(row != null) {
       System.out.println(row.getKey().toStringUtf8());
        for(RowCell cell : row.getCells()) {
          System.out.printf(\"Family: %s   Qualifier: %s   Value: %s\", cell.getFamily(),
             cell.getQualifier().toStringUtf8(), cell.getValue().toStringUtf8());
        }
     }
   } catch(ApiException e) {
     e.printStackTrace();
   }

  table-id - `java.lang.String`
  row-key - `java.lang.String`
  filter - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.Row`

  throws: com.google.api.gax.rpc.ApiException - when a serverside error occurs"
  (^com.google.cloud.bigtable.data.v2.models.Row [^BigtableDataClient this ^java.lang.String table-id ^java.lang.String row-key ^com.google.cloud.bigtable.data.v2.models.Filters$Filter filter]
    (-> this (.readRow table-id row-key filter)))
  (^com.google.cloud.bigtable.data.v2.models.Row [^BigtableDataClient this ^java.lang.String table-id ^com.google.protobuf.ByteString row-key]
    (-> this (.readRow table-id row-key))))

(defn mutate-row
  "Convenience method to synchronously mutate a single row atomically. Cells already present in
   the row are left unchanged unless explicitly changed by the RowMutation.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     RowMutation mutation = RowMutation.create(\"[TABLE]\", \"[ROW KEY]\")
       .setCell(\"[FAMILY NAME]\", \"[QUALIFIER]\", \"[VALUE]\");

     bigtableDataClient.mutateRow(mutation);
   } catch(ApiException e) {
     e.printStackTrace();
   }

  row-mutation - `com.google.cloud.bigtable.data.v2.models.RowMutation`

  throws: com.google.api.gax.rpc.ApiException - when a serverside error occurs"
  ([^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.RowMutation row-mutation]
    (-> this (.mutateRow row-mutation))))

(defn bulk-mutate-rows
  "Convenience method to mutate multiple rows in a batch. Each individual row is mutated
   atomically as in MutateRow, but the entire batch is not executed atomically. Unlike newBulkMutationBatcher(), this method expects the mutations to be pre-batched.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     BulkMutation batch = BulkMutation.create(\"[TABLE]\");
     for (String someValue : someCollection) {
       batch.add(\"[ROW KEY]\", Mutation.create().setCell(\"[FAMILY NAME]\", \"[QUALIFIER]\", \"[VALUE]\"));
     }
     bigtableDataClient.bulkMutateRows(batch);
   } catch(ApiException e) {
     e.printStackTrace();
   } catch(MutateRowsException e) {
     e.printStackTrace();
   }

  mutation - `com.google.cloud.bigtable.data.v2.models.BulkMutation`

  throws: com.google.api.gax.rpc.ApiException - when a serverside error occurs"
  ([^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.BulkMutation mutation]
    (-> this (.bulkMutateRows mutation))))

(defn read-rows
  "Convenience method for synchronously streaming the results of a Query.

   Sample code:



   // Import the filter DSL
   import static com.google.cloud.bigtable.data.v2.models.Filters.FILTERS;

   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     String tableId = \"[TABLE]\";

     Query query = Query.create(tableId)
            .range(\"[START KEY]\", \"[END KEY]\")
            .filter(FILTERS.qualifier().regex(\"[COLUMN PREFIX].*\"));

     try {
       ServerStream<Row> stream = bigtableDataClient.readRows(query);
       int count = 0;

       // Iterator style
       for (Row row : stream) {
         if (++count > 10) {
           stream.cancel();
           break;
         }
         // Do something with row
       }
     } catch (NotFoundException e) {
       System.out.println(\"Tried to read a non-existent table\");
     } catch (RuntimeException e) {
       e.printStackTrace();
     }
   }

  query - `com.google.cloud.bigtable.data.v2.models.Query`

  returns: `com.google.api.gax.rpc.ServerStream<com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.ServerStream [^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.Query query]
    (-> this (.readRows query))))

(defn close
  "Close the clients and releases all associated resources.

  throws: java.lang.Exception"
  ([^BigtableDataClient this]
    (-> this (.close))))

(defn read-modify-write-row
  "Convenience method that synchronously modifies a row atomically on the server. The method reads
   the latest existing timestamp and value from the specified columns and writes a new entry. The
   new value for the timestamp is the greater of the existing timestamp or the current server
   time. The method returns the new contents of all modified cells.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     ReadModifyWriteRow mutation = ReadModifyWriteRow.create(\"[TABLE]\", \"[KEY]\")
       .increment(\"[FAMILY]\", \"[QUALIFIER]\", 1)
       .append(\"[FAMILY2]\", \"[QUALIFIER2]\", \"suffix\");

     Row success = bigtableDataClient.readModifyWriteRow(mutation);
   } catch(ApiException e) {
     e.printStackTrace();
   }

  mutation - `com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow`

  returns: `com.google.cloud.bigtable.data.v2.models.Row`

  throws: com.google.api.gax.rpc.ApiException - when a serverside error occurs"
  (^com.google.cloud.bigtable.data.v2.models.Row [^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow mutation]
    (-> this (.readModifyWriteRow mutation))))

(defn mutate-row-async
  "Convenience method to asynchronously mutate a single row atomically. Cells already present in
   the row are left unchanged unless explicitly changed by the RowMutation.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     RowMutation mutation = RowMutation.create(\"[TABLE]\", \"[ROW KEY]\")
       .setCell(\"[FAMILY NAME]\", \"[QUALIFIER]\", \"[VALUE]\");

     ApiFuture<Void> future = bigtableDataClient.mutateRowAsync(mutation);

     ApiFutures.addCallback(future, new ApiFutureCallback<Void>() {
       public void onFailure(Throwable t) {
         if (t instanceof NotFoundException) {
           System.out.println(\"Tried to mutate a non-existent table\");
         } else {
           t.printStackTrace();
         }
       }
       public void onSuccess(Void ignored) {
         System.out.println(\"Successfully applied mutation\");
       }
     }, MoreExecutors.directExecutor());
   }

  row-mutation - `com.google.cloud.bigtable.data.v2.models.RowMutation`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.RowMutation row-mutation]
    (-> this (.mutateRowAsync row-mutation))))

(defn read-modify-write-row-async
  "Convenience method that asynchronously modifies a row atomically on the server. The method
   reads the latest existing timestamp and value from the specified columns and writes a new
   entry. The new value for the timestamp is the greater of the existing timestamp or the current
   server time. The method returns the new contents of all modified cells.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     ReadModifyWriteRow mutation = ReadModifyWriteRow.create(\"[TABLE]\", \"[KEY]\")
       .increment(\"[FAMILY]\", \"[QUALIFIER]\", 1)
       .append(\"[FAMILY2]\", \"[QUALIFIER2]\", \"suffix\");

     ApiFuture<Row> rowFuture = bigtableDataClient.readModifyWriteRowAsync(mutation);

     ApiFutures.addCallback(rowFuture, new ApiFutureCallback<Row>() {
       public void onFailure(Throwable t) {
         if (t instanceof NotFoundException) {
           System.out.println(\"Tried to mutate a non-existent table\");
         } else {
           t.printStackTrace();
         }
       }
       public void onSuccess(Row resultingRow) {
         System.out.println(\"Resulting row: \"  resultingRow);
       }
     }, MoreExecutors.directExecutor());
   }

  mutation - `com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.core.ApiFuture [^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow mutation]
    (-> this (.readModifyWriteRowAsync mutation))))

(defn read-rows-callable
  "Streams back the results of the query. This callable allows for customization of the logical
   representation of a row. It's meant for advanced use cases.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     String tableId = \"[TABLE]\";

     Query query = Query.create(tableId)
            .range(\"[START KEY]\", \"[END KEY]\")
            .filter(FILTERS.qualifier().regex(\"[COLUMN PREFIX].*\"));

     // Iterator style
     try {
       for(CustomRow row : bigtableDataClient.readRowsCallable(new CustomRowAdapter()).call(query)) {
         // Do something with row
       }
     } catch (NotFoundException e) {
       System.out.println(\"Tried to read a non-existent table\");
     } catch (RuntimeException e) {
       e.printStackTrace();
     }
   }

  row-adapter - `com.google.cloud.bigtable.data.v2.models.RowAdapter`

  returns: `<RowT> com.google.api.gax.rpc.ServerStreamingCallable<com.google.cloud.bigtable.data.v2.models.Query,RowT>`"
  ([^BigtableDataClient this ^com.google.cloud.bigtable.data.v2.models.RowAdapter row-adapter]
    (-> this (.readRowsCallable row-adapter)))
  (^com.google.api.gax.rpc.ServerStreamingCallable [^BigtableDataClient this]
    (-> this (.readRowsCallable))))

(defn mutate-row-callable
  "Mutates a single row atomically. Cells already present in the row are left unchanged unless
   explicitly changed by the RowMutation.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     RowMutation mutation = RowMutation.create(\"[TABLE]\", \"[ROW KEY]\")
       .setCell(\"[FAMILY NAME]\", \"[QUALIFIER]\", \"[VALUE]\");

     // Sync style
     try {
       bigtableDataClient.mutateRowCallable().call(mutation);
     } catch (NotFoundException e) {
       System.out.println(\"Tried to mutate a non-existent table\");
     } catch (RuntimeException e) {
       e.printStackTrace();
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigtable.data.v2.models.RowMutation,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigtableDataClient this]
    (-> this (.mutateRowCallable))))

(defn sample-row-keys-callable
  "Returns a sample of row keys in the table. The returned row keys will delimit contiguous
   sections of the table of approximately equal size, which can be used to break up the data for
   distributed tasks like mapreduces. The returned callable object allows for customization of api
   invocation.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     // Synchronous invocation
     try {
       List<KeyOffset> keyOffsets = bigtableDataClient.sampleRowKeysCallable().call(\"[TABLE]\");
     } catch (NotFoundException e) {
       System.out.println(\"Tried to sample keys of a non-existent table\");
     } catch (RuntimeException e) {
       e.printStackTrace();
     }

     // Asynchronous invocation
     ApiFuture<List<KeyOffset>> keyOffsetsFuture = bigtableDataClient.sampleRowKeysCallable().futureCall(\"[TABLE]\");

     ApiFutures.addCallback(keyOffsetsFuture, new ApiFutureCallback<List<KeyOffset>>() {
       public void onFailure(Throwable t) {
         if (t instanceof NotFoundException) {
           System.out.println(\"Tried to sample keys of a non-existent table\");
         } else {
           t.printStackTrace();
         }
       }
       public void onSuccess(List<KeyOffset> keyOffsets) {
         System.out.println(\"Got key offsets: \"  keyOffsets);
       }
     }, MoreExecutors.directExecutor());
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<java.lang.String,java.util.List<com.google.cloud.bigtable.data.v2.models.KeyOffset>>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigtableDataClient this]
    (-> this (.sampleRowKeysCallable))))

(defn sample-row-keys
  "Convenience method to synchronously return a sample of row keys in the table. The returned row
   keys will delimit contiguous sections of the table of approximately equal size, which can be
   used to break up the data for distributed tasks like mapreduces.

   Sample code:



   try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(\"[PROJECT]\", \"[INSTANCE]\")) {
     String tableId = \"[TABLE_ID]\";

     List<KeyOffset> keyOffsets = bigtableDataClient.sampleRowKeys(tableId);
     for(KeyOffset keyOffset : keyOffsets) {
     // Do something with keyOffset
     }
   } catch(ApiException e) {
     e.printStackTrace();
   }

  table-id - `java.lang.String`

  returns: `java.util.List<com.google.cloud.bigtable.data.v2.models.KeyOffset>`

  throws: com.google.api.gax.rpc.ApiException - when a serverside error occurs"
  (^java.util.List [^BigtableDataClient this ^java.lang.String table-id]
    (-> this (.sampleRowKeys table-id))))

