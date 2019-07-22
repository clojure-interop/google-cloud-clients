(ns com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder
  "Builder for DatabaseAdminSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1 DatabaseAdminSettings$Builder]))

(defn drop-database-settings
  "Returns the builder for the settings used for calls to dropDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.DropDatabaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.dropDatabaseSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder [^DatabaseAdminSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-databases-settings
  "Returns the builder for the settings used for calls to listDatabases.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.spanner.admin.database.v1.ListDatabasesResponse,com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.listDatabasesSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn get-database-settings
  "Returns the builder for the settings used for calls to getDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.GetDatabaseRequest,com.google.spanner.admin.database.v1.Database>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.getDatabaseSettings))))

(defn create-database-operation-settings
  "Returns the builder for the settings used for calls to createDatabase.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`"
  ([^DatabaseAdminSettings$Builder this]
    (-> this (.createDatabaseOperationSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn update-database-ddl-settings
  "Returns the builder for the settings used for calls to updateDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.updateDatabaseDdlSettings))))

(defn build
  "returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings [^DatabaseAdminSettings$Builder this]
    (-> this (.build))))

(defn create-database-settings
  "Returns the builder for the settings used for calls to createDatabase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.createDatabaseSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder`"
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn update-database-ddl-operation-settings
  "Returns the builder for the settings used for calls to updateDatabaseDdl.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`"
  ([^DatabaseAdminSettings$Builder this]
    (-> this (.updateDatabaseDdlOperationSettings))))

(defn get-database-ddl-settings
  "Returns the builder for the settings used for calls to getDatabaseDdl.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DatabaseAdminSettings$Builder this]
    (-> this (.getDatabaseDdlSettings))))

