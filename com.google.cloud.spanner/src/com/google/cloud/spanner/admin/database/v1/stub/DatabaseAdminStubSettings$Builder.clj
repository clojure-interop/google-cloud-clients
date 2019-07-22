(ns com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder
  "Builder for DatabaseAdminStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1.stub DatabaseAdminStubSettings$Builder]))

(defn drop-database-settings
  "Returns the builder for the settings used for calls to dropDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.DropDatabaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.dropDatabaseSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder [^DatabaseAdminStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-databases-settings
  "Returns the builder for the settings used for calls to listDatabases.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.spanner.admin.database.v1.ListDatabasesResponse,com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.listDatabasesSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn get-database-settings
  "Returns the builder for the settings used for calls to getDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.GetDatabaseRequest,com.google.spanner.admin.database.v1.Database>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.getDatabaseSettings))))

(defn create-database-operation-settings
  "Returns the builder for the settings used for calls to createDatabase.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`"
  ([^DatabaseAdminStubSettings$Builder this]
    (-> this (.createDatabaseOperationSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn update-database-ddl-settings
  "Returns the builder for the settings used for calls to updateDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.updateDatabaseDdlSettings))))

(defn build
  "returns: `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings [^DatabaseAdminStubSettings$Builder this]
    (-> this (.build))))

(defn create-database-settings
  "Returns the builder for the settings used for calls to createDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.createDatabaseSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^DatabaseAdminStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn update-database-ddl-operation-settings
  "Returns the builder for the settings used for calls to updateDatabaseDdl.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`"
  ([^DatabaseAdminStubSettings$Builder this]
    (-> this (.updateDatabaseDdlOperationSettings))))

(defn get-database-ddl-settings
  "Returns the builder for the settings used for calls to getDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminStubSettings$Builder this]
    (-> this (.getDatabaseDdlSettings))))

