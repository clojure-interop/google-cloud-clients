(ns com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder
  "Builder for ForwardingRuleStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ForwardingRuleStubSettings$Builder]))

(defn list-forwarding-rules-settings
  "Returns the builder for the settings used for calls to listForwardingRules.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList,com.google.cloud.compute.v1.ForwardingRuleClient$ListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ForwardingRuleStubSettings$Builder this]
    (-> this (.listForwardingRulesSettings))))

(defn aggregated-list-forwarding-rules-settings
  "Returns the builder for the settings used for calls to aggregatedListForwardingRules.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleAggregatedList,com.google.cloud.compute.v1.ForwardingRuleClient$AggregatedListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ForwardingRuleStubSettings$Builder this]
    (-> this (.aggregatedListForwardingRulesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder [^ForwardingRuleStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-forwarding-rule-settings
  "Returns the builder for the settings used for calls to deleteForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ForwardingRuleStubSettings$Builder this]
    (-> this (.deleteForwardingRuleSettings))))

(defn set-target-forwarding-rule-settings
  "Returns the builder for the settings used for calls to setTargetForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetTargetForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ForwardingRuleStubSettings$Builder this]
    (-> this (.setTargetForwardingRuleSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings [^ForwardingRuleStubSettings$Builder this]
    (-> this (.build))))

(defn get-forwarding-rule-settings
  "Returns the builder for the settings used for calls to getForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ForwardingRuleStubSettings$Builder this]
    (-> this (.getForwardingRuleSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ForwardingRuleStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn insert-forwarding-rule-settings
  "Returns the builder for the settings used for calls to insertForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ForwardingRuleStubSettings$Builder this]
    (-> this (.insertForwardingRuleSettings))))

