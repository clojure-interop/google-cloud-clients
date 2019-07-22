(ns com.google.cloud.redis.v1.stub.CloudRedisStub
  "Base stub class for Google Cloud Memorystore for Redis API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1.stub CloudRedisStub]))

(defn ->cloud-redis-stub
  "Constructor."
  (^CloudRedisStub []
    (new CloudRedisStub )))

(defn delete-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.protobuf.Empty,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisStub this]
    (-> this (.deleteInstanceOperationCallable))))

(defn failover-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.failoverInstanceCallable))))

(defn export-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.exportInstanceCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^CloudRedisStub this]
    (-> this (.getOperationsStub))))

(defn list-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ListInstancesRequest,com.google.cloud.redis.v1.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.listInstancesCallable))))

(defn export-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisStub this]
    (-> this (.exportInstanceOperationCallable))))

(defn list-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ListInstancesRequest,com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.listInstancesPagedCallable))))

(defn failover-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisStub this]
    (-> this (.failoverInstanceOperationCallable))))

(defn import-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.importInstanceCallable))))

(defn create-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisStub this]
    (-> this (.createInstanceOperationCallable))))

(defn update-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisStub this]
    (-> this (.updateInstanceOperationCallable))))

(defn close
  ""
  ([^CloudRedisStub this]
    (-> this (.close))))

(defn delete-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.deleteInstanceCallable))))

(defn create-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.createInstanceCallable))))

(defn import-instance-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisStub this]
    (-> this (.importInstanceOperationCallable))))

(defn update-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.updateInstanceCallable))))

(defn get-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.GetInstanceRequest,com.google.cloud.redis.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisStub this]
    (-> this (.getInstanceCallable))))

