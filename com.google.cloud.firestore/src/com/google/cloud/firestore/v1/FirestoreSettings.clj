(ns com.google.cloud.firestore.v1.FirestoreSettings
  "Settings class to configure an instance of FirestoreClient.

  The default instance has everything set to sensible defaults:


    The default service address (firestore.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of updateDocument to 30 seconds:



  FirestoreSettings.Builder firestoreSettingsBuilder =
      FirestoreSettings.newBuilder();
  firestoreSettingsBuilder.updateDocumentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  FirestoreSettings firestoreSettings = firestoreSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1 FirestoreSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (FirestoreSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (FirestoreSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (FirestoreSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.firestore.v1.FirestoreSettings$Builder`"
  (^com.google.cloud.firestore.v1.FirestoreSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (FirestoreSettings/newBuilder client-context))
  (^com.google.cloud.firestore.v1.FirestoreSettings$Builder []
    (FirestoreSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (FirestoreSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.firestore.v1.stub.FirestoreStubSettings`

  returns: `com.google.cloud.firestore.v1.FirestoreSettings`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.FirestoreSettings [^com.google.cloud.firestore.v1.stub.FirestoreStubSettings stub]
    (FirestoreSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (FirestoreSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (FirestoreSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (FirestoreSettings/getDefaultServiceScopes )))

(defn create-document-settings
  "Returns the object with the settings used for calls to createDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.v1.CreateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreSettings this]
    (-> this (.createDocumentSettings))))

(defn write-settings
  "Returns the object with the settings used for calls to write.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.firestore.v1.WriteRequest,com.google.firestore.v1.WriteResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^FirestoreSettings this]
    (-> this (.writeSettings))))

(defn listen-settings
  "Returns the object with the settings used for calls to listen.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.firestore.v1.ListenRequest,com.google.firestore.v1.ListenResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^FirestoreSettings this]
    (-> this (.listenSettings))))

(defn list-documents-settings
  "Returns the object with the settings used for calls to listDocuments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.firestore.v1.ListDocumentsRequest,com.google.firestore.v1.ListDocumentsResponse,com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^FirestoreSettings this]
    (-> this (.listDocumentsSettings))))

(defn rollback-settings
  "Returns the object with the settings used for calls to rollback.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreSettings this]
    (-> this (.rollbackSettings))))

(defn list-collection-ids-settings
  "Returns the object with the settings used for calls to listCollectionIds.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.firestore.v1.ListCollectionIdsRequest,com.google.firestore.v1.ListCollectionIdsResponse,com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^FirestoreSettings this]
    (-> this (.listCollectionIdsSettings))))

(defn run-query-settings
  "Returns the object with the settings used for calls to runQuery.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.firestore.v1.RunQueryRequest,com.google.firestore.v1.RunQueryResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^FirestoreSettings this]
    (-> this (.runQuerySettings))))

(defn commit-settings
  "Returns the object with the settings used for calls to commit.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.v1.CommitRequest,com.google.firestore.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreSettings this]
    (-> this (.commitSettings))))

(defn begin-transaction-settings
  "Returns the object with the settings used for calls to beginTransaction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.v1.BeginTransactionRequest,com.google.firestore.v1.BeginTransactionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreSettings this]
    (-> this (.beginTransactionSettings))))

(defn get-document-settings
  "Returns the object with the settings used for calls to getDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.v1.GetDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreSettings this]
    (-> this (.getDocumentSettings))))

(defn batch-get-documents-settings
  "Returns the object with the settings used for calls to batchGetDocuments.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.firestore.v1.BatchGetDocumentsRequest,com.google.firestore.v1.BatchGetDocumentsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^FirestoreSettings this]
    (-> this (.batchGetDocumentsSettings))))

(defn update-document-settings
  "Returns the object with the settings used for calls to updateDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.v1.UpdateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreSettings this]
    (-> this (.updateDocumentSettings))))

(defn delete-document-settings
  "Returns the object with the settings used for calls to deleteDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.v1.DeleteDocumentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreSettings this]
    (-> this (.deleteDocumentSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.firestore.v1.FirestoreSettings$Builder`"
  (^com.google.cloud.firestore.v1.FirestoreSettings$Builder [^FirestoreSettings this]
    (-> this (.toBuilder))))

