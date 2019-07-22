(ns com.google.cloud.firestore.spi.v1.FirestoreRpc
  "Contains the RPC stubs used by the manual Cloud Firestore client."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.spi.v1 FirestoreRpc]))

(defn run-query-callable
  "Runs a query.

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.RunQueryRequest,com.google.firestore.v1.RunQueryResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^FirestoreRpc this]
    (-> this (.runQueryCallable))))

(defn list-collection-ids-paged-callable
  "Returns a list of collections IDs.

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreRpc this]
    (-> this (.listCollectionIdsPagedCallable))))

(defn get-executor
  "Returns the executor used by the GAPIC client.

  returns: `java.util.concurrent.ScheduledExecutorService`"
  (^java.util.concurrent.ScheduledExecutorService [^FirestoreRpc this]
    (-> this (.getExecutor))))

(defn listen-callable
  "Returns a bi-directional watch stream.

  returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.ListenRequest,com.google.firestore.v1.ListenResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^FirestoreRpc this]
    (-> this (.listenCallable))))

(defn commit-callable
  "Commits a transaction, while optionally updating documents.

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CommitRequest,com.google.firestore.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreRpc this]
    (-> this (.commitCallable))))

(defn rollback-callable
  "Rolls back a transaction.

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreRpc this]
    (-> this (.rollbackCallable))))

(defn list-documents-paged-callable
  "Returns a list of documents.

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreRpc this]
    (-> this (.listDocumentsPagedCallable))))

(defn batch-get-documents-callable
  "Gets multiple documents.

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.BatchGetDocumentsRequest,com.google.firestore.v1.BatchGetDocumentsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^FirestoreRpc this]
    (-> this (.batchGetDocumentsCallable))))

(defn begin-transaction-callable
  "Starts a new transaction.

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.BeginTransactionRequest,com.google.firestore.v1.BeginTransactionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreRpc this]
    (-> this (.beginTransactionCallable))))

