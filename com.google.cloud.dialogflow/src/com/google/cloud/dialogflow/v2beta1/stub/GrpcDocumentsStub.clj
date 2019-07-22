(ns com.google.cloud.dialogflow.v2beta1.stub.GrpcDocumentsStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub GrpcDocumentsStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.GrpcDocumentsStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcDocumentsStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcDocumentsStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcDocumentsStub [^com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings settings]
    (GrpcDocumentsStub/create settings)))

(defn get-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDocumentsStub this]
    (-> this (.getDocumentCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcDocumentsStub this]
    (-> this (.getOperationsStub))))

(defn create-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDocumentsStub this]
    (-> this (.createDocumentCallable))))

(defn update-document-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^GrpcDocumentsStub this]
    (-> this (.updateDocumentOperationCallable))))

(defn reload-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDocumentsStub this]
    (-> this (.reloadDocumentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcDocumentsStub this]
    (-> this (.isShutdown))))

(defn list-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.ListDocumentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDocumentsStub this]
    (-> this (.listDocumentsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcDocumentsStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcDocumentsStub this]
    (-> this (.shutdown))))

(defn delete-document-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.protobuf.Empty,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^GrpcDocumentsStub this]
    (-> this (.deleteDocumentOperationCallable))))

(defn close
  ""
  ([^GrpcDocumentsStub this]
    (-> this (.close))))

(defn delete-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDocumentsStub this]
    (-> this (.deleteDocumentCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcDocumentsStub this]
    (-> this (.isTerminated))))

(defn list-documents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDocumentsStub this]
    (-> this (.listDocumentsPagedCallable))))

(defn create-document-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^GrpcDocumentsStub this]
    (-> this (.createDocumentOperationCallable))))

(defn shutdown-now
  ""
  ([^GrpcDocumentsStub this]
    (-> this (.shutdownNow))))

(defn update-document-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDocumentsStub this]
    (-> this (.updateDocumentCallable))))

