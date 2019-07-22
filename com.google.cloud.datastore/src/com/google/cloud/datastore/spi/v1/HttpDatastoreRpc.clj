(ns com.google.cloud.datastore.spi.v1.HttpDatastoreRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore.spi.v1 HttpDatastoreRpc]))

(defn ->http-datastore-rpc
  "Constructor.

  options - `com.google.cloud.datastore.DatastoreOptions`"
  (^HttpDatastoreRpc [^com.google.cloud.datastore.DatastoreOptions options]
    (new HttpDatastoreRpc options)))

(defn allocate-ids
  "Description copied from interface: DatastoreRpc

  request - `com.google.datastore.v1.AllocateIdsRequest`

  returns: `com.google.datastore.v1.AllocateIdsResponse`"
  (^com.google.datastore.v1.AllocateIdsResponse [^HttpDatastoreRpc this ^com.google.datastore.v1.AllocateIdsRequest request]
    (-> this (.allocateIds request))))

(defn begin-transaction
  "Description copied from interface: DatastoreRpc

  request - `com.google.datastore.v1.BeginTransactionRequest`

  returns: `com.google.datastore.v1.BeginTransactionResponse`"
  (^com.google.datastore.v1.BeginTransactionResponse [^HttpDatastoreRpc this ^com.google.datastore.v1.BeginTransactionRequest request]
    (-> this (.beginTransaction request))))

(defn commit
  "Description copied from interface: DatastoreRpc

  request - `com.google.datastore.v1.CommitRequest`

  returns: `com.google.datastore.v1.CommitResponse`"
  (^com.google.datastore.v1.CommitResponse [^HttpDatastoreRpc this ^com.google.datastore.v1.CommitRequest request]
    (-> this (.commit request))))

(defn lookup
  "Description copied from interface: DatastoreRpc

  request - `com.google.datastore.v1.LookupRequest`

  returns: `com.google.datastore.v1.LookupResponse`"
  (^com.google.datastore.v1.LookupResponse [^HttpDatastoreRpc this ^com.google.datastore.v1.LookupRequest request]
    (-> this (.lookup request))))

(defn rollback
  "Description copied from interface: DatastoreRpc

  request - `com.google.datastore.v1.RollbackRequest`

  returns: `com.google.datastore.v1.RollbackResponse`"
  (^com.google.datastore.v1.RollbackResponse [^HttpDatastoreRpc this ^com.google.datastore.v1.RollbackRequest request]
    (-> this (.rollback request))))

(defn run-query
  "Description copied from interface: DatastoreRpc

  request - `com.google.datastore.v1.RunQueryRequest`

  returns: `com.google.datastore.v1.RunQueryResponse`"
  (^com.google.datastore.v1.RunQueryResponse [^HttpDatastoreRpc this ^com.google.datastore.v1.RunQueryRequest request]
    (-> this (.runQuery request))))

