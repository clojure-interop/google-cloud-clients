(ns com.google.cloud.spanner.TransactionRunner
  "An interface for executing a body of work in the context of a read-write transaction, with
  retries for transaction aborts. See TransactionContext for a description of transaction
  semantics. TransactionRunner instances are obtained by calling DatabaseClient.readWriteTransaction().

  A TransactionRunner instance can only be used for a single invocation of run(TransactionCallable)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner TransactionRunner]))

(defn run
  "Executes a read-write transaction, with retries as necessary. The work to perform in each
   transaction attempt is defined by callable, which may return an object as the result of
   the work. callable will be retried if a transaction attempt aborts; implementations
   must be prepared to be called more than once. Any writes buffered by callable will only
   be applied if the transaction commits successfully. Similarly, the value produced by callable will only be returned by this method if the transaction commits successfully.

   callable is allowed to raise an unchecked exception. Typically this prevents further
   attempts to execute callable, and the exception will propagate from this method call.
   However, if a read or query in callable detected that the transaction aborted, callable will be retried even if it raised an exception.

  callable - `com.google.cloud.spanner.TransactionRunner$TransactionCallable`

  returns: `<T> T`"
  ([^TransactionRunner this ^com.google.cloud.spanner.TransactionRunner$TransactionCallable callable]
    (-> this (.run callable))))

(defn get-commit-timestamp
  "Returns the timestamp at which the transaction committed. This method may only be called once
   run(TransactionCallable) has returned normally.

  returns: `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^TransactionRunner this]
    (-> this (.getCommitTimestamp))))

(defn allow-nested-transaction
  "Allows overriding the default behaviour of blocking nested transactions.

   Note that the client library does not maintain any information regarding the nesting
   structure. If an outer transaction fails and an inner transaction succeeds, upon retry of the
   outer transaction, the inner transaction will be re-executed.

   Use with care when certain that the inner transaction is idempotent. Avoid doing this when
   accessing the same db. There might be legitimate uses where access need to be made across DBs
   for instance.

   E.g. of nesting that is discouraged, see nestedReadWriteTxnThrows nestedReadOnlyTxnThrows, nestedBatchTxnThrows, nestedSingleUseReadTxnThrows

  returns: this object - `com.google.cloud.spanner.TransactionRunner`"
  (^com.google.cloud.spanner.TransactionRunner [^TransactionRunner this]
    (-> this (.allowNestedTransaction))))

