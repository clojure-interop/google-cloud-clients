(ns com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStub
  "Base stub class for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub AllocationPoliciesServiceStub]))

(defn ->allocation-policies-service-stub
  "Constructor."
  (^AllocationPoliciesServiceStub []
    (new AllocationPoliciesServiceStub )))

(defn delete-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceStub this]
    (-> this (.deleteAllocationPolicyCallable))))

(defn delete-allocation-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStub this]
    (-> this (.deleteAllocationPolicyOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^AllocationPoliciesServiceStub this]
    (-> this (.getOperationsStub))))

(defn update-allocation-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStub this]
    (-> this (.updateAllocationPolicyOperationCallable))))

(defn get-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceStub this]
    (-> this (.getAllocationPolicyCallable))))

(defn list-allocation-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceStub this]
    (-> this (.listAllocationPoliciesCallable))))

(defn close
  ""
  ([^AllocationPoliciesServiceStub this]
    (-> this (.close))))

(defn list-allocation-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceStub this]
    (-> this (.listAllocationPoliciesPagedCallable))))

(defn create-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceStub this]
    (-> this (.createAllocationPolicyCallable))))

(defn update-allocation-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceStub this]
    (-> this (.updateAllocationPolicyCallable))))

(defn create-allocation-policy-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStub this]
    (-> this (.createAllocationPolicyOperationCallable))))

