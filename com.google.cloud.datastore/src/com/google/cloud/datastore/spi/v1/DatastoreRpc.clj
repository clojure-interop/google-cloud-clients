(ns com.google.cloud.datastore.spi.v1.DatastoreRpc
  "Provides access to the remote Datastore service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore.spi.v1 DatastoreRpc]))

(defn allocate-ids
  "Sends an allocate IDs request.

  request - `com.google.datastore.v1.AllocateIdsRequest`

  returns: `com.google.datastore.v1.AllocateIdsResponse`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.datastore.v1.AllocateIdsResponse [^DatastoreRpc this ^com.google.datastore.v1.AllocateIdsRequest request]
    (-> this (.allocateIds request))))

(defn begin-transaction
  "Sends a begin transaction request.

  request - `com.google.datastore.v1.BeginTransactionRequest`

  returns: `com.google.datastore.v1.BeginTransactionResponse`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.datastore.v1.BeginTransactionResponse [^DatastoreRpc this ^com.google.datastore.v1.BeginTransactionRequest request]
    (-> this (.beginTransaction request))))

(defn commit
  "Sends a commit request.

  request - `com.google.datastore.v1.CommitRequest`

  returns: `com.google.datastore.v1.CommitResponse`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.datastore.v1.CommitResponse [^DatastoreRpc this ^com.google.datastore.v1.CommitRequest request]
    (-> this (.commit request))))

(defn lookup
  "Sends a lookup request.

  request - `com.google.datastore.v1.LookupRequest`

  returns: `com.google.datastore.v1.LookupResponse`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.datastore.v1.LookupResponse [^DatastoreRpc this ^com.google.datastore.v1.LookupRequest request]
    (-> this (.lookup request))))

(defn rollback
  "Sends a rollback request.

  request - `com.google.datastore.v1.RollbackRequest`

  returns: `com.google.datastore.v1.RollbackResponse`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.datastore.v1.RollbackResponse [^DatastoreRpc this ^com.google.datastore.v1.RollbackRequest request]
    (-> this (.rollback request))))

(defn run-query
  "Sends a request to run a query.

  request - `com.google.datastore.v1.RunQueryRequest`

  returns: `com.google.datastore.v1.RunQueryResponse`

  throws: com.google.cloud.datastore.DatastoreException - upon failure"
  (^com.google.datastore.v1.RunQueryResponse [^DatastoreRpc this ^com.google.datastore.v1.RunQueryRequest request]
    (-> this (.runQuery request))))

