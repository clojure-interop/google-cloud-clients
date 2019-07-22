(ns com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings
  "Settings class to configure an instance of DatabaseAdminStub.

  The default instance has everything set to sensible defaults:


    The default service address (spanner.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDatabase to 30 seconds:



  DatabaseAdminStubSettings.Builder databaseAdminSettingsBuilder =
      DatabaseAdminStubSettings.newBuilder();
  databaseAdminSettingsBuilder.getDatabaseSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DatabaseAdminStubSettings databaseAdminSettings = databaseAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1.stub DatabaseAdminStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DatabaseAdminStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DatabaseAdminStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DatabaseAdminStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DatabaseAdminStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DatabaseAdminStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DatabaseAdminStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DatabaseAdminStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder`"
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DatabaseAdminStubSettings/newBuilder client-context))
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder []
    (DatabaseAdminStubSettings/newBuilder )))

(defn drop-database-settings
  "Returns the object with the settings used for calls to dropDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.DropDatabaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.dropDatabaseSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStub`

  throws: java.io.IOException"
  ([^DatabaseAdminStubSettings this]
    (-> this (.createStub))))

(defn list-databases-settings
  "Returns the object with the settings used for calls to listDatabases.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.spanner.admin.database.v1.ListDatabasesResponse,com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.listDatabasesSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn get-database-settings
  "Returns the object with the settings used for calls to getDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.GetDatabaseRequest,com.google.spanner.admin.database.v1.Database>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.getDatabaseSettings))))

(defn create-database-operation-settings
  "Returns the object with the settings used for calls to createDatabase.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`"
  ([^DatabaseAdminStubSettings this]
    (-> this (.createDatabaseOperationSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn update-database-ddl-settings
  "Returns the object with the settings used for calls to updateDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.updateDatabaseDdlSettings))))

(defn create-database-settings
  "Returns the object with the settings used for calls to createDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.createDatabaseSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn update-database-ddl-operation-settings
  "Returns the object with the settings used for calls to updateDatabaseDdl.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`"
  ([^DatabaseAdminStubSettings this]
    (-> this (.updateDatabaseDdlOperationSettings))))

(defn get-database-ddl-settings
  "Returns the object with the settings used for calls to getDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminStubSettings this]
    (-> this (.getDatabaseDdlSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder`"
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder [^DatabaseAdminStubSettings this]
    (-> this (.toBuilder))))

