(ns com.google.cloud.spanner.TransactionRunner$TransactionCallable
  "A unit of work to be performed in the context of a transaction."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner TransactionRunner$TransactionCallable]))

(defn run
  "Invoked by the library framework to perform a single attempt of a transaction. This method
   may be called more than once if previous transaction attempts aborted. Each invocation can
   perform zero or more reads or queries and can buffer mutations to be applied to the database
   when the transaction commits.

   The framework will attempt to commit the transaction when this method returns normally. If
   commit is successful, the return value from this method will be returned from TransactionRunner.run(TransactionCallable); on failure, the transaction may be retried by
   the framework by calling the method again.

   If this method raises an exception, one of two things can happen. If some operation in the
   transaction has previously detected that the transaction has been aborted, the framework may
   retry the transaction. Otherwise, the framework will roll back the transaction, releasing any
   locks held, and yield the exception to the caller as a SpannerException of type
   ErrorCode.UNKNOWN with the exception as the cause.

  transaction - `com.google.cloud.spanner.TransactionContext`

  returns: `T`

  throws: java.lang.Exception"
  ([^TransactionRunner$TransactionCallable this ^com.google.cloud.spanner.TransactionContext transaction]
    (-> this (.run transaction))))

