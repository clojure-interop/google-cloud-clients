(ns com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonSecurityPolicyStub]))

(def *-add-rule-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSecurityPolicyStub/addRuleSecurityPolicyMethodDescriptor)

(def *-delete-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSecurityPolicyStub/deleteSecurityPolicyMethodDescriptor)

(def *-get-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>"
  HttpJsonSecurityPolicyStub/getSecurityPolicyMethodDescriptor)

(def *-get-rule-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>"
  HttpJsonSecurityPolicyStub/getRuleSecurityPolicyMethodDescriptor)

(def *-insert-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSecurityPolicyStub/insertSecurityPolicyMethodDescriptor)

(def *-list-security-policies-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList>"
  HttpJsonSecurityPolicyStub/listSecurityPoliciesMethodDescriptor)

(def *-patch-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSecurityPolicyStub/patchSecurityPolicyMethodDescriptor)

(def *-patch-rule-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSecurityPolicyStub/patchRuleSecurityPolicyMethodDescriptor)

(def *-remove-rule-security-policy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSecurityPolicyStub/removeRuleSecurityPolicyMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonSecurityPolicyStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonSecurityPolicyStub [^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings settings]
    (HttpJsonSecurityPolicyStub/create settings)))

(defn get-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.getRuleSecurityPolicyCallable))))

(defn list-security-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.listSecurityPoliciesPagedCallable))))

(defn patch-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.patchRuleSecurityPolicyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSecurityPolicyStub this]
    (-> this (.isShutdown))))

(defn delete-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.deleteSecurityPolicyCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonSecurityPolicyStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn patch-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.patchSecurityPolicyCallable))))

(defn shutdown
  ""
  ([^HttpJsonSecurityPolicyStub this]
    (-> this (.shutdown))))

(defn insert-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.insertSecurityPolicyCallable))))

(defn close
  ""
  ([^HttpJsonSecurityPolicyStub this]
    (-> this (.close))))

(defn get-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.getSecurityPolicyCallable))))

(defn add-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.addRuleSecurityPolicyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSecurityPolicyStub this]
    (-> this (.isTerminated))))

(defn remove-rule-security-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.removeRuleSecurityPolicyCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonSecurityPolicyStub this]
    (-> this (.shutdownNow))))

(defn list-security-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSecurityPolicyStub this]
    (-> this (.listSecurityPoliciesCallable))))

