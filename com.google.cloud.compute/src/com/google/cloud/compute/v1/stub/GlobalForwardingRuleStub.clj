(ns com.google.cloud.compute.v1.stub.GlobalForwardingRuleStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalForwardingRuleStub]))

(defn ->global-forwarding-rule-stub
  "Constructor."
  (^GlobalForwardingRuleStub []
    (new GlobalForwardingRuleStub )))

(defn delete-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleStub this]
    (-> this (.deleteGlobalForwardingRuleCallable))))

(defn get-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleStub this]
    (-> this (.getGlobalForwardingRuleCallable))))

(defn insert-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleStub this]
    (-> this (.insertGlobalForwardingRuleCallable))))

(defn list-global-forwarding-rules-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleStub this]
    (-> this (.listGlobalForwardingRulesPagedCallable))))

(defn list-global-forwarding-rules-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleStub this]
    (-> this (.listGlobalForwardingRulesCallable))))

(defn set-target-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleStub this]
    (-> this (.setTargetGlobalForwardingRuleCallable))))

(defn close
  ""
  ([^GlobalForwardingRuleStub this]
    (-> this (.close))))

