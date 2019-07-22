(ns com.google.cloud.spanner.Session
  "A Session can be used to perform transactions that read and/or modify data in a Cloud
  Spanner database.

  Sessions can only execute one transaction at a time. To execute multiple concurrent
  read-write/write-only transactions, create multiple sessions. Note that standalone reads and
  queries use a transaction internally, and count toward the one transaction limit.

  Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
  good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner can
  delete sessions for which no operations are sent for more than an hour, or due to internal
  errors. If a session is deleted, requests to it return ErrorCode.NOT_FOUND.

  Idle sessions can be kept alive by sending a trivial SQL query periodically, for example,
  SELECT 1.

  Sessions are long-lived objects intended to be reused for many consecutive operations; a
  typical application will maintain a pool of sessions to use during its lifetime.

  Since only one transaction can be performed at a time within any given session, instances
  require external synchronization; Session implementations are not required to be
  thread-safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Session]))

(defn get-name
  "Returns the resource name associated with this session.

  returns: `java.lang.String`"
  (^java.lang.String [^Session this]
    (-> this (.getName))))

(defn prepare-read-write-transaction
  "Prepares a transaction for use by a subsequent DatabaseClient.readWriteTransaction() or DatabaseClient.write(Iterable) call. It is not necessary to call this method before running a transaction or
   performing a write, but doing so may allow one round trip of the protocol to be performed in
   advance; calling this method on an idle session that is expected to execute a transaction or
   write in the near future may reduce the latency of the subsequent transaction/write."
  ([^Session this]
    (-> this (.prepareReadWriteTransaction))))

(defn close
  ""
  ([^Session this]
    (-> this (.close))))

