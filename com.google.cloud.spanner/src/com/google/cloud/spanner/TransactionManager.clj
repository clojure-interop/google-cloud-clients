(ns com.google.cloud.spanner.TransactionManager
  "An interface for managing the life cycle of a read write transaction including all its retries.
  See TransactionContext for a description of transaction semantics.

  At any point in time there can be at most one active transaction in this manager. When that
  transaction is committed, if it fails with an ABORTED error, calling resetForRetry() would create a new TransactionContext. The newly created transaction
  would use the same session thus increasing its lock priority. If the transaction is committed
  successfully, or is rolled back or commit fails with any error other than ABORTED, the
  manager is considered complete and no further transactions are allowed to be created in it.

  Every TransactionManager should either be committed or rolled back. Failure to do so
  can cause resources to be leaked and deadlocks. Easiest way to guarantee this is by calling
  close() in a finally block."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner TransactionManager]))

(defn begin
  "Creates a new read write transaction. This must be called before doing any other operation and
   can only be called once. To create a new transaction for subsequent retries, see resetForRetry().

  returns: `com.google.cloud.spanner.TransactionContext`"
  (^com.google.cloud.spanner.TransactionContext [^TransactionManager this]
    (-> this (.begin))))

(defn commit
  "Commits the currently active transaction. If the transaction was already aborted, then this
   would throw an AbortedException."
  ([^TransactionManager this]
    (-> this (.commit))))

(defn rollback
  "Rolls back the currently active transaction. In most cases there should be no need to call this
   explicitly since close() would automatically roll back any active transaction."
  ([^TransactionManager this]
    (-> this (.rollback))))

(defn reset-for-retry
  "Creates a new transaction for retry. This should only be called if the previous transaction
   failed with ABORTED. In all other cases, this will throw an IllegalStateException. Users should backoff before calling this method. Backoff delay is
   specified by SpannerException.getRetryDelayInMillis() on the SpannerException
   throw by the previous commit call.

  returns: `com.google.cloud.spanner.TransactionContext`"
  (^com.google.cloud.spanner.TransactionContext [^TransactionManager this]
    (-> this (.resetForRetry))))

(defn get-commit-timestamp
  "Returns the commit timestamp if the transaction committed successfully otherwise it will throw
   IllegalStateException.

  returns: `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^TransactionManager this]
    (-> this (.getCommitTimestamp))))

(defn get-state
  "Returns the state of the transaction.

  returns: `com.google.cloud.spanner.TransactionManager$TransactionState`"
  (^com.google.cloud.spanner.TransactionManager$TransactionState [^TransactionManager this]
    (-> this (.getState))))

(defn close
  "Closes the manager. If there is an active transaction, it will be rolled back. Underlying
   session will be released back to the session pool."
  ([^TransactionManager this]
    (-> this (.close))))

