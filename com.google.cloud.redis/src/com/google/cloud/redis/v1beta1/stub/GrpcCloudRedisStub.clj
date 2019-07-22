(ns com.google.cloud.redis.v1beta1.stub.GrpcCloudRedisStub
  "gRPC stub implementation for Google Cloud Memorystore for Redis API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1beta1.stub GrpcCloudRedisStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.redis.v1beta1.stub.GrpcCloudRedisStub`

  throws: java.io.IOException"
  (^com.google.cloud.redis.v1beta1.stub.GrpcCloudRedisStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcCloudRedisStub/create client-context callable-factory))
  (^com.google.cloud.redis.v1beta1.stub.GrpcCloudRedisStub [^com.google.cloud.redis.v1beta1.stub.CloudRedisStubSettings settings]
    (GrpcCloudRedisStub/create settings)))

(defn delete-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1beta1.DeleteInstanceRequest,com.google.protobuf.Empty,com.google.protobuf.Any>`"
  ([^GrpcCloudRedisStub this]
    (-> this (.deleteInstanceOperationCallable))))

(defn failover-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.FailoverInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.failoverInstanceCallable))))

(defn export-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.ExportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.exportInstanceCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcCloudRedisStub this]
    (-> this (.getOperationsStub))))

(defn list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.ListInstancesRequest,com.google.cloud.redis.v1beta1.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.listInstancesCallable))))

(defn export-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1beta1.ExportInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^GrpcCloudRedisStub this]
    (-> this (.exportInstanceOperationCallable))))

(defn list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.ListInstancesRequest,com.google.cloud.redis.v1beta1.CloudRedisClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.listInstancesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcCloudRedisStub this]
    (-> this (.isShutdown))))

(defn failover-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1beta1.FailoverInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^GrpcCloudRedisStub this]
    (-> this (.failoverInstanceOperationCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcCloudRedisStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn import-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.ImportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.importInstanceCallable))))

(defn create-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1beta1.CreateInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^GrpcCloudRedisStub this]
    (-> this (.createInstanceOperationCallable))))

(defn update-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1beta1.UpdateInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^GrpcCloudRedisStub this]
    (-> this (.updateInstanceOperationCallable))))

(defn shutdown
  ""
  ([^GrpcCloudRedisStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcCloudRedisStub this]
    (-> this (.close))))

(defn delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.DeleteInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.deleteInstanceCallable))))

(defn create-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.createInstanceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcCloudRedisStub this]
    (-> this (.isTerminated))))

(defn import-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1beta1.ImportInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^GrpcCloudRedisStub this]
    (-> this (.importInstanceOperationCallable))))

(defn update-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.updateInstanceCallable))))

(defn get-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1beta1.GetInstanceRequest,com.google.cloud.redis.v1beta1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudRedisStub this]
    (-> this (.getInstanceCallable))))

(defn shutdown-now
  ""
  ([^GrpcCloudRedisStub this]
    (-> this (.shutdownNow))))

