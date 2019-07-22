(ns com.google.cloud.firestore.v1.FirestoreClient
  "Service Description: The Cloud Firestore service.

  This service exposes several types of comparable timestamps:

  * `create_time` - The time at which a document was created. Changes only when a document
  is deleted, then re-created. Increases in a strict monotonic fashion. * `update_time` - The
  time at which a document was last updated. Changes every time a document is modified. Does not
  change when a write results in no modifications. Increases in a strict monotonic fashion. *
  `read_time` - The time at which a particular state was observed. Used to denote a consistent
  snapshot of the database or the time at which a Document was observed to not exist. *
  `commit_time` - The time at which the writes in a transaction were committed. Any read with an
  equal or greater `read_time` is guaranteed to see the effects of the transaction.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (FirestoreClient firestoreClient = FirestoreClient.create()) {
    Document document = Document.newBuilder().build();
    DocumentMask updateMask = DocumentMask.newBuilder().build();
    Document response = firestoreClient.updateDocument(document, updateMask);
  }

  Note: close() needs to be called on the firestoreClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of FirestoreSettings to create().
  For example:

  To customize credentials:



  FirestoreSettings firestoreSettings =
      FirestoreSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  FirestoreClient firestoreClient =
      FirestoreClient.create(firestoreSettings);

  To customize the endpoint:



  FirestoreSettings firestoreSettings =
      FirestoreSettings.newBuilder().setEndpoint(myEndpoint).build();
  FirestoreClient firestoreClient =
      FirestoreClient.create(firestoreSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1 FirestoreClient]))

(defn *create
  "Constructs an instance of FirestoreClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.firestore.v1.FirestoreSettings`

  returns: `com.google.cloud.firestore.v1.FirestoreClient`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.FirestoreClient [^com.google.cloud.firestore.v1.FirestoreSettings settings]
    (FirestoreClient/create settings))
  (^com.google.cloud.firestore.v1.FirestoreClient []
    (FirestoreClient/create )))

(defn list-collection-ids
  "Lists all the collection IDs underneath a document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     for (String element : firestoreClient.listCollectionIds(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The parent document. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. For example: `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom` - `java.lang.String`

  returns: `com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse [^FirestoreClient this ^java.lang.String parent]
    (-> this (.listCollectionIds parent))))

(defn get-document-callable
  "Gets a single document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     AnyPathName name = AnyPathName.of(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     GetDocumentRequest request = GetDocumentRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Document> future = firestoreClient.getDocumentCallable().futureCall(request);
     // Do something
     Document response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.GetDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.getDocumentCallable))))

(defn get-document
  "Gets a single document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     AnyPathName name = AnyPathName.of(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     GetDocumentRequest request = GetDocumentRequest.newBuilder()
       .setName(name.toString())
       .build();
     Document response = firestoreClient.getDocument(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.firestore.v1.GetDocumentRequest`

  returns: `com.google.firestore.v1.Document`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.firestore.v1.Document [^FirestoreClient this ^com.google.firestore.v1.GetDocumentRequest request]
    (-> this (.getDocument request))))

(defn run-query-callable
  "Runs a query.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     RunQueryRequest request = RunQueryRequest.newBuilder()
       .setParent(formattedParent)
       .build();

     ServerStream<RunQueryResponse> stream = firestoreClient.runQueryCallable().call(request);
     for (RunQueryResponse response : stream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.RunQueryRequest,com.google.firestore.v1.RunQueryResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^FirestoreClient this]
    (-> this (.runQueryCallable))))

(defn get-settings
  "returns: `com.google.cloud.firestore.v1.FirestoreSettings`"
  (^com.google.cloud.firestore.v1.FirestoreSettings [^FirestoreClient this]
    (-> this (.getSettings))))

(defn write-callable
  "Streams batches of document updates and deletes, in order.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     BidiStream<WriteRequest, WriteResponse> bidiStream =
         firestoreClient.writeCallable().call();

     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     WriteRequest request = WriteRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .build();
     bidiStream.send(request);
     for (WriteResponse response : bidiStream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.WriteRequest,com.google.firestore.v1.WriteResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^FirestoreClient this]
    (-> this (.writeCallable))))

(defn list-collection-ids-callable
  "Lists all the collection IDs underneath a document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     ListCollectionIdsRequest request = ListCollectionIdsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListCollectionIdsResponse response = firestoreClient.listCollectionIdsCallable().call(request);
       for (String element : response.getCollectionIdsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.firestore.v1.ListCollectionIdsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.listCollectionIdsCallable))))

(defn create-document-callable
  "Creates a new document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     String collectionId = \"\";
     String documentId = \"\";
     Document document = Document.newBuilder().build();
     CreateDocumentRequest request = CreateDocumentRequest.newBuilder()
       .setParent(formattedParent)
       .setCollectionId(collectionId)
       .setDocumentId(documentId)
       .setDocument(document)
       .build();
     ApiFuture<Document> future = firestoreClient.createDocumentCallable().futureCall(request);
     // Do something
     Document response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CreateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.createDocumentCallable))))

(defn list-collection-ids-paged-callable
  "Lists all the collection IDs underneath a document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     ListCollectionIdsRequest request = ListCollectionIdsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListCollectionIdsPagedResponse> future = firestoreClient.listCollectionIdsPagedCallable().futureCall(request);
     // Do something
     for (String element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListCollectionIdsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.listCollectionIdsPagedCallable))))

(defn listen-callable
  "Listens to changes.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     BidiStream<ListenRequest, ListenResponse> bidiStream =
         firestoreClient.listenCallable().call();

     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     ListenRequest request = ListenRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .build();
     bidiStream.send(request);
     for (ListenResponse response : bidiStream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.firestore.v1.ListenRequest,com.google.firestore.v1.ListenResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^FirestoreClient this]
    (-> this (.listenCallable))))

(defn create-document
  "Creates a new document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     String collectionId = \"\";
     String documentId = \"\";
     Document document = Document.newBuilder().build();
     CreateDocumentRequest request = CreateDocumentRequest.newBuilder()
       .setParent(formattedParent)
       .setCollectionId(collectionId)
       .setDocumentId(documentId)
       .setDocument(document)
       .build();
     Document response = firestoreClient.createDocument(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.firestore.v1.CreateDocumentRequest`

  returns: `com.google.firestore.v1.Document`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.firestore.v1.Document [^FirestoreClient this ^com.google.firestore.v1.CreateDocumentRequest request]
    (-> this (.createDocument request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.firestore.v1.stub.FirestoreStub`"
  ([^FirestoreClient this]
    (-> this (.getStub))))

(defn update-document
  "Updates or inserts a document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     Document document = Document.newBuilder().build();
     DocumentMask updateMask = DocumentMask.newBuilder().build();
     Document response = firestoreClient.updateDocument(document, updateMask);
   }

  document - The updated document. Creates the document if it does not already exist. - `com.google.firestore.v1.Document`
  update-mask - The fields to update. None of the field paths in the mask may contain a reserved name. If the document exists on the server and has fields not referenced in the mask, they are left unchanged. Fields referenced in the mask, but not present in the input document, are deleted from the document on the server. - `com.google.firestore.v1.DocumentMask`

  returns: `com.google.firestore.v1.Document`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.firestore.v1.Document [^FirestoreClient this ^com.google.firestore.v1.Document document ^com.google.firestore.v1.DocumentMask update-mask]
    (-> this (.updateDocument document update-mask)))
  (^com.google.firestore.v1.Document [^FirestoreClient this ^com.google.firestore.v1.UpdateDocumentRequest request]
    (-> this (.updateDocument request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^FirestoreClient this]
    (-> this (.isShutdown))))

(defn list-documents-callable
  "Lists documents.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     String collectionId = \"\";
     ListDocumentsRequest request = ListDocumentsRequest.newBuilder()
       .setParent(formattedParent)
       .setCollectionId(collectionId)
       .build();
     while (true) {
       ListDocumentsResponse response = firestoreClient.listDocumentsCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.firestore.v1.ListDocumentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.listDocumentsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^FirestoreClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn commit
  "Commits a transaction, while optionally updating documents.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     List<Write> writes = new ArrayList<>();
     CommitResponse response = firestoreClient.commit(formattedDatabase, writes);
   }

  database - The database name. In the format: `projects/{project_id}/databases/{database_id}`. - `java.lang.String`
  writes - The writes to apply. Always executed atomically and in order. - `java.util.List`

  returns: `com.google.firestore.v1.CommitResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.firestore.v1.CommitResponse [^FirestoreClient this ^java.lang.String database ^java.util.List writes]
    (-> this (.commit database writes)))
  (^com.google.firestore.v1.CommitResponse [^FirestoreClient this ^com.google.firestore.v1.CommitRequest request]
    (-> this (.commit request))))

(defn shutdown
  ""
  ([^FirestoreClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^FirestoreClient this]
    (-> this (.close))))

(defn list-documents
  "Lists documents.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     String collectionId = \"\";
     ListDocumentsRequest request = ListDocumentsRequest.newBuilder()
       .setParent(formattedParent)
       .setCollectionId(collectionId)
       .build();
     for (Document element : firestoreClient.listDocuments(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.firestore.v1.ListDocumentsRequest`

  returns: `com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse [^FirestoreClient this ^com.google.firestore.v1.ListDocumentsRequest request]
    (-> this (.listDocuments request))))

(defn delete-document-callable
  "Deletes a document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     AnyPathName name = AnyPathName.of(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     DeleteDocumentRequest request = DeleteDocumentRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = firestoreClient.deleteDocumentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.DeleteDocumentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.deleteDocumentCallable))))

(defn commit-callable
  "Commits a transaction, while optionally updating documents.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     List<Write> writes = new ArrayList<>();
     CommitRequest request = CommitRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .addAllWrites(writes)
       .build();
     ApiFuture<CommitResponse> future = firestoreClient.commitCallable().futureCall(request);
     // Do something
     CommitResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.CommitRequest,com.google.firestore.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.commitCallable))))

(defn rollback
  "Rolls back a transaction.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     ByteString transaction = ByteString.copyFromUtf8(\"\");
     firestoreClient.rollback(formattedDatabase, transaction);
   }

  database - The database name. In the format: `projects/{project_id}/databases/{database_id}`. - `java.lang.String`
  transaction - The transaction to roll back. - `com.google.protobuf.ByteString`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^FirestoreClient this ^java.lang.String database ^com.google.protobuf.ByteString transaction]
    (-> this (.rollback database transaction)))
  ([^FirestoreClient this ^com.google.firestore.v1.RollbackRequest request]
    (-> this (.rollback request))))

(defn rollback-callable
  "Rolls back a transaction.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     ByteString transaction = ByteString.copyFromUtf8(\"\");
     RollbackRequest request = RollbackRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .setTransaction(transaction)
       .build();
     ApiFuture<Void> future = firestoreClient.rollbackCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.rollbackCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^FirestoreClient this]
    (-> this (.isTerminated))))

(defn begin-transaction
  "Starts a new transaction.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     BeginTransactionResponse response = firestoreClient.beginTransaction(formattedDatabase);
   }

  database - The database name. In the format: `projects/{project_id}/databases/{database_id}`. - `java.lang.String`

  returns: `com.google.firestore.v1.BeginTransactionResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.firestore.v1.BeginTransactionResponse [^FirestoreClient this ^java.lang.String database]
    (-> this (.beginTransaction database))))

(defn list-documents-paged-callable
  "Lists documents.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedParent = AnyPathName.format(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     String collectionId = \"\";
     ListDocumentsRequest request = ListDocumentsRequest.newBuilder()
       .setParent(formattedParent)
       .setCollectionId(collectionId)
       .build();
     ApiFuture<ListDocumentsPagedResponse> future = firestoreClient.listDocumentsPagedCallable().futureCall(request);
     // Do something
     for (Document element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.ListDocumentsRequest,com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.listDocumentsPagedCallable))))

(defn batch-get-documents-callable
  "Gets multiple documents.

   Documents returned by this method are not guaranteed to be returned in the same order that
   they were requested.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     List<String> documents = new ArrayList<>();
     BatchGetDocumentsRequest request = BatchGetDocumentsRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .addAllDocuments(documents)
       .build();

     ServerStream<BatchGetDocumentsResponse> stream = firestoreClient.batchGetDocumentsCallable().call(request);
     for (BatchGetDocumentsResponse response : stream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.firestore.v1.BatchGetDocumentsRequest,com.google.firestore.v1.BatchGetDocumentsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^FirestoreClient this]
    (-> this (.batchGetDocumentsCallable))))

(defn delete-document
  "Deletes a document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     AnyPathName name = AnyPathName.of(\"[PROJECT]\", \"[DATABASE]\", \"[DOCUMENT]\", \"[ANY_PATH]\");
     firestoreClient.deleteDocument(name);
   }

  name - The resource name of the Document to delete. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. - `com.google.firestore.v1.AnyPathName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^FirestoreClient this ^com.google.firestore.v1.AnyPathName name]
    (-> this (.deleteDocument name))))

(defn shutdown-now
  ""
  ([^FirestoreClient this]
    (-> this (.shutdownNow))))

(defn update-document-callable
  "Updates or inserts a document.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     Document document = Document.newBuilder().build();
     DocumentMask updateMask = DocumentMask.newBuilder().build();
     UpdateDocumentRequest request = UpdateDocumentRequest.newBuilder()
       .setDocument(document)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Document> future = firestoreClient.updateDocumentCallable().futureCall(request);
     // Do something
     Document response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.UpdateDocumentRequest,com.google.firestore.v1.Document>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.updateDocumentCallable))))

(defn begin-transaction-callable
  "Starts a new transaction.

   Sample code:



   try (FirestoreClient firestoreClient = FirestoreClient.create()) {
     String formattedDatabase = DatabaseRootName.format(\"[PROJECT]\", \"[DATABASE]\");
     BeginTransactionRequest request = BeginTransactionRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .build();
     ApiFuture<BeginTransactionResponse> future = firestoreClient.beginTransactionCallable().futureCall(request);
     // Do something
     BeginTransactionResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.v1.BeginTransactionRequest,com.google.firestore.v1.BeginTransactionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreClient this]
    (-> this (.beginTransactionCallable))))

