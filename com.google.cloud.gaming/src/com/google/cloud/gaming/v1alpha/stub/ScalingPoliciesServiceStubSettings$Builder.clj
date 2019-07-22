(ns com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder
  "Builder for ScalingPoliciesServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub ScalingPoliciesServiceStubSettings$Builder]))

(defn update-scaling-policy-settings
  "Returns the builder for the settings used for calls to updateScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.updateScalingPolicySettings))))

(defn create-scaling-policy-operation-settings
  "Returns the builder for the settings used for calls to createScalingPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.createScalingPolicyOperationSettings))))

(defn list-scaling-policies-settings
  "Returns the builder for the settings used for calls to listScalingPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ListScalingPoliciesResponse,com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.listScalingPoliciesSettings))))

(defn get-scaling-policy-settings
  "Returns the builder for the settings used for calls to getScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.GetScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.getScalingPolicySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder [^ScalingPoliciesServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-scaling-policy-settings
  "Returns the builder for the settings used for calls to createScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.createScalingPolicySettings))))

(defn delete-scaling-policy-settings
  "Returns the builder for the settings used for calls to deleteScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.deleteScalingPolicySettings))))

(defn build
  "returns: `com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings [^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.build))))

(defn delete-scaling-policy-operation-settings
  "Returns the builder for the settings used for calls to deleteScalingPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.deleteScalingPolicyOperationSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn update-scaling-policy-operation-settings
  "Returns the builder for the settings used for calls to updateScalingPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStubSettings$Builder this]
    (-> this (.updateScalingPolicyOperationSettings))))

