(ns com.google.cloud.dialogflow.v2beta1.DocumentsClient
  "Service Description: Manages documents of a knowledge base.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DocumentsClient documentsClient = DocumentsClient.create()) {
    DocumentName name = DocumentName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\", \"[DOCUMENT]\");
    Document response = documentsClient.getDocument(name);
  }

  Note: close() needs to be called on the documentsClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of DocumentsSettings to create().
  For example:

  To customize credentials:



  DocumentsSettings documentsSettings =
      DocumentsSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DocumentsClient documentsClient =
      DocumentsClient.create(documentsSettings);

  To customize the endpoint:



  DocumentsSettings documentsSettings =
      DocumentsSettings.newBuilder().setEndpoint(myEndpoint).build();
  DocumentsClient documentsClient =
      DocumentsClient.create(documentsSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 DocumentsClient]))

(defn *create
  "Constructs an instance of DocumentsClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2beta1.DocumentsSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.DocumentsClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.DocumentsClient [^com.google.cloud.dialogflow.v2beta1.DocumentsSettings settings]
    (DocumentsClient/create settings))
  (^com.google.cloud.dialogflow.v2beta1.DocumentsClient []
    (DocumentsClient/create )))

(defn get-document-callable
  "Retrieves the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     DocumentName name = DocumentName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\", \"[DOCUMENT]\");
     GetDocumentRequest request = GetDocumentRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Document> future = documentsClient.getDocumentCallable().futureCall(request);
     // Do something
     Document response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsClient this]
    (-> this (.getDocumentCallable))))

(defn get-document
  "Retrieves the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     DocumentName name = DocumentName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\", \"[DOCUMENT]\");
     Document response = documentsClient.getDocument(name);
   }

  name - Required. The name of the document to retrieve. Format `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`. - `com.google.cloud.dialogflow.v2beta1.DocumentName`

  returns: `com.google.cloud.dialogflow.v2beta1.Document`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.Document [^DocumentsClient this ^com.google.cloud.dialogflow.v2beta1.DocumentName name]
    (-> this (.getDocument name))))

(defn delete-document-async
  "Deletes the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     DocumentName name = DocumentName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\", \"[DOCUMENT]\");
     documentsClient.deleteDocumentAsync(name).get();
   }

  name - The name of the document to delete. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`. - `com.google.cloud.dialogflow.v2beta1.DocumentName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DocumentsClient this ^com.google.cloud.dialogflow.v2beta1.DocumentName name]
    (-> this (.deleteDocumentAsync name))))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2beta1.DocumentsSettings`"
  (^com.google.cloud.dialogflow.v2beta1.DocumentsSettings [^DocumentsClient this]
    (-> this (.getSettings))))

(defn create-document-callable
  "Creates a new document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     KnowledgeBaseName parent = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     Document document = Document.newBuilder().build();
     CreateDocumentRequest request = CreateDocumentRequest.newBuilder()
       .setParent(parent.toString())
       .setDocument(document)
       .build();
     ApiFuture<Operation> future = documentsClient.createDocumentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsClient this]
    (-> this (.createDocumentCallable))))

(defn reload-document
  "Reloads the specified document from its specified source, content_uri or content. The
   previously loaded content of the document will be deleted. Note: Even when the content of the
   document has not changed, there still may be side effects because of internal implementation
   changes.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     ReloadDocumentRequest request = ReloadDocumentRequest.newBuilder().build();
     Operation response = documentsClient.reloadDocument(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest`

  returns: `com.google.longrunning.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.longrunning.Operation [^DocumentsClient this ^com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest request]
    (-> this (.reloadDocument request))))

(defn update-document-operation-callable
  "Updates the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     Document document = Document.newBuilder().build();
     UpdateDocumentRequest request = UpdateDocumentRequest.newBuilder()
       .setDocument(document)
       .build();
     OperationFuture<Document, KnowledgeOperationMetadata> future = documentsClient.updateDocumentOperationCallable().futureCall(request);
     // Do something
     Document response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsClient this]
    (-> this (.updateDocumentOperationCallable))))

(defn update-document-async
  "Updates the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     Document document = Document.newBuilder().build();
     Document response = documentsClient.updateDocumentAsync(document).get();
   }

  document - Required. The document to update. - `com.google.cloud.dialogflow.v2beta1.Document`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DocumentsClient this ^com.google.cloud.dialogflow.v2beta1.Document document]
    (-> this (.updateDocumentAsync document))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.DocumentsStub`"
  ([^DocumentsClient this]
    (-> this (.getStub))))

(defn reload-document-callable
  "Reloads the specified document from its specified source, content_uri or content. The
   previously loaded content of the document will be deleted. Note: Even when the content of the
   document has not changed, there still may be side effects because of internal implementation
   changes.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     ReloadDocumentRequest request = ReloadDocumentRequest.newBuilder().build();
     ApiFuture<Operation> future = documentsClient.reloadDocumentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsClient this]
    (-> this (.reloadDocumentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DocumentsClient this]
    (-> this (.isShutdown))))

(defn list-documents-callable
  "Returns the list of all documents of the knowledge base.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     KnowledgeBaseName parent = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     ListDocumentsRequest request = ListDocumentsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDocumentsResponse response = documentsClient.listDocumentsCallable().call(request);
       for (Document element : response.getDocumentsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.ListDocumentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsClient this]
    (-> this (.listDocumentsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DocumentsClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^DocumentsClient this]
    (-> this (.shutdown))))

(defn delete-document-operation-callable
  "Deletes the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     DocumentName name = DocumentName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\", \"[DOCUMENT]\");
     DeleteDocumentRequest request = DeleteDocumentRequest.newBuilder()
       .setName(name.toString())
       .build();
     OperationFuture<Empty, KnowledgeOperationMetadata> future = documentsClient.deleteDocumentOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.protobuf.Empty,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsClient this]
    (-> this (.deleteDocumentOperationCallable))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^DocumentsClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^DocumentsClient this]
    (-> this (.close))))

(defn list-documents
  "Returns the list of all documents of the knowledge base.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     KnowledgeBaseName parent = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     for (Document element : documentsClient.listDocuments(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The knowledge base to list all documents for. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`. - `com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName`

  returns: `com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse [^DocumentsClient this ^com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName parent]
    (-> this (.listDocuments parent))))

(defn delete-document-callable
  "Deletes the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     DocumentName name = DocumentName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\", \"[DOCUMENT]\");
     DeleteDocumentRequest request = DeleteDocumentRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = documentsClient.deleteDocumentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsClient this]
    (-> this (.deleteDocumentCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DocumentsClient this]
    (-> this (.isTerminated))))

(defn list-documents-paged-callable
  "Returns the list of all documents of the knowledge base.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     KnowledgeBaseName parent = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     ListDocumentsRequest request = ListDocumentsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDocumentsPagedResponse> future = documentsClient.listDocumentsPagedCallable().futureCall(request);
     // Do something
     for (Document element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest,com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsClient this]
    (-> this (.listDocumentsPagedCallable))))

(defn create-document-async
  "Creates a new document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     KnowledgeBaseName parent = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     Document document = Document.newBuilder().build();
     Document response = documentsClient.createDocumentAsync(parent, document).get();
   }

  parent - Required. The knoweldge base to create a document for. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`. - `com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName`
  document - Required. The document to create. - `com.google.cloud.dialogflow.v2beta1.Document`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DocumentsClient this ^com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName parent ^com.google.cloud.dialogflow.v2beta1.Document document]
    (-> this (.createDocumentAsync parent document)))
  ([^DocumentsClient this ^com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest request]
    (-> this (.createDocumentAsync request))))

(defn create-document-operation-callable
  "Creates a new document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     KnowledgeBaseName parent = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     Document document = Document.newBuilder().build();
     CreateDocumentRequest request = CreateDocumentRequest.newBuilder()
       .setParent(parent.toString())
       .setDocument(document)
       .build();
     OperationFuture<Document, KnowledgeOperationMetadata> future = documentsClient.createDocumentOperationCallable().futureCall(request);
     // Do something
     Document response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest,com.google.cloud.dialogflow.v2beta1.Document,com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata>`"
  ([^DocumentsClient this]
    (-> this (.createDocumentOperationCallable))))

(defn shutdown-now
  ""
  ([^DocumentsClient this]
    (-> this (.shutdownNow))))

(defn update-document-callable
  "Updates the specified document.

   Note: The `projects.agent.knowledgeBases.documents` resource is deprecated; only use
   `projects.knowledgeBases.documents`.

   Operation <response: [Document][google.cloud.dialogflow.v2beta1.Document], metadata:
   [KnowledgeOperationMetadata][google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata]>

   Sample code:



   try (DocumentsClient documentsClient = DocumentsClient.create()) {
     Document document = Document.newBuilder().build();
     UpdateDocumentRequest request = UpdateDocumentRequest.newBuilder()
       .setDocument(document)
       .build();
     ApiFuture<Operation> future = documentsClient.updateDocumentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DocumentsClient this]
    (-> this (.updateDocumentCallable))))

