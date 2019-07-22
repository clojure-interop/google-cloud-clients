(ns com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder
  "Builder for GlobalForwardingRuleStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalForwardingRuleStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder [^GlobalForwardingRuleStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^GlobalForwardingRuleStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to deleteGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleStubSettings$Builder this]
    (-> this (.deleteGlobalForwardingRuleSettings))))

(defn get-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to getGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleStubSettings$Builder this]
    (-> this (.getGlobalForwardingRuleSettings))))

(defn insert-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to insertGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleStubSettings$Builder this]
    (-> this (.insertGlobalForwardingRuleSettings))))

(defn list-global-forwarding-rules-settings
  "Returns the builder for the settings used for calls to listGlobalForwardingRules.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList,com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GlobalForwardingRuleStubSettings$Builder this]
    (-> this (.listGlobalForwardingRulesSettings))))

(defn set-target-global-forwarding-rule-settings
  "Returns the builder for the settings used for calls to setTargetGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalForwardingRuleStubSettings$Builder this]
    (-> this (.setTargetGlobalForwardingRuleSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings [^GlobalForwardingRuleStubSettings$Builder this]
    (-> this (.build))))

