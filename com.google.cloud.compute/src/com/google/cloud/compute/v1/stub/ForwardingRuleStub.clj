(ns com.google.cloud.compute.v1.stub.ForwardingRuleStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ForwardingRuleStub]))

(defn ->forwarding-rule-stub
  "Constructor."
  (^ForwardingRuleStub []
    (new ForwardingRuleStub )))

(defn set-target-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.setTargetForwardingRuleCallable))))

(defn delete-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.deleteForwardingRuleCallable))))

(defn get-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.getForwardingRuleCallable))))

(defn aggregated-list-forwarding-rules-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleClient$AggregatedListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.aggregatedListForwardingRulesPagedCallable))))

(defn list-forwarding-rules-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.listForwardingRulesCallable))))

(defn close
  ""
  ([^ForwardingRuleStub this]
    (-> this (.close))))

(defn aggregated-list-forwarding-rules-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.aggregatedListForwardingRulesCallable))))

(defn insert-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.insertForwardingRuleCallable))))

(defn list-forwarding-rules-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleClient$ListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleStub this]
    (-> this (.listForwardingRulesPagedCallable))))

