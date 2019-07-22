(ns com.google.cloud.spanner.ReadOnlyTransaction
  "A transaction type that provides guaranteed consistency across several reads, but does not allow
  writes. Snapshot read-only transactions can be configured to read at timestamps in the past.
  Snapshot read-only transactions do not need to be committed.

  Snapshot read-only transactions provide a simpler method than locking read-write transactions
  for doing several consistent reads. However, this type of transaction does not support writes.

  Snapshot read-only transactions do not take locks. Instead, they work by choosing a Cloud
  Spanner timestamp, then executing all reads at that timestamp. Since they do not acquire locks,
  they do not block concurrent read-write transactions.

  Unlike locking read-write transactions, snapshot read-only transactions never abort. They can
  fail if the chosen read timestamp is garbage collected; however, the default garbage collection
  policy is generous enough that most applications do not need to worry about this in practice. See
  the class documentation of TimestampBound for more details.

  To execute a snapshot transaction, specify a TimestampBound, which tells Cloud Spanner
  how to choose a read timestamp."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ReadOnlyTransaction]))

(defn get-read-timestamp
  "Returns the timestamp chosen to perform reads and queries in this transaction. The value can
   only be read after some read or query has either returned some data or completed without
   returning any data.

  returns: `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^ReadOnlyTransaction this]
    (-> this (.getReadTimestamp))))

