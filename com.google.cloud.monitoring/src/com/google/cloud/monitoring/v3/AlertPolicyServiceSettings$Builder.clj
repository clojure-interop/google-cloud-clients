(ns com.google.cloud.monitoring.v3.AlertPolicyServiceSettings$Builder
  "Builder for AlertPolicyServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 AlertPolicyServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder [^AlertPolicyServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.monitoring.v3.AlertPolicyServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.monitoring.v3.AlertPolicyServiceSettings$Builder [^AlertPolicyServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-alert-policies-settings
  "Returns the builder for the settings used for calls to listAlertPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.monitoring.v3.ListAlertPoliciesResponse,com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AlertPolicyServiceSettings$Builder this]
    (-> this (.listAlertPoliciesSettings))))

(defn get-alert-policy-settings
  "Returns the builder for the settings used for calls to getAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceSettings$Builder this]
    (-> this (.getAlertPolicySettings))))

(defn create-alert-policy-settings
  "Returns the builder for the settings used for calls to createAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceSettings$Builder this]
    (-> this (.createAlertPolicySettings))))

(defn delete-alert-policy-settings
  "Returns the builder for the settings used for calls to deleteAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.DeleteAlertPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceSettings$Builder this]
    (-> this (.deleteAlertPolicySettings))))

(defn update-alert-policy-settings
  "Returns the builder for the settings used for calls to updateAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.UpdateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AlertPolicyServiceSettings$Builder this]
    (-> this (.updateAlertPolicySettings))))

(defn build
  "returns: `com.google.cloud.monitoring.v3.AlertPolicyServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.AlertPolicyServiceSettings [^AlertPolicyServiceSettings$Builder this]
    (-> this (.build))))

