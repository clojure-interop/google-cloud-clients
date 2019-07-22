(ns com.google.cloud.spanner.admin.instance.v1.stub.GrpcInstanceAdminStub
  "gRPC stub implementation for Cloud Spanner Instance Admin API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.instance.v1.stub GrpcInstanceAdminStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.spanner.admin.instance.v1.stub.GrpcInstanceAdminStub`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.instance.v1.stub.GrpcInstanceAdminStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcInstanceAdminStub/create client-context callable-factory))
  (^com.google.cloud.spanner.admin.instance.v1.stub.GrpcInstanceAdminStub [^com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings settings]
    (GrpcInstanceAdminStub/create settings)))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.getIamPolicyCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcInstanceAdminStub this]
    (-> this (.getOperationsStub))))

(defn list-instance-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.listInstanceConfigsCallable))))

(defn get-instance-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.GetInstanceConfigRequest,com.google.spanner.admin.instance.v1.InstanceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.getInstanceConfigCallable))))

(defn list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.spanner.admin.instance.v1.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.listInstancesCallable))))

(defn list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.listInstancesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcInstanceAdminStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcInstanceAdminStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn create-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`"
  ([^GrpcInstanceAdminStub this]
    (-> this (.createInstanceOperationCallable))))

(defn update-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`"
  ([^GrpcInstanceAdminStub this]
    (-> this (.updateInstanceOperationCallable))))

(defn shutdown
  ""
  ([^GrpcInstanceAdminStub this]
    (-> this (.shutdown))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcInstanceAdminStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.testIamPermissionsCallable))))

(defn delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.DeleteInstanceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.deleteInstanceCallable))))

(defn create-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.createInstanceCallable))))

(defn list-instance-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.listInstanceConfigsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcInstanceAdminStub this]
    (-> this (.isTerminated))))

(defn update-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.updateInstanceCallable))))

(defn get-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.GetInstanceRequest,com.google.spanner.admin.instance.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcInstanceAdminStub this]
    (-> this (.getInstanceCallable))))

(defn shutdown-now
  ""
  ([^GrpcInstanceAdminStub this]
    (-> this (.shutdownNow))))

