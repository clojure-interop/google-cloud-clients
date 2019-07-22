(ns com.google.cloud.firestore.v1.FirestoreAdminClient
  "Service Description: Operations are created by service `FirestoreAdmin`, but are accessed via
  service `google.longrunning.Operations`.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
    ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
    Index index = Index.newBuilder().build();
    Operation response = firestoreAdminClient.createIndex(parent, index);
  }

  Note: close() needs to be called on the firestoreAdminClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of FirestoreAdminSettings to
  create(). For example:

  To customize credentials:



  FirestoreAdminSettings firestoreAdminSettings =
      FirestoreAdminSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  FirestoreAdminClient firestoreAdminClient =
      FirestoreAdminClient.create(firestoreAdminSettings);

  To customize the endpoint:



  FirestoreAdminSettings firestoreAdminSettings =
      FirestoreAdminSettings.newBuilder().setEndpoint(myEndpoint).build();
  FirestoreAdminClient firestoreAdminClient =
      FirestoreAdminClient.create(firestoreAdminSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1 FirestoreAdminClient]))

(defn *create
  "Constructs an instance of FirestoreAdminClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.firestore.v1.FirestoreAdminSettings`

  returns: `com.google.cloud.firestore.v1.FirestoreAdminClient`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.FirestoreAdminClient [^com.google.cloud.firestore.v1.FirestoreAdminSettings settings]
    (FirestoreAdminClient/create settings))
  (^com.google.cloud.firestore.v1.FirestoreAdminClient []
    (FirestoreAdminClient/create )))

(defn list-fields
  "Lists the field configuration and metadata for this database.

   Currently, [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields]
   only supports listing fields that have been explicitly overridden. To issue this query, call
   [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields] with the
   filter set to `indexConfig.usesAncestorConfig:false`.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     for (Field element : firestoreAdminClient.listFields(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}` - `com.google.firestore.admin.v1.ParentName`

  returns: `com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse [^FirestoreAdminClient this ^com.google.firestore.admin.v1.ParentName parent]
    (-> this (.listFields parent))))

(defn delete-index-callable
  "Deletes a composite index.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     IndexName name = IndexName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\", \"[INDEX_ID]\");
     DeleteIndexRequest request = DeleteIndexRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = firestoreAdminClient.deleteIndexCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.DeleteIndexRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.deleteIndexCallable))))

(defn import-documents
  "Imports documents into Google Cloud Firestore. Existing documents with the same name are
   overwritten. The import occurs in the background and its progress can be monitored and managed
   via the Operation resource that is created. If an ImportDocuments operation is cancelled, it is
   possible that a subset of the data has already been imported to Cloud Firestore.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     DatabaseName name = DatabaseName.of(\"[PROJECT]\", \"[DATABASE]\");
     Operation response = firestoreAdminClient.importDocuments(name);
   }

  name - Database to import into. Should be of the form: `projects/{project_id}/databases/{database_id}`. - `com.google.firestore.admin.v1.DatabaseName`

  returns: `com.google.longrunning.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.longrunning.Operation [^FirestoreAdminClient this ^com.google.firestore.admin.v1.DatabaseName name]
    (-> this (.importDocuments name))))

(defn export-documents
  "Exports a copy of all or a subset of documents from Google Cloud Firestore to another storage
   system, such as Google Cloud Storage. Recent updates to documents may not be reflected in the
   export. The export occurs in the background and its progress can be monitored and managed via
   the Operation resource that is created. The output of an export may only be used once the
   associated operation is done. If an export operation is cancelled before completion it may
   leave partial data behind in Google Cloud Storage.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     DatabaseName name = DatabaseName.of(\"[PROJECT]\", \"[DATABASE]\");
     Operation response = firestoreAdminClient.exportDocuments(name);
   }

  name - Database to export. Should be of the form: `projects/{project_id}/databases/{database_id}`. - `com.google.firestore.admin.v1.DatabaseName`

  returns: `com.google.longrunning.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.longrunning.Operation [^FirestoreAdminClient this ^com.google.firestore.admin.v1.DatabaseName name]
    (-> this (.exportDocuments name))))

(defn list-fields-callable
  "Lists the field configuration and metadata for this database.

   Currently, [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields]
   only supports listing fields that have been explicitly overridden. To issue this query, call
   [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields] with the
   filter set to `indexConfig.usesAncestorConfig:false`.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     ListFieldsRequest request = ListFieldsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListFieldsResponse response = firestoreAdminClient.listFieldsCallable().call(request);
       for (Field element : response.getFieldsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListFieldsRequest,com.google.firestore.admin.v1.ListFieldsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.listFieldsCallable))))

(defn import-documents-callable
  "Imports documents into Google Cloud Firestore. Existing documents with the same name are
   overwritten. The import occurs in the background and its progress can be monitored and managed
   via the Operation resource that is created. If an ImportDocuments operation is cancelled, it is
   possible that a subset of the data has already been imported to Cloud Firestore.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     DatabaseName name = DatabaseName.of(\"[PROJECT]\", \"[DATABASE]\");
     ImportDocumentsRequest request = ImportDocumentsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = firestoreAdminClient.importDocumentsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ImportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.importDocumentsCallable))))

(defn list-fields-paged-callable
  "Lists the field configuration and metadata for this database.

   Currently, [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields]
   only supports listing fields that have been explicitly overridden. To issue this query, call
   [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields] with the
   filter set to `indexConfig.usesAncestorConfig:false`.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     ListFieldsRequest request = ListFieldsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListFieldsPagedResponse> future = firestoreAdminClient.listFieldsPagedCallable().futureCall(request);
     // Do something
     for (Field element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListFieldsRequest,com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.listFieldsPagedCallable))))

(defn list-indexes-callable
  "Lists composite indexes.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     ListIndexesRequest request = ListIndexesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListIndexesResponse response = firestoreAdminClient.listIndexesCallable().call(request);
       for (Index element : response.getIndexesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListIndexesRequest,com.google.firestore.admin.v1.ListIndexesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.listIndexesCallable))))

(defn get-settings
  "returns: `com.google.cloud.firestore.v1.FirestoreAdminSettings`"
  (^com.google.cloud.firestore.v1.FirestoreAdminSettings [^FirestoreAdminClient this]
    (-> this (.getSettings))))

(defn get-index
  "Gets a composite index.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     IndexName name = IndexName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\", \"[INDEX_ID]\");
     Index response = firestoreAdminClient.getIndex(name);
   }

  name - A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}` - `com.google.firestore.admin.v1.IndexName`

  returns: `com.google.firestore.admin.v1.Index`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.firestore.admin.v1.Index [^FirestoreAdminClient this ^com.google.firestore.admin.v1.IndexName name]
    (-> this (.getIndex name))))

(defn get-field-callable
  "Gets the metadata and configuration for a Field.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     FieldName name = FieldName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\", \"[FIELD_ID]\");
     GetFieldRequest request = GetFieldRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Field> future = firestoreAdminClient.getFieldCallable().futureCall(request);
     // Do something
     Field response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.GetFieldRequest,com.google.firestore.admin.v1.Field>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.getFieldCallable))))

(defn update-field
  "Updates a field configuration. Currently, field updates apply only to single field index
   configuration. However, calls to
   [FirestoreAdmin.UpdateField][google.firestore.admin.v1.FirestoreAdmin.UpdateField] should
   provide a field mask to avoid changing any configuration that the caller isn't aware of. The
   field mask should be specified as: `{ paths: \"index_config\" }`.

   This call returns a [google.longrunning.Operation][google.longrunning.Operation] which may
   be used to track the status of the field update. The metadata for the operation will be the
   type [FieldOperationMetadata][google.firestore.admin.v1.FieldOperationMetadata].

   To configure the default field settings for the database, use the special `Field` with
   resource name:
   `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/*`.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     Field field = Field.newBuilder().build();
     Operation response = firestoreAdminClient.updateField(field);
   }

  field - The field to be updated. - `com.google.firestore.admin.v1.Field`

  returns: `com.google.longrunning.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.longrunning.Operation [^FirestoreAdminClient this ^com.google.firestore.admin.v1.Field field]
    (-> this (.updateField field))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.firestore.v1.stub.FirestoreAdminStub`"
  ([^FirestoreAdminClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^FirestoreAdminClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^FirestoreAdminClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^FirestoreAdminClient this]
    (-> this (.shutdown))))

(defn update-field-callable
  "Updates a field configuration. Currently, field updates apply only to single field index
   configuration. However, calls to
   [FirestoreAdmin.UpdateField][google.firestore.admin.v1.FirestoreAdmin.UpdateField] should
   provide a field mask to avoid changing any configuration that the caller isn't aware of. The
   field mask should be specified as: `{ paths: \"index_config\" }`.

   This call returns a [google.longrunning.Operation][google.longrunning.Operation] which may
   be used to track the status of the field update. The metadata for the operation will be the
   type [FieldOperationMetadata][google.firestore.admin.v1.FieldOperationMetadata].

   To configure the default field settings for the database, use the special `Field` with
   resource name:
   `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/*`.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     Field field = Field.newBuilder().build();
     UpdateFieldRequest request = UpdateFieldRequest.newBuilder()
       .setField(field)
       .build();
     ApiFuture<Operation> future = firestoreAdminClient.updateFieldCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.UpdateFieldRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.updateFieldCallable))))

(defn get-field
  "Gets the metadata and configuration for a Field.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     FieldName name = FieldName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\", \"[FIELD_ID]\");
     Field response = firestoreAdminClient.getField(name);
   }

  name - A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_id}` - `com.google.firestore.admin.v1.FieldName`

  returns: `com.google.firestore.admin.v1.Field`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.firestore.admin.v1.Field [^FirestoreAdminClient this ^com.google.firestore.admin.v1.FieldName name]
    (-> this (.getField name))))

(defn export-documents-callable
  "Exports a copy of all or a subset of documents from Google Cloud Firestore to another storage
   system, such as Google Cloud Storage. Recent updates to documents may not be reflected in the
   export. The export occurs in the background and its progress can be monitored and managed via
   the Operation resource that is created. The output of an export may only be used once the
   associated operation is done. If an export operation is cancelled before completion it may
   leave partial data behind in Google Cloud Storage.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     DatabaseName name = DatabaseName.of(\"[PROJECT]\", \"[DATABASE]\");
     ExportDocumentsRequest request = ExportDocumentsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = firestoreAdminClient.exportDocumentsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ExportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.exportDocumentsCallable))))

(defn list-indexes
  "Lists composite indexes.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     for (Index element : firestoreAdminClient.listIndexes(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}` - `com.google.firestore.admin.v1.ParentName`

  returns: `com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse [^FirestoreAdminClient this ^com.google.firestore.admin.v1.ParentName parent]
    (-> this (.listIndexes parent))))

(defn close
  ""
  ([^FirestoreAdminClient this]
    (-> this (.close))))

(defn create-index
  "Creates a composite index. This returns a
   [google.longrunning.Operation][google.longrunning.Operation] which may be used to track the
   status of the creation. The metadata for the operation will be the type
   [IndexOperationMetadata][google.firestore.admin.v1.IndexOperationMetadata].

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     Index index = Index.newBuilder().build();
     Operation response = firestoreAdminClient.createIndex(parent, index);
   }

  parent - A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}` - `com.google.firestore.admin.v1.ParentName`
  index - The composite index to create. - `com.google.firestore.admin.v1.Index`

  returns: `com.google.longrunning.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.longrunning.Operation [^FirestoreAdminClient this ^com.google.firestore.admin.v1.ParentName parent ^com.google.firestore.admin.v1.Index index]
    (-> this (.createIndex parent index)))
  (^com.google.longrunning.Operation [^FirestoreAdminClient this ^com.google.firestore.admin.v1.CreateIndexRequest request]
    (-> this (.createIndex request))))

(defn create-index-callable
  "Creates a composite index. This returns a
   [google.longrunning.Operation][google.longrunning.Operation] which may be used to track the
   status of the creation. The metadata for the operation will be the type
   [IndexOperationMetadata][google.firestore.admin.v1.IndexOperationMetadata].

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     Index index = Index.newBuilder().build();
     CreateIndexRequest request = CreateIndexRequest.newBuilder()
       .setParent(parent.toString())
       .setIndex(index)
       .build();
     ApiFuture<Operation> future = firestoreAdminClient.createIndexCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.CreateIndexRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.createIndexCallable))))

(defn delete-index
  "Deletes a composite index.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     IndexName name = IndexName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\", \"[INDEX_ID]\");
     firestoreAdminClient.deleteIndex(name);
   }

  name - A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}` - `com.google.firestore.admin.v1.IndexName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^FirestoreAdminClient this ^com.google.firestore.admin.v1.IndexName name]
    (-> this (.deleteIndex name))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^FirestoreAdminClient this]
    (-> this (.isTerminated))))

(defn list-indexes-paged-callable
  "Lists composite indexes.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     ParentName parent = ParentName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\");
     ListIndexesRequest request = ListIndexesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListIndexesPagedResponse> future = firestoreAdminClient.listIndexesPagedCallable().futureCall(request);
     // Do something
     for (Index element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListIndexesRequest,com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.listIndexesPagedCallable))))

(defn get-index-callable
  "Gets a composite index.

   Sample code:



   try (FirestoreAdminClient firestoreAdminClient = FirestoreAdminClient.create()) {
     IndexName name = IndexName.of(\"[PROJECT]\", \"[DATABASE]\", \"[COLLECTION_ID]\", \"[INDEX_ID]\");
     GetIndexRequest request = GetIndexRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Index> future = firestoreAdminClient.getIndexCallable().futureCall(request);
     // Do something
     Index response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.GetIndexRequest,com.google.firestore.admin.v1.Index>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminClient this]
    (-> this (.getIndexCallable))))

(defn shutdown-now
  ""
  ([^FirestoreAdminClient this]
    (-> this (.shutdownNow))))

