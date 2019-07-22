(ns com.google.cloud.dialogflow.v2beta1.DocumentsSettings
  "Settings class to configure an instance of DocumentsClient.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDocument to 30 seconds:



  DocumentsSettings.Builder documentsSettingsBuilder =
      DocumentsSettings.newBuilder();
  documentsSettingsBuilder.getDocumentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DocumentsSettings documentsSettings = documentsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 DocumentsSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DocumentsSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DocumentsSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DocumentsSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.DocumentsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.DocumentsSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DocumentsSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.DocumentsSettings$Builder []
    (DocumentsSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DocumentsSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.DocumentsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.DocumentsSettings [^com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings stub]
    (DocumentsSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DocumentsSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DocumentsSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DocumentsSettings/getDefaultServiceScopes )))

(defn create-document-settings
  "Returns the object with the settings used for calls to createDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsSettings this]
    (-> this (.createDocumentSettings))))

(defn list-documents-settings
  "Returns the object with the settings used for calls to listDocuments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.ListDocumentsResponse,com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DocumentsSettings this]
    (-> this (.listDocumentsSettings))))

(defn create-document-operation-settings
  "Returns the object with the settings used for calls to createDocument.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsSettings this]
    (-> this (.createDocumentOperationSettings))))

(defn update-document-operation-settings
  "Returns the object with the settings used for calls to updateDocument.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsSettings this]
    (-> this (.updateDocumentOperationSettings))))

(defn get-document-settings
  "Returns the object with the settings used for calls to getDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsSettings this]
    (-> this (.getDocumentSettings))))

(defn reload-document-settings
  "Returns the object with the settings used for calls to reloadDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsSettings this]
    (-> this (.reloadDocumentSettings))))

(defn update-document-settings
  "Returns the object with the settings used for calls to updateDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsSettings this]
    (-> this (.updateDocumentSettings))))

(defn delete-document-operation-settings
  "Returns the object with the settings used for calls to deleteDocument.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.protobuf.Empty,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsSettings this]
    (-> this (.deleteDocumentOperationSettings))))

(defn delete-document-settings
  "Returns the object with the settings used for calls to deleteDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DocumentsSettings this]
    (-> this (.deleteDocumentSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.DocumentsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.DocumentsSettings$Builder [^DocumentsSettings this]
    (-> this (.toBuilder))))

