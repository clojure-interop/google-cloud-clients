(ns com.google.cloud.spanner.BatchClient
  "Interface for the Batch Client that is used to read data from a Cloud Spanner database. An
  instance of this is tied to a specific database.

  BatchClient is useful when one wants to read or query a large amount of data from
  Cloud Spanner across multiple processes, even across different machines. It allows to create
  partitions of Cloud Spanner database and then read or query over each partition independently yet
  at the same snapshot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner BatchClient]))

(defn batch-read-only-transaction
  "Returns a BatchReadOnlyTransaction context in which multiple reads and/or queries can
   be performed. All reads/queries will use the same timestamp, and the timestamp can be inspected
   after this transaction is created successfully. This is a blocking method since it waits to
   finish the rpcs.

   Note that the bounded staleness modes, TimestampBound.Mode.MIN_READ_TIMESTAMP and
   TimestampBound.Mode.MAX_STALENESS, are not supported for BatchReadOnlyTransaction.

  bound - the timestamp bound at which to perform the read SNIPPET batch_client_strong_read BatchReadOnlyTransaction txn = batchClient.batchReadOnlyTransaction(TimestampBound.strong()); SNIPPET batch_client_strong_read - `com.google.cloud.spanner.TimestampBound`

  returns: `com.google.cloud.spanner.BatchReadOnlyTransaction`"
  (^com.google.cloud.spanner.BatchReadOnlyTransaction [^BatchClient this ^com.google.cloud.spanner.TimestampBound bound]
    (-> this (.batchReadOnlyTransaction bound))))

