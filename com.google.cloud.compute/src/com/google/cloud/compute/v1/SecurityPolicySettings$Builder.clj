(ns com.google.cloud.compute.v1.SecurityPolicySettings$Builder
  "Builder for SecurityPolicySettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicySettings$Builder]))

(defn get-security-policy-settings
  "Returns the builder for the settings used for calls to getSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.getSecurityPolicySettings))))

(defn delete-security-policy-settings
  "Returns the builder for the settings used for calls to deleteSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.deleteSecurityPolicySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.SecurityPolicySettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.SecurityPolicySettings$Builder [^SecurityPolicySettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-security-policies-settings
  "Returns the builder for the settings used for calls to listSecurityPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList,com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.listSecurityPoliciesSettings))))

(defn insert-security-policy-settings
  "Returns the builder for the settings used for calls to insertSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.insertSecurityPolicySettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.SecurityPolicySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SecurityPolicySettings [^SecurityPolicySettings$Builder this]
    (-> this (.build))))

(defn add-rule-security-policy-settings
  "Returns the builder for the settings used for calls to addRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.addRuleSecurityPolicySettings))))

(defn remove-rule-security-policy-settings
  "Returns the builder for the settings used for calls to removeRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.removeRuleSecurityPolicySettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder [^SecurityPolicySettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn patch-security-policy-settings
  "Returns the builder for the settings used for calls to patchSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.patchSecurityPolicySettings))))

(defn get-rule-security-policy-settings
  "Returns the builder for the settings used for calls to getRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.getRuleSecurityPolicySettings))))

(defn patch-rule-security-policy-settings
  "Returns the builder for the settings used for calls to patchRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicySettings$Builder this]
    (-> this (.patchRuleSecurityPolicySettings))))

