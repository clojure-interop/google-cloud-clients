(ns com.google.cloud.spanner.BatchClientImpl
  "Default implementation for Batch Client interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner BatchClientImpl]))

(defn batch-read-only-transaction
  "Description copied from interface: BatchClient

  bound - the timestamp bound at which to perform the read SNIPPET batch_client_strong_read BatchReadOnlyTransaction txn = batchClient.batchReadOnlyTransaction(TimestampBound.strong()); SNIPPET batch_client_strong_read - `com.google.cloud.spanner.TimestampBound`

  returns: `com.google.cloud.spanner.BatchReadOnlyTransaction`"
  (^com.google.cloud.spanner.BatchReadOnlyTransaction [^BatchClientImpl this ^com.google.cloud.spanner.TimestampBound bound]
    (-> this (.batchReadOnlyTransaction bound))))

