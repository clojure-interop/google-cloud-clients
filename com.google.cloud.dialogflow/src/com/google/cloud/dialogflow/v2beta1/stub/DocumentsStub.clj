(ns com.google.cloud.dialogflow.v2beta1.stub.DocumentsStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub DocumentsStub]))

(defn ->documents-stub
  "Constructor."
  (^DocumentsStub []
    (new DocumentsStub )))

(defn get-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsStub this]
    (-> this (.getDocumentCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^DocumentsStub this]
    (-> this (.getOperationsStub))))

(defn create-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsStub this]
    (-> this (.createDocumentCallable))))

(defn update-document-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStub this]
    (-> this (.updateDocumentOperationCallable))))

(defn reload-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsStub this]
    (-> this (.reloadDocumentCallable))))

(defn list-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.ListDocumentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsStub this]
    (-> this (.listDocumentsCallable))))

(defn delete-document-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.protobuf.Empty,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStub this]
    (-> this (.deleteDocumentOperationCallable))))

(defn close
  ""
  ([^DocumentsStub this]
    (-> this (.close))))

(defn delete-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsStub this]
    (-> this (.deleteDocumentCallable))))

(defn list-documents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsStub this]
    (-> this (.listDocumentsPagedCallable))))

(defn create-document-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsStub this]
    (-> this (.createDocumentOperationCallable))))

(defn update-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsStub this]
    (-> this (.updateDocumentCallable))))

