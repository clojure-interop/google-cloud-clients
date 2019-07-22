(ns com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings
  "Settings class to configure an instance of DocumentsStub.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDocument to 30 seconds:



  DocumentsStubSettings.Builder documentsSettingsBuilder =
      DocumentsStubSettings.newBuilder();
  documentsSettingsBuilder.getDocumentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DocumentsStubSettings documentsSettings = documentsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub DocumentsStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DocumentsStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DocumentsStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DocumentsStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DocumentsStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DocumentsStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DocumentsStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DocumentsStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DocumentsStubSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder []
    (DocumentsStubSettings/newBuilder )))

(defn create-document-settings
  "Returns the object with the settings used for calls to createDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsStubSettings this]
    (-> this (.createDocumentSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.DocumentsStub`

  throws: java.io.IOException"
  ([^DocumentsStubSettings this]
    (-> this (.createStub))))

(defn list-documents-settings
  "Returns the object with the settings used for calls to listDocuments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.ListDocumentsResponse,com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DocumentsStubSettings this]
    (-> this (.listDocumentsSettings))))

(defn create-document-operation-settings
  "Returns the object with the settings used for calls to createDocument.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStubSettings this]
    (-> this (.createDocumentOperationSettings))))

(defn update-document-operation-settings
  "Returns the object with the settings used for calls to updateDocument.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStubSettings this]
    (-> this (.updateDocumentOperationSettings))))

(defn get-document-settings
  "Returns the object with the settings used for calls to getDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsStubSettings this]
    (-> this (.getDocumentSettings))))

(defn reload-document-settings
  "Returns the object with the settings used for calls to reloadDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsStubSettings this]
    (-> this (.reloadDocumentSettings))))

(defn update-document-settings
  "Returns the object with the settings used for calls to updateDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsStubSettings this]
    (-> this (.updateDocumentSettings))))

(defn delete-document-operation-settings
  "Returns the object with the settings used for calls to deleteDocument.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.protobuf.Empty,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStubSettings this]
    (-> this (.deleteDocumentOperationSettings))))

(defn delete-document-settings
  "Returns the object with the settings used for calls to deleteDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsStubSettings this]
    (-> this (.deleteDocumentSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder [^DocumentsStubSettings this]
    (-> this (.toBuilder))))

