(ns com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder
  "Builder for DocumentsStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub DocumentsStubSettings$Builder]))

(defn create-document-settings
  "Returns the builder for the settings used for calls to createDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DocumentsStubSettings$Builder this]
    (-> this (.createDocumentSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder [^DocumentsStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-documents-settings
  "Returns the builder for the settings used for calls to listDocuments.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.ListDocumentsResponse,com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DocumentsStubSettings$Builder this]
    (-> this (.listDocumentsSettings))))

(defn create-document-operation-settings
  "Returns the builder for the settings used for calls to createDocument.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStubSettings$Builder this]
    (-> this (.createDocumentOperationSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings [^DocumentsStubSettings$Builder this]
    (-> this (.build))))

(defn update-document-operation-settings
  "Returns the builder for the settings used for calls to updateDocument.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStubSettings$Builder this]
    (-> this (.updateDocumentOperationSettings))))

(defn get-document-settings
  "Returns the builder for the settings used for calls to getDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.GetDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DocumentsStubSettings$Builder this]
    (-> this (.getDocumentSettings))))

(defn reload-document-settings
  "Returns the builder for the settings used for calls to reloadDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DocumentsStubSettings$Builder this]
    (-> this (.reloadDocumentSettings))))

(defn update-document-settings
  "Returns the builder for the settings used for calls to updateDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DocumentsStubSettings$Builder this]
    (-> this (.updateDocumentSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^DocumentsStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-document-operation-settings
  "Returns the builder for the settings used for calls to deleteDocument.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.protobuf.Empty,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStubSettings$Builder this]
    (-> this (.deleteDocumentOperationSettings))))

(defn delete-document-settings
  "Returns the builder for the settings used for calls to deleteDocument.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DocumentsStubSettings$Builder this]
    (-> this (.deleteDocumentSettings))))

