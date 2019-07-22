(ns com.google.cloud.compute.v1.GlobalForwardingRuleSettings$Builder
  "Builder for GlobalForwardingRuleSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalForwardingRuleSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder [^GlobalForwardingRuleSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.GlobalForwardingRuleSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.GlobalForwardingRuleSettings$Builder [^GlobalForwardingRuleSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to deleteGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleSettings$Builder this]
    (-> this (.deleteGlobalForwardingRuleSettings))))

(defn get-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to getGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleSettings$Builder this]
    (-> this (.getGlobalForwardingRuleSettings))))

(defn insert-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to insertGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleSettings$Builder this]
    (-> this (.insertGlobalForwardingRuleSettings))))

(defn list-global-forwarding-rules-settings
  "Returns the builder for the settings used for calls to listGlobalForwardingRules.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList,com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GlobalForwardingRuleSettings$Builder this]
    (-> this (.listGlobalForwardingRulesSettings))))

(defn set-target-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to setTargetGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleSettings$Builder this]
    (-> this (.setTargetGlobalForwardingRuleSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.GlobalForwardingRuleSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.GlobalForwardingRuleSettings [^GlobalForwardingRuleSettings$Builder this]
    (-> this (.build))))

