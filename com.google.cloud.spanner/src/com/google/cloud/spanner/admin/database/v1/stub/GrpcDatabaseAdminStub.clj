(ns com.google.cloud.spanner.admin.database.v1.stub.GrpcDatabaseAdminStub
  "gRPC stub implementation for Cloud Spanner Database Admin API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1.stub GrpcDatabaseAdminStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.spanner.admin.database.v1.stub.GrpcDatabaseAdminStub`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.database.v1.stub.GrpcDatabaseAdminStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcDatabaseAdminStub/create client-context callable-factory))
  (^com.google.cloud.spanner.admin.database.v1.stub.GrpcDatabaseAdminStub [^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings settings]
    (GrpcDatabaseAdminStub/create settings)))

(defn list-databases-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.spanner.admin.database.v1.ListDatabasesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.listDatabasesCallable))))

(defn get-database-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.GetDatabaseRequest,com.google.spanner.admin.database.v1.Database>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.getDatabaseCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.getIamPolicyCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcDatabaseAdminStub this]
    (-> this (.getOperationsStub))))

(defn list-databases-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.listDatabasesPagedCallable))))

(defn update-database-ddl-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`"
  ([^GrpcDatabaseAdminStub this]
    (-> this (.updateDatabaseDdlOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcDatabaseAdminStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcDatabaseAdminStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcDatabaseAdminStub this]
    (-> this (.shutdown))))

(defn create-database-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`"
  ([^GrpcDatabaseAdminStub this]
    (-> this (.createDatabaseOperationCallable))))

(defn drop-database-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.DropDatabaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.dropDatabaseCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcDatabaseAdminStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.testIamPermissionsCallable))))

(defn get-database-ddl-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.getDatabaseDdlCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcDatabaseAdminStub this]
    (-> this (.isTerminated))))

(defn create-database-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.createDatabaseCallable))))

(defn shutdown-now
  ""
  ([^GrpcDatabaseAdminStub this]
    (-> this (.shutdownNow))))

(defn update-database-ddl-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDatabaseAdminStub this]
    (-> this (.updateDatabaseDdlCallable))))

