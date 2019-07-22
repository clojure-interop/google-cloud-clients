(ns com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStub
  "Base stub class for Cloud Spanner Database Admin API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1.stub DatabaseAdminStub]))

(defn ->database-admin-stub
  "Constructor."
  (^DatabaseAdminStub []
    (new DatabaseAdminStub )))

(defn list-databases-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.spanner.admin.database.v1.ListDatabasesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.listDatabasesCallable))))

(defn get-database-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.GetDatabaseRequest,com.google.spanner.admin.database.v1.Database>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.getDatabaseCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.getIamPolicyCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^DatabaseAdminStub this]
    (-> this (.getOperationsStub))))

(defn list-databases-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.listDatabasesPagedCallable))))

(defn update-database-ddl-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`"
  ([^DatabaseAdminStub this]
    (-> this (.updateDatabaseDdlOperationCallable))))

(defn create-database-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`"
  ([^DatabaseAdminStub this]
    (-> this (.createDatabaseOperationCallable))))

(defn drop-database-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.DropDatabaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.dropDatabaseCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^DatabaseAdminStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.testIamPermissionsCallable))))

(defn get-database-ddl-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.getDatabaseDdlCallable))))

(defn create-database-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.createDatabaseCallable))))

(defn update-database-ddl-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminStub this]
    (-> this (.updateDatabaseDdlCallable))))

