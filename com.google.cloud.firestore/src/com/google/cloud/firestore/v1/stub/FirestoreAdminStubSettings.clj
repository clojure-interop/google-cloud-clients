(ns com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings
  "Settings class to configure an instance of FirestoreAdminStub.

  The default instance has everything set to sensible defaults:


    The default service address (firestore.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createIndex to 30 seconds:



  FirestoreAdminStubSettings.Builder firestoreAdminSettingsBuilder =
      FirestoreAdminStubSettings.newBuilder();
  firestoreAdminSettingsBuilder.createIndexSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  FirestoreAdminStubSettings firestoreAdminSettings = firestoreAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1.stub FirestoreAdminStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (FirestoreAdminStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (FirestoreAdminStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (FirestoreAdminStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (FirestoreAdminStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (FirestoreAdminStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (FirestoreAdminStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (FirestoreAdminStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder`"
  (^com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (FirestoreAdminStubSettings/newBuilder client-context))
  (^com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder []
    (FirestoreAdminStubSettings/newBuilder )))

(defn get-field-settings
  "Returns the object with the settings used for calls to getField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.admin.v1.GetFieldRequest,com.google.firestore.admin.v1.Field>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.getFieldSettings))))

(defn get-index-settings
  "Returns the object with the settings used for calls to getIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.admin.v1.GetIndexRequest,com.google.firestore.admin.v1.Index>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.getIndexSettings))))

(defn list-indexes-settings
  "Returns the object with the settings used for calls to listIndexes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.firestore.admin.v1.ListIndexesRequest,com.google.firestore.admin.v1.ListIndexesResponse,com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.listIndexesSettings))))

(defn delete-index-settings
  "Returns the object with the settings used for calls to deleteIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.admin.v1.DeleteIndexRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.deleteIndexSettings))))

(defn list-fields-settings
  "Returns the object with the settings used for calls to listFields.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.firestore.admin.v1.ListFieldsRequest,com.google.firestore.admin.v1.ListFieldsResponse,com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.listFieldsSettings))))

(defn export-documents-settings
  "Returns the object with the settings used for calls to exportDocuments.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.admin.v1.ExportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.exportDocumentsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.firestore.v1.stub.FirestoreAdminStub`

  throws: java.io.IOException"
  ([^FirestoreAdminStubSettings this]
    (-> this (.createStub))))

(defn import-documents-settings
  "Returns the object with the settings used for calls to importDocuments.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.admin.v1.ImportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.importDocumentsSettings))))

(defn update-field-settings
  "Returns the object with the settings used for calls to updateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.admin.v1.UpdateFieldRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.updateFieldSettings))))

(defn create-index-settings
  "Returns the object with the settings used for calls to createIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.firestore.admin.v1.CreateIndexRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirestoreAdminStubSettings this]
    (-> this (.createIndexSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder`"
  (^com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder [^FirestoreAdminStubSettings this]
    (-> this (.toBuilder))))

