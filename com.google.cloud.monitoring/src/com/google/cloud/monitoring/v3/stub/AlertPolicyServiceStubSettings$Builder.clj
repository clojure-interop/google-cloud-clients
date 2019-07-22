(ns com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder
  "Builder for AlertPolicyServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub AlertPolicyServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder [^AlertPolicyServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^AlertPolicyServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-alert-policies-settings
  "Returns the builder for the settings used for calls to listAlertPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.monitoring.v3.ListAlertPoliciesResponse,com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AlertPolicyServiceStubSettings$Builder this]
    (-> this (.listAlertPoliciesSettings))))

(defn get-alert-policy-settings
  "Returns the builder for the settings used for calls to getAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceStubSettings$Builder this]
    (-> this (.getAlertPolicySettings))))

(defn create-alert-policy-settings
  "Returns the builder for the settings used for calls to createAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceStubSettings$Builder this]
    (-> this (.createAlertPolicySettings))))

(defn delete-alert-policy-settings
  "Returns the builder for the settings used for calls to deleteAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.DeleteAlertPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceStubSettings$Builder this]
    (-> this (.deleteAlertPolicySettings))))

(defn update-alert-policy-settings
  "Returns the builder for the settings used for calls to updateAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.UpdateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceStubSettings$Builder this]
    (-> this (.updateAlertPolicySettings))))

(defn build
  "returns: `com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings [^AlertPolicyServiceStubSettings$Builder this]
    (-> this (.build))))

