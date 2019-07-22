(ns com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder
  "Builder for AllocationPoliciesServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub AllocationPoliciesServiceStubSettings$Builder]))

(defn delete-allocation-policy-settings
  "Returns the builder for the settings used for calls to deleteAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.deleteAllocationPolicySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder [^AllocationPoliciesServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-allocation-policy-settings
  "Returns the builder for the settings used for calls to getAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.GetAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.getAllocationPolicySettings))))

(defn create-allocation-policy-settings
  "Returns the builder for the settings used for calls to createAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.createAllocationPolicySettings))))

(defn build
  "returns: `com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings [^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.build))))

(defn update-allocation-policy-settings
  "Returns the builder for the settings used for calls to updateAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.updateAllocationPolicySettings))))

(defn delete-allocation-policy-operation-settings
  "Returns the builder for the settings used for calls to deleteAllocationPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.deleteAllocationPolicyOperationSettings))))

(defn update-allocation-policy-operation-settings
  "Returns the builder for the settings used for calls to updateAllocationPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.updateAllocationPolicyOperationSettings))))

(defn list-allocation-policies-settings
  "Returns the builder for the settings used for calls to listAllocationPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse,com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.listAllocationPoliciesSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-allocation-policy-operation-settings
  "Returns the builder for the settings used for calls to createAllocationPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStubSettings$Builder this]
    (-> this (.createAllocationPolicyOperationSettings))))

