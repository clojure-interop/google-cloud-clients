(ns com.google.cloud.firestore.v1.FirestoreSettings$Builder
  "Builder for FirestoreSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1 FirestoreSettings$Builder]))

(defn create-document-settings
  "Returns the builder for the settings used for calls to createDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.v1.CreateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.createDocumentSettings))))

(defn write-settings
  "Returns the builder for the settings used for calls to write.

  returns: `com.google.api.gax.rpc.StreamingCallSettings.Builder<com.google.firestore.v1.WriteRequest,com.google.firestore.v1.WriteResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.writeSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.firestore.v1.FirestoreSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.firestore.v1.FirestoreSettings$Builder [^FirestoreSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn listen-settings
  "Returns the builder for the settings used for calls to listen.

  returns: `com.google.api.gax.rpc.StreamingCallSettings.Builder<com.google.firestore.v1.ListenRequest,com.google.firestore.v1.ListenResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.listenSettings))))

(defn list-documents-settings
  "Returns the builder for the settings used for calls to listDocuments.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.firestore.v1.ListDocumentsRequest,com.google.firestore.v1.ListDocumentsResponse,com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.listDocumentsSettings))))

(defn rollback-settings
  "Returns the builder for the settings used for calls to rollback.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.rollbackSettings))))

(defn list-collection-ids-settings
  "Returns the builder for the settings used for calls to listCollectionIds.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.firestore.v1.ListCollectionIdsRequest,com.google.firestore.v1.ListCollectionIdsResponse,com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.listCollectionIdsSettings))))

(defn run-query-settings
  "Returns the builder for the settings used for calls to runQuery.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings.Builder<com.google.firestore.v1.RunQueryRequest,com.google.firestore.v1.RunQueryResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.runQuerySettings))))

(defn commit-settings
  "Returns the builder for the settings used for calls to commit.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.v1.CommitRequest,com.google.firestore.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.commitSettings))))

(defn build
  "returns: `com.google.cloud.firestore.v1.FirestoreSettings`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.FirestoreSettings [^FirestoreSettings$Builder this]
    (-> this (.build))))

(defn begin-transaction-settings
  "Returns the builder for the settings used for calls to beginTransaction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.v1.BeginTransactionRequest,com.google.firestore.v1.BeginTransactionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.beginTransactionSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.firestore.v1.stub.FirestoreStubSettings$Builder`"
  (^com.google.cloud.firestore.v1.stub.FirestoreStubSettings$Builder [^FirestoreSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn get-document-settings
  "Returns the builder for the settings used for calls to getDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.v1.GetDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.getDocumentSettings))))

(defn batch-get-documents-settings
  "Returns the builder for the settings used for calls to batchGetDocuments.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings.Builder<com.google.firestore.v1.BatchGetDocumentsRequest,com.google.firestore.v1.BatchGetDocumentsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.batchGetDocumentsSettings))))

(defn update-document-settings
  "Returns the builder for the settings used for calls to updateDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.v1.UpdateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.updateDocumentSettings))))

(defn delete-document-settings
  "Returns the builder for the settings used for calls to deleteDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.v1.DeleteDocumentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreSettings$Builder this]
    (-> this (.deleteDocumentSettings))))

