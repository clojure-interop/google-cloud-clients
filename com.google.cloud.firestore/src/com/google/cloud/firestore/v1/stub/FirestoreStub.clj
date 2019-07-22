(ns com.google.cloud.firestore.v1.stub.FirestoreStub
  "Base stub class for Google Cloud Firestore API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1.stub FirestoreStub]))

(defn ->firestore-stub
  "Constructor."
  (^FirestoreStub []
    (new FirestoreStub )))

(defn get-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.GetDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.getDocumentCallable))))

(defn run-query-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.RunQueryRequest,com.google.firestore.v1.RunQueryResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^FirestoreStub this]
    (-> this (.runQueryCallable))))

(defn write-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.WriteRequest,com.google.firestore.v1.WriteResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^FirestoreStub this]
    (-> this (.writeCallable))))

(defn list-collection-ids-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.firestore.v1.ListCollectionIdsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.listCollectionIdsCallable))))

(defn create-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CreateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.createDocumentCallable))))

(defn list-collection-ids-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.listCollectionIdsPagedCallable))))

(defn listen-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.ListenRequest,com.google.firestore.v1.ListenResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^FirestoreStub this]
    (-> this (.listenCallable))))

(defn list-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.firestore.v1.ListDocumentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.listDocumentsCallable))))

(defn close
  ""
  ([^FirestoreStub this]
    (-> this (.close))))

(defn delete-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.DeleteDocumentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.deleteDocumentCallable))))

(defn commit-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CommitRequest,com.google.firestore.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.commitCallable))))

(defn rollback-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.rollbackCallable))))

(defn list-documents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.listDocumentsPagedCallable))))

(defn batch-get-documents-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.BatchGetDocumentsRequest,com.google.firestore.v1.BatchGetDocumentsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^FirestoreStub this]
    (-> this (.batchGetDocumentsCallable))))

(defn update-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.UpdateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.updateDocumentCallable))))

(defn begin-transaction-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.BeginTransactionRequest,com.google.firestore.v1.BeginTransactionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreStub this]
    (-> this (.beginTransactionCallable))))

