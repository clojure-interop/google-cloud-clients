(ns com.google.cloud.spanner.TransactionContext
  "Context for a single attempt of a locking read-write transaction. This type of transaction is the
  only way to write data into Cloud Spanner; DatabaseClient.write(Iterable) and DatabaseClient.writeAtLeastOnce(Iterable) use transactions internally. These transactions rely on
  pessimistic locking and, if necessary, two-phase commit. Locking read-write transactions may
  abort, requiring the application to retry. However, the interface exposed by TransactionRunner eliminates the need for applications to write retry loops explicitly.

  Locking transactions may be used to atomically read-modify-write data anywhere in a database.
  This type of transaction is externally consistent.

  Clients should attempt to minimize the amount of time a transaction is active. Faster
  transactions commit with higher probability and cause less contention. Cloud Spanner attempts to
  keep read locks active as long as the transaction continues to do reads, and the transaction has
  not been terminated by returning from a TransactionRunner.TransactionCallable. Long
  periods of inactivity at the client may cause Cloud Spanner to release a transaction's locks and
  abort it.

  Reads performed within a transaction acquire locks on the data being read. Writes can only be
  done at commit time, after all reads have been completed.

  Conceptually, a read-write transaction consists of zero or more reads or SQL queries followed
  by a commit.

  Semantics

  Cloud Spanner can commit the transaction if all read locks it acquired are still valid at
  commit time, and it is able to acquire write locks for all writes. Cloud Spanner can abort the
  transaction for any reason. If a commit attempt returns ABORTED, Cloud Spanner guarantees
  that the transaction has not modified any user data in Cloud Spanner.

  Unless the transaction commits, Cloud Spanner makes no guarantees about how long the
  transaction's locks were held for. It is an error to use Cloud Spanner locks for any sort of
  mutual exclusion other than between Cloud Spanner transactions themselves.

  Retrying Aborted Transactions

  When a transaction aborts, the application can choose to retry the whole transaction again. To
  maximize the chances of successfully committing the retry, the client should execute the retry in
  the same session as the original attempt. The original session's lock priority increases with
  each consecutive abort, meaning that each attempt has a slightly better chance of success than
  the previous.

  Under some circumstances (e.g., many transactions attempting to modify the same row(s)), a
  transaction can abort many times in a short period before successfully committing. Thus, it is
  not a good idea to cap the number of retries a transaction can attempt; instead, it is better to
  limit the total amount of wall time spent retrying.

  Application code does not need to retry explicitly; TransactionRunner will
  automatically retry a transaction if an attempt results in an abort.

  Idle Transactions

  A transaction is considered idle if it has no outstanding reads or SQL queries and has not
  started a read or SQL query within the last 10 seconds. Idle transactions can be aborted by Cloud
  Spanner so that they don't hold on to locks indefinitely. In that case, the commit will fail with
  error ABORTED.

  If this behavior is undesirable, periodically executing a simple SQL query in the transaction
  (e.g., SELECT 1) prevents the transaction from becoming idle."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner TransactionContext]))

(defn buffer
  "Buffers a single mutation to be applied if the transaction commits successfully. The effects of
   this mutation will not be visible to subsequent operations in the transaction. All buffered
   mutations will be applied atomically.

  mutation - `com.google.cloud.spanner.Mutation`"
  ([^TransactionContext this ^com.google.cloud.spanner.Mutation mutation]
    (-> this (.buffer mutation))))

(defn execute-update
  "Executes the DML statement(s) and returns the number of rows modified. For non-DML statements,
   it will result in an IllegalArgumentException. The effects of the DML statement will be
   visible to subsequent operations in the transaction.

  statement - `com.google.cloud.spanner.Statement`

  returns: `long`"
  (^Long [^TransactionContext this ^com.google.cloud.spanner.Statement statement]
    (-> this (.executeUpdate statement))))

(defn batch-update
  "Executes a list of DML statements in a single request. The statements will be executed in order
   and the semantics is the same as if each statement is executed by executeUpdate in a
   loop. This method returns an array of long integers, each representing the number of rows
   modified by each statement.

   If an individual statement fails, execution stops and a SpannerBatchUpdateException
   is returned, which includes the error and the number of rows affected by the statements that
   are run prior to the error.

   For example, if statements contains 3 statements, and the 2nd one is not a valid DML. This
   method throws a SpannerBatchUpdateException that contains the error message from the
   2nd statement, and an array of length 1 that contains the number of rows modified by the 1st
   statement. The 3rd statement will not run.

  statements - `java.lang.Iterable`

  returns: `long[]`"
  ([^TransactionContext this ^java.lang.Iterable statements]
    (-> this (.batchUpdate statements))))

