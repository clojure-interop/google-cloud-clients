(ns com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder
  "Builder for AllocationPoliciesServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha AllocationPoliciesServiceSettings$Builder]))

(defn delete-allocation-policy-settings
  "Returns the builder for the settings used for calls to deleteAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.deleteAllocationPolicySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder [^AllocationPoliciesServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-allocation-policy-settings
  "Returns the builder for the settings used for calls to getAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.GetAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.getAllocationPolicySettings))))

(defn create-allocation-policy-settings
  "Returns the builder for the settings used for calls to createAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.createAllocationPolicySettings))))

(defn build
  "returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings [^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder [^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-allocation-policy-settings
  "Returns the builder for the settings used for calls to updateAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.updateAllocationPolicySettings))))

(defn delete-allocation-policy-operation-settings
  "Returns the builder for the settings used for calls to deleteAllocationPolicy.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.deleteAllocationPolicyOperationSettings))))

(defn update-allocation-policy-operation-settings
  "Returns the builder for the settings used for calls to updateAllocationPolicy.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.updateAllocationPolicyOperationSettings))))

(defn list-allocation-policies-settings
  "Returns the builder for the settings used for calls to listAllocationPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse,com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.listAllocationPoliciesSettings))))

(defn create-allocation-policy-operation-settings
  "Returns the builder for the settings used for calls to createAllocationPolicy.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceSettings$Builder this]
    (-> this (.createAllocationPolicyOperationSettings))))

