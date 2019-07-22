(ns com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings
  "Settings class to configure an instance of DatabaseAdminClient.

  The default instance has everything set to sensible defaults:


    The default service address (spanner.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getDatabase to 30 seconds:



  DatabaseAdminSettings.Builder databaseAdminSettingsBuilder =
      DatabaseAdminSettings.newBuilder();
  databaseAdminSettingsBuilder.getDatabaseSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DatabaseAdminSettings databaseAdminSettings = databaseAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1 DatabaseAdminSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DatabaseAdminSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DatabaseAdminSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DatabaseAdminSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder`"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DatabaseAdminSettings/newBuilder client-context))
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder []
    (DatabaseAdminSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DatabaseAdminSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings`

  returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings [^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings stub]
    (DatabaseAdminSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DatabaseAdminSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DatabaseAdminSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DatabaseAdminSettings/getDefaultServiceScopes )))

(defn drop-database-settings
  "Returns the object with the settings used for calls to dropDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.DropDatabaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.dropDatabaseSettings))))

(defn list-databases-settings
  "Returns the object with the settings used for calls to listDatabases.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.spanner.admin.database.v1.ListDatabasesResponse,com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DatabaseAdminSettings this]
    (-> this (.listDatabasesSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn get-database-settings
  "Returns the object with the settings used for calls to getDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.GetDatabaseRequest,com.google.spanner.admin.database.v1.Database>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.getDatabaseSettings))))

(defn create-database-operation-settings
  "Returns the object with the settings used for calls to createDatabase.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`"
  ([^DatabaseAdminSettings this]
    (-> this (.createDatabaseOperationSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.setIamPolicySettings))))

(defn update-database-ddl-settings
  "Returns the object with the settings used for calls to updateDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.updateDatabaseDdlSettings))))

(defn create-database-settings
  "Returns the object with the settings used for calls to createDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.createDatabaseSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.getIamPolicySettings))))

(defn update-database-ddl-operation-settings
  "Returns the object with the settings used for calls to updateDatabaseDdl.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`"
  ([^DatabaseAdminSettings this]
    (-> this (.updateDatabaseDdlOperationSettings))))

(defn get-database-ddl-settings
  "Returns the object with the settings used for calls to getDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DatabaseAdminSettings this]
    (-> this (.getDatabaseDdlSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder`"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder [^DatabaseAdminSettings this]
    (-> this (.toBuilder))))

