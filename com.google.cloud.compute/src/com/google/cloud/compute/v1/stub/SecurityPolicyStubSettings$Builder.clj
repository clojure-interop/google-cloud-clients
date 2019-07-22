(ns com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder
  "Builder for SecurityPolicyStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SecurityPolicyStubSettings$Builder]))

(defn get-security-policy-settings
  "Returns the builder for the settings used for calls to getSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.getSecurityPolicySettings))))

(defn delete-security-policy-settings
  "Returns the builder for the settings used for calls to deleteSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.deleteSecurityPolicySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder [^SecurityPolicyStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-security-policies-settings
  "Returns the builder for the settings used for calls to listSecurityPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList,com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.listSecurityPoliciesSettings))))

(defn insert-security-policy-settings
  "Returns the builder for the settings used for calls to insertSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.insertSecurityPolicySettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings [^SecurityPolicyStubSettings$Builder this]
    (-> this (.build))))

(defn add-rule-security-policy-settings
  "Returns the builder for the settings used for calls to addRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.addRuleSecurityPolicySettings))))

(defn remove-rule-security-policy-settings
  "Returns the builder for the settings used for calls to removeRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.removeRuleSecurityPolicySettings))))

(defn patch-security-policy-settings
  "Returns the builder for the settings used for calls to patchSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.patchSecurityPolicySettings))))

(defn get-rule-security-policy-settings
  "Returns the builder for the settings used for calls to getRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.getRuleSecurityPolicySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SecurityPolicyStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn patch-rule-security-policy-settings
  "Returns the builder for the settings used for calls to patchRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SecurityPolicyStubSettings$Builder this]
    (-> this (.patchRuleSecurityPolicySettings))))

