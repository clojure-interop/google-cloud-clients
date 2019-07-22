(ns com.google.cloud.spanner.TimestampBound
  "Defines how Cloud Spanner will choose a timestamp for a read-only transaction or a single
  read/query.

  The types of timestamp bound are:


    Strong (the default).
    Bounded staleness.
    Exact staleness.


  If the Cloud Spanner database to be read is geographically distributed, stale read-only
  transactions can execute more quickly than strong or read-write transactions, because they are
  able to execute far from the leader replica.

  Each type of timestamp bound is discussed in detail below.

  Strong reads

  Strong reads are guaranteed to see the effects of all transactions that have committed before
  the start of the read. Furthermore, all rows yielded by a single read are consistent with each
  other - if any part of the read observes a transaction, all parts of the read see the
  transaction.

  Strong reads are not repeatable: two consecutive strong read-only transactions might return
  inconsistent results if there are concurrent writes. If consistency across reads is required, the
  reads should be executed within a transaction or at an exact read timestamp.

  Use strong() to create a bound of this type.

  Exact Staleness

  These timestamp bounds execute reads at a user-specified timestamp. Reads at a timestamp are
  guaranteed to see a consistent prefix of the global transaction history: they observe
  modifications done by all transactions with a commit timestamp less than or equal to the read
  timestamp, and observe none of the modifications done by transactions with a larger commit
  timestamp. They will block until all conflicting transactions that may be assigned commit
  timestamps less than or equal to the read timestamp have finished.

  The timestamp can either be expressed as an absolute Cloud Spanner commit timestamp or a
  staleness relative to the current time.

  These modes do not require a \"negotiation phase\" to pick a timestamp. As a result, they
  execute slightly faster than the equivalent boundedly stale concurrency modes. On the other hand,
  boundedly stale reads usually return fresher results.

  Use ofReadTimestamp(Timestamp) and ofExactStaleness(long, TimeUnit) to
  create a bound of this type.

  Bounded Staleness

  Bounded staleness modes allow Cloud Spanner to pick the read timestamp, subject to a
  user-provided staleness bound. Cloud Spanner chooses the newest timestamp within the staleness
  bound that allows execution of the reads at the closest available replica without blocking.

  All rows yielded are consistent with each other -- if any part of the read observes a
  transaction, all parts of the read see the transaction. Boundedly stale reads are not repeatable:
  two stale reads, even if they use the same staleness bound, can execute at different timestamps
  and thus return inconsistent results.

  Boundedly stale reads execute in two phases: the first phase negotiates a timestamp among all
  replicas needed to serve the read. In the second phase, reads are executed at the negotiated
  timestamp.

  As a result of the two phase execution, bounded staleness reads are usually a little slower
  than comparable exact staleness reads. However, they are typically able to return fresher
  results, and are more likely to execute at the closest replica.

  Because the timestamp negotiation requires up-front knowledge of which rows will be read, it
  can only be used with single-use reads and single-use read-only transactions.

  Use ofMinReadTimestamp(Timestamp) and ofMaxStaleness(long, TimeUnit) to
  create a bound of this type.

  Old Read Timestamps and Garbage Collection

  Cloud Spanner continuously garbage collects deleted and overwritten data in the background to
  reclaim storage space. This process is known as \"version GC\". By default, version GC reclaims
  versions after they are four hours old. Because of this, Cloud Spanner cannot perform reads at
  read timestamps more than four hours in the past. This restriction also applies to in-progress
  reads and/or SQL queries whose timestamp become too old while executing. Reads and SQL queries
  with too-old read timestamps fail with the error ErrorCode.FAILED_PRECONDITION."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner TimestampBound]))

(defn *strong
  "Returns a timestamp bound that will perform reads and queries at a timestamp where all
   previously committed transactions are visible.

  returns: `com.google.cloud.spanner.TimestampBound`"
  (^com.google.cloud.spanner.TimestampBound []
    (TimestampBound/strong )))

(defn *of-read-timestamp
  "Returns a timestamp bound that will perform reads and queries at the given timestamp. Unlike
   other modes, reads at a specific timestamp are repeatable; the same read at the same timestamp
   always returns the same data. If the timestamp is in the future, the read will block until the
   specified timestamp, modulo the read's deadline.

   This mode is useful for large scale consistent reads such as mapreduces, or for coordinating
   many reads against a consistent snapshot of the data.

  timestamp - `com.google.cloud.Timestamp`

  returns: `com.google.cloud.spanner.TimestampBound`"
  (^com.google.cloud.spanner.TimestampBound [^com.google.cloud.Timestamp timestamp]
    (TimestampBound/ofReadTimestamp timestamp)))

(defn *of-min-read-timestamp
  "Returns a timestamp bound that will perform reads and queries at a timestamp chosen to be at
   least timestamp. This is useful for requesting fresher data than some previous read, or
   data that is fresh enough to observe the effects of some previously committed transaction whose
   timestamp is known.

   Note that this option can only be used in single-use reads and single-use read-only
   transactions.

  timestamp - `com.google.cloud.Timestamp`

  returns: `com.google.cloud.spanner.TimestampBound`"
  (^com.google.cloud.spanner.TimestampBound [^com.google.cloud.Timestamp timestamp]
    (TimestampBound/ofMinReadTimestamp timestamp)))

(defn *of-exact-staleness
  "Returns a timestamp bound that will perform reads and queries at an exact staleness. The
   timestamp is chosen soon after the read is started.

   Guarantees that all writes that have committed more than the specified number of seconds ago
   are visible. Because Cloud Spanner chooses the exact timestamp, this mode works even if the
   client's local clock is substantially skewed from Cloud Spanner commit timestamps.

   Useful for reading at nearby replicas without the distributed timestamp negotiation overhead
   of ofMaxStaleness(long, TimeUnit).

  num - `long`
  units - `java.util.concurrent.TimeUnit`

  returns: `com.google.cloud.spanner.TimestampBound`"
  (^com.google.cloud.spanner.TimestampBound [^Long num ^java.util.concurrent.TimeUnit units]
    (TimestampBound/ofExactStaleness num units)))

(defn *of-max-staleness
  "Returns a timestamp bound that will perform reads and queries at a timestamp chosen to be at
   most num units stale. This guarantees that all writes that have committed more than the
   specified number of seconds ago are visible. Because Cloud Spanner chooses the exact timestamp,
   this mode works even if the client's local clock is substantially skewed from Cloud Spanner
   commit timestamps.

   Useful for reading the freshest data available at a nearby replica, while bounding the
   possible staleness if the local replica has fallen behind.

   Note that this option can only be used in single-use reads and single-use read-only
   transactions.

  num - `long`
  units - `java.util.concurrent.TimeUnit`

  returns: `com.google.cloud.spanner.TimestampBound`"
  (^com.google.cloud.spanner.TimestampBound [^Long num ^java.util.concurrent.TimeUnit units]
    (TimestampBound/ofMaxStaleness num units)))

(defn get-mode
  "returns: `com.google.cloud.spanner.TimestampBound$Mode`"
  (^com.google.cloud.spanner.TimestampBound$Mode [^TimestampBound this]
    (-> this (.getMode))))

(defn get-read-timestamp
  "Returns the timestamp at which reads will be performed.

  returns: `com.google.cloud.Timestamp`

  throws: java.lang.IllegalStateException - if mode() != Mode.EXACT_TIMESTAMP"
  (^com.google.cloud.Timestamp [^TimestampBound this]
    (-> this (.getReadTimestamp))))

(defn get-min-read-timestamp
  "Returns the minimum timestamp at which reads will be performed.

  returns: `com.google.cloud.Timestamp`

  throws: java.lang.IllegalStateException - if mode() != Mode.MIN_READ_TIMESTAMP"
  (^com.google.cloud.Timestamp [^TimestampBound this]
    (-> this (.getMinReadTimestamp))))

(defn get-exact-staleness
  "Returns the exact staleness, in the units requested, at which reads will be performed.

  units - `java.util.concurrent.TimeUnit`

  returns: `long`

  throws: java.lang.IllegalStateException - if mode() != Mode.EXACT_STALENESS"
  (^Long [^TimestampBound this ^java.util.concurrent.TimeUnit units]
    (-> this (.getExactStaleness units))))

(defn get-max-staleness
  "Returns the maximum staleness, in the units requested, at which reads will be performed.

  units - `java.util.concurrent.TimeUnit`

  returns: `long`

  throws: java.lang.IllegalStateException - if mode() != Mode.MAX_STALENESS"
  (^Long [^TimestampBound this ^java.util.concurrent.TimeUnit units]
    (-> this (.getMaxStaleness units))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TimestampBound this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TimestampBound this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TimestampBound this]
    (-> this (.hashCode))))

