(ns com.google.cloud.spanner.BatchReadOnlyTransaction
  "BatchReadOnlyTransaction can be configured to read at timestamps in the past and allows
  for exporting arbitrarily large amounts of data from Cloud Spanner databases. This is a read only
  transaction which additionally allows to partition a read or query request. Read/query request
  can then be executed independently over each partition while observing the same snapshot of the
  database. BatchReadOnlyTransaction can also be shared across multiple processes/machines by
  passing around the BatchTransactionId and then recreating the transaction using BatchClient.batchReadOnlyTransaction(BatchTransactionId).

  Unlike locking read-write transactions, BatchReadOnlyTransaction never abort. They can fail if
  the chosen read timestamp is garbage collected; however any read or query activity within an hour
  on the transaction avoids garbage collection and most applications do not need to worry about
  this in practice.

  To execute a BatchReadOnlyTransaction, specify a TimestampBound, which tells Cloud
  Spanner how to choose a read timestamp."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner BatchReadOnlyTransaction]))

(defn partition-read
  "Returns a list of Partition to read zero or more rows from a database.

   These partitions can be executed across multiple processes, even across different machines.
   The partition size and count hints can be configured using PartitionOptions.

  partition-options - configuration for size and count of partitions returned - `com.google.cloud.spanner.PartitionOptions`
  table - the name of the table to read - `java.lang.String`
  keys - the keys and ranges of rows to read. Regardless of ordering in keys, rows are returned in their natural key order. - `com.google.cloud.spanner.KeySet`
  columns - the columns to read - `java.lang.Iterable`
  options - the options to configure the read, supported values are Options.prefetchChunks() SNIPPET partition_read final BatchReadOnlyTransaction txn = batchClient.batchReadOnlyTransaction(TimestampBound.strong()); List<Partition> partitions = txn.partitionRead( PartitionOptions.getDefaultInstance(), \"Singers\", KeySet.all(), Arrays.asList(\"SingerId\", \"FirstName\", \"LastName\")); for (final Partition p : partitions) { try (ResultSet results = txn.execute(p)) { while (results.next()) { long singerId = results.getLong(0); String firstName = results.getString(1); String lastName = results.getString(2); System.out.println(\"[\" singerId \"] \" firstName \" \" lastName); } } } SNIPPET partition_read - `com.google.cloud.spanner.Options$ReadOption`

  returns: `java.util.List<com.google.cloud.spanner.Partition>`

  throws: com.google.cloud.spanner.SpannerException"
  (^java.util.List [^BatchReadOnlyTransaction this ^com.google.cloud.spanner.PartitionOptions partition-options ^java.lang.String table ^com.google.cloud.spanner.KeySet keys ^java.lang.Iterable columns ^com.google.cloud.spanner.Options$ReadOption options]
    (-> this (.partitionRead partition-options table keys columns options))))

(defn partition-read-using-index
  "Returns a list of Partition to read zero or more rows from a database using an index.

   These partitions can be executed across multiple processes, even across different machines.
   The partition size and count can be configured using PartitionOptions. Though it may
   not necessarily be honored depending on the parameters in the request.

  partition-options - configuration for size and count of partitions returned - `com.google.cloud.spanner.PartitionOptions`
  table - the name of the table to read - `java.lang.String`
  index - the name of the index on table to use - `java.lang.String`
  keys - the keys and ranges of index rows to read. Regardless of ordering in keys, rows are returned in the natural key order of the index. - `com.google.cloud.spanner.KeySet`
  columns - the columns to read - `java.lang.Iterable`
  options - the options to configure the read SNIPPET partition_read_using_index final BatchReadOnlyTransaction txn = batchClient.batchReadOnlyTransaction(TimestampBound.strong()); List<Partition> partitions = txn.partitionReadUsingIndex( PartitionOptions.getDefaultInstance(), \"Singers\", \"SingerId\", KeySet.all(), Arrays.asList(\"SingerId\", \"FirstName\", \"LastName\")); for (Partition p : partitions) { try (ResultSet results = txn.execute(p)) { while (results.next()) { long singerId = results.getLong(0); String firstName = results.getString(1); String lastName = results.getString(2); System.out.println(\"[\" singerId \"] \" firstName \" \" lastName); } } } SNIPPET partition_read_using_index - `com.google.cloud.spanner.Options$ReadOption`

  returns: `java.util.List<com.google.cloud.spanner.Partition>`

  throws: com.google.cloud.spanner.SpannerException"
  (^java.util.List [^BatchReadOnlyTransaction this ^com.google.cloud.spanner.PartitionOptions partition-options ^java.lang.String table ^java.lang.String index ^com.google.cloud.spanner.KeySet keys ^java.lang.Iterable columns ^com.google.cloud.spanner.Options$ReadOption options]
    (-> this (.partitionReadUsingIndex partition-options table index keys columns options))))

(defn partition-query
  "Returns a list of Partition to execute a query against the database.

   These partitions can be executed across multiple processes, even across different machines.
   The partition size and count can be configured using PartitionOptions. Though it may
   not necessarily be honored depending on the query and options in the request.

  partition-options - configuration for size and count of partitions returned - `com.google.cloud.spanner.PartitionOptions`
  statement - the query statement to execute - `com.google.cloud.spanner.Statement`
  options - the options to configure the query SNIPPET partition_query final BatchReadOnlyTransaction txn = batchClient.batchReadOnlyTransaction(TimestampBound.strong()); List<Partition> partitions = txn.partitionQuery(PartitionOptions.getDefaultInstance(), Statement.of(\"SELECT SingerId, FirstName, LastName FROM Singers\")); for (final Partition p : partitions) { try (ResultSet results = txn.execute(p)) { while (results.next()) { long singerId = results.getLong(0); String firstName = results.getString(1); String lastName = results.getString(2); System.out.println(\"[\" singerId \"] \" firstName \" \" lastName); } } } SNIPPET partition_query - `com.google.cloud.spanner.Options$QueryOption`

  returns: `java.util.List<com.google.cloud.spanner.Partition>`

  throws: com.google.cloud.spanner.SpannerException"
  (^java.util.List [^BatchReadOnlyTransaction this ^com.google.cloud.spanner.PartitionOptions partition-options ^com.google.cloud.spanner.Statement statement ^com.google.cloud.spanner.Options$QueryOption options]
    (-> this (.partitionQuery partition-options statement options))))

(defn execute
  "Execute the partition to return ResultSet. The result returned could be zero or more
   rows. The row metadata may be absent if no rows are returned.
   SNIPPET partition_query



   final BatchReadOnlyTransaction txn =
       batchClient.batchReadOnlyTransaction(TimestampBound.strong());
   List<Partition> partitions = txn.partitionQuery(PartitionOptions.getDefaultInstance(),
       Statement.of(\"SELECT SingerId, FirstName, LastName FROM Singers\"));

   for (final Partition p : partitions) {
     try (ResultSet results = txn.execute(p)) {
       while (results.next()) {
         long singerId = results.getLong(0);
         String firstName = results.getString(1);
         String lastName = results.getString(2);
         System.out.println(\"[\"  singerId  \"] \"  firstName  \" \"  lastName);
       }
     }
   }

   SNIPPET partition_query

  partition - `com.google.cloud.spanner.Partition`

  returns: `com.google.cloud.spanner.ResultSet`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.ResultSet [^BatchReadOnlyTransaction this ^com.google.cloud.spanner.Partition partition]
    (-> this (.execute partition))))

(defn get-batch-transaction-id
  "Returns a BatchTransactionId to be re-used across several machines/processes. This
   BatchTransactionId guarantees the subsequent read/query to be executed at the same timestamp.

  returns: `com.google.cloud.spanner.BatchTransactionId`"
  (^com.google.cloud.spanner.BatchTransactionId [^BatchReadOnlyTransaction this]
    (-> this (.getBatchTransactionId))))

