(ns com.google.cloud.compute.v1.stub.HttpJsonGlobalForwardingRuleStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonGlobalForwardingRuleStub]))

(def *-delete-global-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonGlobalForwardingRuleStub/deleteGlobalForwardingRuleMethodDescriptor)

(def *-get-global-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>"
  HttpJsonGlobalForwardingRuleStub/getGlobalForwardingRuleMethodDescriptor)

(def *-insert-global-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonGlobalForwardingRuleStub/insertGlobalForwardingRuleMethodDescriptor)

(def *-list-global-forwarding-rules-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>"
  HttpJsonGlobalForwardingRuleStub/listGlobalForwardingRulesMethodDescriptor)

(def *-set-target-global-forwarding-rule-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonGlobalForwardingRuleStub/setTargetGlobalForwardingRuleMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonGlobalForwardingRuleStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonGlobalForwardingRuleStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonGlobalForwardingRuleStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonGlobalForwardingRuleStub [^com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings settings]
    (HttpJsonGlobalForwardingRuleStub/create settings)))

(defn insert-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.insertGlobalForwardingRuleCallable))))

(defn set-target-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.setTargetGlobalForwardingRuleCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonGlobalForwardingRuleStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.shutdown))))

(defn get-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.getGlobalForwardingRuleCallable))))

(defn close
  ""
  ([^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.close))))

(defn list-global-forwarding-rules-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.listGlobalForwardingRulesCallable))))

(defn list-global-forwarding-rules-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.listGlobalForwardingRulesPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.shutdownNow))))

(defn delete-global-forwarding-rule-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalForwardingRuleStub this]
    (-> this (.deleteGlobalForwardingRuleCallable))))

