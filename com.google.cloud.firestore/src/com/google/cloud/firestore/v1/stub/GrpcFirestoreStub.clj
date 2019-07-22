(ns com.google.cloud.firestore.v1.stub.GrpcFirestoreStub
  "gRPC stub implementation for Google Cloud Firestore API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1.stub GrpcFirestoreStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.firestore.v1.stub.GrpcFirestoreStub`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.stub.GrpcFirestoreStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcFirestoreStub/create client-context callable-factory))
  (^com.google.cloud.firestore.v1.stub.GrpcFirestoreStub [^com.google.cloud.firestore.v1.stub.FirestoreStubSettings settings]
    (GrpcFirestoreStub/create settings)))

(defn get-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.GetDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.getDocumentCallable))))

(defn run-query-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.RunQueryRequest,com.google.firestore.v1.RunQueryResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^GrpcFirestoreStub this]
    (-> this (.runQueryCallable))))

(defn write-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.WriteRequest,com.google.firestore.v1.WriteResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^GrpcFirestoreStub this]
    (-> this (.writeCallable))))

(defn list-collection-ids-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.firestore.v1.ListCollectionIdsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.listCollectionIdsCallable))))

(defn create-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CreateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.createDocumentCallable))))

(defn list-collection-ids-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.listCollectionIdsPagedCallable))))

(defn listen-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.ListenRequest,com.google.firestore.v1.ListenResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^GrpcFirestoreStub this]
    (-> this (.listenCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcFirestoreStub this]
    (-> this (.isShutdown))))

(defn list-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.firestore.v1.ListDocumentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.listDocumentsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcFirestoreStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcFirestoreStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcFirestoreStub this]
    (-> this (.close))))

(defn delete-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.DeleteDocumentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.deleteDocumentCallable))))

(defn commit-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CommitRequest,com.google.firestore.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.commitCallable))))

(defn rollback-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.rollbackCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcFirestoreStub this]
    (-> this (.isTerminated))))

(defn list-documents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.listDocumentsPagedCallable))))

(defn batch-get-documents-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.BatchGetDocumentsRequest,com.google.firestore.v1.BatchGetDocumentsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^GrpcFirestoreStub this]
    (-> this (.batchGetDocumentsCallable))))

(defn shutdown-now
  ""
  ([^GrpcFirestoreStub this]
    (-> this (.shutdownNow))))

(defn update-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.UpdateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.updateDocumentCallable))))

(defn begin-transaction-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.BeginTransactionRequest,com.google.firestore.v1.BeginTransactionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreStub this]
    (-> this (.beginTransactionCallable))))

