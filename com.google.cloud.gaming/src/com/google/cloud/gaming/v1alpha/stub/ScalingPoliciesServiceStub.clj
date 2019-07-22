(ns com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStub
  "Base stub class for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub ScalingPoliciesServiceStub]))

(defn ->scaling-policies-service-stub
  "Constructor."
  (^ScalingPoliciesServiceStub []
    (new ScalingPoliciesServiceStub )))

(defn create-scaling-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStub this]
    (-> this (.createScalingPolicyOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^ScalingPoliciesServiceStub this]
    (-> this (.getOperationsStub))))

(defn update-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceStub this]
    (-> this (.updateScalingPolicyCallable))))

(defn get-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceStub this]
    (-> this (.getScalingPolicyCallable))))

(defn list-scaling-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceStub this]
    (-> this (.listScalingPoliciesPagedCallable))))

(defn delete-scaling-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStub this]
    (-> this (.deleteScalingPolicyOperationCallable))))

(defn close
  ""
  ([^ScalingPoliciesServiceStub this]
    (-> this (.close))))

(defn update-scaling-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStub this]
    (-> this (.updateScalingPolicyOperationCallable))))

(defn delete-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceStub this]
    (-> this (.deleteScalingPolicyCallable))))

(defn create-scaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceStub this]
    (-> this (.createScalingPolicyCallable))))

(defn list-scaling-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ListScalingPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceStub this]
    (-> this (.listScalingPoliciesCallable))))

