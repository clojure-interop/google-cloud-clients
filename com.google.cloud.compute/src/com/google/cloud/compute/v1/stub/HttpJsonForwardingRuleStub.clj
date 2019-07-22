(ns com.google.cloud.compute.v1.stub.HttpJsonForwardingRuleStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonForwardingRuleStub]))

(def *-aggregated-list-forwarding-rules-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleAggregatedList>"
  HttpJsonForwardingRuleStub/aggregatedListForwardingRulesMethodDescriptor)

(def *-delete-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonForwardingRuleStub/deleteForwardingRuleMethodDescriptor)

(def *-get-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>"
  HttpJsonForwardingRuleStub/getForwardingRuleMethodDescriptor)

(def *-insert-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonForwardingRuleStub/insertForwardingRuleMethodDescriptor)

(def *-list-forwarding-rules-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>"
  HttpJsonForwardingRuleStub/listForwardingRulesMethodDescriptor)

(def *-set-target-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetTargetForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonForwardingRuleStub/setTargetForwardingRuleMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonForwardingRuleStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonForwardingRuleStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonForwardingRuleStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonForwardingRuleStub [^com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings settings]
    (HttpJsonForwardingRuleStub/create settings)))

(defn set-target-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.setTargetForwardingRuleCallable))))

(defn delete-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.deleteForwardingRuleCallable))))

(defn get-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.getForwardingRuleCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonForwardingRuleStub this]
    (-> this (.isShutdown))))

(defn aggregated-list-forwarding-rules-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleClient$AggregatedListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.aggregatedListForwardingRulesPagedCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonForwardingRuleStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonForwardingRuleStub this]
    (-> this (.shutdown))))

(defn list-forwarding-rules-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.listForwardingRulesCallable))))

(defn close
  ""
  ([^HttpJsonForwardingRuleStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonForwardingRuleStub this]
    (-> this (.isTerminated))))

(defn aggregated-list-forwarding-rules-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.aggregatedListForwardingRulesCallable))))

(defn insert-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.insertForwardingRuleCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonForwardingRuleStub this]
    (-> this (.shutdownNow))))

(defn list-forwarding-rules-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleClient$ListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonForwardingRuleStub this]
    (-> this (.listForwardingRulesPagedCallable))))

