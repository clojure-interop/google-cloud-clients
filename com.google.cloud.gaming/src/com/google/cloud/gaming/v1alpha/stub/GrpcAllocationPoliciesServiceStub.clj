(ns com.google.cloud.gaming.v1alpha.stub.GrpcAllocationPoliciesServiceStub
  "gRPC stub implementation for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GrpcAllocationPoliciesServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.gaming.v1alpha.stub.GrpcAllocationPoliciesServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.GrpcAllocationPoliciesServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcAllocationPoliciesServiceStub/create client-context callable-factory))
  (^com.google.cloud.gaming.v1alpha.stub.GrpcAllocationPoliciesServiceStub [^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings settings]
    (GrpcAllocationPoliciesServiceStub/create settings)))

(defn delete-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.deleteAllocationPolicyCallable))))

(defn delete-allocation-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GrpcAllocationPoliciesServiceStub this]
    (-> this (.deleteAllocationPolicyOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcAllocationPoliciesServiceStub this]
    (-> this (.getOperationsStub))))

(defn update-allocation-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^GrpcAllocationPoliciesServiceStub this]
    (-> this (.updateAllocationPolicyOperationCallable))))

(defn get-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.getAllocationPolicyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcAllocationPoliciesServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcAllocationPoliciesServiceStub this]
    (-> this (.shutdown))))

(defn list-allocation-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.listAllocationPoliciesCallable))))

(defn close
  ""
  ([^GrpcAllocationPoliciesServiceStub this]
    (-> this (.close))))

(defn list-allocation-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.listAllocationPoliciesPagedCallable))))

(defn create-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.createAllocationPolicyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.isTerminated))))

(defn update-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAllocationPoliciesServiceStub this]
    (-> this (.updateAllocationPolicyCallable))))

(defn shutdown-now
  ""
  ([^GrpcAllocationPoliciesServiceStub this]
    (-> this (.shutdownNow))))

(defn create-allocation-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^GrpcAllocationPoliciesServiceStub this]
    (-> this (.createAllocationPolicyOperationCallable))))

