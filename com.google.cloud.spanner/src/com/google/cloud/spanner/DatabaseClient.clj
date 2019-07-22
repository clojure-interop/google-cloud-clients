(ns com.google.cloud.spanner.DatabaseClient
  "Interface for all the APIs that are used to read/write data into a Cloud Spanner database. An
  instance of this is tied to a specific database."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner DatabaseClient]))

(defn write
  "Writes the given mutations atomically to the database.

   This method uses retries and replay protection internally, which means that the mutations
   are applied exactly once on success, or not at all if an error is returned, regardless of any
   failures in the underlying network. Note that if the call is cancelled or reaches deadline, it
   is not possible to know whether the mutations were applied without performing a subsequent
   database operation, but the mutations will have been applied at most once.

   Example of blind write.



   long singerId = my_singer_id;
   Mutation mutation = Mutation.newInsertBuilder(\"Singer\")
           .set(\"SingerId\")
           .to(singerId)
           .set(\"FirstName\")
           .to(\"Billy\")
           .set(\"LastName\")
           .to(\"Joel\")
           .build();
   dbClient.write(Collections.singletonList(mutation));

  mutations - `java.lang.Iterable`

  returns: the timestamp at which the write was committed - `com.google.cloud.Timestamp`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.Timestamp [^DatabaseClient this ^java.lang.Iterable mutations]
    (-> this (.write mutations))))

(defn write-at-least-once
  "Writes the given mutations atomically to the database without replay protection.

   Since this method does not feature replay protection, it may attempt to apply mutations more than once; if the mutations are not idempotent, this may lead to a failure
   being reported when the mutation was applied once. For example, an insert may fail with ErrorCode.ALREADY_EXISTS even though the row did not exist before this method was called. For
   this reason, most users of the library will prefer to use write(Iterable) instead.
   However, writeAtLeastOnce() requires only a single RPC, whereas write()
   requires two RPCs (one of which may be performed in advance), and so this method may be
   appropriate for latency sensitive and/or high throughput blind writing.

   Example of unprotected blind write.



   long singerId = my_singer_id;
   Mutation mutation = Mutation.newInsertBuilder(\"Singers\")
           .set(\"SingerId\")
           .to(singerId)
           .set(\"FirstName\")
           .to(\"Billy\")
           .set(\"LastName\")
           .to(\"Joel\")
           .build();
   dbClient.writeAtLeastOnce(Collections.singletonList(mutation));

  mutations - `java.lang.Iterable`

  returns: the timestamp at which the write was committed - `com.google.cloud.Timestamp`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.Timestamp [^DatabaseClient this ^java.lang.Iterable mutations]
    (-> this (.writeAtLeastOnce mutations))))

(defn single-use
  "Returns a context in which a single read can be performed at the given timestamp bound. This
   method will return a ReadContext that will not return the read timestamp that was used
   by Cloud Spanner. If you want to be able to access the read timestamp, you should use the
   method singleUseReadOnlyTransaction().

   Example of single use with timestamp bound.



   long singerId = my_singer_id;
   String column = \"FirstName\";
   Struct row = dbClient.singleUse(TimestampBound.ofMaxStaleness(10, TimeUnit.SECONDS))
       .readRow(\"Singers\", Key.of(singerId), Collections.singleton(column));
   String firstName = row.getString(column);

  bound - the timestamp bound at which to perform the read - `com.google.cloud.spanner.TimestampBound`

  returns: `com.google.cloud.spanner.ReadContext`"
  (^com.google.cloud.spanner.ReadContext [^DatabaseClient this ^com.google.cloud.spanner.TimestampBound bound]
    (-> this (.singleUse bound)))
  (^com.google.cloud.spanner.ReadContext [^DatabaseClient this]
    (-> this (.singleUse))))

(defn single-use-read-only-transaction
  "Returns a read-only transaction context in which a single read or query can be performed at
   given timestamp bound. This method differs from singleUse(TimestampBound) in that the
   read timestamp used may be inspected after the read has returned data or finished successfully.

   Example of single use read only transaction with timestamp bound.



   long singerId = my_singer_id;
   String column = \"FirstName\";
   ReadOnlyTransaction txn =
       dbClient.singleUseReadOnlyTransaction(TimestampBound.ofMaxStaleness(10, TimeUnit.SECONDS));
   Struct row = txn.readRow(\"Singers\", Key.of(singerId), Collections.singleton(column));
   row.getString(column);
   Timestamp timestamp = txn.getReadTimestamp();

  bound - the timestamp bound at which to perform the read - `com.google.cloud.spanner.TimestampBound`

  returns: `com.google.cloud.spanner.ReadOnlyTransaction`"
  (^com.google.cloud.spanner.ReadOnlyTransaction [^DatabaseClient this ^com.google.cloud.spanner.TimestampBound bound]
    (-> this (.singleUseReadOnlyTransaction bound)))
  (^com.google.cloud.spanner.ReadOnlyTransaction [^DatabaseClient this]
    (-> this (.singleUseReadOnlyTransaction))))

(defn read-only-transaction
  "Returns a read-only transaction context in which a multiple reads and/or queries can be
   performed at the given timestamp bound. All reads/queries will use the same timestamp, and the
   timestamp can be inspected after any read/query has returned data or finished successfully.

   Note that the bounded staleness modes, TimestampBound.Mode.MIN_READ_TIMESTAMP and
   TimestampBound.Mode.MAX_STALENESS, are not supported for multi-use read-only
   transactions.

   Example of read only transaction with timestamp bound.



   long singerId = my_singer_id;
   long albumId = my_album_id;
   String singerColumn = \"FirstName\";
   String albumColumn = \"AlbumTitle\";
   String albumTitle = null;
   // ReadOnlyTransaction should be closed to prevent resource leak.
   try (ReadOnlyTransaction txn =
       dbClient.readOnlyTransaction(TimestampBound.ofExactStaleness(10, TimeUnit.SECONDS))) {
     Struct singerRow =
         txn.readRow(\"Singers\", Key.of(singerId), Collections.singleton(singerColumn));
     Struct albumRow =
         txn.readRow(\"Albums\", Key.of(singerId, albumId), Collections.singleton(albumColumn));
     singerRow.getString(singerColumn);
     albumTitle = albumRow.getString(albumColumn);
   }

  bound - the timestamp bound at which to perform the read - `com.google.cloud.spanner.TimestampBound`

  returns: `com.google.cloud.spanner.ReadOnlyTransaction`"
  (^com.google.cloud.spanner.ReadOnlyTransaction [^DatabaseClient this ^com.google.cloud.spanner.TimestampBound bound]
    (-> this (.readOnlyTransaction bound)))
  (^com.google.cloud.spanner.ReadOnlyTransaction [^DatabaseClient this]
    (-> this (.readOnlyTransaction))))

(defn read-write-transaction
  "Returns a transaction runner for executing a single logical transaction with retries. The
   returned runner can only be used once.

   Example of a read write transaction.



   long singerId = my_singer_id;
   TransactionRunner runner = dbClient.readWriteTransaction();
   runner.run(
       new TransactionCallable<Void>() {

          @Override
         public Void run(TransactionContext transaction) throws Exception {
           String column = \"FirstName\";
           Struct row =
               transaction.readRow(\"Singers\", Key.of(singerId), Collections.singleton(column));
           String name = row.getString(column);
           transaction.buffer(
               Mutation.newUpdateBuilder(\"Singers\").set(column).to(name.toUpperCase()).build());
           return null;
         }
       });

  returns: `com.google.cloud.spanner.TransactionRunner`"
  (^com.google.cloud.spanner.TransactionRunner [^DatabaseClient this]
    (-> this (.readWriteTransaction))))

(defn transaction-manager
  "Returns a transaction manager which allows manual management of transaction lifecycle. This API
   is meant for advanced users. Most users should instead use the readWriteTransaction()
   API instead.

   Example of using TransactionManager.



   long singerId = my_singer_id;
   try (TransactionManager manager = dbClient.transactionManager()) {
     TransactionContext txn = manager.begin();
     while (true) {
       String column = \"FirstName\";
       Struct row = txn.readRow(\"Singers\", Key.of(singerId), Collections.singleton(column));
       String name = row.getString(column);
       txn.buffer(
           Mutation.newUpdateBuilder(\"Singers\").set(column).to(name.toUpperCase()).build());
       try {
         manager.commit();
         break;
       } catch (AbortedException e) {
         Thread.sleep(e.getRetryDelayInMillis() / 1000);
         txn = manager.resetForRetry();
       }
     }
   }

  returns: `com.google.cloud.spanner.TransactionManager`"
  (^com.google.cloud.spanner.TransactionManager [^DatabaseClient this]
    (-> this (.transactionManager))))

(defn execute-partitioned-update
  "Returns the lower bound of rows modified by this DML statement.

   The method will block until the update is complete. Running a DML statement with this method
   does not offer exactly once semantics, and therfore the DML statement should be idempotent. The
   DML statement must be fully-partitionable. Specifically, the statement must be expressible as
   the union of many statements which each access only a single row of the table. This is a
   Partitioned DML transaction in which a single Partitioned DML statement is executed.
   Partitioned DML partitions the key space and runs the DML statement over each partition in
   parallel using separate, internal transactions that commit independently. Partitioned DML
   transactions do not need to be committed.

   Partitioned DML updates are used to execute a single DML statement with a different
   execution strategy that provides different, and often better, scalability properties for large,
   table-wide operations than DML in a readWriteTransaction() transaction. Smaller scoped
   statements, such as an OLTP workload, should prefer using TransactionContext.executeUpdate(Statement) with readWriteTransaction().

   That said, Partitioned DML is not a drop-in replacement for standard DML used in readWriteTransaction().


     The DML statement must be fully-partitionable. Specifically, the statement must be
         expressible as the union of many statements which each access only a single row of the
         table.
     The statement is not applied atomically to all rows of the table. Rather, the statement
         is applied atomically to partitions of the table, in independent internal transactions.
         Secondary index rows are updated atomically with the base table rows.
     Partitioned DML does not guarantee exactly-once execution semantics against a partition.
         The statement will be applied at least once to each partition. It is strongly recommended
         that the DML statement should be idempotent to avoid unexpected results. For instance, it
         is potentially dangerous to run a statement such as `UPDATE table SET column = column
         1` as it could be run multiple times against some rows.
     The partitions are committed automatically - there is no support for Commit or Rollback.
         If the call returns an error, or if the client issuing the DML statement dies, it is
         possible that some rows had the statement executed on them successfully. It is also
         possible that statement was never executed against other rows.
     If any error is encountered during the execution of the partitioned DML operation (for
         instance, a UNIQUE INDEX violation, division by zero, or a value that cannot be stored
         due to schema constraints), then the operation is stopped at that point and an error is
         returned. It is possible that at this point, some partitions have been committed (or even
         committed multiple times), and other partitions have not been run at all.


   Given the above, Partitioned DML is good fit for large, database-wide, operations that are
   idempotent, such as deleting old rows from a very large table.

  stmt - `com.google.cloud.spanner.Statement`

  returns: `long`"
  (^Long [^DatabaseClient this ^com.google.cloud.spanner.Statement stmt]
    (-> this (.executePartitionedUpdate stmt))))

