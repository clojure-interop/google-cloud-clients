(ns com.google.cloud.firestore.spi.v1.GrpcFirestoreRpc
  "GRPC client implementation of the Firestore RPC methods. Exposes FirestoreOptions on top of the
  GRPC-based Firestore GAPIC client."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.spi.v1 GrpcFirestoreRpc]))

(defn ->grpc-firestore-rpc
  "Constructor.

  options - `com.google.cloud.firestore.FirestoreOptions`

  throws: java.io.IOException"
  (^GrpcFirestoreRpc [^com.google.cloud.firestore.FirestoreOptions options]
    (new GrpcFirestoreRpc options)))

(defn run-query-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.RunQueryRequest,com.google.firestore.v1.RunQueryResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^GrpcFirestoreRpc this]
    (-> this (.runQueryCallable))))

(defn list-collection-ids-paged-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreRpc this]
    (-> this (.listCollectionIdsPagedCallable))))

(defn get-executor
  "Description copied from interface: FirestoreRpc

  returns: `java.util.concurrent.ScheduledExecutorService`"
  (^java.util.concurrent.ScheduledExecutorService [^GrpcFirestoreRpc this]
    (-> this (.getExecutor))))

(defn listen-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.ListenRequest,com.google.firestore.v1.ListenResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^GrpcFirestoreRpc this]
    (-> this (.listenCallable))))

(defn close
  "throws: java.lang.Exception"
  ([^GrpcFirestoreRpc this]
    (-> this (.close))))

(defn commit-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CommitRequest,com.google.firestore.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreRpc this]
    (-> this (.commitCallable))))

(defn rollback-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreRpc this]
    (-> this (.rollbackCallable))))

(defn list-documents-paged-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreRpc this]
    (-> this (.listDocumentsPagedCallable))))

(defn batch-get-documents-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.BatchGetDocumentsRequest,com.google.firestore.v1.BatchGetDocumentsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^GrpcFirestoreRpc this]
    (-> this (.batchGetDocumentsCallable))))

(defn begin-transaction-callable
  "Description copied from interface: FirestoreRpc

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.BeginTransactionRequest,com.google.firestore.v1.BeginTransactionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreRpc this]
    (-> this (.beginTransactionCallable))))

