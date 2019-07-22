(ns com.google.cloud.gaming.v1alpha.stub.GrpcScalingPoliciesServiceStub
  "gRPC stub implementation for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GrpcScalingPoliciesServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.gaming.v1alpha.stub.GrpcScalingPoliciesServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.GrpcScalingPoliciesServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcScalingPoliciesServiceStub/create client-context callable-factory))
  (^com.google.cloud.gaming.v1alpha.stub.GrpcScalingPoliciesServiceStub [^com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings settings]
    (GrpcScalingPoliciesServiceStub/create settings)))

(defn create-scaling-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^GrpcScalingPoliciesServiceStub this]
    (-> this (.createScalingPolicyOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcScalingPoliciesServiceStub this]
    (-> this (.getOperationsStub))))

(defn update-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcScalingPoliciesServiceStub this]
    (-> this (.updateScalingPolicyCallable))))

(defn get-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcScalingPoliciesServiceStub this]
    (-> this (.getScalingPolicyCallable))))

(defn list-scaling-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcScalingPoliciesServiceStub this]
    (-> this (.listScalingPoliciesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcScalingPoliciesServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcScalingPoliciesServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcScalingPoliciesServiceStub this]
    (-> this (.shutdown))))

(defn delete-scaling-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GrpcScalingPoliciesServiceStub this]
    (-> this (.deleteScalingPolicyOperationCallable))))

(defn close
  ""
  ([^GrpcScalingPoliciesServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcScalingPoliciesServiceStub this]
    (-> this (.isTerminated))))

(defn update-scaling-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^GrpcScalingPoliciesServiceStub this]
    (-> this (.updateScalingPolicyOperationCallable))))

(defn delete-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcScalingPoliciesServiceStub this]
    (-> this (.deleteScalingPolicyCallable))))

(defn create-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcScalingPoliciesServiceStub this]
    (-> this (.createScalingPolicyCallable))))

(defn list-scaling-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ListScalingPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcScalingPoliciesServiceStub this]
    (-> this (.listScalingPoliciesCallable))))

(defn shutdown-now
  ""
  ([^GrpcScalingPoliciesServiceStub this]
    (-> this (.shutdownNow))))

