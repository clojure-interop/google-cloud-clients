(ns com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder
  "Builder for AutoscalingPolicyServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 AutoscalingPolicyServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStubSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStubSettings$Builder [^AutoscalingPolicyServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder [^AutoscalingPolicyServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-autoscaling-policy-settings
  "Returns the builder for the settings used for calls to createAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.CreateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalingPolicyServiceSettings$Builder this]
    (-> this (.createAutoscalingPolicySettings))))

(defn update-autoscaling-policy-settings
  "Returns the builder for the settings used for calls to updateAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalingPolicyServiceSettings$Builder this]
    (-> this (.updateAutoscalingPolicySettings))))

(defn get-autoscaling-policy-settings
  "Returns the builder for the settings used for calls to getAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.GetAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalingPolicyServiceSettings$Builder this]
    (-> this (.getAutoscalingPolicySettings))))

(defn list-autoscaling-policies-settings
  "Returns the builder for the settings used for calls to listAutoscalingPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesResponse,com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoscalingPolicyServiceSettings$Builder this]
    (-> this (.listAutoscalingPoliciesSettings))))

(defn delete-autoscaling-policy-settings
  "Returns the builder for the settings used for calls to deleteAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.DeleteAutoscalingPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalingPolicyServiceSettings$Builder this]
    (-> this (.deleteAutoscalingPolicySettings))))

(defn build
  "returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings [^AutoscalingPolicyServiceSettings$Builder this]
    (-> this (.build))))

